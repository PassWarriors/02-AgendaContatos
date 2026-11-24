package br.edu.telas;

import br.edu.modelo.*;
import br.edu.telas.*;


public class TelaAdicionarContato extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaAdicionarContato.class.getName());
    private TelaPrincipal TelaPrin;
       
    public TelaAdicionarContato(TelaPrincipal TelaPrin) {
        
        this.TelaPrin = TelaPrin;
        
        // INICIAR COMPONENTES, UTIL
        initComponents();
        
        // DEFINE O TITULO DA JANELA
        this.setTitle("SafeVault IFCE - Gerenciador de Senhas");
        
        // DEFINIR UM ICONE PARA A JANELA
        this.setIconImage(null); // POR ENQUANTO ESTÁ NULO POIS NÃO TEM IMAGEM
        
        // CENTRALIZAR A JANELA
        this.setLocationRelativeTo(null);
        
        // DEFINIR QUE O X FECHA A JANELA
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        // NÃO PERMITE REDIMENSIONAR A TELA
        this.setResizable(false);
        
        // TORNA A JANELA VISÍVEL
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JTextField();
        CampoEmail = new javax.swing.JTextField();
        CampoNome = new javax.swing.JTextField();
        BotaoCancelar = new javax.swing.JButton();
        BotaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Novo Contato");

        jLabel2.setText("Nome");

        jLabel3.setText("Telefone / WhatsApp");

        jLabel4.setText("E-mail");

        CampoTelefone.addActionListener(this::CampoTelefoneActionPerformed);

        CampoEmail.addActionListener(this::CampoEmailActionPerformed);

        CampoNome.addActionListener(this::CampoNomeActionPerformed);

        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(this::BotaoCancelarActionPerformed);

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(this::BotaoSalvarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoTelefone)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CampoEmail)
                    .addComponent(CampoNome))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BotaoCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(BotaoSalvar)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCancelar)
                    .addComponent(BotaoSalvar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefoneActionPerformed

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    // QUANDO APERTAR O BOTÃO PARA SALVAR O CONTATO
    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        String nome = CampoNome.getText().trim();
        String celular = CampoTelefone.getText().trim();
        String email = CampoEmail.getText().trim();

        if (!nome.isEmpty() && !celular.isEmpty() && !email.isEmpty()) {
            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setCelular(celular);
            contato.setEmail(email);

            TelaPrin.ADICIONAR(contato);
            fecharJanela();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        }

    }//GEN-LAST:event_BotaoSalvarActionPerformed

    // QUANDO APERTAR NO BOtÃO DE CANCELAR
    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        fecharJanela();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    // APENAS FECHA A JANELA DUHH
    private void fecharJanela() {
        // 2. Fecha apenas esta janela (Janela 2)
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
