package projetoInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;

import Main.FileManager;
import Personagem.Personagem;

import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.beans.VetoableChangeListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;
import java.awt.Panel;

public class FramePrincipal extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField tfNomeDoPersonagem;
	private JTextField tfFor;
	private JTextField tfCon;
	private JTextField tfDes;
	private JTextField tfInt;
	private JTextField tfSab;
	private JTextField tfCar;
	private JTextField tfModFor;
	private JTextField tfModCon;
	private JTextField tfModDes;
	private JTextField tfModInt;
	private JTextField tfModSab;
	private JTextField tfModCar;
	private JLabel lblMod;
	private JTextField tfClassFor;
	private JTextField tfClassCon;
	private JTextField tfClassDes;
	private JTextField tfClassInt;
	private JTextField tfClassSab;
	private JTextField tfClassCar;
	private JTextField tfIdade;
	private JLabel lblTendncia;
	private JComboBox<Object> comboBox_1;
	private JLabel lblDivindade;
	private JComboBox<Object> cbDivindade;
	private JLabel lblDestinopico;
	private JTextField textField;
	private JLabel lblTrilhaExemplar;
	private JTextField textField_1;
	private JLabel lblCompanhiaOuAfiliao;
	private JTextField textField_2;
	private JLabel lblPeri;
	private JLabel lblAcrobacia;
	private JTextField tfAcrobaticsValue;
	private JTextField tfPerDes1;
	private JTextField tfRaceAcrobatics;
	private JTextField tfMiscAcrobatics;
	private JLabel label_5;
	private JTextField tfPerPen1;
	private JLabel label_6;
	private JLabel lblNv;
	private JLabel lblMod_1;
	private JLabel lblRaa;
	private JLabel lblMisc;
	private JLabel lblPenalidadeDaArmadura;
	private JLabel lblArmadura;
	private JTextField tfArcanismValue;
	private JTextField tfPerInt1;
	private JTextField tfRaceArcanism;
	private JTextField tfMiscArcanism;
	private JTextField tfAtletismValue;
	private JTextField tfPerFor1;
	private JTextField tfRaceAtletism;
	private JTextField tfMiscAtletism;
	private JTextField tfPerPen2;
	private JTextField tfBlefValue;
	private JTextField tfPerCar1;
	private JTextField tfRaceBlef;
	private JTextField tfMiscBlef;
	private JTextField tfDiplomacyValue;
	private JTextField tfPerCar2;
	private JTextField tfRaceDiplomacy;
	private JTextField tfMiscDiplomacy;
	private JTextField tfDungeoneringValue;
	private JTextField tfPerSab1;
	private JTextField tfRaceDungeonering;
	private JTextField tfMiscDungeonering;
	private JTextField tfStealthValue;
	private JTextField tfPerDes2;
	private JTextField tfRaceStealth;
	private JTextField tfMiscStealth;
	private JTextField tfPerPen3;
	private JTextField tfHistoryValue;
	private JTextField tfPerInt2;
	private JTextField tfRaceHistory;
	private JTextField tfMiscHistory;
	private JTextField tfIntimidationValue;
	private JTextField tfPerFor2;
	private JTextField tfRaceIntimidation;
	private JTextField tfMiscIntimidation;
	private JTextField tfInsightValue;
	private JTextField tfPerSab2;
	private JTextField tfRaceInsight;
	private JTextField tfMiscInsight;
	private JTextField tfThieveryValue;
	private JTextField tfPerDes3;
	private JTextField tfRaceThievery;
	private JTextField tfMiscThievery;
	private JTextField tfPerPen4;
	private JTextField tfStreetwiseValue;
	private JTextField tfPerCar3;
	private JTextField tfRaceStreetwise;
	private JTextField tfMiscStreetwise;
	private JTextField tfNatureValue;
	private JTextField tfPerSab3;
	private JTextField tfRaceNature;
	private JTextField tfMiscNature;
	private JTextField tfPerceptionValue;
	private JTextField tfPerSab4;
	private JTextField tfRacePerception;
	private JTextField tfMiscPerception;
	private JTextField tfReligionValue;
	private JTextField tfPerInt3;
	private JTextField tfRaceReligion;
	private JTextField tfMiscReligion;
	private JTextField tfHealValue;
	private JTextField tfPerSab5;
	private JTextField tfRaceHeal;
	private JTextField tfMiscHeal;
	private JTextField tfEnduranceValue;
	private JTextField tfPerCon;
	private JTextField tfRaceEndurance;
	private JTextField tfMiscEndurance;
	private JTextField tfPerPen5;
	private JRadioButton rbInsight;
	private JRadioButton rbThievery;
	private JRadioButton rbStreetwise;
	private JRadioButton rbNature;
	private JRadioButton rbPerception;
	private JRadioButton rbReligion;
	private JRadioButton rbHeal;
	private JRadioButton rbEndurance;
	private JLabel lblTrein;
	private JTextField nivel;
	private Panel Defesa;
	private JLabel label_43;
	private JTextField tfCAValue;
	private JLabel label_73;
	private JLabel label_113;
	private JLabel label_114;
	private JTextField tfNivel;
	private JLabel label_115;
	private JLabel label_116;
	private JTextField textField_27;
	private JLabel label_117;
	private JLabel label_118;
	private JTextField tfCAArmor1;
	private JLabel label_119;
	private JTextField tfCAMisc1;
	private JLabel label_120;
	private JLabel label_121;
	private JLabel label_122;
	private JTextField tfCAMisc2;
	private JLabel label_123;
	private JLabel label_124;
	private JTextField textField_31;
	private JLabel label_125;
	private JTextField textField_32;
	private JLabel label_126;
	private JTextField textField_33;
	private JLabel label_127;
	private JTextField textField_34;
	private JLabel label_128;
	private JLabel label_129;
	private JTextField textField_35;
	private JLabel label_130;
	private JLabel label_131;
	private JTextField textField_36;
	private JLabel label_132;
	private JTextField textField_37;
	private JLabel label_133;
	private JTextField textField_38;
	private JLabel label_134;
	private JTextField textField_39;
	private JLabel label_135;
	private JLabel label_136;
	private JTextField textField_40;
	private JLabel label_137;
	private JLabel label_138;
	private JTextField textField_41;
	private JLabel label_139;
	private JTextField textField_42;
	private JLabel label_140;
	private JTextField textField_43;
	private JLabel label_141;
	private JTextField textField_44;
	private JLabel label_142;
	private JLabel label_143;
	private JTextField textField_45;
	private JLabel label_144;
	private JLabel label_145;
	private JTextField textField_46;
	private JLabel label_146;
	private JTextField textField_47;
	private JLabel label_147;
	private JTextField textField_48;
	private JLabel label_148;
	private JTextField tfCAClass;
	private JLabel lblClasse;
	private JLabel label_150;
	private JLabel label_151;
	private JTextField tfCAShield;
	private JLabel label_152;
	private JTextField textField_51;
	private JButton button;
	private Panel Perícias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
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
	public FramePrincipal() {
		Preenchedor atributos = new Preenchedor();
		CaracteristicasPadroes caracteristicas = new CaracteristicasPadroes();
		
		setTitle("Dungeons & Dragons 4.0 - Character Creator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1287, 987);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Personagem p = new Personagem();
		
		Defesa = new Panel();
		Defesa.setBounds(208, 87, 415, 189);
		contentPane.add(Defesa);
		Defesa.setLayout(null);
		
		label_43 = new JLabel("CA");
		label_43.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_43.setBounds(12, 34, 30, 20);
		Defesa.add(label_43);
		
		tfCAValue = new JTextField();
		tfCAValue.setText("0");
		tfCAValue.setColumns(10);
		tfCAValue.setBounds(38, 34, 30, 20);
		Defesa.add(tfCAValue);
		
		label_73 = new JLabel("Valor");
		label_73.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_73.setBounds(42, 11, 39, 20);
		Defesa.add(label_73);
		
		label_113 = new JLabel("=");
		label_113.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_113.setBounds(75, 33, 14, 20);
		Defesa.add(label_113);
		
		label_114 = new JLabel("+");
		label_114.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_114.setBounds(162, 34, 14, 20);
		Defesa.add(label_114);
		
		tfNivel = new JTextField();
		tfNivel.setText("0");
		tfNivel.setHorizontalAlignment(SwingConstants.CENTER);
		tfNivel.setColumns(10);
		tfNivel.setBounds(126, 34, 26, 117);
		Defesa.add(tfNivel);
		
		label_115 = new JLabel("1/2 Nv");
		label_115.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_115.setBounds(123, 11, 39, 20);
		Defesa.add(label_115);
		
		label_116 = new JLabel("+");
		label_116.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_116.setBounds(202, 34, 14, 20);
		Defesa.add(label_116);
		
		textField_27 = new JTextField();
		textField_27.setText("0");
		textField_27.setColumns(10);
		textField_27.setBounds(170, 34, 30, 20);
		Defesa.add(textField_27);
		
		label_117 = new JLabel("Atr.");
		label_117.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_117.setBounds(172, 11, 39, 20);
		Defesa.add(label_117);
		
		label_118 = new JLabel("+");
		label_118.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_118.setBounds(239, 34, 14, 20);
		Defesa.add(label_118);
		
		tfCAArmor1 = new JTextField();
		tfCAArmor1.setText("0");
		tfCAArmor1.setColumns(10);
		tfCAArmor1.setBounds(210, 34, 30, 20);
		Defesa.add(tfCAArmor1);
		
		label_119 = new JLabel("Armadura");
		label_119.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		label_119.setBounds(202, 11, 50, 20);
		Defesa.add(label_119);
		
		tfCAMisc1 = new JTextField();
		tfCAMisc1.setText("0");
		tfCAMisc1.setColumns(10);
		tfCAMisc1.setBounds(247, 34, 30, 20);
		Defesa.add(tfCAMisc1);
		
		label_120 = new JLabel("Misc");
		label_120.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_120.setBounds(250, 11, 39, 20);
		Defesa.add(label_120);
		
		label_121 = new JLabel("10 +");
		label_121.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_121.setBounds(96, 34, 30, 20);
		Defesa.add(label_121);
		
		label_122 = new JLabel("+");
		label_122.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_122.setBounds(280, 34, 14, 20);
		Defesa.add(label_122);
		
		tfCAMisc2 = new JTextField();
		tfCAMisc2.setText("0");
		tfCAMisc2.setColumns(10);
		tfCAMisc2.setBounds(288, 34, 30, 20);
		Defesa.add(tfCAMisc2);
		
		label_123 = new JLabel("Misc");
		label_123.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_123.setBounds(288, 11, 39, 20);
		Defesa.add(label_123);
		
		label_124 = new JLabel("+");
		label_124.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_124.setBounds(280, 66, 14, 20);
		Defesa.add(label_124);
		
		textField_31 = new JTextField();
		textField_31.setText("0");
		textField_31.setColumns(10);
		textField_31.setBounds(288, 66, 30, 20);
		Defesa.add(textField_31);
		
		label_125 = new JLabel("+");
		label_125.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_125.setBounds(239, 66, 14, 20);
		Defesa.add(label_125);
		
		textField_32 = new JTextField();
		textField_32.setText("0");
		textField_32.setColumns(10);
		textField_32.setBounds(247, 66, 30, 20);
		Defesa.add(textField_32);
		
		label_126 = new JLabel("+");
		label_126.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_126.setBounds(202, 66, 14, 20);
		Defesa.add(label_126);
		
		textField_33 = new JTextField();
		textField_33.setText("0");
		textField_33.setColumns(10);
		textField_33.setBounds(210, 66, 30, 20);
		Defesa.add(textField_33);
		
		label_127 = new JLabel("+");
		label_127.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_127.setBounds(162, 66, 14, 20);
		Defesa.add(label_127);
		
		textField_34 = new JTextField();
		textField_34.setText("0");
		textField_34.setColumns(10);
		textField_34.setBounds(170, 66, 30, 20);
		Defesa.add(textField_34);
		
		label_128 = new JLabel("10 +");
		label_128.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_128.setBounds(96, 66, 30, 20);
		Defesa.add(label_128);
		
		label_129 = new JLabel("=");
		label_129.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_129.setBounds(75, 65, 14, 20);
		Defesa.add(label_129);
		
		textField_35 = new JTextField();
		textField_35.setText("0");
		textField_35.setColumns(10);
		textField_35.setBounds(38, 66, 30, 20);
		Defesa.add(textField_35);
		
		label_130 = new JLabel("FORT");
		label_130.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_130.setBounds(3, 66, 33, 20);
		Defesa.add(label_130);
		
		label_131 = new JLabel("+");
		label_131.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_131.setBounds(280, 98, 14, 20);
		Defesa.add(label_131);
		
		textField_36 = new JTextField();
		textField_36.setText("0");
		textField_36.setColumns(10);
		textField_36.setBounds(288, 98, 30, 20);
		Defesa.add(textField_36);
		
		label_132 = new JLabel("+");
		label_132.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_132.setBounds(239, 98, 14, 20);
		Defesa.add(label_132);
		
		textField_37 = new JTextField();
		textField_37.setText("0");
		textField_37.setColumns(10);
		textField_37.setBounds(247, 98, 30, 20);
		Defesa.add(textField_37);
		
		label_133 = new JLabel("+");
		label_133.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_133.setBounds(202, 98, 14, 20);
		Defesa.add(label_133);
		
		textField_38 = new JTextField();
		textField_38.setText("0");
		textField_38.setColumns(10);
		textField_38.setBounds(210, 98, 30, 20);
		Defesa.add(textField_38);
		
		label_134 = new JLabel("+");
		label_134.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_134.setBounds(162, 98, 14, 20);
		Defesa.add(label_134);
		
		textField_39 = new JTextField();
		textField_39.setText("0");
		textField_39.setColumns(10);
		textField_39.setBounds(170, 98, 30, 20);
		Defesa.add(textField_39);
		
		label_135 = new JLabel("10 +");
		label_135.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_135.setBounds(96, 98, 30, 20);
		Defesa.add(label_135);
		
		label_136 = new JLabel("=");
		label_136.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_136.setBounds(75, 97, 14, 20);
		Defesa.add(label_136);
		
		textField_40 = new JTextField();
		textField_40.setText("0");
		textField_40.setColumns(10);
		textField_40.setBounds(38, 98, 30, 20);
		Defesa.add(textField_40);
		
		label_137 = new JLabel("REFL");
		label_137.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_137.setBounds(5, 98, 30, 20);
		Defesa.add(label_137);
		
		label_138 = new JLabel("+");
		label_138.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_138.setBounds(280, 130, 14, 20);
		Defesa.add(label_138);
		
		textField_41 = new JTextField();
		textField_41.setText("0");
		textField_41.setColumns(10);
		textField_41.setBounds(288, 130, 30, 20);
		Defesa.add(textField_41);
		
		label_139 = new JLabel("+");
		label_139.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_139.setBounds(239, 130, 14, 20);
		Defesa.add(label_139);
		
		textField_42 = new JTextField();
		textField_42.setText("0");
		textField_42.setColumns(10);
		textField_42.setBounds(247, 130, 30, 20);
		Defesa.add(textField_42);
		
		label_140 = new JLabel("+");
		label_140.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_140.setBounds(202, 130, 14, 20);
		Defesa.add(label_140);
		
		textField_43 = new JTextField();
		textField_43.setText("0");
		textField_43.setColumns(10);
		textField_43.setBounds(210, 130, 30, 20);
		Defesa.add(textField_43);
		
		label_141 = new JLabel("+");
		label_141.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_141.setBounds(162, 130, 14, 20);
		Defesa.add(label_141);
		
		textField_44 = new JTextField();
		textField_44.setText("0");
		textField_44.setColumns(10);
		textField_44.setBounds(170, 130, 30, 20);
		Defesa.add(textField_44);
		
		label_142 = new JLabel("10 +");
		label_142.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_142.setBounds(96, 130, 30, 20);
		Defesa.add(label_142);
		
		label_143 = new JLabel("=");
		label_143.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_143.setBounds(75, 129, 14, 20);
		Defesa.add(label_143);
		
		textField_45 = new JTextField();
		textField_45.setText("0");
		textField_45.setColumns(10);
		textField_45.setBounds(38, 130, 30, 20);
		Defesa.add(textField_45);
		
		label_144 = new JLabel("VONT");
		label_144.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_144.setBounds(0, 130, 53, 20);
		Defesa.add(label_144);
		
		label_145 = new JLabel("+");
		label_145.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_145.setBounds(317, 130, 14, 20);
		Defesa.add(label_145);
		
		textField_46 = new JTextField();
		textField_46.setText("0");
		textField_46.setColumns(10);
		textField_46.setBounds(325, 130, 30, 20);
		Defesa.add(textField_46);
		
		label_146 = new JLabel("+");
		label_146.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_146.setBounds(317, 98, 14, 20);
		Defesa.add(label_146);
		
		textField_47 = new JTextField();
		textField_47.setText("0");
		textField_47.setColumns(10);
		textField_47.setBounds(325, 98, 30, 20);
		Defesa.add(textField_47);
		
		label_147 = new JLabel("+");
		label_147.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_147.setBounds(317, 66, 14, 20);
		Defesa.add(label_147);
		
		textField_48 = new JTextField();
		textField_48.setText("0");
		textField_48.setColumns(10);
		textField_48.setBounds(325, 66, 30, 20);
		Defesa.add(textField_48);
		
		label_148 = new JLabel("+");
		label_148.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_148.setBounds(317, 34, 14, 20);
		Defesa.add(label_148);
		
		tfCAClass = new JTextField();
		tfCAClass.setText("0");
		tfCAClass.setColumns(10);
		tfCAClass.setBounds(325, 34, 30, 20);
		Defesa.add(tfCAClass);
		
		lblClasse = new JLabel("Classe");
		lblClasse.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		lblClasse.setBounds(325, 11, 39, 20);
		Defesa.add(lblClasse);
		
		label_150 = new JLabel("Escudo");
		label_150.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		label_150.setBounds(370, 11, 50, 20);
		Defesa.add(label_150);
		
		label_151 = new JLabel("+");
		label_151.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_151.setBounds(358, 34, 14, 20);
		Defesa.add(label_151);
		
		tfCAShield = new JTextField();
		tfCAShield.setText("0");
		tfCAShield.setColumns(10);
		tfCAShield.setBounds(370, 34, 30, 20);
		Defesa.add(tfCAShield);
		
		label_152 = new JLabel("+");
		label_152.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_152.setBounds(358, 98, 14, 20);
		Defesa.add(label_152);
		
		textField_51 = new JTextField();
		textField_51.setText("0");
		textField_51.setColumns(10);
		textField_51.setBounds(370, 98, 30, 20);
		Defesa.add(textField_51);
		
		button = new JButton("Calcular Defesa");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//atributos.setCAValue(tfCAValue, tfNivel);
				
			}
		});
		button.setBounds(284, 161, 125, 23);
		Defesa.add(button);
		
		JLabel lblNomeDoPersonagem = new JLabel("Nome do Personagem");
		lblNomeDoPersonagem.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblNomeDoPersonagem.setBounds(10, 11, 162, 59);
		contentPane.add(lblNomeDoPersonagem);
		
		tfNomeDoPersonagem = new JTextField(" ");
		tfNomeDoPersonagem.setBounds(10, 11, 217, 20);
		contentPane.add(tfNomeDoPersonagem);
		tfNomeDoPersonagem.setColumns(10);
		atributos.nome(p, tfNomeDoPersonagem);
		
		JButton btnGerar = new JButton("Gerar");
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileManager file = new FileManager();
				file.createFile(p);
			}
		});
		btnGerar.setBounds(936, 613, 115, 65);
		contentPane.add(btnGerar);
		
		JLabel lblNivel = new JLabel("N\u00EDvel");
		lblNivel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblNivel.setBounds(237, 11, 39, 59);
		contentPane.add(lblNivel);
		
		JComboBox<?> comboBox = new JComboBox<Object>(caracteristicas.niveisArray);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setNivel(comboBox.getSelectedIndex()+1);
				nivel.setText(Integer.toString(((comboBox.getSelectedIndex()+ 1)/2)));
				tfNivel.setText(Integer.toString(((comboBox.getSelectedIndex()+ 1)/2)));
			}
		});
		comboBox.setBounds(237, 11, 50, 20);
		contentPane.add(comboBox);
		
		JLabel lblFor = new JLabel("FOR");
		lblFor.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblFor.setBounds(10, 101, 50, 20);
		contentPane.add(lblFor);
		//p.setFor(Integer.parseInt(tfFor.getText()));
		//p.setFor(Integer.parseInt(tfFor.getText()));
		tfFor = new JTextField();
		tfFor.setText("0");
			
		tfFor.setColumns(10);
		tfFor.setBounds(54, 101, 30, 20);
		contentPane.add(tfFor);
		
		JLabel lblCon = new JLabel("CON");
		lblCon.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblCon.setBounds(10, 132, 88, 20);
		contentPane.add(lblCon);
		
		tfCon = new JTextField("0");
		tfCon.setColumns(10);
		tfCon.setBounds(54, 132, 30, 20);
		contentPane.add(tfCon);
		
		JLabel lblDes = new JLabel("DES");
		lblDes.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblDes.setBounds(10, 163, 88, 20);
		contentPane.add(lblDes);
		
		tfDes = new JTextField("0");
		tfDes.setColumns(10);
		tfDes.setBounds(54, 163, 30, 20);
		contentPane.add(tfDes);
		
		JLabel lblInt = new JLabel("INT");
		lblInt.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblInt.setBounds(10, 194, 88, 20);
		contentPane.add(lblInt);
		
		tfInt = new JTextField("0");
		tfInt.setColumns(10);
		tfInt.setBounds(54, 194, 30, 20);
		contentPane.add(tfInt);
		
		JLabel lblSab = new JLabel("SAB");
		lblSab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblSab.setBounds(10, 225, 88, 20);
		contentPane.add(lblSab);
		
		tfSab = new JTextField("0");
		tfSab.setColumns(10);
		tfSab.setBounds(54, 225, 30, 20);
		contentPane.add(tfSab);
		
		JLabel lblCar = new JLabel("CAR");
		lblCar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblCar.setBounds(10, 256, 88, 20);
		contentPane.add(lblCar);
		
		tfCar = new JTextField("0");
		tfCar.setColumns(10);
		tfCar.setBounds(54, 256, 30, 20);
		contentPane.add(tfCar);
		
		JLabel lblAtValue = new JLabel("Valor");
		lblAtValue.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		lblAtValue.setBounds(54, 76, 39, 20);
		contentPane.add(lblAtValue);
		
		tfModFor = new JTextField("0");
		tfModFor.setColumns(10);
		tfModFor.setBounds(134, 101, 30, 20);
		contentPane.add(tfModFor);
		
		tfModCon = new JTextField("0");
		tfModCon.setColumns(10);
		tfModCon.setBounds(134, 132, 30, 20);
		contentPane.add(tfModCon);
		
		tfModDes = new JTextField("0");
		tfModDes.setColumns(10);
		tfModDes.setBounds(134, 163, 30, 20);
		contentPane.add(tfModDes);
		
		tfModInt = new JTextField("0");
		tfModInt.setColumns(10);
		tfModInt.setBounds(134, 194, 30, 20);
		contentPane.add(tfModInt);
		
		tfModSab = new JTextField("0");
		tfModSab.setColumns(10);
		tfModSab.setBounds(134, 225, 30, 20);
		contentPane.add(tfModSab);
		
		tfModCar = new JTextField("0");
		tfModCar.setColumns(10);
		tfModCar.setBounds(134, 256, 30, 20);
		contentPane.add(tfModCar);
		
		lblMod = new JLabel("Classe");
		lblMod.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		lblMod.setBounds(94, 75, 39, 20);
		contentPane.add(lblMod);
		
		tfClassFor = new JTextField("0");
		tfClassFor.setColumns(10);
		tfClassFor.setBounds(94, 101, 30, 20);
		contentPane.add(tfClassFor);
		
		tfClassCon = new JTextField("0");
		tfClassCon.setColumns(10);
		tfClassCon.setBounds(94, 132, 30, 20);
		contentPane.add(tfClassCon);
		
		tfClassDes = new JTextField("0");
		tfClassDes.setColumns(10);
		tfClassDes.setBounds(94, 163, 30, 20);
		contentPane.add(tfClassDes);
		
		tfClassInt = new JTextField("0");
		tfClassInt.setColumns(10);
		tfClassInt.setBounds(94, 194, 30, 20);
		contentPane.add(tfClassInt);
		
		tfClassSab = new JTextField("0");
		tfClassSab.setColumns(10);
		tfClassSab.setBounds(94, 225, 30, 20);
		contentPane.add(tfClassSab);
		
		tfClassCar = new JTextField("0");
		tfClassCar.setColumns(10);
		tfClassCar.setBounds(94, 256, 30, 20);
		contentPane.add(tfClassCar);
		
		JLabel label = new JLabel("Mod");
		label.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label.setBounds(139, 76, 88, 20);
		contentPane.add(label);
		
		JButton btnCalcular = new JButton("Calcular Atributos");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				atributos.forca(p, tfFor, tfModFor, tfPerFor1, tfPerFor2);
				atributos.constituicao(p, tfCon, tfModCon, tfPerCon);
				atributos.destreza(p, tfDes, tfModDes, tfPerDes1, tfPerDes2, tfPerDes3);
				atributos.inteligencia(p, tfInt, tfModInt, tfPerInt1, tfPerInt2, tfPerInt3);
				atributos.sabedoria(p, tfSab, tfModSab, tfPerSab1, tfPerSab2, tfPerSab3, tfPerSab4, tfPerSab5);
				atributos.carisma(p, tfCar, tfModCar, tfPerCar1, tfPerCar2, tfPerCar3);
			}
		});
		btnCalcular.setBounds(10, 287, 125, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblIdade.setBounds(297, 11, 39, 59);
		contentPane.add(lblIdade);
		
		tfIdade = new JTextField(" ");
		tfIdade.setColumns(10);
		tfIdade.setBounds(297, 11, 39, 20);
		contentPane.add(tfIdade);
		atributos.idade(p, tfIdade);
		
		JLabel lblGenero = new JLabel("Sexo");
		lblGenero.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblGenero.setBounds(346, 11, 50, 59);
		contentPane.add(lblGenero);
		
		JComboBox<Object> cbGenero = new JComboBox<Object>(caracteristicas.generos);
		cbGenero.setBounds(346, 11, 98, 20);
		contentPane.add(cbGenero);
		
		lblTendncia = new JLabel("Tend\u00EAncia");
		lblTendncia.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblTendncia.setBounds(454, 11, 64, 59);
		contentPane.add(lblTendncia);
		
		comboBox_1 = new JComboBox<Object>(caracteristicas.tendencias);
		comboBox_1.setBounds(454, 11, 139, 20);
		contentPane.add(comboBox_1);
		
		lblDivindade = new JLabel("Divindade");
		lblDivindade.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblDivindade.setBounds(603, 11, 64, 59);
		contentPane.add(lblDivindade);
		
		cbDivindade = new JComboBox<Object>(caracteristicas.divindades);
		cbDivindade.setBounds(603, 11, 139, 20);
		contentPane.add(cbDivindade);
		
		lblDestinopico = new JLabel("Destino \u00C9pico");
		lblDestinopico.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblDestinopico.setBounds(752, 11, 162, 59);
		contentPane.add(lblDestinopico);
		
		textField = new JTextField(" ");
		textField.setColumns(10);
		textField.setBounds(752, 11, 217, 20);
		contentPane.add(textField);
		
		lblTrilhaExemplar = new JLabel("Trilha Exemplar");
		lblTrilhaExemplar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblTrilhaExemplar.setBounds(752, 54, 162, 59);
		contentPane.add(lblTrilhaExemplar);
		
		textField_1 = new JTextField(" ");
		textField_1.setColumns(10);
		textField_1.setBounds(752, 54, 217, 20);
		contentPane.add(textField_1);
		
		lblCompanhiaOuAfiliao = new JLabel("Companhia ou Afilia\u00E7\u00E3o");
		lblCompanhiaOuAfiliao.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblCompanhiaOuAfiliao.setBounds(978, 11, 162, 59);
		contentPane.add(lblCompanhiaOuAfiliao);
		
		textField_2 = new JTextField(" ");
		textField_2.setColumns(10);
		textField_2.setBounds(978, 11, 217, 20);
		contentPane.add(textField_2);
		
		Perícias = new Panel();
		Perícias.setBounds(10, 318, 390, 614);
		contentPane.add(Perícias);
		Perícias.setLayout(null);
		
		lblPeri = new JLabel("Valor");
		lblPeri.setBounds(128, 16, 39, 20);
		Perícias.add(lblPeri);
		lblPeri.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		lblAcrobacia = new JLabel("Acrobacia (Des)");
		lblAcrobacia.setBounds(20, 39, 98, 20);
		Perícias.add(lblAcrobacia);
		lblAcrobacia.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfAcrobaticsValue = new JTextField();
		tfAcrobaticsValue.setBounds(128, 39, 30, 20);
		Perícias.add(tfAcrobaticsValue);
		tfAcrobaticsValue.setText("0");
		tfAcrobaticsValue.setColumns(10);
		
		JLabel label_2 = new JLabel("=");
		label_2.setBounds(162, 38, 14, 20);
		Perícias.add(label_2);
		label_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_3 = new JLabel("+");
		label_3.setBounds(204, 39, 14, 20);
		Perícias.add(label_3);
		label_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerDes1 = new JTextField();
		tfPerDes1.setBounds(212, 39, 30, 20);
		Perícias.add(tfPerDes1);
		tfPerDes1.setText("0");
		tfPerDes1.setColumns(10);
		
		tfRaceAcrobatics = new JTextField();
		tfRaceAcrobatics.setBounds(249, 39, 30, 20);
		Perícias.add(tfRaceAcrobatics);
		tfRaceAcrobatics.setText("0");
		tfRaceAcrobatics.setColumns(10);
		
		JLabel label_4 = new JLabel("+");
		label_4.setBounds(241, 39, 14, 20);
		Perícias.add(label_4);
		label_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscAcrobatics = new JTextField();
		tfMiscAcrobatics.setBounds(291, 39, 30, 20);
		Perícias.add(tfMiscAcrobatics);
		tfMiscAcrobatics.setText("0");
		tfMiscAcrobatics.setColumns(10);
		
		label_5 = new JLabel("+");
		label_5.setBounds(283, 39, 14, 20);
		Perícias.add(label_5);
		label_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerPen1 = new JTextField();
		tfPerPen1.setBounds(329, 39, 30, 20);
		Perícias.add(tfPerPen1);
		tfPerPen1.setText("0");
		tfPerPen1.setColumns(10);
		
		label_6 = new JLabel("-");
		label_6.setBounds(321, 39, 14, 20);
		Perícias.add(label_6);
		label_6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		lblNv = new JLabel("1/2 Nv");
		lblNv.setBounds(168, 16, 39, 20);
		Perícias.add(lblNv);
		lblNv.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		lblMod_1 = new JLabel("Atr.");
		lblMod_1.setBounds(212, 16, 39, 20);
		Perícias.add(lblMod_1);
		lblMod_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		lblRaa = new JLabel("Ra\u00E7a");
		lblRaa.setBounds(249, 16, 39, 20);
		Perícias.add(lblRaa);
		lblRaa.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		lblMisc = new JLabel("Misc");
		lblMisc.setBounds(291, 16, 39, 20);
		Perícias.add(lblMisc);
		lblMisc.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		lblPenalidadeDaArmadura = new JLabel("Penalidade");
		lblPenalidadeDaArmadura.setBounds(336, 0, 64, 20);
		Perícias.add(lblPenalidadeDaArmadura);
		lblPenalidadeDaArmadura.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		
		lblArmadura = new JLabel("Armadura");
		lblArmadura.setBounds(336, 13, 64, 20);
		Perícias.add(lblArmadura);
		lblArmadura.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		
		JLabel lblArcanismoint = new JLabel("Arcanismo (Int)");
		lblArcanismoint.setBounds(20, 71, 98, 20);
		Perícias.add(lblArcanismoint);
		lblArcanismoint.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfArcanismValue = new JTextField();
		tfArcanismValue.setBounds(128, 71, 30, 20);
		Perícias.add(tfArcanismValue);
		tfArcanismValue.setText("0");
		tfArcanismValue.setColumns(10);
		
		JLabel label_8 = new JLabel("=");
		label_8.setBounds(162, 70, 14, 20);
		Perícias.add(label_8);
		label_8.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_9 = new JLabel("+");
		label_9.setBounds(204, 71, 14, 20);
		Perícias.add(label_9);
		label_9.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerInt1 = new JTextField();
		tfPerInt1.setBounds(212, 71, 30, 20);
		Perícias.add(tfPerInt1);
		tfPerInt1.setText("0");
		tfPerInt1.setColumns(10);
		
		tfRaceArcanism = new JTextField();
		tfRaceArcanism.setBounds(249, 71, 30, 20);
		Perícias.add(tfRaceArcanism);
		tfRaceArcanism.setText("0");
		tfRaceArcanism.setColumns(10);
		
		JLabel label_10 = new JLabel("+");
		label_10.setBounds(241, 71, 14, 20);
		Perícias.add(label_10);
		label_10.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscArcanism = new JTextField();
		tfMiscArcanism.setBounds(291, 71, 30, 20);
		Perícias.add(tfMiscArcanism);
		tfMiscArcanism.setText("0");
		tfMiscArcanism.setColumns(10);
		
		JLabel label_11 = new JLabel("+");
		label_11.setBounds(283, 71, 14, 20);
		Perícias.add(label_11);
		label_11.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblAtletismofor = new JLabel("Atletismo (For)");
		lblAtletismofor.setBounds(20, 102, 98, 20);
		Perícias.add(lblAtletismofor);
		lblAtletismofor.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfAtletismValue = new JTextField();
		tfAtletismValue.setBounds(128, 102, 30, 20);
		Perícias.add(tfAtletismValue);
		tfAtletismValue.setText("0");
		tfAtletismValue.setColumns(10);
		
		JLabel label_14 = new JLabel("=");
		label_14.setBounds(162, 101, 14, 20);
		Perícias.add(label_14);
		label_14.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_15 = new JLabel("+");
		label_15.setBounds(204, 102, 14, 20);
		Perícias.add(label_15);
		label_15.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerFor1 = new JTextField();
		tfPerFor1.setBounds(212, 102, 30, 20);
		Perícias.add(tfPerFor1);
		tfPerFor1.setText("0");
		tfPerFor1.setColumns(10);
		
		tfRaceAtletism = new JTextField();
		tfRaceAtletism.setBounds(249, 102, 30, 20);
		Perícias.add(tfRaceAtletism);
		tfRaceAtletism.setText("0");
		tfRaceAtletism.setColumns(10);
		
		JLabel label_16 = new JLabel("+");
		label_16.setBounds(241, 102, 14, 20);
		Perícias.add(label_16);
		label_16.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscAtletism = new JTextField();
		tfMiscAtletism.setBounds(291, 102, 30, 20);
		Perícias.add(tfMiscAtletism);
		tfMiscAtletism.setText("0");
		tfMiscAtletism.setColumns(10);
		
		JLabel label_17 = new JLabel("+");
		label_17.setBounds(283, 102, 14, 20);
		Perícias.add(label_17);
		label_17.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerPen2 = new JTextField();
		tfPerPen2.setBounds(329, 102, 30, 20);
		Perícias.add(tfPerPen2);
		tfPerPen2.setText("0");
		tfPerPen2.setColumns(10);
		
		JLabel label_18 = new JLabel("-");
		label_18.setBounds(321, 102, 14, 20);
		Perícias.add(label_18);
		label_18.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblBlefecar = new JLabel("Blefe (Car)");
		lblBlefecar.setBounds(20, 134, 98, 20);
		Perícias.add(lblBlefecar);
		lblBlefecar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfBlefValue = new JTextField();
		tfBlefValue.setBounds(128, 134, 30, 20);
		Perícias.add(tfBlefValue);
		tfBlefValue.setText("0");
		tfBlefValue.setColumns(10);
		
		JLabel label_20 = new JLabel("=");
		label_20.setBounds(162, 133, 14, 20);
		Perícias.add(label_20);
		label_20.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_21 = new JLabel("+");
		label_21.setBounds(204, 134, 14, 20);
		Perícias.add(label_21);
		label_21.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerCar1 = new JTextField();
		tfPerCar1.setBounds(212, 134, 30, 20);
		Perícias.add(tfPerCar1);
		tfPerCar1.setText("0");
		tfPerCar1.setColumns(10);
		
		tfRaceBlef = new JTextField();
		tfRaceBlef.setBounds(249, 134, 30, 20);
		Perícias.add(tfRaceBlef);
		tfRaceBlef.setText("0");
		tfRaceBlef.setColumns(10);
		
		JLabel label_22 = new JLabel("+");
		label_22.setBounds(241, 134, 14, 20);
		Perícias.add(label_22);
		label_22.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscBlef = new JTextField();
		tfMiscBlef.setBounds(291, 134, 30, 20);
		Perícias.add(tfMiscBlef);
		tfMiscBlef.setText("0");
		tfMiscBlef.setColumns(10);
		
		JLabel label_23 = new JLabel("+");
		label_23.setBounds(283, 134, 14, 20);
		Perícias.add(label_23);
		label_23.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblDiplomaciacar = new JLabel("Diplomacia (Car)");
		lblDiplomaciacar.setBounds(20, 166, 98, 20);
		Perícias.add(lblDiplomaciacar);
		lblDiplomaciacar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfDiplomacyValue = new JTextField();
		tfDiplomacyValue.setBounds(128, 166, 30, 20);
		Perícias.add(tfDiplomacyValue);
		tfDiplomacyValue.setText("0");
		tfDiplomacyValue.setColumns(10);
		
		JLabel label_26 = new JLabel("=");
		label_26.setBounds(162, 165, 14, 20);
		Perícias.add(label_26);
		label_26.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_27 = new JLabel("+");
		label_27.setBounds(204, 166, 14, 20);
		Perícias.add(label_27);
		label_27.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerCar2 = new JTextField();
		tfPerCar2.setBounds(212, 166, 30, 20);
		Perícias.add(tfPerCar2);
		tfPerCar2.setText("0");
		tfPerCar2.setColumns(10);
		
		tfRaceDiplomacy = new JTextField();
		tfRaceDiplomacy.setBounds(249, 166, 30, 20);
		Perícias.add(tfRaceDiplomacy);
		tfRaceDiplomacy.setText("0");
		tfRaceDiplomacy.setColumns(10);
		
		JLabel label_28 = new JLabel("+");
		label_28.setBounds(241, 166, 14, 20);
		Perícias.add(label_28);
		label_28.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscDiplomacy = new JTextField();
		tfMiscDiplomacy.setBounds(291, 166, 30, 20);
		Perícias.add(tfMiscDiplomacy);
		tfMiscDiplomacy.setText("0");
		tfMiscDiplomacy.setColumns(10);
		
		JLabel label_29 = new JLabel("+");
		label_29.setBounds(283, 166, 14, 20);
		Perícias.add(label_29);
		label_29.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblExploraosab = new JLabel("Explora\u00E7\u00E3o (Sab)");
		lblExploraosab.setBounds(20, 198, 105, 20);
		Perícias.add(lblExploraosab);
		lblExploraosab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfDungeoneringValue = new JTextField();
		tfDungeoneringValue.setBounds(128, 198, 30, 20);
		Perícias.add(tfDungeoneringValue);
		tfDungeoneringValue.setText("0");
		tfDungeoneringValue.setColumns(10);
		
		JLabel label_32 = new JLabel("=");
		label_32.setBounds(162, 197, 14, 20);
		Perícias.add(label_32);
		label_32.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_33 = new JLabel("+");
		label_33.setBounds(204, 198, 14, 20);
		Perícias.add(label_33);
		label_33.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerSab1 = new JTextField();
		tfPerSab1.setBounds(212, 198, 30, 20);
		Perícias.add(tfPerSab1);
		tfPerSab1.setText("0");
		tfPerSab1.setColumns(10);
		
		tfRaceDungeonering = new JTextField();
		tfRaceDungeonering.setBounds(249, 198, 30, 20);
		Perícias.add(tfRaceDungeonering);
		tfRaceDungeonering.setText("0");
		tfRaceDungeonering.setColumns(10);
		
		JLabel label_34 = new JLabel("+");
		label_34.setBounds(241, 198, 14, 20);
		Perícias.add(label_34);
		label_34.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscDungeonering = new JTextField();
		tfMiscDungeonering.setBounds(291, 198, 30, 20);
		Perícias.add(tfMiscDungeonering);
		tfMiscDungeonering.setText("0");
		tfMiscDungeonering.setColumns(10);
		
		JLabel label_35 = new JLabel("+");
		label_35.setBounds(283, 198, 14, 20);
		Perícias.add(label_35);
		label_35.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblFurtividadedes = new JLabel("Furtividade (Des)");
		lblFurtividadedes.setBounds(20, 230, 98, 20);
		Perícias.add(lblFurtividadedes);
		lblFurtividadedes.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfStealthValue = new JTextField();
		tfStealthValue.setBounds(128, 230, 30, 20);
		Perícias.add(tfStealthValue);
		tfStealthValue.setText("0");
		tfStealthValue.setColumns(10);
		
		JLabel label_38 = new JLabel("=");
		label_38.setBounds(162, 229, 14, 20);
		Perícias.add(label_38);
		label_38.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_39 = new JLabel("+");
		label_39.setBounds(204, 230, 14, 20);
		Perícias.add(label_39);
		label_39.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerDes2 = new JTextField();
		tfPerDes2.setBounds(212, 230, 30, 20);
		Perícias.add(tfPerDes2);
		tfPerDes2.setText("0");
		tfPerDes2.setColumns(10);
		
		tfRaceStealth = new JTextField();
		tfRaceStealth.setBounds(249, 230, 30, 20);
		Perícias.add(tfRaceStealth);
		tfRaceStealth.setText("0");
		tfRaceStealth.setColumns(10);
		
		JLabel label_40 = new JLabel("+");
		label_40.setBounds(241, 230, 14, 20);
		Perícias.add(label_40);
		label_40.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscStealth = new JTextField();
		tfMiscStealth.setBounds(291, 230, 30, 20);
		Perícias.add(tfMiscStealth);
		tfMiscStealth.setText("0");
		tfMiscStealth.setColumns(10);
		
		JLabel label_41 = new JLabel("+");
		label_41.setBounds(283, 230, 14, 20);
		Perícias.add(label_41);
		label_41.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerPen3 = new JTextField();
		tfPerPen3.setBounds(329, 230, 30, 20);
		Perícias.add(tfPerPen3);
		tfPerPen3.setText("0");
		tfPerPen3.setColumns(10);
		
		JLabel label_42 = new JLabel("-");
		label_42.setBounds(321, 230, 14, 20);
		Perícias.add(label_42);
		label_42.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblHistriaint = new JLabel("Hist\u00F3ria (Int)");
		lblHistriaint.setBounds(20, 262, 98, 20);
		Perícias.add(lblHistriaint);
		lblHistriaint.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfHistoryValue = new JTextField();
		tfHistoryValue.setBounds(128, 262, 30, 20);
		Perícias.add(tfHistoryValue);
		tfHistoryValue.setText("0");
		tfHistoryValue.setColumns(10);
		
		JLabel label_44 = new JLabel("=");
		label_44.setBounds(162, 261, 14, 20);
		Perícias.add(label_44);
		label_44.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_45 = new JLabel("+");
		label_45.setBounds(204, 262, 14, 20);
		Perícias.add(label_45);
		label_45.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerInt2 = new JTextField();
		tfPerInt2.setBounds(212, 262, 30, 20);
		Perícias.add(tfPerInt2);
		tfPerInt2.setText("0");
		tfPerInt2.setColumns(10);
		
		tfRaceHistory = new JTextField();
		tfRaceHistory.setBounds(249, 262, 30, 20);
		Perícias.add(tfRaceHistory);
		tfRaceHistory.setText("0");
		tfRaceHistory.setColumns(10);
		
		JLabel label_46 = new JLabel("+");
		label_46.setBounds(241, 262, 14, 20);
		Perícias.add(label_46);
		label_46.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscHistory = new JTextField();
		tfMiscHistory.setBounds(291, 262, 30, 20);
		Perícias.add(tfMiscHistory);
		tfMiscHistory.setText("0");
		tfMiscHistory.setColumns(10);
		
		JLabel label_47 = new JLabel("+");
		label_47.setBounds(283, 262, 14, 20);
		Perícias.add(label_47);
		label_47.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblIntimidaofor = new JLabel("Intimida\u00E7\u00E3o (For)");
		lblIntimidaofor.setBounds(20, 294, 105, 20);
		Perícias.add(lblIntimidaofor);
		lblIntimidaofor.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfIntimidationValue = new JTextField();
		tfIntimidationValue.setBounds(128, 294, 30, 20);
		Perícias.add(tfIntimidationValue);
		tfIntimidationValue.setText("0");
		tfIntimidationValue.setColumns(10);
		
		JLabel label_50 = new JLabel("=");
		label_50.setBounds(162, 293, 14, 20);
		Perícias.add(label_50);
		label_50.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_51 = new JLabel("+");
		label_51.setBounds(204, 294, 14, 20);
		Perícias.add(label_51);
		label_51.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerFor2 = new JTextField();
		tfPerFor2.setBounds(212, 294, 30, 20);
		Perícias.add(tfPerFor2);
		tfPerFor2.setText("0");
		tfPerFor2.setColumns(10);
		
		tfRaceIntimidation = new JTextField();
		tfRaceIntimidation.setBounds(249, 294, 30, 20);
		Perícias.add(tfRaceIntimidation);
		tfRaceIntimidation.setText("0");
		tfRaceIntimidation.setColumns(10);
		
		JLabel label_52 = new JLabel("+");
		label_52.setBounds(241, 294, 14, 20);
		Perícias.add(label_52);
		label_52.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscIntimidation = new JTextField();
		tfMiscIntimidation.setBounds(291, 294, 30, 20);
		Perícias.add(tfMiscIntimidation);
		tfMiscIntimidation.setText("0");
		tfMiscIntimidation.setColumns(10);
		
		JLabel label_53 = new JLabel("+");
		label_53.setBounds(283, 294, 14, 20);
		Perícias.add(label_53);
		label_53.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblIntuiosab = new JLabel("Intui\u00E7\u00E3o (Sab)");
		lblIntuiosab.setBounds(20, 326, 98, 20);
		Perícias.add(lblIntuiosab);
		lblIntuiosab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfInsightValue = new JTextField();
		tfInsightValue.setBounds(128, 326, 30, 20);
		Perícias.add(tfInsightValue);
		tfInsightValue.setText("0");
		tfInsightValue.setColumns(10);
		
		JLabel label_56 = new JLabel("=");
		label_56.setBounds(162, 325, 14, 20);
		Perícias.add(label_56);
		label_56.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_57 = new JLabel("+");
		label_57.setBounds(204, 326, 14, 20);
		Perícias.add(label_57);
		label_57.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerSab2 = new JTextField();
		tfPerSab2.setBounds(212, 326, 30, 20);
		Perícias.add(tfPerSab2);
		tfPerSab2.setText("0");
		tfPerSab2.setColumns(10);
		
		tfRaceInsight = new JTextField();
		tfRaceInsight.setBounds(249, 326, 30, 20);
		Perícias.add(tfRaceInsight);
		tfRaceInsight.setText("0");
		tfRaceInsight.setColumns(10);
		
		JLabel label_58 = new JLabel("+");
		label_58.setBounds(241, 326, 14, 20);
		Perícias.add(label_58);
		label_58.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscInsight = new JTextField();
		tfMiscInsight.setBounds(291, 326, 30, 20);
		Perícias.add(tfMiscInsight);
		tfMiscInsight.setText("0");
		tfMiscInsight.setColumns(10);
		
		JLabel label_59 = new JLabel("+");
		label_59.setBounds(283, 326, 14, 20);
		Perícias.add(label_59);
		label_59.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblLadinagemdes = new JLabel("Ladinagem (Des)");
		lblLadinagemdes.setBounds(20, 358, 98, 20);
		Perícias.add(lblLadinagemdes);
		lblLadinagemdes.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfThieveryValue = new JTextField();
		tfThieveryValue.setBounds(128, 358, 30, 20);
		Perícias.add(tfThieveryValue);
		tfThieveryValue.setText("0");
		tfThieveryValue.setColumns(10);
		
		JLabel label_62 = new JLabel("=");
		label_62.setBounds(162, 357, 14, 20);
		Perícias.add(label_62);
		label_62.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_63 = new JLabel("+");
		label_63.setBounds(204, 358, 14, 20);
		Perícias.add(label_63);
		label_63.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerDes3 = new JTextField();
		tfPerDes3.setBounds(212, 358, 30, 20);
		Perícias.add(tfPerDes3);
		tfPerDes3.setText("0");
		tfPerDes3.setColumns(10);
		
		tfRaceThievery = new JTextField();
		tfRaceThievery.setBounds(249, 358, 30, 20);
		Perícias.add(tfRaceThievery);
		tfRaceThievery.setText("0");
		tfRaceThievery.setColumns(10);
		
		JLabel label_64 = new JLabel("+");
		label_64.setBounds(241, 358, 14, 20);
		Perícias.add(label_64);
		label_64.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscThievery = new JTextField();
		tfMiscThievery.setBounds(291, 358, 30, 20);
		Perícias.add(tfMiscThievery);
		tfMiscThievery.setText("0");
		tfMiscThievery.setColumns(10);
		
		JLabel label_65 = new JLabel("+");
		label_65.setBounds(283, 358, 14, 20);
		Perícias.add(label_65);
		label_65.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerPen4 = new JTextField();
		tfPerPen4.setBounds(329, 358, 30, 20);
		Perícias.add(tfPerPen4);
		tfPerPen4.setText("0");
		tfPerPen4.setColumns(10);
		
		JLabel label_66 = new JLabel("-");
		label_66.setBounds(321, 358, 14, 20);
		Perícias.add(label_66);
		label_66.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblManhacar = new JLabel("Manha (Car)");
		lblManhacar.setBounds(20, 390, 98, 20);
		Perícias.add(lblManhacar);
		lblManhacar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfStreetwiseValue = new JTextField();
		tfStreetwiseValue.setBounds(128, 390, 30, 20);
		Perícias.add(tfStreetwiseValue);
		tfStreetwiseValue.setText("0");
		tfStreetwiseValue.setColumns(10);
		
		JLabel label_68 = new JLabel("=");
		label_68.setBounds(162, 389, 14, 20);
		Perícias.add(label_68);
		label_68.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_69 = new JLabel("+");
		label_69.setBounds(204, 390, 14, 20);
		Perícias.add(label_69);
		label_69.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerCar3 = new JTextField();
		tfPerCar3.setBounds(212, 390, 30, 20);
		Perícias.add(tfPerCar3);
		tfPerCar3.setText("0");
		tfPerCar3.setColumns(10);
		
		tfRaceStreetwise = new JTextField();
		tfRaceStreetwise.setBounds(249, 390, 30, 20);
		Perícias.add(tfRaceStreetwise);
		tfRaceStreetwise.setText("0");
		tfRaceStreetwise.setColumns(10);
		
		JLabel label_70 = new JLabel("+");
		label_70.setBounds(227, 389, 14, 20);
		Perícias.add(label_70);
		label_70.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscStreetwise = new JTextField();
		tfMiscStreetwise.setBounds(291, 390, 30, 20);
		Perícias.add(tfMiscStreetwise);
		tfMiscStreetwise.setText("0");
		tfMiscStreetwise.setColumns(10);
		
		JLabel label_71 = new JLabel("+");
		label_71.setBounds(283, 390, 14, 20);
		Perícias.add(label_71);
		label_71.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblNaturezasab = new JLabel("Natureza (Sab)");
		lblNaturezasab.setBounds(20, 422, 98, 20);
		Perícias.add(lblNaturezasab);
		lblNaturezasab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfNatureValue = new JTextField();
		tfNatureValue.setBounds(128, 422, 30, 20);
		Perícias.add(tfNatureValue);
		tfNatureValue.setText("0");
		tfNatureValue.setColumns(10);
		
		JLabel label_74 = new JLabel("=");
		label_74.setBounds(162, 421, 14, 20);
		Perícias.add(label_74);
		label_74.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_75 = new JLabel("+");
		label_75.setBounds(204, 422, 14, 20);
		Perícias.add(label_75);
		label_75.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerSab3 = new JTextField();
		tfPerSab3.setBounds(212, 422, 30, 20);
		Perícias.add(tfPerSab3);
		tfPerSab3.setText("0");
		tfPerSab3.setColumns(10);
		
		tfRaceNature = new JTextField();
		tfRaceNature.setBounds(249, 422, 30, 20);
		Perícias.add(tfRaceNature);
		tfRaceNature.setText("0");
		tfRaceNature.setColumns(10);
		
		JLabel label_76 = new JLabel("+");
		label_76.setBounds(241, 422, 14, 20);
		Perícias.add(label_76);
		label_76.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscNature = new JTextField();
		tfMiscNature.setBounds(291, 422, 30, 20);
		Perícias.add(tfMiscNature);
		tfMiscNature.setText("0");
		tfMiscNature.setColumns(10);
		
		JLabel label_77 = new JLabel("+");
		label_77.setBounds(283, 422, 14, 20);
		Perícias.add(label_77);
		label_77.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblPerceposab = new JLabel("Percep\u00E7\u00E3o (Sab)");
		lblPerceposab.setBounds(20, 454, 98, 20);
		Perícias.add(lblPerceposab);
		lblPerceposab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfPerceptionValue = new JTextField();
		tfPerceptionValue.setBounds(128, 454, 30, 20);
		Perícias.add(tfPerceptionValue);
		tfPerceptionValue.setText("0");
		tfPerceptionValue.setColumns(10);
		
		JLabel label_80 = new JLabel("=");
		label_80.setBounds(162, 453, 14, 20);
		Perícias.add(label_80);
		label_80.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_81 = new JLabel("+");
		label_81.setBounds(204, 454, 14, 20);
		Perícias.add(label_81);
		label_81.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerSab4 = new JTextField();
		tfPerSab4.setBounds(212, 454, 30, 20);
		Perícias.add(tfPerSab4);
		tfPerSab4.setText("0");
		tfPerSab4.setColumns(10);
		
		tfRacePerception = new JTextField();
		tfRacePerception.setBounds(249, 454, 30, 20);
		Perícias.add(tfRacePerception);
		tfRacePerception.setText("0");
		tfRacePerception.setColumns(10);
		
		JLabel label_82 = new JLabel("+");
		label_82.setBounds(241, 454, 14, 20);
		Perícias.add(label_82);
		label_82.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscPerception = new JTextField();
		tfMiscPerception.setBounds(291, 454, 30, 20);
		Perícias.add(tfMiscPerception);
		tfMiscPerception.setText("0");
		tfMiscPerception.setColumns(10);
		
		JLabel label_83 = new JLabel("+");
		label_83.setBounds(283, 454, 14, 20);
		Perícias.add(label_83);
		label_83.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblReligioint = new JLabel("Religi\u00E3o (Int)");
		lblReligioint.setBounds(20, 486, 98, 20);
		Perícias.add(lblReligioint);
		lblReligioint.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfReligionValue = new JTextField();
		tfReligionValue.setBounds(128, 486, 30, 20);
		Perícias.add(tfReligionValue);
		tfReligionValue.setText("0");
		tfReligionValue.setColumns(10);
		
		JLabel label_86 = new JLabel("=");
		label_86.setBounds(162, 485, 14, 20);
		Perícias.add(label_86);
		label_86.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_87 = new JLabel("+");
		label_87.setBounds(204, 486, 14, 20);
		Perícias.add(label_87);
		label_87.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerInt3 = new JTextField();
		tfPerInt3.setBounds(212, 486, 30, 20);
		Perícias.add(tfPerInt3);
		tfPerInt3.setText("0");
		tfPerInt3.setColumns(10);
		
		tfRaceReligion = new JTextField();
		tfRaceReligion.setBounds(249, 486, 30, 20);
		Perícias.add(tfRaceReligion);
		tfRaceReligion.setText("0");
		tfRaceReligion.setColumns(10);
		
		JLabel label_88 = new JLabel("+");
		label_88.setBounds(241, 486, 14, 20);
		Perícias.add(label_88);
		label_88.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscReligion = new JTextField();
		tfMiscReligion.setBounds(291, 486, 30, 20);
		Perícias.add(tfMiscReligion);
		tfMiscReligion.setText("0");
		tfMiscReligion.setColumns(10);
		
		JLabel label_89 = new JLabel("+");
		label_89.setBounds(283, 486, 14, 20);
		Perícias.add(label_89);
		label_89.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblSocorrosab = new JLabel("Socorro (Sab)");
		lblSocorrosab.setBounds(20, 518, 98, 20);
		Perícias.add(lblSocorrosab);
		lblSocorrosab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfHealValue = new JTextField();
		tfHealValue.setBounds(128, 518, 30, 20);
		Perícias.add(tfHealValue);
		tfHealValue.setText("0");
		tfHealValue.setColumns(10);
		
		JLabel label_92 = new JLabel("=");
		label_92.setBounds(162, 517, 14, 20);
		Perícias.add(label_92);
		label_92.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_93 = new JLabel("+");
		label_93.setBounds(204, 518, 14, 20);
		Perícias.add(label_93);
		label_93.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerSab5 = new JTextField();
		tfPerSab5.setBounds(212, 518, 30, 20);
		Perícias.add(tfPerSab5);
		tfPerSab5.setText("0");
		tfPerSab5.setColumns(10);
		
		tfRaceHeal = new JTextField();
		tfRaceHeal.setBounds(249, 518, 30, 20);
		Perícias.add(tfRaceHeal);
		tfRaceHeal.setText("0");
		tfRaceHeal.setColumns(10);
		
		JLabel label_94 = new JLabel("+");
		label_94.setBounds(241, 518, 14, 20);
		Perícias.add(label_94);
		label_94.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscHeal = new JTextField();
		tfMiscHeal.setBounds(291, 518, 30, 20);
		Perícias.add(tfMiscHeal);
		tfMiscHeal.setText("0");
		tfMiscHeal.setColumns(10);
		
		JLabel label_95 = new JLabel("+");
		label_95.setBounds(283, 518, 14, 20);
		Perícias.add(label_95);
		label_95.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel lblTolernciacon = new JLabel("Toler\u00E2ncia (Con)");
		lblTolernciacon.setBounds(20, 550, 98, 20);
		Perícias.add(lblTolernciacon);
		lblTolernciacon.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		
		tfEnduranceValue = new JTextField();
		tfEnduranceValue.setBounds(128, 550, 30, 20);
		Perícias.add(tfEnduranceValue);
		tfEnduranceValue.setText("0");
		tfEnduranceValue.setColumns(10);
		
		JLabel label_98 = new JLabel("=");
		label_98.setBounds(162, 549, 14, 20);
		Perícias.add(label_98);
		label_98.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JLabel label_99 = new JLabel("+");
		label_99.setBounds(204, 550, 14, 20);
		Perícias.add(label_99);
		label_99.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerCon = new JTextField();
		tfPerCon.setBounds(212, 550, 30, 20);
		Perícias.add(tfPerCon);
		tfPerCon.setText("0");
		tfPerCon.setColumns(10);
		
		tfRaceEndurance = new JTextField();
		tfRaceEndurance.setBounds(249, 550, 30, 20);
		Perícias.add(tfRaceEndurance);
		tfRaceEndurance.setText("0");
		tfRaceEndurance.setColumns(10);
		
		JLabel label_100 = new JLabel("+");
		label_100.setBounds(241, 550, 14, 20);
		Perícias.add(label_100);
		label_100.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfMiscEndurance = new JTextField();
		tfMiscEndurance.setBounds(291, 550, 30, 20);
		Perícias.add(tfMiscEndurance);
		tfMiscEndurance.setText("0");
		tfMiscEndurance.setColumns(10);
		
		JLabel label_101 = new JLabel("+");
		label_101.setBounds(283, 550, 14, 20);
		Perícias.add(label_101);
		label_101.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		tfPerPen5 = new JTextField();
		tfPerPen5.setBounds(329, 550, 30, 20);
		Perícias.add(tfPerPen5);
		tfPerPen5.setText("0");
		tfPerPen5.setColumns(10);
		
		JLabel label_102 = new JLabel("-");
		label_102.setBounds(321, 550, 14, 20);
		Perícias.add(label_102);
		label_102.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		
		JRadioButton rbAcrobatics = new JRadioButton("");
		rbAcrobatics.setBounds(0, 39, 21, 23);
		Perícias.add(rbAcrobatics);
		
		JRadioButton rbAtletism = new JRadioButton("");
		rbAtletism.setBounds(0, 102, 21, 23);
		Perícias.add(rbAtletism);
		
		JRadioButton rbBlef = new JRadioButton("");
		rbBlef.setBounds(0, 134, 21, 23);
		Perícias.add(rbBlef);
		
		JRadioButton rbArcanism = new JRadioButton("");
		rbArcanism.setBounds(0, 71, 21, 23);
		Perícias.add(rbArcanism);
		
		JRadioButton rbDiplomacy = new JRadioButton("");
		rbDiplomacy.setBounds(0, 166, 21, 23);
		Perícias.add(rbDiplomacy);
		
		JRadioButton rbDungeonering = new JRadioButton("");
		rbDungeonering.setBounds(0, 198, 21, 23);
		Perícias.add(rbDungeonering);
		
		JRadioButton rbStealth = new JRadioButton("");
		rbStealth.setBounds(0, 232, 21, 23);
		Perícias.add(rbStealth);
		
		JRadioButton rbHistoty = new JRadioButton("");
		rbHistoty.setBounds(0, 262, 21, 23);
		Perícias.add(rbHistoty);
		
		JRadioButton rbIntimidation = new JRadioButton("");
		rbIntimidation.setBounds(0, 294, 21, 23);
		Perícias.add(rbIntimidation);
		
		rbInsight = new JRadioButton("");
		rbInsight.setBounds(0, 326, 21, 23);
		Perícias.add(rbInsight);
		
		rbThievery = new JRadioButton("");
		rbThievery.setBounds(0, 358, 21, 23);
		Perícias.add(rbThievery);
		
		rbStreetwise = new JRadioButton("");
		rbStreetwise.setBounds(0, 390, 21, 23);
		Perícias.add(rbStreetwise);
		
		rbNature = new JRadioButton("");
		rbNature.setBounds(0, 422, 21, 23);
		Perícias.add(rbNature);
		
		rbPerception = new JRadioButton("");
		rbPerception.setBounds(0, 454, 21, 23);
		Perícias.add(rbPerception);
		
		rbReligion = new JRadioButton("");
		rbReligion.setBounds(0, 486, 21, 23);
		Perícias.add(rbReligion);
		
		rbHeal = new JRadioButton("");
		rbHeal.setBounds(0, 518, 21, 23);
		Perícias.add(rbHeal);
		
		rbEndurance = new JRadioButton("");
		rbEndurance.setBounds(0, 550, 21, 23);
		Perícias.add(rbEndurance);
		
		lblTrein = new JLabel("+5 Trein.");
		lblTrein.setBounds(0, 14, 64, 20);
		Perícias.add(lblTrein);
		lblTrein.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		
		nivel = new JTextField();
		nivel.setBounds(172, 39, 26, 533);
		Perícias.add(nivel);
		nivel.setHorizontalAlignment(SwingConstants.CENTER);
		nivel.setText("0");
		nivel.setColumns(10);
		
		JButton btnCalcularPercia = new JButton("Calcular Per\u00EDcia");
		btnCalcularPercia.setBounds(0, 581, 123, 23);
		Perícias.add(btnCalcularPercia);
		btnCalcularPercia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				atributos.setPericiaValue(rbAcrobatics, tfAcrobaticsValue, tfPerDes1, nivel, tfRaceAcrobatics, tfMiscAcrobatics, tfPerPen1);
				atributos.setPericiaValue(rbArcanism, tfArcanismValue, tfPerInt1, nivel, tfRaceArcanism, tfMiscArcanism);
				atributos.setPericiaValue(rbAtletism, tfAtletismValue, tfPerFor1, nivel, tfRaceAtletism, tfMiscAtletism, tfPerPen2);
				atributos.setPericiaValue(rbBlef, tfBlefValue, tfPerCar1, nivel, tfRaceBlef, tfMiscBlef);
				atributos.setPericiaValue(rbDiplomacy, tfDiplomacyValue, tfPerCar1, nivel, tfRaceDiplomacy, tfMiscDiplomacy);
				atributos.setPericiaValue(rbDungeonering, tfDungeoneringValue, tfPerSab1, nivel, tfRaceDungeonering, tfMiscDungeonering);
				atributos.setPericiaValue(rbStealth, tfStealthValue, tfPerDes2, nivel, tfRaceStealth, tfMiscStealth);
				atributos.setPericiaValue(rbHistoty, tfHistoryValue, tfPerInt2, nivel, tfRaceHistory, tfMiscHistory);
				atributos.setPericiaValue(rbIntimidation, tfIntimidationValue, tfPerFor2, nivel, tfRaceIntimidation, tfMiscIntimidation);
				atributos.setPericiaValue(rbInsight, tfInsightValue, tfPerSab2, nivel, tfRaceInsight, tfMiscInsight);
				atributos.setPericiaValue(rbThievery, tfThieveryValue, tfPerDes3, nivel, tfRaceThievery, tfMiscThievery, tfPerPen4);
				atributos.setPericiaValue(rbStreetwise, tfStreetwiseValue, tfPerCar3, nivel, tfRaceStreetwise, tfMiscStreetwise);
				atributos.setPericiaValue(rbNature, tfNatureValue, tfPerSab3, nivel, tfRaceNature, tfMiscNature);
				atributos.setPericiaValue(rbPerception, tfPerceptionValue, tfPerSab4, nivel, tfRacePerception, tfMiscPerception);
				atributos.setPericiaValue(rbReligion, tfReligionValue, tfPerInt3, nivel, tfRaceReligion, tfMiscReligion);
				atributos.setPericiaValue(rbHeal, tfHealValue, tfPerSab5, nivel, tfRaceHeal, tfMiscHeal);
				atributos.setPericiaValue(rbEndurance, tfEnduranceValue, tfPerCon, nivel, tfRaceEndurance, tfMiscEndurance, tfPerPen5);
			}
		});
		
	}
}
