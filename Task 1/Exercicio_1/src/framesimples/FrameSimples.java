package framesimples;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class FrameSimples {
	static int cliques;
	static JLabel texto;
	
	public static void main(String args[]) {
		cliques = 0;
		JFrame janela = new JFrame("Aplicacao Simples");
		JButton but = new JButton("Sou um botao!");
		texto = new JLabel ("Total de cliques no botao: 0");
		JPanel painel = new JPanel();
		
		janela.setLocationRelativeTo(null);		// Centraliza janela no meio da tela
		painel.add(but);
		painel.add(texto);
		
		but.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cliques++;
				texto.setText("Total de cliques no botao: " + cliques);
				
				if (cliques == 10)		// Numero máximo até onde são contados os cliques
				{
					JDialog dialog = new JDialog(new javax.swing.JFrame(), true);	// Instancia do objeto JDialog
					JButton but2 = new JButton("Fechar");	// Criação de um novo botão
					JPanel painel2 = new JPanel();		// Criação de um novo painel 
					texto = new JLabel ("-----NUMERO MÁXIMO DE CLIQUES ATINGIDO-----");		// Modifica texto
					
					dialog.setLocationRelativeTo(null);		// Dialog é setado para o centro da tela
					dialog.setTitle("Atenção!");		// Titulo do Dialog
					painel2.setLayout(new GridLayout(2,2));		// Alocação do Layout
					painel2.add(texto);			// Adiciona o texto modificado ao novo painel
					painel2.add(but2);			// Adiciona o novo botão ao novo painel
						
					but2.addActionListener(new ActionListener() {		// Quando o novo botão for clicado
						public void actionPerformed(ActionEvent c) {
							System.exit(0);			// Encerra Janelas ao clicar no novo botão
						}
					});
					
					dialog.getContentPane().add(painel2);
					dialog.pack();
					dialog.setVisible(true);	
				}
			}
		});
		
		janela.getContentPane().add(painel);
		janela.pack();
		janela.setVisible(true);
		
	}
}
