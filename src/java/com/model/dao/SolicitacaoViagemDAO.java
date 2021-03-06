package com.model.dao;

import com.jdbc.ConnectionFactory;
import com.model.entity.Passageiro;
import com.model.entity.SolicitacaoViagem;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class SolicitacaoViagemDAO {

    private Connection connection;

    public SolicitacaoViagemDAO() {
        try {
            this.connection = new ConnectionFactory().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserir(SolicitacaoViagem solicitacao) {
        String sql = "insert into solicitacao_viagem "
                + "(numero_transportados, servidores, data_saida, hora_saida, "
                + "local_saida, data_retorno, hora_retorno, local_retorno, "
                + "percurso, objetivo_viagem, id_veiculo, id_responsavel_solicitacao, "
                + "id_responsavel_autorizante, status) values (?,?,?,?,?,?,?,?,?,?,?,"
                + "?, ?, ?)";

        String sql2 = "insert into passageiro_solicitacao_viagem "
                + "(id_passageiro, id_solicitacao_viagem) values (?, ?)";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, solicitacao.getNumero());
            stmt.setBoolean(2, solicitacao.getServidores());
            stmt.setDate(3, new Date(solicitacao.getDataSaida().getTime()));
            stmt.setDate(4, new Date(solicitacao.getHoraSaida().getTime()));
            stmt.setString(5, solicitacao.getLocalSaida());
            stmt.setDate(6, new Date(solicitacao.getDataRetorno().getTime()));
            stmt.setDate(7, new Date(solicitacao.getHoraRetorno().getTime()));
            stmt.setString(8, solicitacao.getLocalRetorno());
            stmt.setString(9, solicitacao.getPercurso());
            stmt.setString(10, solicitacao.getObjetivo());
            stmt.setInt(11, solicitacao.getVeiculo().getId());
            stmt.setInt(12, solicitacao.getSolicitante().getId());
            stmt.setInt(13, solicitacao.getAutorizante().getId());
            stmt.setString(14, solicitacao.getStatus());

            stmt.execute();
            ResultSet rsid = stmt.getGeneratedKeys();
            rsid.next();
            Integer gid = rsid.getInt(1);
            stmt.close();

            List<Passageiro> passageiros = solicitacao.getPassageiros();
            this.cadastraPassageiros(passageiros);
            this.linkPassageiros(passageiros, gid);
//            for (Passageiro passageiro : passageiros) {
//                if (passageiro.getIdPassageiro() == null) {
//                    Passageiro teste = new PassageiroDAO().getByRG(passageiro.getRg());
//                    if (teste == null) {
//                        new PassageiroDAO().inserir(passageiro);
//                    }
//                    stmt = this.connection.prepareStatement(sql2);
//                    String rgp = passageiro.getRg();
//                    Passageiro pass2 = new PassageiroDAO().getByRG(rgp);
//                    Integer id2 = pass2.getIdPassageiro();
//                    stmt.setInt(1, id2);
//                    Integer id3 = gid;
//                    stmt.setInt(2, id3);
//                    stmt.execute();
//                    stmt.close();
//                }
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    
    
    private void cadastraPassageiros(List<Passageiro> pass) {
        for (Passageiro p: pass) {
            if (p.getIdPassageiro() == null) {
                new PassageiroDAO().inserir(p);
            }
        }
    }
    
    private void linkPassageiros(List<Passageiro> pass, Integer id) 
    throws SQLException{
        String sql_insert = "insert into passageiro_solicitacao_viagem ("
                + "id_passageiro, id_solicitacao_viagem) values (?,?)";
//        String sql_query = "select * from passageiro_solicitacao_viagem"
//                + " where id_passageiro=? and id_solicitacao_viagem=?";
        String sql_del = "delete from passageiro_solicitacao_viagem"
                + " where id_solicitacao_viagem=?";
        PreparedStatement st_del = this.connection.prepareStatement(sql_del);
        st_del.setInt(1, id);
        st_del.executeUpdate();
        st_del.close();
        for (Passageiro p: pass) {
              PreparedStatement st_insert = this.connection.prepareStatement(
                        sql_insert);
              st_insert.setInt(1, p.getIdPassageiro());
              st_insert.setInt(2, id);
              st_insert.executeUpdate();
              st_insert.close();
//            PreparedStatement st_query = this.connection.prepareStatement(
//                    sql_query);
//            st_query.setInt(1, p.getIdPassageiro());
//            st_query.setInt(2, id);
//            ResultSet rs = st_query.executeQuery();
//            if (!rs.next()) {
//                PreparedStatement st_insert = this.connection.prepareStatement(
//                        sql_insert);
//                st_insert.setInt(1, p.getIdPassageiro());
//                st_insert.setInt(2, id);
//            }
        }
    }
    
    
    public void alterar(SolicitacaoViagem solicitacao) {
        String sql = "update solicitacao_viagem set "
                + "numero_transportados=?, servidores=?, data_saida=?, hora_saida=?, "
                + "local_saida=?, data_retorno=?, hora_retorno=?, local_retorno=?, "
                + "percurso=?, objetivo_viagem=?, id_veiculo=?, id_responsavel_solicitacao=?, "
                + "id_responsavel_autorizante=?, status=? where id_solicitacao_viagem=? ";

//        String sql2 = "insert into passageiro_solicitacao_viagem "
//                + "(id_passageiro, id_solicitacao_viagem) values (?, ?)";
//        String sql3 = "select * from passageiro_solicitacao_viagem";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setInt(1, solicitacao.getNumero());
            stmt.setBoolean(2, solicitacao.getServidores());
            if (solicitacao.getDataSaida() == null) {
                stmt.setDate(3, null);
            } else {
                stmt.setDate(3, new Date(solicitacao.getDataSaida().getTime()));
            }
            if (solicitacao.getHoraSaida() == null) {
                stmt.setDate(4, null);
            } else {
                stmt.setDate(4, new Date(solicitacao.getHoraSaida().getTime()));
            }
            stmt.setString(5, solicitacao.getLocalSaida());
            if (solicitacao.getDataRetorno() == null) {
                stmt.setDate(6, null);
            } else {
                stmt.setDate(6, new Date(solicitacao.getDataRetorno().getTime()));
            }
            if (solicitacao.getHoraRetorno() == null) {
                stmt.setDate(7, null);
            } else {
                stmt.setDate(7, new Date(solicitacao.getHoraRetorno().getTime()));
            }
            stmt.setString(8, solicitacao.getLocalRetorno());
            stmt.setString(9, solicitacao.getPercurso());
            stmt.setString(10, solicitacao.getObjetivo());
            stmt.setInt(11, solicitacao.getVeiculo().getId());
            stmt.setInt(12, solicitacao.getSolicitante().getId());
            stmt.setInt(13, solicitacao.getAutorizante().getId());
            stmt.setString(14, solicitacao.getStatus());
            stmt.setInt(15, solicitacao.getId());
            stmt.execute();
            stmt.close();

            List<Passageiro> passageiros = solicitacao.getPassageiros();
            cadastraPassageiros(passageiros);
            linkPassageiros(passageiros, solicitacao.getId());
//            for (Passageiro passageiro : passageiros) {
//                stmt = this.connection.prepareStatement(sql2);
//                stmt.setInt(1, passageiro.getIdPassageiro());
//                stmt.setInt(2, solicitacao.getId());
//                stmt.execute();
//                stmt.close();
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deletar(int id) throws Exception {
        String sql = "delete from solicitacao_viagem where id_solicitacao_viagem=?";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            stmt.close();
            if (rowsAffected != 1) {
                throw new Exception("Erro ao deletar solicitacaoViagem, id: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletar(SolicitacaoViagem solicitacaoViagem) throws Exception {
        this.deletar(solicitacaoViagem.getId());
    }

    public List<SolicitacaoViagem> getSolicitacoes() throws Exception {
        String sql = "select * from solicitacao_viagem";
        List<SolicitacaoViagem> solicitacoes = new ArrayList<SolicitacaoViagem>();

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while ((rs.next())) {
                SolicitacaoViagem sv = this.setsFromDatabase(rs);
                solicitacoes.add(sv);
            }
            return solicitacoes;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public SolicitacaoViagem getById(Integer id) {
        String sql = "select * from solicitacao_viagem where id_solicitacao_viagem=?";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while ((rs.next())) {
                return this.setsFromDatabase(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private SolicitacaoViagem setsFromDatabase(ResultSet rs) {
        String sql2 = "select * from passageiro_solicitacao_viagem where "
                + "id_solicitacao_viagem = ?";
        try {
            SolicitacaoViagem sv = new SolicitacaoViagem();
            sv.setId(rs.getInt("id_solicitacao_viagem"));
            Calendar c = Calendar.getInstance();
            Date dataSaida = rs.getDate("data_saida");
            if (dataSaida != null) {
                c.setTime(dataSaida);
                sv.setDataSaida(c.getTime());
            }
            c = Calendar.getInstance();
            Date horaSaida = rs.getDate("hora_saida");
            if (horaSaida != null) {
                c.setTime(horaSaida);
                sv.setHoraSaida(c.getTime());
            }
            c = Calendar.getInstance();
            Date dataRetorno = rs.getDate("data_retorno");
            if (dataRetorno != null) {
                c.setTime(dataRetorno);
                sv.setDataRetorno(c.getTime());
            }
            c = Calendar.getInstance();
            Date horaRetorno = rs.getDate("hora_retorno");
            if (horaRetorno != null) {
                c.setTime(horaRetorno);
                sv.setHoraRetorno(c.getTime());
            }
            sv.setLocalSaida(rs.getString("local_saida"));
            sv.setLocalRetorno(rs.getString("local_retorno"));
            sv.setNumero(rs.getInt("numero_transportados"));
            sv.setObjetivo(rs.getString("objetivo_viagem"));
            sv.setPercurso(rs.getString("percurso"));
            sv.setServidores(rs.getBoolean("servidores"));
            try {
                sv.setStatus(rs.getString("status"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            PreparedStatement stmt2 = this.connection.prepareStatement(sql2);
            stmt2.setInt(1, sv.getId());
            ResultSet rs2 = stmt2.executeQuery();
            while (rs2.next()) {
                Integer ids = rs2.getInt("id_passageiro");
                sv.getPassageiros().add(new PassageiroDAO().getById(ids));
            }
            Integer uid = rs.getInt("id_responsavel_solicitacao");
            sv.setSolicitante(new UsuarioDAO().getById(uid));
            Integer uaid = rs.getInt("id_responsavel_autorizante");
            sv.setAutorizante(new UsuarioDAO().getById(uaid));
            Integer vid = rs.getInt("id_veiculo");
            sv.setVeiculo(new VeiculoDAO().getById(vid));
            return sv;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
