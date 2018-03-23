import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Commerce extends JFrame{
	final JLabel viv1 = new JLabel();
	final JLabel viv2 = new JLabel();
	final JLabel viv3 = new JLabel();
	final JLabel viv4 = new JLabel();
	final JLabel viv5 = new JLabel();
	final JLabel viv6 = new JLabel();
	final JLabel mat1 = new JLabel();
	final JLabel mat2 = new JLabel();
	final JLabel mat3 = new JLabel();
	final JLabel mat4 = new JLabel();
	final JLabel mat5 = new JLabel();
	final JLabel mat6 = new JLabel();
	final JLabel rec1 = new JLabel();
	final JLabel rec2 = new JLabel();
	final JLabel rec3 = new JLabel();
	final JLabel rec4 = new JLabel();
	final JLabel rec5 = new JLabel();
	final JLabel rec6 = new JLabel();
	
	JRadioButton cont1 = new JRadioButton("Atrodia");
	JRadioButton cont2 = new JRadioButton("Corlantae");
	JRadioButton cont3 = new JRadioButton("Hepothysus");
	JRadioButton cont4 = new JRadioButton("Olegea");
	JRadioButton cont5 = new JRadioButton("Revus");
	JRadioButton cont6 = new JRadioButton("Tertio");
	JRadioButton cont7 = new JRadioButton("Verkonos");
	
	private Dimension dim2 = new Dimension(180,35);
	private Dimension dim = new Dimension(210,270);
	
	public Commerce(){
		this.setTitle("Table de commerce en Hykosya");
		this.setSize(800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new FlowLayout());
		this.tableCommerce();
		this.setVisible(true);
	}
	
	private void tableCommerce(){
		// Commerce
		JPanel commerce = new JPanel();
				
		JPanel continent = new JPanel();
		cont1 = new JRadioButton("Atrodia");
		cont2 = new JRadioButton("Corlantae");
		cont3 = new JRadioButton("Hepothysus");
		cont4 = new JRadioButton("Olegea");
		cont5 = new JRadioButton("Revus");
		cont6 = new JRadioButton("Tertio");
		cont7 = new JRadioButton("Verkonos");
		
		cont1.addActionListener(new AtrodiaListener());
		cont2.addActionListener(new CorlantaeListener());
		cont3.addActionListener(new HepothysusListener());
		cont4.addActionListener(new OlegeaListener());
		cont5.addActionListener(new RevusListener());
		cont6.addActionListener(new TertioListener());
		cont7.addActionListener(new VerkonosListener());
		
		continent.add(cont1);
		continent.add(cont2);
		continent.add(cont3);
		continent.add(cont4);
		continent.add(cont5);
		continent.add(cont6);
		continent.add(cont7);
		continent.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black), "Choix du continent", TitledBorder.CENTER, TitledBorder.TOP));
		continent.setPreferredSize(new Dimension(700,70));
				
		JPanel achat = new JPanel();
		JPanel achatVivre = new JPanel();
		Font police = new Font("Arial",Font.PLAIN, 13);
		viv1.setFont(police);
		viv1.setPreferredSize(dim2);
		viv1.setHorizontalAlignment(JLabel.CENTER);
		viv1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		viv2.setFont(police);
		viv2.setPreferredSize(dim2);
		viv2.setHorizontalAlignment(JLabel.CENTER);
		viv2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		viv3.setFont(police);
		viv3.setPreferredSize(dim2);
		viv3.setHorizontalAlignment(JLabel.CENTER);
		viv3.setBorder(BorderFactory.createLineBorder(Color.black));
				
		viv4.setFont(police);
		viv4.setPreferredSize(dim2);
		viv4.setHorizontalAlignment(JLabel.CENTER);
		viv4.setBorder(BorderFactory.createLineBorder(Color.black));
		
		viv5.setFont(police);
		viv5.setPreferredSize(dim2);
		viv5.setHorizontalAlignment(JLabel.CENTER);
		viv5.setBorder(BorderFactory.createLineBorder(Color.black));
		
		viv6.setFont(police);
		viv6.setPreferredSize(dim2);
		viv6.setHorizontalAlignment(JLabel.CENTER);
		viv6.setBorder(BorderFactory.createLineBorder(Color.black));
				
		achatVivre.add(viv1);
		achatVivre.add(viv2);
		achatVivre.add(viv3);
		achatVivre.add(viv4);
		achatVivre.add(viv5);
		achatVivre.add(viv6);
		achatVivre.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black), "Vivre", TitledBorder.CENTER, TitledBorder.TOP));
		achatVivre.setPreferredSize(dim);
		
		JPanel achatMateriau = new JPanel();
		mat1.setFont(police);
		mat1.setPreferredSize(dim2);
		mat1.setHorizontalAlignment(JLabel.CENTER);
		mat1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		mat2.setFont(police);
		mat2.setPreferredSize(dim2);
		mat2.setHorizontalAlignment(JLabel.CENTER);
		mat2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		mat3.setFont(police);
		mat3.setPreferredSize(dim2);
		mat3.setHorizontalAlignment(JLabel.CENTER);
		mat3.setBorder(BorderFactory.createLineBorder(Color.black));
				
		mat4.setFont(police);
		mat4.setPreferredSize(dim2);
		mat4.setHorizontalAlignment(JLabel.CENTER);
		mat4.setBorder(BorderFactory.createLineBorder(Color.black));
		
		mat5.setFont(police);
		mat5.setPreferredSize(dim2);
		mat5.setHorizontalAlignment(JLabel.CENTER);
		mat5.setBorder(BorderFactory.createLineBorder(Color.black));
		
		mat6.setFont(police);
		mat6.setPreferredSize(dim2);
		mat6.setHorizontalAlignment(JLabel.CENTER);
		mat6.setBorder(BorderFactory.createLineBorder(Color.black));
				
		achatMateriau.add(mat1);
		achatMateriau.add(mat2);
		achatMateriau.add(mat3);
		achatMateriau.add(mat4);
		achatMateriau.add(mat5);
		achatMateriau.add(mat6);
		achatMateriau.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black), "Materiaux", TitledBorder.CENTER, TitledBorder.TOP));
		achatMateriau.setPreferredSize(dim);
				
		JPanel recherche = new JPanel();
		rec1.setFont(police);
		rec1.setPreferredSize(dim2);
		rec1.setHorizontalAlignment(JLabel.CENTER);
		rec1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		rec2.setFont(police);
		rec2.setPreferredSize(dim2);
		rec2.setHorizontalAlignment(JLabel.CENTER);
		rec2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		rec3.setFont(police);
		rec3.setPreferredSize(dim2);
		rec3.setHorizontalAlignment(JLabel.CENTER);
		rec3.setBorder(BorderFactory.createLineBorder(Color.black));
				
		rec4.setFont(police);
		rec4.setPreferredSize(dim2);
		rec4.setHorizontalAlignment(JLabel.CENTER);
		rec4.setBorder(BorderFactory.createLineBorder(Color.black));
		
		rec5.setFont(police);
		rec5.setPreferredSize(dim2);
		rec5.setHorizontalAlignment(JLabel.CENTER);
		rec5.setBorder(BorderFactory.createLineBorder(Color.black));
		
		rec6.setFont(police);
		rec6.setPreferredSize(dim2);
		rec6.setHorizontalAlignment(JLabel.CENTER);
		rec6.setBorder(BorderFactory.createLineBorder(Color.black));
				
		recherche.add(rec1);
		recherche.add(rec2);
		recherche.add(rec3);
		recherche.add(rec4);
		recherche.add(rec5);
		recherche.add(rec6);
		recherche.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black), "Articles recherchés", TitledBorder.CENTER, TitledBorder.TOP));
		recherche.setPreferredSize(dim);
		
		achat.add(achatVivre, BorderLayout.WEST);
		achat.add(achatMateriau, BorderLayout.CENTER);
		achat.add(recherche, BorderLayout.EAST);
		achat.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red), "Achat/Vente", TitledBorder.CENTER, TitledBorder.TOP));
		
		commerce.add(continent);
		commerce.add(achat);
		commerce.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red), "Commerce sur Hykosya", TitledBorder.CENTER, TitledBorder.TOP));
		commerce.setPreferredSize(new Dimension(750,450));
		
		this.getContentPane().add(commerce);
		this.setVisible(true);
	}
	
	class AtrodiaListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			tableCom();
		}
	}
	
	class CorlantaeListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			tableCom();
		}
	}
	
	class HepothysusListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			tableCom();
		}
	}
	
	class OlegeaListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			tableCom();
		}
	}
	
	class RevusListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			tableCom();
		}
	}
	
	class TertioListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			tableCom();
		}
	}
	
	class VerkonosListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			tableCom();
		}
	}
	
	public void tableCom(){
		if(cont1.isSelected()==true){
			viv1.setText("Vache/Lait (1500 PA)");
			viv2.setText("Sucre (750 PA)");
			viv3.setText("Poule/Oeuf (750 PA)");
			viv4.setText("Ananas (1500 PA)");
			viv5.setText("Tomate (1000 PA)");
			viv6.setText("Café (2500 PA)");
			
			mat1.setText("Tissus (750 PA)");
			mat2.setText("Acier (5000 PA)");
			mat3.setText("Or (25 000 PA)");
			mat4.setText("Pin (1000 PA)");
			mat5.setText("Orme (1500 PA)");
			mat6.setText("Lin (1500 PA)");
			
			rec1.setText("Avoine (5000 PA)");
			rec2.setText("Rhum (1500 PA)");
			rec3.setText("Mouton (1500 PA)");
			rec4.setText("Plume (4000 PA)");
			rec5.setText("Huile de baleine (60000 PA)");
			rec6.setText("Fer (3000 PA)");
		}
		if(cont2.isSelected()==true){
			viv1.setText("Porc (750 PA)");
			viv2.setText("Rhum (1000 PA)");
			viv3.setText("Orge (750 PA)");
			viv4.setText("Patate (750 PA)");
			viv5.setText("Tabac (2500 PA)");
			viv6.setText("Thon (2500 PA)");
			
			mat1.setText("Cuivre (2000 PA)");
			mat2.setText("Fer (2000 PA)");
			mat3.setText("Ebonite (25 000 PA)");
			mat4.setText("Pin (1000 PA)");
			mat5.setText("Bouleau (1000 PA)");
			mat6.setText("Lin (1500 PA)");
			
			rec1.setText("Baleine (5000 PA)");
			rec2.setText("Café (3750 PA)");
			rec3.setText("Mouton (1500 PA)");
			rec4.setText("Acajou (10 000 PA)");
			rec5.setText("Parchemin (9000 PA)");
			rec6.setText("Diamand (75 000 PA)");
		}
		if(cont3.isSelected()==true){
			viv1.setText("Sanglier (2000 PA)");
			viv2.setText("Café (2500 PA)");
			viv3.setText("Orge (750 PA)");
			viv4.setText("Mouton (1500 PA)");
			viv5.setText("Rhum (1000 PA)");
			viv6.setText("Bière (500 PA)");
			
			mat1.setText("Voile (2000 PA)");
			mat2.setText("Fer (2000 PA)");
			mat3.setText("Parchemin (6000 PA)");
			mat4.setText("Topaze/Rubis (50 000 PA)");
			mat5.setText("Cordage (3000 PA)");
			mat6.setText("Argent (10 000 PA)");
			
			rec1.setText("Tomate (1500 PA)");
			rec2.setText("Or (37 500 PA)");
			rec3.setText("Acajou (10 000 PA)");
			rec4.setText("Bronze (25 000 PA)");
			rec5.setText("Soie (7500 PA)");
			rec6.setText("Cuivre (3000 PA)");
		}
		if(cont4.isSelected()==true){
			viv1.setText("Poule/Oeuf (750 PA)");
			viv2.setText("Sucre (750 PA)");
			viv3.setText("Raisin/Vin (3000 PA)");
			viv4.setText("Ananas (1500 PA)");
			viv5.setText("Tomate (1000 PA)");
			viv6.setText("Farine (1000 PA)");
			
			mat1.setText("Diamand/Saphir (50 000 PA)");
			mat2.setText("Pierre (1000 PA)");
			mat3.setText("Sapin (1000 PA)");
			mat4.setText("Soie (5000 PA)");
			mat5.setText("Bouleau (1000 PA)");
			mat6.setText("Lin (1500 PA)");
			
			rec1.setText("Chèvre/Lait (2250 PA)");
			rec2.setText("Avoine (5000 PA)");
			rec3.setText("Porc (1125 PA)");
			rec4.setText("Bronze (25 000 PA)");
			rec5.setText("Fer (3000 PA)");
			rec6.setText("Acajou (10 000 PA)");
		}
		if(cont5.isSelected()==true){
			viv1.setText("Malte (750 PA)");
			viv2.setText("Banane (850 PA)");
			viv3.setText("Pomme (750 PA)");
			viv4.setText("Orge (750 PA)");
			viv5.setText("Riz (2000 PA)");
			viv6.setText("Cerf (4000 PA)");
			
			mat1.setText("Laine (1000 PA)");
			mat2.setText("Fer (1000 PA)");
			mat3.setText("Cuivre (2000 PA)");
			mat4.setText("Topaze/Rubis (50 000 PA)");
			mat5.setText("Poudre (3000 PA)");
			mat6.setText("Acier (5000 PA)");
			
			rec1.setText("Café (3750 PA)");
			rec2.setText("Liqueur (90 000 PA)");
			rec3.setText("Ananas (2250 PA)");
			rec4.setText("Caviar (80 000 PA)");
			rec5.setText("Pin (1500 PA)");
			rec6.setText("Pierre (1500 PA)");
		}
		if(cont6.isSelected()==true){
			viv1.setText("Chèvre/Lait (1500 PA)");
			viv2.setText("Banane (850 PA)");
			viv3.setText("Malte (750 PA)");
			viv4.setText("Orge (750 PA)");
			viv5.setText("Blé (750 PA)");
			viv6.setText("Raisin/Vin (3000 PA)");
			
			mat1.setText("Bouleau (1000 PA)");
			mat2.setText("Or (25 000 PA)");
			mat3.setText("Huile de Baleine (40 000 PA)");
			mat4.setText("Soie (5000 PA)");
			mat5.setText("Emeraude (55 000 PA)");
			mat6.setText("Poudre (3000 PA)");
			
			rec1.setText("Farine (1500 PA)");
			rec2.setText("Avoine (5000 PA)");
			rec3.setText("Pierre (1500 PA)");
			rec4.setText("Parchemin (9000 PA)");
			rec5.setText("Encre (7500 PA)");
			rec6.setText("Ebonite (37 500 PA)");
		}
		if(cont7.isSelected()==true){
			viv1.setText("Tabac (2500 PA)");
			viv2.setText("Café (2500 PA)");
			viv3.setText("Tomate (1000 PA)");
			viv4.setText("Farine (1000 PA)");
			viv5.setText("Blé (750 PA)");
			viv6.setText("Liqueur (60 000 PA)");
			
			mat1.setText("Encre (5000 PA)");
			mat2.setText("Parchemin (6000 PA)");
			mat3.setText("Argent (10 000 PA)");
			mat4.setText("Chène (1200 PA)");
			mat5.setText("Ebène (6000 PA)");
			mat6.setText("Fer (1000 PA)");
			
			rec1.setText("Cerf (6000 PA)");
			rec2.setText("Orge (1125 PA)");
			rec3.setText("Malte (1125 PA)");
			rec4.setText("Ebonite (37 500 PA)");
			rec5.setText("Or (37 500 PA)");
			rec6.setText("Tissus (1125 PA)");
		}
	}
}