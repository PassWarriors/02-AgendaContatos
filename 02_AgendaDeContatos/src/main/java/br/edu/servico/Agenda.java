package br.edu.servico;

import java.util.List;
import java.util.Scanner;

import br.edu.modelo.Contato;

public class Agenda {
	
        // RECEBE UM DADO DO USUARIO APENAS SE FOR VÁLIDO
        // PRINTA A MENSAGEM DE INFORMAÇÃO
        public static String ReceberDado(String Mensagem, Scanner sc) {
            System.out.println(Mensagem);
            String Dado = sc.nextLine();
            
            while (Dado.isEmpty()) {
                System.out.println("Dado inválido! tente denovo: ");
                Dado = sc.nextLine();
            }
            
            return Dado;
        }
    
	public static void adicionar(Scanner sc, List<Contato> contatos) {
    	
		System.out.println("=== ADICIONAR CONTATO ===");
        
                String nome = ReceberDado("Digite o nome: " , sc);
                String celular = ReceberDado("Digite o celular: " , sc);
                String email = ReceberDado("Digite o email: " , sc);

                Contato contato = new Contato(nome, celular, email);
                contatos.add(contato);
                System.out.println("Contato adicionado com sucesso!");
    }
	
	public static void listar(List<Contato> contatos) {
    	
		System.out.println("=== LISTAR CONTATOS ===");
       
		if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado!");

        } else {
            
        	for (Contato contato : contatos) {
        		System.out.println("--------------------------");
                System.out.println(contato);
            }
        }
    }

    public static void pesquisar(Scanner sc, List<Contato> contatos) {
    	
    	System.out.println("=== PROCURAR CONTATO ===");
        
    	System.out.print("Digite o nome do contato: ");
        String nomeBusca = sc.nextLine();

        boolean encontrado = false;

        for (Contato contato : contatos) {

            if (contato.getNome().toLowerCase().contains(nomeBusca.toLowerCase())) {
            	System.out.println("--------------------------");
                System.out.println(contato);

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado!");
        }
    }

    public static void atualizar(Scanner sc, List<Contato> contatos) {
    	
    	System.out.println("=== ALTERAR CONTATO ===");
        
    	System.out.print("Digite o nome do contato: ");
        String nomeProcurado = sc.nextLine();

        Contato contatoEncontrado = null;

        for (Contato contato : contatos) {

            if (contato.getNome().equalsIgnoreCase(nomeProcurado)) {
                contatoEncontrado = contato;
            }
        }

        if (contatoEncontrado != null) {

            System.out.print("Digite o novo nome: ");
            String novoNome = sc.nextLine();

            System.out.print("Digite o novo celular: ");
            String novoCelular = sc.nextLine();

            System.out.print("Digite o novo email: ");
            String novoEmail = sc.nextLine();

            contatoEncontrado.setNome(novoNome);
            contatoEncontrado.setCelular(novoCelular);
            contatoEncontrado.setEmail(novoEmail);

            System.out.println("Contato alterado com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public static void excluir(Scanner sc, List<Contato> contatos) {
    	
    	System.out.println("=== EXCLUIR CONTATO ===");
        
    	System.out.print("Digite o nome do contato: ");
        String nomeExcluir = sc.nextLine();

        Contato contatoExcluir = null;

        for (Contato contato : contatos) {

            if (contato.getNome().equalsIgnoreCase(nomeExcluir)) {
                contatoExcluir = contato;
            }
        }

        if (contatoExcluir != null) {

            contatos.remove(contatoExcluir);

            System.out.println("Contato excluído com sucesso!");

        } else {

            System.out.println("Contato não encontrado!");
        }

    }
    
}