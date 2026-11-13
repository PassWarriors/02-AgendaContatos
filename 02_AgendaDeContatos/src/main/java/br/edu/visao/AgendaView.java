package br.edu.visao;

import br.edu.controle.AgendaController;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import br.edu.modelo.Contato;

public class AgendaView {
    private Scanner sc;

    // CONSTRUTOR DA CLASSE
    public AgendaView(Scanner sc) {
        this.sc = sc;
    }
    
    public void sair() {
    	System.out.println("Saindo da Agenda de Contatos...");
    }
    
    public void sobre() {
    	JOptionPane.showMessageDialog(null, 
        "Desenvolvido por Arthur risada frouxa!");
    }
    
    public void mostraInicializacao() {
    	System.out.println("==========================");
        System.out.println("     AGENDA DE CONTATOS   ");
        System.out.println("          v2.1.0          ");
        System.out.println("==========================");
        System.out.println("Bem-vindo!");
    }

    public void mostrarMenu() {
        System.out.println();
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Procurar contato");
        System.out.println("4 - Alterar contato");
        System.out.println("5 - Excluir contato");
        System.out.println("6 - Sair");
        System.out.println("7 - Sobre");
    }

    public int selecionarOpcao() {
        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        return opcao;
    }
    
    // RECEBER APENAS INPUTS VÁLIDOS
    public String ReceberInput(){
        String Input = sc.nextLine();
        
        while (Input.isEmpty()){
            mostrarMensagem("Erro! Não pode texto vazio.");
            Input = sc.nextLine();    
        }
        
        return Input;
    }
    
    public Contato lerContato() {
        System.out.println("=== ADICIONAR CONTATO ===");
        
        mostrarMensagem("digite o nome: ");
        String nome = ReceberInput();
        mostrarMensagem("digite o celular: ");
        String celular = ReceberInput();
        mostrarMensagem("digite o email: ");
        String email = ReceberInput();

        return new Contato(nome, celular, email);
    }
    
    public String lerNomePesquisa() {
        System.out.println("\n=== PESQUISAR CONTATO ===");
        mostrarMensagem("Digite o nome do contato: ");
        return ReceberInput();
    }
    
    public Contato lerDadosAtualizacao() {

        System.out.println("\n=== NOVOS DADOS ===");
        mostrarMensagem("Novo nome: ");
        String nome = ReceberInput();
        mostrarMensagem("Novo celular: ");
        String celular = ReceberInput();
        mostrarMensagem("Novo email: ");
        String email = ReceberInput();

        return new Contato(nome, celular, email);
    }
    
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
    
    public void mostrarContatos(List<Contato> contatos) {
        System.out.println("\n=== LISTA DE CONTATOS ===");

        if (contatos.isEmpty()) {
            mostrarMensagem("Nenhum contato cadastrado.");
            return;
        }
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
    
    public void mostrarResultadoPesquisa(Contato contato) {

        if (contato == null) {
            mostrarMensagem("Contato não encontrado.");

        } else {
            System.out.println("\nContato encontrado:");
            System.out.println(contato);
        }
    }
    
    public boolean confirmarExclusao() {
        mostrarMensagem("Deseja excluir contato? [S/n]");
        String resposta = ReceberInput();
        return resposta.equalsIgnoreCase("S");
    }
    
    // PROGRAMA PRINCIPAL
    public void Inicializar(AgendaController controller) {
        int opcao;
        mostraInicializacao();
        while (true) {
        	
        	mostrarMenu();

        	opcao = selecionarOpcao();

            switch (opcao) {
                case 1-> {
                	Contato contato = lerContato();
                    controller.adicionarContato(contato);
                    mostrarMensagem("Contato adicionado com sucesso!");
                }          	
                case 2-> {
                	List<Contato> lista = controller.listarContatos();
                    mostrarContatos(lista);
                }
                case 3-> {
                	String nome = lerNomePesquisa();
                    Contato contato = controller.pesquisarContato(nome);
                    mostrarResultadoPesquisa(contato);
                }
                case 4-> {
                	String nome = lerNomePesquisa();

                    Contato contato = controller.pesquisarContato(nome);

                    if (contato == null) {

                        mostrarMensagem("Contato não encontrado.");

                    } else {

                        mostrarResultadoPesquisa(contato);

                        Contato novosDados = lerDadosAtualizacao();

                        boolean atualizado = controller.atualizarContato(
                                nome,
                                novosDados.getNome(),
                                novosDados.getCelular(),
                                novosDados.getEmail()
                        );

                        if (atualizado) {
                            mostrarMensagem("Contato atualizado com sucesso!");
                        }
                    }
                }          	
                case 5-> {
                	String nome = lerNomePesquisa();

                    Contato contato = controller.pesquisarContato(nome);

                    if (contato == null) {

                        mostrarMensagem("Contato não encontrado.");

                    } else {

                        mostrarResultadoPesquisa(contato);

                        if (confirmarExclusao()) {

                            boolean excluido = controller.excluirContato(nome);

                            if (excluido) {
                                mostrarMensagem("Contato excluído com sucesso!");
                            }

                        } else {

                            mostrarMensagem("Exclusão cancelada.");
                        }
                    }
                }        	
                case 6-> {
                	boolean salvou = controller.salvarContatos();
                    if (salvou) {
                        sair();
                        sc.close();
                        return;
                    }
                    else {
                        System.out.println("Não foi possível salvar os contatos.");
                        System.out.println("A aplicação continuará em execução.");
                    }
                }
                case 7-> sobre();
                default -> System.out.println("Opção Inválida!");
            }
        }
    }	
    }
