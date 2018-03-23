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

public class Bateau extends JFrame{
	JComboBox classeBateau = new JComboBox();
	JComboBox typeBateau = new JComboBox();
	final boolean update = true;
	
	// Definition des Labels
	final JLabel exp = new JLabel();
	final JLabel res = new JLabel();
	final JLabel vit = new JLabel();
	final JLabel nbc = new JLabel();
	final JLabel def = new JLabel();
	final JLabel ref = new JLabel();
	final JLabel tonMax = new JLabel();
	final JLabel rep = new JLabel();
	final JLabel mun = new JLabel();
	final JLabel bouffe = new JLabel();
	final JLabel rap = new JLabel();
	final JLabel tir = new JLabel();
	final JLabel comb = new JLabel();
	final JLabel canon = new JLabel();
	final JLabel lceg = new JLabel();
	final JLabel nbeT = new JLabel();
	final JLabel vivPil = new JLabel();
	final JLabel matPil = new JLabel();
		
	private Dimension dim = new Dimension(100,20);
	private Dimension dim2 = new Dimension(120,35);
	private Dimension dim3 = new Dimension(300,150);
	private Dimension dim4 = new Dimension(750,80);
	
	private int resistance, defense, reflexe, nbCanon, nbEquipage, ingenieur, lanceGrappin, cannonier, combattant, tireur;
	private int munition, reparation, nourriture, rapine, tonnageMax, experience;
	private double vitesse;
	
	public Bateau(){
		this.setTitle("Statistiques des bateaux");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new FlowLayout());
		this.carac();
		this.setVisible(true);
	}
	
	private void carac(){
		/*
		 * Classe, Type et Expérience du bateau
		 */
		JPanel classeTypeExp = new JPanel();
		String[] tab = {"Sloop", "Caravelle", "Galère", "Cuirassé", "Frégate", "Gallion"};
		classeBateau = new JComboBox(tab);
		JLabel labelClasse = new JLabel("Classe du bateau");
			
		String[] tab2 = {"Pirate", "Militaire", "Marchand"};
		typeBateau = new JComboBox(tab2);
		JLabel labelType = new JLabel("Type du bateau");
		
		JPanel top = new JPanel();
		top.add(labelClasse);
		top.add(classeBateau);
		classeBateau.setPreferredSize(dim);
		
		JPanel top2 = new JPanel();
		top2.add(labelType);
		top2.add(typeBateau);
		typeBateau.setPreferredSize(dim);
		
		Font police = new Font("Arial",Font.PLAIN, 13);
		exp.setFont(police);
		exp.setPreferredSize(dim2);
		exp.setHorizontalAlignment(JLabel.CENTER);
		exp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.green), "Expériences", TitledBorder.LEFT, TitledBorder.TOP));
		
		classeTypeExp.add(top);
		classeTypeExp.add(top2);
		classeTypeExp.add(exp);
		classeTypeExp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black), "Classe, type de bateau et expérience gagnée", TitledBorder.CENTER, TitledBorder.TOP));
		classeTypeExp.setPreferredSize(dim4);
		
		/*
		 * Assiociation
		 */
		classeBateau.addActionListener(new ClasseListener());
		typeBateau.addActionListener(new TypeListener());
		
		/*
		 * Caractéristiques de combat du bateau
		 */
		JPanel ligne2 = new JPanel();
		JPanel combat = new JPanel();
		
		res.setFont(police);
		res.setPreferredSize(dim2);
		res.setHorizontalAlignment(JLabel.CENTER);
		res.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Résistance", TitledBorder.LEFT, TitledBorder.TOP));
		
		vit.setFont(police);
		vit.setPreferredSize(dim2);
		vit.setHorizontalAlignment(JLabel.CENTER);
		vit.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Vitesse", TitledBorder.LEFT, TitledBorder.TOP));
		
		nbc.setFont(police);
		nbc.setPreferredSize(dim2);
		nbc.setHorizontalAlignment(JLabel.CENTER);
		nbc.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Nombre de canon", TitledBorder.LEFT, TitledBorder.TOP));
		
		def.setFont(police);
		def.setPreferredSize(dim2);
		def.setHorizontalAlignment(JLabel.CENTER);
		def.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Bonus de défense", TitledBorder.LEFT, TitledBorder.TOP));
		
		ref.setFont(police);
		ref.setPreferredSize(dim2);
		ref.setHorizontalAlignment(JLabel.CENTER);
		ref.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Bonus de réflexe", TitledBorder.LEFT, TitledBorder.TOP));
				
		combat.add(res);
		combat.add(vit);
		combat.add(nbc);
		combat.add(def);
		combat.add(ref);
		combat.setPreferredSize(dim3);
		combat.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black), "Caractéristiques de combat", TitledBorder.CENTER, TitledBorder.TOP));
		
		JPanel soute = new JPanel();
		
		tonMax.setFont(police);
		tonMax.setPreferredSize(dim2);
		tonMax.setHorizontalAlignment(JLabel.CENTER);
		tonMax.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Tonnage max", TitledBorder.LEFT, TitledBorder.TOP));
		
		rep.setFont(police);
		rep.setPreferredSize(dim2);
		rep.setHorizontalAlignment(JLabel.CENTER);
		rep.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Reparation", TitledBorder.LEFT, TitledBorder.TOP));
		
		mun.setFont(police);
		mun.setPreferredSize(dim2);
		mun.setHorizontalAlignment(JLabel.CENTER);
		mun.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Munition", TitledBorder.LEFT, TitledBorder.TOP));
		
		bouffe.setFont(police);
		bouffe.setPreferredSize(dim2);
		bouffe.setHorizontalAlignment(JLabel.CENTER);
		bouffe.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Nourriture", TitledBorder.LEFT, TitledBorder.TOP));
		
		rap.setFont(police);
		rap.setPreferredSize(dim2);
		rap.setHorizontalAlignment(JLabel.CENTER);
		rap.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Inventaire", TitledBorder.LEFT, TitledBorder.TOP));
		
		soute.add(tonMax);
		soute.add(rep);
		soute.add(mun);
		soute.add(bouffe);
		soute.add(rap);
		soute.setPreferredSize(dim3);
		soute.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black), "Organisation de la soute", TitledBorder.CENTER, TitledBorder.TOP));
		
		ligne2.add(combat);
		ligne2.add(soute);
		
		JPanel equipage = new JPanel();
		
		final JLabel cap = new JLabel();
		cap.setText("1");
		cap.setFont(police);
		cap.setPreferredSize(dim2);
		cap.setHorizontalAlignment(JLabel.CENTER);
		cap.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Capitaine", TitledBorder.LEFT, TitledBorder.TOP));
		
		final JLabel med = new JLabel();
		med.setText("1");
		med.setFont(police);
		med.setPreferredSize(dim2);
		med.setHorizontalAlignment(JLabel.CENTER);
		med.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Médecin", TitledBorder.LEFT, TitledBorder.TOP));
		
		final JLabel cuisto = new JLabel();
		cuisto.setText("1");
		cuisto.setFont(police);
		cuisto.setPreferredSize(dim2);
		cuisto.setHorizontalAlignment(JLabel.CENTER);
		cuisto.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Cuisto", TitledBorder.LEFT, TitledBorder.TOP));
		
		final JLabel inge = new JLabel();
		inge.setFont(police);
		inge.setPreferredSize(dim2);
		inge.setHorizontalAlignment(JLabel.CENTER);
		inge.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Ingénieure", TitledBorder.LEFT, TitledBorder.TOP));
		classeBateau.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if(classeBateau.getSelectedItem()=="Sloop"){
					ingenieur = 0;
				}
				else{
					ingenieur = 1;
				}
				inge.setText(String.valueOf(ingenieur));
			}
		});
		
		tir.setFont(police);
		tir.setPreferredSize(dim2);
		tir.setHorizontalAlignment(JLabel.CENTER);
		tir.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Tireur", TitledBorder.LEFT, TitledBorder.TOP));
		
		comb.setFont(police);
		comb.setPreferredSize(dim2);
		comb.setHorizontalAlignment(JLabel.CENTER);
		comb.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Combattant", TitledBorder.LEFT, TitledBorder.TOP));
		
		canon.setFont(police);
		canon.setPreferredSize(dim2);
		canon.setHorizontalAlignment(JLabel.CENTER);
		canon.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Cannonier", TitledBorder.LEFT, TitledBorder.TOP));
		
		lceg.setFont(police);
		lceg.setPreferredSize(dim2);
		lceg.setHorizontalAlignment(JLabel.CENTER);
		lceg.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue), "Lance-grappin", TitledBorder.LEFT, TitledBorder.TOP));
		
		nbeT.setFont(police);
		nbeT.setPreferredSize(dim2);
		nbeT.setHorizontalAlignment(JLabel.CENTER);
		nbeT.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.green), "Nombre de marin", TitledBorder.LEFT, TitledBorder.TOP));
		
		equipage.add(cap);
		equipage.add(med);
		equipage.add(cuisto);
		equipage.add(inge);
		equipage.add(tir);
		equipage.add(comb);
		equipage.add(canon);
		equipage.add(lceg);
		equipage.add(nbeT);
		equipage.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black), "Composition de l'équipage", TitledBorder.CENTER, TitledBorder.TOP));
		equipage.setPreferredSize(new Dimension(750,110));
		
		
		/*
		 * Pillage et Commerce		
		 */
		
		JPanel pillage = new JPanel();
		JPanel vivre = new JPanel();
		JTextField DDVivre = new JTextField();
		JLabel labelDDVivre = new JLabel("Résultat DD");
		
		String[] tab_vivre={"Blé", "Avoine", "Orge", "Riz", "Malte", "Pomme", "Banane", "Ananas", "Café", " Tomate"
				, "Patate", "Vache/Lait", "Porc", "Mouton", "Farine", "Chèvre/Lait", "Poule/oeuf", "Cerf", "Sanglier"
				, "Sucre", "Rhum", "Bière", "Liqueur", "Raisin/Vin", "Caviar", "Cognac", "Tabac", "Baleine", "Thon"};
		
		DDVivre.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if(update){
					String temp = DDVivre.getText();
					int temp2 = Integer.parseInt(temp)-2;
					vivPil.setText(tab_vivre[temp2]);
				}
			}
		});		
		DDVivre.setPreferredSize(new Dimension(100,20));
		
		vivPil.setFont(police);
		vivPil.setPreferredSize(dim2);
		vivPil.setHorizontalAlignment(JLabel.CENTER);
		vivPil.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black), "Résultat", TitledBorder.LEFT, TitledBorder.TOP));
		
		vivre.add(labelDDVivre);
		vivre.add(DDVivre);
		vivre.add(vivPil);
		vivre.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black), "Vivre", TitledBorder.CENTER, TitledBorder.TOP));
		
		JPanel materiaux = new JPanel();
		JTextField DDMateriaux = new JTextField();
		JLabel labelDDMateriaux = new JLabel("Résultat DD");
		
		String[] tab_materiaux={"Cuivre", "Or", "Diamand/Saphir", "Topaze/Rubis", "Emeraude", "Bouleau", "Pin", "Pierre", "Orme", "Chêne", "Sapin", "Acajou"
				, "Tissus", "Soie", "Laine", "Lin", "Parchemin", "Encre", "Poudre", "Voile", "Cordage", "Huile de Baleine", "Acier", "Ebène", "Ebonite"
				, "Fer", "Plume", "Argent", "Bronze"};
		
		DDMateriaux.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if(update){
					String temp = DDMateriaux.getText();
					int temp2 = Integer.parseInt(temp)-2;
					matPil.setText(tab_materiaux[temp2]);
				}
			}
		});		
		DDMateriaux.setPreferredSize(new Dimension(100,20));
		
		matPil.setFont(police);
		matPil.setPreferredSize(dim2);
		matPil.setHorizontalAlignment(JLabel.CENTER);
		matPil.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black), "Résultat", TitledBorder.LEFT, TitledBorder.TOP));
		
		materiaux.add(labelDDMateriaux);
		materiaux.add(DDMateriaux);
		materiaux.add(matPil);
		materiaux.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black), "Matériau", TitledBorder.CENTER, TitledBorder.TOP));
		
		pillage.add(vivre, BorderLayout.WEST);
		pillage.add(materiaux, BorderLayout.EAST);
		pillage.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red), "Pillage (1d10+1d20)", TitledBorder.CENTER, TitledBorder.TOP));
		pillage.setPreferredSize(new Dimension(750,110));
		
			
		this.getContentPane().add(classeTypeExp, BorderLayout.NORTH);
		this.getContentPane().add(ligne2, BorderLayout.CENTER);
		this.getContentPane().add(equipage,BorderLayout.CENTER);
		this.getContentPane().add(pillage,BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	class ClasseListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			caracteristique();
			exp.setText(String.valueOf(resistance));
			res.setText(String.valueOf(resistance));
			vit.setText(String.valueOf(vitesse));
			nbc.setText(String.valueOf(nbCanon));
			def.setText(String.valueOf(defense));
			ref.setText(String.valueOf(reflexe));
			tonMax.setText(String.valueOf(tonnageMax));
			rep.setText(String.valueOf(reparation));
			mun.setText(String.valueOf(munition));
			bouffe.setText(String.valueOf(nourriture));
			rap.setText(String.valueOf(rapine));
			tir.setText(String.valueOf(tireur));
			comb.setText(String.valueOf(combattant));
			canon.setText(String.valueOf(cannonier));
			lceg.setText(String.valueOf(lanceGrappin));
			nbeT.setText(String.valueOf(nbEquipage));
		}
	}
	
	class TypeListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			caracteristique();
			exp.setText(String.valueOf(experience));
			res.setText(String.valueOf(resistance));
			vit.setText(String.valueOf(vitesse));
			nbc.setText(String.valueOf(nbCanon));
			def.setText(String.valueOf(defense));
			ref.setText(String.valueOf(reflexe));
			tonMax.setText(String.valueOf(tonnageMax));
			rep.setText(String.valueOf(reparation));
			mun.setText(String.valueOf(munition));
			bouffe.setText(String.valueOf(nourriture));
			rap.setText(String.valueOf(rapine));
			tir.setText(String.valueOf(tireur));
			comb.setText(String.valueOf(combattant));
			canon.setText(String.valueOf(cannonier));
			lceg.setText(String.valueOf(lanceGrappin));
			nbeT.setText(String.valueOf(nbEquipage));
		}
	}
	public void caracteristique(){
		if(classeBateau.getSelectedItem()=="Sloop"){
			int resBase = 156;
			double vitBase = 1.5;
			int nbCanonBase = 2;
			int defBase = 2;
			int refBase = 1;
			int tonBase = 2500;
			tireur = 2;
			combattant = 2;
			cannonier = 2;
			lanceGrappin = 2;
			nbEquipage = 14;
			if(typeBateau.getSelectedItem()=="Pirate"){
				experience = 453;
				resistance = resBase;
				vitesse = vitBase;
				nbCanon = nbCanonBase;
				defense = defBase;
				reflexe = refBase;
				tonnageMax = tonBase;
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
			if(typeBateau.getSelectedItem()=="Militaire"){
				experience = 491;
				resistance = (int)(resBase + resBase*0.3);
				vitesse = vitBase - vitBase*0.2;
				nbCanon = (int)(nbCanonBase + nbCanonBase*0.1);
				defense = defBase + 1;
				reflexe = refBase + 1;
				tonnageMax = (int)(tonBase-tonBase*0.3);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
			if(typeBateau.getSelectedItem()=="Marchand"){
				experience = 461;
				resistance = (int)(resBase - resBase*0.15);
				vitesse = vitBase + vitBase*0.2;
				nbCanon = (int)(nbCanonBase - nbCanonBase*0.1);
				defense = defBase;
				reflexe = refBase;
				tonnageMax = (int)(tonBase+tonBase*0.1);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
		}
		if(classeBateau.getSelectedItem()=="Caravelle"){
			int resBase = 372;
			double vitBase = 1.5;
			int nbCanonBase = 5;
			int defBase = 4;
			int refBase = 2;
			int tonBase = 5000;
			tireur = 3;
			combattant = 3;
			cannonier = 10;
			lanceGrappin = 5;
			nbEquipage = 26;
			if(typeBateau.getSelectedItem()=="Pirate"){
				experience = 734;
				resistance = resBase;
				vitesse = vitBase;
				nbCanon = nbCanonBase;
				defense = defBase;
				reflexe = refBase;
				tonnageMax = tonBase;
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
			if(typeBateau.getSelectedItem()=="Militaire"){
				experience = 812;
				resistance = (int)(resBase + resBase*0.3);
				vitesse = vitBase - vitBase*0.2;
				nbCanon = (int)(nbCanonBase + nbCanonBase*0.1);
				defense = defBase + 1;
				reflexe = refBase + 1;
				tonnageMax = (int)(tonBase-tonBase*0.3);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
			if(typeBateau.getSelectedItem()=="Marchand"){
				experience = 736;
				resistance = (int)(resBase - resBase*0.15);
				vitesse = vitBase + vitBase*0.2;
				nbCanon = (int)(nbCanonBase - nbCanonBase*0.1);
				defense = defBase;
				reflexe = refBase;
				tonnageMax = (int)(tonBase+tonBase*0.1);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
		}
		if(classeBateau.getSelectedItem()=="Galère"){
			int resBase = 516;
			double vitBase = 2;
			int nbCanonBase = 7;
			int defBase = 2;
			int refBase = 1;
			int tonBase = 10000;
			tireur = 5;
			combattant = 5;
			cannonier = 14;
			lanceGrappin = 7;
			nbEquipage = 36;
			if(typeBateau.getSelectedItem()=="Pirate"){
				experience =1028;
				resistance = resBase;
				vitesse = vitBase;
				nbCanon = nbCanonBase;
				defense = defBase;
				reflexe = refBase;
				tonnageMax = tonBase;
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
			if(typeBateau.getSelectedItem()=="Militaire"){
				experience = 1146;
				resistance = (int)(resBase + resBase*0.3);
				vitesse = vitBase - vitBase*0.2;
				nbCanon = (int)(nbCanonBase + nbCanonBase*0.1);
				defense = defBase + 1;
				reflexe = refBase + 1;
				tonnageMax = (int)(tonBase-tonBase*0.3);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
			if(typeBateau.getSelectedItem()=="Marchand"){
				experience = 1026;
				resistance = (int)(resBase - resBase*0.15);
				vitesse = vitBase + vitBase*0.2;
				nbCanon = (int)(nbCanonBase + nbCanonBase*0.1);
				defense = defBase;
				reflexe = refBase;
				tonnageMax = (int)(tonBase+tonBase*0.1);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
		}
		if(classeBateau.getSelectedItem()=="Cuirassé"){
			int resBase = 732;
			double vitBase = 1;
			int nbCanonBase = 10;
			int defBase = 6;
			int refBase = 3;
			int tonBase = 15000;
			tireur = 7;
			combattant = 7;
			cannonier = 20;
			lanceGrappin = 10;
			nbEquipage = 49;
			if(typeBateau.getSelectedItem()=="Pirate"){
				experience = 1389;
				resistance = resBase;
				vitesse = vitBase;
				nbCanon = nbCanonBase;
				defense = defBase;
				reflexe = refBase;
				tonnageMax = tonBase;
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
			if(typeBateau.getSelectedItem()=="Militaire"){
				experience = 1547;
				resistance = (int)(resBase + resBase*0.3);
				vitesse = vitBase - vitBase*0.2;
				nbCanon = (int)(nbCanonBase + nbCanonBase*0.1);
				defense = defBase + 1;
				reflexe = refBase + 1;
				tonnageMax = (int)(tonBase-tonBase*0.3);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
			if(typeBateau.getSelectedItem()=="Marchand"){
				experience = 1393;
				resistance = (int)(resBase - resBase*0.15);
				vitesse = vitBase + vitBase*0.2;
				nbCanon = (int)(nbCanonBase - nbCanonBase*0.1);
				defense = defBase;
				reflexe = refBase;
				tonnageMax = (int)(tonBase+tonBase*0.1);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
		}
		if(classeBateau.getSelectedItem()=="Frégate"){
			int resBase = 1092;
			double vitBase = 3;
			int nbCanonBase = 15;
			int defBase = 4;
			int refBase = 2;
			int tonBase = 20000;
			tireur = 10;
			combattant = 10;
			cannonier = 30;
			lanceGrappin = 15;
			nbEquipage = 70;
			if(typeBateau.getSelectedItem()=="Pirate"){
				experience = 1964;
				resistance = resBase;
				vitesse = vitBase;
				nbCanon = nbCanonBase;
				defense = defBase;
				reflexe = refBase;
				tonnageMax = tonBase;
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
				
			}
			if(typeBateau.getSelectedItem()=="Militaire"){
				experience = 2202;
				resistance = (int)(resBase + resBase*0.3);
				vitesse = vitBase - vitBase*0.2;
				nbCanon = (int)(nbCanonBase + nbCanonBase*0.1);
				defense = defBase + 1;
				reflexe = refBase + 1;
				tonnageMax = (int)(tonBase-tonBase*0.3);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
				
			}
			if(typeBateau.getSelectedItem()=="Marchand"){
				experience = 2006;
				resistance = (int)(resBase - resBase*0.15);
				vitesse = vitBase + vitBase*0.2;
				nbCanon = (int)(nbCanonBase - nbCanonBase*0.1);
				defense = defBase;
				reflexe = refBase;
				tonnageMax = (int)(tonBase+tonBase*0.1);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
		}
		if(classeBateau.getSelectedItem()=="Gallion"){
			int resBase = 1452;
			double vitBase = 4;
			int nbCanonBase = 20;
			int defBase = 4;
			int refBase =3;
			int tonBase = 30000;
			tireur = 15;
			combattant = 15;
			cannonier = 40;
			lanceGrappin = 20;
			nbEquipage = 95;
			if(typeBateau.getSelectedItem()=="Pirate"){
				experience = 2699;
				resistance = resBase;
				vitesse = vitBase;
				nbCanon = nbCanonBase;
				defense = defBase;
				reflexe = refBase;
				tonnageMax = tonBase;
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
			if(typeBateau.getSelectedItem()=="Militaire"){
				experience = 3017;
				resistance = (int)(resBase + resBase*0.3);
				vitesse = vitBase - vitBase*0.2;
				nbCanon = (int)(nbCanonBase + nbCanonBase*0.1);
				defense = defBase + 1;
				reflexe = refBase + 1;
				tonnageMax = (int)(tonBase-tonBase*0.3);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
			if(typeBateau.getSelectedItem()=="Marchand"){
				experience = 2755;
				resistance = (int)(resBase - resBase*0.15);
				vitesse = vitBase + vitBase*0.2;
				nbCanon = (int)(nbCanonBase - nbCanonBase*0.1);
				defense = defBase;
				reflexe = refBase;
				tonnageMax = (int)(tonBase+tonBase*0.1);
				reparation = tonBase/5;
				munition = tonBase/5;
				nourriture = nbEquipage*30;
				rapine = tonnageMax - reparation - munition - nourriture;
			}
		}
	}
}
