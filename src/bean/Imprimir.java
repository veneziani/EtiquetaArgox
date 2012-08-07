/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author admin
 */
public class Imprimir {
    
    int NUM_OP;
    int SEQ_OP;
    int QTD;
    String NOM_PESSOA;
    String DES_ITEM;
    String COD_ITEM;

    public Imprimir(int NUM_OP, int SEQ_OP, int QTD, String NOM_PESSOA, String DES_ITEM, String COD_ITEM) {
        this.NUM_OP = NUM_OP;
        this.SEQ_OP = SEQ_OP;
        this.QTD = QTD;
        this.NOM_PESSOA = NOM_PESSOA;
        this.DES_ITEM = DES_ITEM;
        this.COD_ITEM = COD_ITEM;
    }

    public String getCOD_ITEM() {
        return COD_ITEM;
    }

    public void setCOD_ITEM(String COD_ITEM) {
        this.COD_ITEM = COD_ITEM;
    }

    public String getDES_ITEM() {
        return DES_ITEM;
    }

    public void setDES_ITEM(String DES_ITEM) {
        this.DES_ITEM = DES_ITEM;
    }

    public String getNOM_PESSOA() {
        return NOM_PESSOA;
    }

    public void setNOM_PESSOA(String NOM_PESSOA) {
        this.NOM_PESSOA = NOM_PESSOA;
    }

    public int getNUM_OP() {
        return NUM_OP;
    }

    public void setNUM_OP(int NUM_OP) {
        this.NUM_OP = NUM_OP;
    }

    public int getQTD() {
        return QTD;
    }

    public void setQTD(int QTD) {
        this.QTD = QTD;
    }

    public int getSEQ_OP() {
        return SEQ_OP;
    }

    public void setSEQ_OP(int SEQ_OP) {
        this.SEQ_OP = SEQ_OP;
    }
    

    
}
