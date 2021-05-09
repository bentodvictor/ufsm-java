package framesimples;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class FrameSimples {
	
	static int cliques;
	static JLabel texto;
	// 		Declaração apra JList
	private static String [] numbers = {"UM", "DOIS", "TRES", "QUATRO", "CINCO", "SEIS", "SETE"};
	//		Declaração para a JCheckBox
	private static JCheckBox azul, preto, branco, amarelo, vermelho, verde;
	
	public static void main(String args[]) {
		cliques = 0;
		JFrame janela = new JFrame("Aplicacao Simples");
		JButton but = new JButton("Sou um botao");
		texto = new JLabel ("Total de cliques no botao: 0");
		JPanel painel = new JPanel();
		janela.setLocationRelativeTo(null);
		painel.add(but);
		painel.add(texto);   
		
/*			>>> JLIST <<<	
		JList list = new JList(numbers);
		list.setVisibleRowCount(5);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		painel.add(new JScrollPane(list));		*/		  
		
/*				>>> JTextArea <<<
  		JTextArea textArea = new JTextArea(); 
		textArea.setText("testando a area de texto!");
		painel.add(textArea); 		*/
		
/*				>>> JRadioButton <<<		
		JLabel tit = new JLabel ("Marque uma opção:");
		JLabel tit2 = new JLabel ("");
		JRadioButton rbs = new JRadioButton("Sim", true);
		JRadioButton rbn = new JRadioButton("Não");
		painel.setLayout(new FlowLayout());
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rbs);
		grupo1.add(rbn);
		painel.add(tit);
		painel.add(tit2);
		painel.add(rbs);
		painel.add(rbn);		*/
		
		
/*				>>> JCheckBox <<<	
		painel.setLayout(new GridLayout(2,3));
		azul = new JCheckBox("Azul");
		preto = new JCheckBox("Preto");
		branco = new JCheckBox("Branco");
		amarelo = new JCheckBox("Amarelho");
		vermelho = new JCheckBox("Vermelho");
		verde = new JCheckBox("Verde");
		painel.add(azul);
		painel.add(preto);
		painel.add(branco);
		painel.add(amarelo);
		painel.add(vermelho);
		painel.add(verde);			*/
		
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cliques++;
				texto.setText("Total de cliques no botao: " + cliques);
			}
		});
		janela.getContentPane().add(painel);
		janela.pack();
		janela.setVisible(true);
		}
}