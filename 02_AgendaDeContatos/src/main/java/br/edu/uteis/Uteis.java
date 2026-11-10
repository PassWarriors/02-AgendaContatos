package br.edu.uteis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Uteis {
	public static void mostraInicializacao() {
    	System.out.println("+-_==========--=========_-+");
        System.out.println("|    AGENDA-DE-CONTATOS   |");
        System.out.println("}      - PASSGUARDIAN -   {");
        System.out.println("|          v1.1.0         |");
        System.out.println("+-_==========--=========_-+");
        System.out.println("|   Não entre em panico!  |");
        System.out.println("+-_==========--=========_-+");
    }
    
    public static void mostraMenu() {
    	System.out.println();
        System.out.println("+-_==========--=========_-+");
        System.out.println("| 1 - Adicionar contato   |");
        System.out.println("| 2 - Listar contatos     |");
        System.out.println("| 3 - Procurar contato    |");
        System.out.println("| 4 - Alterar contato     |");
        System.out.println("| 5 - Excluir contato     |");
        System.out.println("| 6 - Sair                |");
        System.out.println("| 7 - Sobre               |");
        System.out.println("+-_==========--=========_-+");
    	System.out.println();
    }
    
    public static int selecionaOpcao(Scanner sc) {
    	System.out.println("");
    	System.out.print("Escolha uma opção: ");
        int opc = sc.nextInt();
        sc.nextLine();
        return opc;
    }

    public static void sair() {
    	System.out.println("Saindo da Agenda de Contatos PassGuardiana ...");
    }
    
    public static void sobre() {
        JOptionPane.showMessageDialog(
                null, 
    		"Arthur Silva Trindade",
                "Creditos da programadora: ",
                0
        );
    }
}








