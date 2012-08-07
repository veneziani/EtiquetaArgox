/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

public class Ops {
    
    int NUM_OP;
    int SEQ_OP;
    String NOM_PESSOA;
    String DES_ITEM;

    public Ops(int NUM_OP, int SEQ_OP, String NOM_PESSOA, String DES_ITEM) {
        this.NUM_OP = NUM_OP;
        this.SEQ_OP = SEQ_OP;
        this.NOM_PESSOA = NOM_PESSOA;
        this.DES_ITEM = DES_ITEM;
    }

    public String getDES_ITEM() {
        return DES_ITEM;
    }

    public String getNOM_PESSOA() {
        return NOM_PESSOA;
    }

    public int getNUM_OP() {
        return NUM_OP;
    }

    public int getSEQ_OP() {
        return SEQ_OP;
    }
    
    
    
}
