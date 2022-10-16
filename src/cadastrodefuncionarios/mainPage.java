package cadastrodefuncionarios;

public class mainPage extends javax.swing.JFrame {

    public DataBase dataBase = new DataBase();
    public CadastroDeFuncionarios gerentes = new CadastroDeFuncionarios(new java.awt.Frame(),true, 0, dataBase);
    public CadastroDeFuncionarios secretarios = new CadastroDeFuncionarios(new java.awt.Frame(),true, 1, dataBase);
    
    public mainPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadGerente = new javax.swing.JMenuItem();
        cadSecret = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Meus Funcionários");

        jMenu1.setText("Funcionários");

        cadGerente.setText("Gerente");
        cadGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadGerenteActionPerformed(evt);
            }
        });
        jMenu1.add(cadGerente);

        cadSecret.setText("Secretario(a)");
        cadSecret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadSecretActionPerformed(evt);
            }
        });
        jMenu1.add(cadSecret);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadGerenteActionPerformed
        gerentes.setVisible(true);
    }//GEN-LAST:event_cadGerenteActionPerformed

    private void cadSecretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadSecretActionPerformed
        secretarios.setVisible(true);
    }//GEN-LAST:event_cadSecretActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadGerente;
    private javax.swing.JMenuItem cadSecret;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
