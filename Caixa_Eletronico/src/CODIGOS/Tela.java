/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

/**
 *
 * @author irmoura
 */
public class Tela extends javax.swing.JFrame {
    
    public static int valor_solicitado ,
    notas_de_1, notas_de_2, notas_de_5, notas_de_10, notas_de_20, notas_de_50, notas_de_100;

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
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
        QUANTIDADE_NOTAS_1_REAL = new javax.swing.JLabel();
        QUANTIDADE_NOTAS_2_REAIS = new javax.swing.JLabel();
        QUANTIDADE_NOTAS_5_REAIS = new javax.swing.JLabel();
        QUANTIDADE_NOTAS_10_REAIS = new javax.swing.JLabel();
        QUANTIDADE_NOTAS_50_REAIS = new javax.swing.JLabel();
        QUANTIDADE_NOTAS_20_REAIS = new javax.swing.JLabel();
        QUANTIDADE_NOTAS_100_REAIS = new javax.swing.JLabel();
        TEXTO_VALOR = new javax.swing.JTextField();
        BOTAO_SACAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caixa Eletrônico");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODIGOS/Imagens/cedulas do REAL.png"))); // NOI18N

        QUANTIDADE_NOTAS_1_REAL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QUANTIDADE_NOTAS_1_REAL.setText("0");

        QUANTIDADE_NOTAS_2_REAIS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QUANTIDADE_NOTAS_2_REAIS.setText("0");

        QUANTIDADE_NOTAS_5_REAIS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QUANTIDADE_NOTAS_5_REAIS.setText("0");

        QUANTIDADE_NOTAS_10_REAIS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QUANTIDADE_NOTAS_10_REAIS.setText("0");

        QUANTIDADE_NOTAS_50_REAIS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QUANTIDADE_NOTAS_50_REAIS.setText("0");

        QUANTIDADE_NOTAS_20_REAIS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QUANTIDADE_NOTAS_20_REAIS.setText("0");

        QUANTIDADE_NOTAS_100_REAIS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QUANTIDADE_NOTAS_100_REAIS.setText("0");

        BOTAO_SACAR.setText("Sacar");
        BOTAO_SACAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SACARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(QUANTIDADE_NOTAS_1_REAL)
                .addGap(130, 130, 130)
                .addComponent(QUANTIDADE_NOTAS_2_REAIS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QUANTIDADE_NOTAS_5_REAIS)
                .addGap(110, 110, 110)
                .addComponent(QUANTIDADE_NOTAS_10_REAIS)
                .addGap(115, 115, 115)
                .addComponent(QUANTIDADE_NOTAS_20_REAIS)
                .addGap(116, 116, 116)
                .addComponent(QUANTIDADE_NOTAS_50_REAIS)
                .addGap(128, 128, 128)
                .addComponent(QUANTIDADE_NOTAS_100_REAIS)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(TEXTO_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(BOTAO_SACAR)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QUANTIDADE_NOTAS_1_REAL)
                    .addComponent(QUANTIDADE_NOTAS_20_REAIS)
                    .addComponent(QUANTIDADE_NOTAS_50_REAIS)
                    .addComponent(QUANTIDADE_NOTAS_100_REAIS)
                    .addComponent(QUANTIDADE_NOTAS_10_REAIS)
                    .addComponent(QUANTIDADE_NOTAS_5_REAIS)
                    .addComponent(QUANTIDADE_NOTAS_2_REAIS))
                .addGap(50, 50, 50)
                .addComponent(TEXTO_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BOTAO_SACAR)
                .addGap(0, 140, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAO_SACARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_SACARActionPerformed
        // TODO add your handling code here:
        
        valor_solicitado = 0;
        notas_de_1 = 0;
        notas_de_2 = 0;
        notas_de_5 = 0;
        notas_de_10 = 0;
        notas_de_20 = 0;
        notas_de_50 = 0;
        notas_de_100 = 0;
        
        valor_solicitado = Integer.parseInt(TEXTO_VALOR.getText());
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_100++;
            if(notas_de_100*100 > valor_solicitado){
                notas_de_100--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_50++;
            if(notas_de_50*50 > valor_solicitado){
                notas_de_50--;
            }
            if((notas_de_50*50) > (valor_solicitado - notas_de_100*100)){
                notas_de_50--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_20++;
            if(notas_de_20*20 > valor_solicitado){
                notas_de_20--;
            }
            if((notas_de_20*20) > (valor_solicitado - notas_de_50*50)){
                notas_de_20--;
            }
            if((notas_de_20*20) > (valor_solicitado - notas_de_100*100)){
                notas_de_20--;
            }
            if(((notas_de_20*20)+(notas_de_50*50)+(notas_de_100*100)) > valor_solicitado){
                notas_de_20--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_10++;
            if(notas_de_10*10 > valor_solicitado){
                notas_de_10--;
            }
            if((notas_de_10*10) > (valor_solicitado - notas_de_20*20)){
                notas_de_10--;
            }
            if((notas_de_10*10) > (valor_solicitado - notas_de_50*50)){
                notas_de_10--;
            }
            if((notas_de_10*10) > (valor_solicitado - notas_de_100*100)){
                notas_de_10--;
            }
            if(((notas_de_10*10)+(notas_de_20*20)+(notas_de_50*50)+(notas_de_100*100)) > valor_solicitado){
                notas_de_10--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_5++;
            if(notas_de_5*5 > valor_solicitado){
                notas_de_5--;
            }
            if((notas_de_5*5) > (valor_solicitado - notas_de_10*10)){
                notas_de_5--;
            }
            if((notas_de_5*5) > (valor_solicitado - notas_de_20*20)){
                notas_de_5--;
            }
            if((notas_de_5*5) > (valor_solicitado - notas_de_50*50)){
                notas_de_5--;
            }
            if((notas_de_5*5) > (valor_solicitado - notas_de_100*100)){
                notas_de_5--;
            }
            if(((notas_de_5*5)+(notas_de_10*10)+(notas_de_20*20)+(notas_de_50*50)+(notas_de_100*100)) > valor_solicitado){
                notas_de_5--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_2++;
            if(notas_de_2*2 > valor_solicitado){
                notas_de_2--;
            }
            if((notas_de_2*2) > (valor_solicitado - notas_de_5*5)){
                notas_de_2--;
            }
            if((notas_de_2*2) > (valor_solicitado - notas_de_10*10)){
                notas_de_2--;
            }
            if((notas_de_2*2) > (valor_solicitado - notas_de_20*20)){
                notas_de_2--;
            }
            if((notas_de_2*2) > (valor_solicitado - notas_de_50*50)){
                notas_de_2--;
            }
            if((notas_de_2*2) > (valor_solicitado - notas_de_100*100)){
                notas_de_2--;
            }
            if(((notas_de_2*2)+(notas_de_5*5)+(notas_de_10*10)+(notas_de_20*20)+(notas_de_50*50)+(notas_de_100*100)) > valor_solicitado){
                notas_de_2--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_1++;
            if(notas_de_1 > valor_solicitado){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_2*2)){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_5*5)){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_10*10)){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_20*20)){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_50*50)){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_100*100)){
                notas_de_1--;
            }
            if(((notas_de_1)+(notas_de_2*2)+(notas_de_5*5)+(notas_de_10*10)+(notas_de_20*20)+(notas_de_50*50)+(notas_de_100*100)) > valor_solicitado){
                notas_de_1--;
            }
            
            QUANTIDADE_NOTAS_1_REAL.setText(""+notas_de_1);
            QUANTIDADE_NOTAS_2_REAIS.setText(""+notas_de_2);
            QUANTIDADE_NOTAS_5_REAIS.setText(""+notas_de_5);
            QUANTIDADE_NOTAS_10_REAIS.setText(""+notas_de_10);
            QUANTIDADE_NOTAS_20_REAIS.setText(""+notas_de_20);
            QUANTIDADE_NOTAS_50_REAIS.setText(""+notas_de_50);
            QUANTIDADE_NOTAS_100_REAIS.setText(""+notas_de_100);
            
        }
        
    }//GEN-LAST:event_BOTAO_SACARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_SACAR;
    private javax.swing.JLabel QUANTIDADE_NOTAS_100_REAIS;
    private javax.swing.JLabel QUANTIDADE_NOTAS_10_REAIS;
    private javax.swing.JLabel QUANTIDADE_NOTAS_1_REAL;
    private javax.swing.JLabel QUANTIDADE_NOTAS_20_REAIS;
    private javax.swing.JLabel QUANTIDADE_NOTAS_2_REAIS;
    private javax.swing.JLabel QUANTIDADE_NOTAS_50_REAIS;
    private javax.swing.JLabel QUANTIDADE_NOTAS_5_REAIS;
    private javax.swing.JTextField TEXTO_VALOR;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
