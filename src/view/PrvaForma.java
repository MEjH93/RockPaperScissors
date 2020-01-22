package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controler.Controler;
import domen.RockPaperScissors;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PrvaForma extends JFrame {

	private JPanel contentPane;
	private List<String>listaRPS = new ArrayList<String>();
	private JTextField lblPlayer;
	private JTextField lblComputer;
	private JLabel lblNereseno;
	private JLabel lblBotWinovi;
	private JLabel lblRound;
	private JLabel lblBrojWinova;
	private RockPaperScissors rockPaperScissors = Controler.getInstanca().getrockPaperScissors();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrvaForma frame = new PrvaForma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public PrvaForma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWinIgrac = new JLabel("Win");
		lblWinIgrac.setBounds(115, 125, 48, 14);
		contentPane.add(lblWinIgrac);
		
		JLabel lblTies = new JLabel("Ties");
		lblTies.setBounds(331, 125, 48, 14);
		contentPane.add(lblTies);
		
		JLabel lblWin1 = new JLabel("Win");
		lblWin1.setBounds(508, 125, 48, 14);
		contentPane.add(lblWin1);
		

		
		
		JLabel lblRound = new JLabel("Round");
		lblRound.setBounds(331, 65, 48, 14);
		contentPane.add(lblRound);
		
		lblBrojWinova = new JLabel("");
		lblBrojWinova.setBounds(99, 150, 48, 14);
		contentPane.add(lblBrojWinova);
		
		lblNereseno = new JLabel("");
		lblNereseno.setBounds(316, 150, 48, 14);
		contentPane.add(lblNereseno);
		
		
		lblBotWinovi = new JLabel("");
		lblBotWinovi.setBounds(491, 150, 48, 14);
		contentPane.add(lblBotWinovi);
		
		lblPlayer = new JTextField();
		lblPlayer.setBounds(96, 265, 96, 20);
		contentPane.add(lblPlayer);
		lblPlayer.setColumns(10);
		//if()
		
		
		JLabel lblNewLabel = new JLabel("Player");
		lblNewLabel.setBounds(32, 268, 48, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Computer");
		lblNewLabel_1.setBounds(387, 268, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnRock = new JButton("Rock");
		btnRock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MODEL M = cONTROLER.PLAYGAME("Rock");
				//CREATEVIEW(M);
				setValue(lblPlayer.getText(), lblComputer.getText(), rockPaperScissors.getRock(), rockPaperScissors.getScissors(), rockPaperScissors.getPaper());
				
			}
			
			}
		);
		btnRock.setBounds(32, 421, 89, 23);
		contentPane.add(btnRock);
		
		JButton btnPaper = new JButton("Paper");
		btnPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setValue(lblPlayer.getText(), lblComputer.getText(),rockPaperScissors.getPaper(), rockPaperScissors.getScissors(), rockPaperScissors.getRock());
				
				
			}
		});
		btnPaper.setBounds(124, 421, 89, 23);
		contentPane.add(btnPaper);
		
		JButton btnScissors = new JButton("Scissors");
		btnScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setValue(lblPlayer.getText(), lblComputer.getText(), rockPaperScissors.getScissors(), rockPaperScissors.getPaper(), rockPaperScissors.getRock());
			}
				
			
		});
		btnScissors.setBounds(223, 421, 89, 23);
		contentPane.add(btnScissors);
		
		lblComputer = new JTextField();
		lblComputer.setColumns(10);
		lblComputer.setBounds(460, 265, 96, 20);
		contentPane.add(lblComputer);
		cleardugme();
		
			
		
	}
	public void setValue(String valuePlayer , String valueComputer, String type, String typeValue, String typeValue1) {
		lblPlayer.setText(Controler.getInstanca().getValue(type));
		
		cleardugme();
		lblComputer.setText(Controler.getInstanca().napuniBota());
		
		if(valuePlayer.equalsIgnoreCase(valueComputer)) { 
			napuniLabelu(lblNereseno);
			JOptionPane.showMessageDialog(null, "Tied");
	    }else if(valuePlayer.equalsIgnoreCase(type) && valueComputer.equalsIgnoreCase(typeValue)) {
			napuniLabelu(lblBrojWinova);
			JOptionPane.showMessageDialog(null, "Player wins");
		}else if(valuePlayer.equalsIgnoreCase(type) && valueComputer.equalsIgnoreCase(typeValue1)) {
			napuniLabelu(lblBotWinovi);
			JOptionPane.showMessageDialog(null, "Computer wins");
		}
		
		lblPlayer.setText("");
		lblComputer.setText("");
		
	}
	
	private void napuniLabelu(JLabel label) {
		label.setText(Controler.getInstanca().getValueLabel(label.getText()));
		
	}

	private void cleardugme() {
		lblComputer.setText("");
		
	}

	
	
}
