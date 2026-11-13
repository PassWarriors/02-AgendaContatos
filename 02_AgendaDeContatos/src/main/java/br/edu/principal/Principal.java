package br.edu.principal;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import br.edu.dao.ContatoDAO;
import br.edu.modelo.Contato;

import br.edu.visao.AgendaView;
import br.edu.controle.AgendaController;

public class Principal {
	
    public static void main(String[] args) {
            List<Contato> contatos = new ArrayList<>();

            ContatoDAO dao = new ContatoDAO("contatos.txt");
            dao.carregarContatos(contatos);

            Scanner sc = new Scanner(System.in);
            AgendaView view = new AgendaView(sc);
            
            AgendaController controller = new AgendaController(contatos, dao);
            view.Inicializar(controller);
    }
}