/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bd.Conector;
import bean.Ops;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OpsDAO {

    public static List<Ops> getOps() {
        ArrayList<Ops> s = new ArrayList<Ops>();
        try {

            String sql = "SELECT NUM_OP,SEQ_OP,NOM_PESSOA,DES_ITEM FROM OPS WHERE COD_EMPRESA = 'BUZAS' ORDER BY NUM_OP,SEQ_OP;";
            Connection con = Conector.conectar();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Ops opss = new Ops(rs.getInt("NUM_OP"), rs.getInt("SEQ_OP"), rs.getString("NOM_PESSOA"), rs.getString("DES_ITEM FROM"));
                s.add(opss);

            }

            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OpsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
        //return null;

    }

    public static boolean existeOp(int NUM_OP) {

        boolean retorna = false;

        try {
            String sql = "SELECT NUM_OP FROM OPS WHERE NUM_OP = " + NUM_OP + " AND COD_EMPRESA = 'BUZAS';";
            Connection con = Conector.conectar();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                retorna = true;
            } else {
                retorna = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(OpsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return retorna;

    }

    public static List getListaItens(int NUM_OP) {

        String sql = "SELECT SEQ_OP FROM OPS WHERE NUM_OP = " + NUM_OP + " AND COD_EMPRESA = 'BUZAS' AND COD_ORIGEM = 'PEDIDO' ORDER BY SEQ_OP ;";

        List<String> l = new ArrayList<String>();

        try {
            Connection con = Conector.conectar();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                l.add(rs.getString(1));
            }
            stmt.close();
            con.close();
            return l;

        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return null;

    }

    public static List getListaDescItens(int NUM_OP, int SEQ_OP) {

        String sql = "SELECT DES_ITEM FROM OPS WHERE NUM_OP = " + NUM_OP + " AND SEQ_OP = " + SEQ_OP + " AND COD_EMPRESA = 'BUZAS';";

        List<String> l = new ArrayList<String>();

        try {
            Connection con = Conector.conectar();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                l.add(rs.getString(1));
            }
            stmt.close();
            con.close();
            return l;

        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return null;

    }

    public static String getDescItens(int NUM_OP, int SEQ_OP) {

        String sql = "SELECT DES_ITEM FROM OPS WHERE NUM_OP = " + NUM_OP + " AND SEQ_OP = " + SEQ_OP + " AND COD_EMPRESA = 'BUZAS';";

        String l = "";

        try {
            Connection con = Conector.conectar();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                l = (rs.getString(1));
            }
            stmt.close();
            con.close();
            return l;

        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return null;

    }

    public static String getNomPessoa(int NUM_OP) {

        String sql = "SELECT NOM_PESSOA FROM OPS WHERE NUM_OP = " + NUM_OP + " AND COD_EMPRESA = 'BUZAS';";

        String l = "";

        try {
            Connection con = Conector.conectar();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                l = (rs.getString(1));
            }
            stmt.close();
            con.close();
            return l;

        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return null;

    }
}
