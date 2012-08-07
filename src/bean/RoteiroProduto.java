/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author admin
 */
public class RoteiroProduto {
    int NUM_OP;
    int SEQ_OP;
    String COD_ITEM;

    public RoteiroProduto(int NUM_OP, int SEQ_OP, String COD_ITEM) {
        this.NUM_OP = NUM_OP;
        this.SEQ_OP = SEQ_OP;
        this.COD_ITEM = COD_ITEM;
    }

    public String getCOD_ITEM() {
        return COD_ITEM;
    }

    public int getNUM_OP() {
        return NUM_OP;
    }

    public int getSEQ_OP() {
        return SEQ_OP;
    }
    
    
}
