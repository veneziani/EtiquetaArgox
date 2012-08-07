/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bd.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class RoteiroProdutoDAO {

    public static boolean existeSubitem(int NUM_OP, int SEQ_OP) {

        boolean retorna = false;

        try {
            String sql = "SELECT NUM_OP, SEQ_OP FROM ROTEIROPRODUTO WHERE NUM_OP = " + NUM_OP + " AND SEQ_OP = " + SEQ_OP + " AND COD_EMPRESA = 'BUZAS';";
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
    
        public static List getListaSubitens(int NUM_OP, int SEQ_OP) {

        String sql = "SELECT COD_ITEM FROM ROTEIROPRODUTO WHERE NUM_OP = " + NUM_OP + " AND SEQ_OP = " + SEQ_OP + " AND COD_EMPRESA = 'BUZAS';";

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
}
