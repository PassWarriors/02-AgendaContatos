package br.edu.telas;

import br.edu.controle.AgendaController;
import br.edu.dao.ContatoDao;
import br.edu.modelo.Contato;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private int contador = 1;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());
    
    List<Contato> contatos = new ArrayList<>();
    ContatoDao dao = new ContatoDao("contatos.txt");
    Scanner sc = new Scanner(System.in);
    AgendaController controller = new AgendaController(contatos, dao);

    // CONSTRUTOR DA JANELA PRINCIPAL
    public TelaPrincipal() {
        
        dao.carregarContatos(contatos);
        
        initComponents();
        
        painelConteudo.setLayout(new javax.swing.BoxLayout(painelConteudo, javax.swing.BoxLayout.Y_AXIS));
        
        AtualizarLista(controller.listarContatos());
        
        // DEFINE O TITULO DA JANELA
        this.setTitle("SafeVault IFCE - Gerenciador de Senhas");
        // DEFINIR UM ICONE PARA A JANELA
        this.setIconImage(null); // POR ENQUANTO ESTÁ NULO POIS NÃO TEM IMAGEM
        // CENTRALIZAR A JANELA
        this.setLocationRelativeTo(null);
        // DEFINIR QUE O X FECHA A JANELA
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // NÃO PERMITE REDIMENSIONAR A TELA
        this.setResizable(false);
        
        // CONFIGURA PARA QUE A LISTA DE CONTATOS SEJA VERTICAL
        painelConteudo.setLayout(new javax.swing.BoxLayout(painelConteudo, javax.swing.BoxLayout.Y_AXIS));
        
        // TORNA A JANELA VISÍVEL
        this.setVisible(true);
    }
   
    // INICIAR O LOOP PRINCIPAL DO PROGRAMA
    public void ADICIONAR(Contato contato){
        controller.adicionarContato(contato);
        AtualizarLista(controller.listarContatos());
    }
    
    public void SALVAR(){
        boolean salvou = controller.salvarContatos();
            if (salvou) {
                sc.close();
                javax.swing.JOptionPane.showMessageDialog(this, "Agenda de Contatos Salva Com sucesso!");
                return;
                
            }
            else {
                System.out.println("Não foi possível salvar os contatos.");
                System.out.println("A aplicação continuará em execução.");
            }
        }
    
    public void EXCLUIR(Contato contato) {
        controller.excluirContato(contato.getNome());
        AtualizarLista(controller.listarContatos());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotaoAddContato = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelConteudo = new javax.swing.JPanel();
        BotaoSalvarContatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agenda de Contatos");

        jLabel2.setText("Contatos importantes salvos no SaveFault");

        BotaoAddContato.setText("+ Novo");
        BotaoAddContato.addActionListener(this::BotaoAddContatoActionPerformed);

        painelConteudo.setLayout(new javax.swing.BoxLayout(painelConteudo, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(painelConteudo);

        BotaoSalvarContatos.setText("Salvar Contatos");
        BotaoSalvarContatos.addActionListener(this::BotaoSalvarContatosActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(BotaoAddContato)))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoSalvarContatos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BotaoAddContato))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BotaoSalvarContatos)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // QUANDO O BOTÃO ADICIONAR É CLICADO
    private void BotaoAddContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAddContatoActionPerformed
        TelaAdicionarContato TelaAddCont = new TelaAdicionarContato(this);
    }
    
    // CRIA UM NOVO ITEM E ADICIONA ELE NA LISTA DE CONTATOS
    public void AtualizarLista(List<Contato> ListaContato){

        // LIMPA TODOS OS ITENS DA LISTA DA JANELA
        painelConteudo.removeAll();
        
        // ADICIONA CADA CONTATO ARMAZENADO NA LISTA DA JANELA
        for (Contato contato : ListaContato) {
            // 3 linhas, 18 colunas (força o texto a quebrar antes de bater no botão)
            JTextArea textoContato = new JTextArea(3, 18);
            textoContato.setText(contato.getNome() + "\n" + contato.getCelular() + "\n" + contato.getEmail());
            textoContato.setLineWrap(true);
            textoContato.setWrapStyleWord(true);
            textoContato.setEditable(false);
            textoContato.setOpaque(false);

            JButton BotaoExcluirContato = new JButton("[ X ]");
            BotaoExcluirContato.addActionListener(e -> {
                EXCLUIR(contato);
            });

            JPanel novoItem = new JPanel(new java.awt.BorderLayout(10, 0));
            novoItem.add(textoContato, java.awt.BorderLayout.CENTER);
            novoItem.add(BotaoExcluirContato, java.awt.BorderLayout.EAST);
            novoItem.setAlignmentX(java.awt.Component.LEFT_ALIGNMENT);

            // Deixa o painel crescer na altura conforme as linhas quebram
            novoItem.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, novoItem.getPreferredSize().height));

            painelConteudo.add(novoItem);
            painelConteudo.add(javax.swing.Box.createRigidArea(new java.awt.Dimension(0, 8)));
        }

        painelConteudo.revalidate();
        painelConteudo.repaint();

    }//GEN-LAST:event_BotaoAddContatoActionPerformed

    // QUANDO O BOTÃO DE SALVAR CONTATOS É APERTADO
    private void BotaoSalvarContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarContatosActionPerformed
        SALVAR();
    }//GEN-LAST:event_BotaoSalvarContatosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAddContato;
    private javax.swing.JButton BotaoSalvarContatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelConteudo;
    // End of variables declaration//GEN-END:variables
}