package ui;

import bean.Imprimir;
import dao.OpsDAO;
import dao.RoteiroProdutoDAO;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Etiqueta extends javax.swing.JFrame {

    public Etiqueta() {
        initComponents();
        this.setVisible(true);
        jCDesSubitem.setEnabled(false);
        estilo();
        Dimension paneSize = this.getSize();
        Dimension screenSize = this.getToolkit().getScreenSize();
        this.setLocation((screenSize.width - paneSize.width) / 2, (screenSize.height - paneSize.height) / 2);

    }

    public void geraArquivo() {
        int var1 = (Integer.parseInt(jTOP.getText()));
        int var2 = (Integer.parseInt(jCOPItem.getSelectedItem().toString()));
        int var6 = (Integer.parseInt(jTQtd.getText()));
        String var3 = jTNomPessoa.getText();
        String var4 = jTDesItem.getText();
        String var5 = "" ;

        if (jCDesSubitem.getSelectedItem() == null){
            var5 = "";
        }else{
            var5 = jCDesSubitem.getSelectedItem().toString();
        }
            
        
        
        Imprimir i = new Imprimir(var1, var2, var6, var3, var4, var5);
        try {
            arquivo(i);
        } catch (IOException ex) {
            Logger.getLogger(Etiqueta.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public void arquivo(Imprimir imprimir) throws IOException {

        String cliente = imprimir.getNOM_PESSOA();
        int op = imprimir.getNUM_OP();
        int seqop = imprimir.getSEQ_OP();

        //DIVIDE STRING


        int tamanhocliente = imprimir.getNOM_PESSOA().length();

        if (tamanhocliente > 33) {
            cliente = imprimir.getNOM_PESSOA().substring(0, 33);
        }

        String deslinha1 = "";
        String deslinha2 = "";
        String sublinha1 = "";
        String sublinha2 = "";


        int tamanho = imprimir.getDES_ITEM().length();

        if (tamanho <= 33) {
            deslinha1 = imprimir.getDES_ITEM().substring(0, tamanho);
        } else if (tamanho > 33 && tamanho <= 66) {
            deslinha1 = imprimir.getDES_ITEM().substring(0, 32);
            deslinha2 = imprimir.getDES_ITEM().substring(32, tamanho);
        } else if (tamanho > 66) {
            deslinha1 = imprimir.getDES_ITEM().substring(0, 32);
            deslinha2 = imprimir.getDES_ITEM().substring(32, 66);

        }

        int tamanho2 = imprimir.getCOD_ITEM().length();

        if (tamanho2 <= 33) {
            sublinha1 = imprimir.getCOD_ITEM().substring(0, tamanho2);
        } else if (tamanho2 > 33 && tamanho <= 66) {
            sublinha1 = imprimir.getCOD_ITEM().substring(0, 32);
            sublinha2 = imprimir.getCOD_ITEM().substring(32, tamanho2);
        } else if (tamanho2 > 66) {
            sublinha1 = imprimir.getCOD_ITEM().substring(0, 32);
            sublinha2 = imprimir.getCOD_ITEM().substring(32, 66);

        }




        //GERA ARQUIVO
        File arquivo;
        arquivo = new File("C:\\Argox\\java_etiqueta2.txt");
//        System.out.println(imprimir.getCOD_ITEM());
//        System.out.println(imprimir.getDES_ITEM());
//        System.out.println(imprimir.getNOM_PESSOA());
//        System.out.println(imprimir.getNUM_OP());
//        System.out.println(imprimir.getSEQ_OP());
//        System.out.println(imprimir.getQTD());
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(arquivo);
            String texto = "e";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "j";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "L";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "n";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "PD";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "H12";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "D11";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            //texto = "1X1100000010010B400230001001";
            //fos.write(texto.getBytes());
            //texto = System.getProperty("line.separator");
            //fos.write(texto.getBytes());
            //texto = "1X1100001150010L398001";
            //fos.write(texto.getBytes());
            //texto = System.getProperty("line.separator");
            //fos.write(texto.getBytes());
            //texto = "1X1100000010210l00010230";
            //fos.write(texto.getBytes());
            //texto = System.getProperty("line.separator");
            //fos.write(texto.getBytes());
            texto = "1X1100002120010L398001";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "1X1100000820010L398001";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100002300014" + cliente;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100002300222" + cliente;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100001000014" + cliente;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100001000222" + cliente;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100002150015OP: " + op;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100002150222OP: " + op;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000850015OP: " + op;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000850222OP: " + op;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100002150075ITEM: " + seqop;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100002150290ITEM: " + seqop;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000850085ITEM: " + seqop;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000850290ITEM: " + seqop;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "111100002050015DESCRICAO:";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "111100002050222DESCRICAO:";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "111100000750015DESCRICAO:";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "111100000750222DESCRICAO:";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "111100001650015SUBITEM:";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "111100001650222SUBITEM:";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "111100000300015SUBITEM:";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "111100000300222SUBITEM:";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100001930015" + deslinha1;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100001930222" + deslinha1;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000450015" + deslinha2;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000450222" + deslinha2;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100001780015" + deslinha2;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100001780222" + deslinha2;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000570015" + deslinha1;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000570222" + deslinha1;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100001540015" + sublinha1;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100001540222" + sublinha1;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000180015" + sublinha1;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000180222" + sublinha1;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100001380015" + sublinha2;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100001380222" + sublinha2;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000050015" + sublinha2;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "121100000050222" + sublinha2;
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "Q000" + imprimir.getQTD();
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "J";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "E";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "f320";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            texto = "E0001";
            fos.write(texto.getBytes());
            texto = System.getProperty("line.separator");
            fos.write(texto.getBytes());
            fos.close();  // Fecha o arquivo. Nunca esquecer disso.
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Etiqueta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   /* private void exec() {
        Process exec;
        try {
            exec = Runtime.getRuntime().exec("cmd /c type c:\\Argox\\java_etiqueta2.txt > lpt1");
            if (exec.waitFor() == 0) {
                System.out.println("Executado.");
            } else {
                System.out.println("ERRO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    
      public static void exec() {
     
      Runtime run = Runtime.getRuntime();
     
      String command1 = "cmd /c type c:\\Argox\\java_etiqueta2.txt > lpt1";
     
     
      try { run.exec(command1);
     
      } catch (IOException e) {
     
      e.printStackTrace(); }
     
      }
     
    public void resetForm() {
        limpaCB();
        jCDesSubitem.setEnabled(false);
        jTQtd.setText("1");
        jTNomPessoa.setText("");
        jTDesItem.setText("");
        jTOP.setText("");


    }

    public void preencheJC() {
        limpaCB();
        List<String> lista = OpsDAO.getListaItens(Integer.parseInt(jTOP.getText()));

        for (int i = 0; i < lista.size(); i++) {
            jCOPItem.addItem(lista.get(i));
        }

    }

    public void preencheJCSubitem() {

        List<String> lista = RoteiroProdutoDAO.getListaSubitens((Integer.parseInt(jTOP.getText())), (Integer.parseInt(jCOPItem.getSelectedItem().toString())));

        for (int i = 0; i < lista.size(); i++) {
            jCDesSubitem.addItem(lista.get(i));
        }

    }

    public void limpaCB() {
        jCOPItem.removeAllItems();
        jCDesSubitem.removeAllItems();

    }

    public void preencherDesItem(int NUM_OP, int SEQ_OP) {
        jTDesItem.setText(OpsDAO.getDescItens(NUM_OP, SEQ_OP));
    }

    public void preencherNomPessoa(int NUM_OP) {
        jTNomPessoa.setText(OpsDAO.getNomPessoa(NUM_OP));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTOP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCOPItem = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTQtd = new javax.swing.JTextField();
        jTDesItem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCDesSubitem = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jTNomPessoa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMSobre = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("OP");

        jTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTOPActionPerformed(evt);
            }
        });

        jLabel2.setText("Item");

        jCOPItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCOPItemItemStateChanged(evt);
            }
        });
        jCOPItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCOPItemActionPerformed(evt);
            }
        });

        jLabel3.setText("Qtd de Etiquetas");

        jTQtd.setText("1");

        jTDesItem.setEditable(false);
        jTDesItem.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jLabel4.setText("Desrição do Item");

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Subitem");

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTNomPessoa.setEditable(false);
        jTNomPessoa.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jLabel5.setText("Cliente");

        jMenu1.setText("Arquivo");

        jMSobre.setText("Sobre");
        jMSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSobreActionPerformed(evt);
            }
        });
        jMenu1.add(jMSobre);

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTNomPessoa)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTOP, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(74, 74, 74))
                                    .addComponent(jCOPItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addComponent(jCDesSubitem, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTDesItem, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCOPItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTDesItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCDesSubitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNomPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTOPActionPerformed
        String temp = jTOP.getText();
        if(-1 != jCOPItem.getSelectedIndex()){
            resetForm();
            jTOP.setText(temp);
        }
        
        if (OpsDAO.existeOp(Integer.parseInt(jTOP.getText()))) {
            preencheJC();
            preencherNomPessoa(Integer.parseInt(jTOP.getText()));
        } else if ("".equals(jTOP.getText())) {
            JOptionPane.showMessageDialog(null, "OP inválida");
            resetForm();
        } else {
            resetForm();
            JOptionPane.showMessageDialog(null, "OP inválida");
        }

        //OpsDAO.existeOp(Integer.parseInt(jTOP.getText()))
        //"".equals(jTOP.getText()) //
    }//GEN-LAST:event_jTOPActionPerformed

    private void jCOPItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCOPItemActionPerformed
        if (jCOPItem.getSelectedIndex() != -1) {
            preencherDesItem((Integer.parseInt(jTOP.getText())), (Integer.parseInt(jCOPItem.getSelectedItem().toString())));
            if (RoteiroProdutoDAO.existeSubitem((Integer.parseInt(jTOP.getText())), (Integer.parseInt(jCOPItem.getSelectedItem().toString())))) {
                jCDesSubitem.setEnabled(true);
                jCDesSubitem.removeAllItems();
                preencheJCSubitem();
            } else {
                jCDesSubitem.removeAllItems();
                jCDesSubitem.setSelectedItem(-1);
                jCDesSubitem.setEnabled(false);
            }
        } else {
            resetForm();

        }

    }//GEN-LAST:event_jCOPItemActionPerformed

    private void jCOPItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCOPItemItemStateChanged
    }//GEN-LAST:event_jCOPItemItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resetForm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        geraArquivo();
        exec();
        //executaComando();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSobreActionPerformed
        Sobre s = new Sobre();
        s.setVisible(true);
    }//GEN-LAST:event_jMSobreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Etiqueta().setVisible(true);
            }
        });
    }

    public void estilo() {

        try {

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jCDesSubitem;
    private javax.swing.JComboBox jCOPItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMSobre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTDesItem;
    private javax.swing.JTextField jTNomPessoa;
    private javax.swing.JTextField jTOP;
    private javax.swing.JTextField jTQtd;
    // End of variables declaration//GEN-END:variables
}
