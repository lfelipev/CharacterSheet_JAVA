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

public class FramePrincipal extends JFrame {

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
	private JTextField tfAcrValue;
	private JTextField tfPerDes1;
	private JTextField tfPerRace;
	private JTextField tfPerMisc1;
	private JLabel label_5;
	private JTextField tfPerPen;
	private JLabel label_6;
	private JLabel lblNv;
	private JLabel lblMod_1;
	private JLabel lblRaa;
	private JLabel lblMisc;
	private JLabel lblPenalidadeDaArmadura;
	private JLabel lblArmadura;
	private JTextField textField_3;
	private JTextField tfPerInt;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField tfPerFor2;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField tfPerCar;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_21;
	private JTextField tfPerCar2;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_27;
	private JTextField tfPerSab;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_33;
	private JTextField tfPerDes;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField tfPerInt2;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_45;
	private JTextField tfPerFor3;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_51;
	private JTextField tfPerSab2;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_57;
	private JTextField tfPerDes3;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField tfPerCar3;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_69;
	private JTextField tfPerSab3;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_75;
	private JTextField tfPerSab4;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_81;
	private JTextField tfPerInt3;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_87;
	private JTextField tfPerSab5;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_93;
	private JTextField tfPerCon;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JRadioButton rbIntu;
	private JRadioButton rbLadi;
	private JRadioButton brManh;
	private JRadioButton brNatu;
	private JRadioButton rbPerce;
	private JRadioButton rbRelig;
	private JRadioButton rbSocor;
	private JRadioButton rbToler;
	private JLabel lblTrein;
	private JTextField nivel;

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
		btnGerar.setBounds(442, 235, 115, 65);
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
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				atributos.forca(p, tfFor, tfModFor);
				atributos.constituicao(p, tfCon, tfModCon);
				atributos.destreza(p, tfDes, tfModDes);
				atributos.inteligencia(p, tfInt, tfModInt);
				atributos.sabedoria(p, tfSab, tfModSab);
				atributos.carisma(p, tfCar, tfModCar);
				
				atributos.acrobatics(p, tfModDes, tfPerDes1, tfAcrValue);
		
			}
		});
		btnCalcular.setBounds(64, 287, 91, 23);
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
		
		lblPeri = new JLabel("Valor");
		lblPeri.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		lblPeri.setBounds(138, 324, 39, 20);
		contentPane.add(lblPeri);
		
		lblAcrobacia = new JLabel("Acrobacia (Des)");
		lblAcrobacia.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblAcrobacia.setBounds(30, 347, 98, 20);
		contentPane.add(lblAcrobacia);
		
		tfAcrValue = new JTextField();
		tfAcrValue.setText("0");
		tfAcrValue.setColumns(10);
		tfAcrValue.setBounds(138, 347, 30, 20);
		contentPane.add(tfAcrValue);
		
		JLabel label_2 = new JLabel("=");
		label_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_2.setBounds(172, 346, 14, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("+");
		label_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_3.setBounds(214, 347, 14, 20);
		contentPane.add(label_3);
		
		tfPerDes1 = new JTextField();
		tfPerDes1.setText("0");
		tfPerDes1.setColumns(10);
		tfPerDes1.setBounds(222, 347, 30, 20);
		contentPane.add(tfPerDes1);
		
		tfPerRace = new JTextField();
		tfPerRace.setText("0");
		tfPerRace.setColumns(10);
		tfPerRace.setBounds(259, 347, 30, 20);
		contentPane.add(tfPerRace);
		
		JLabel label_4 = new JLabel("+");
		label_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_4.setBounds(251, 347, 14, 20);
		contentPane.add(label_4);
		
		tfPerMisc1 = new JTextField();
		tfPerMisc1.setText("0");
		tfPerMisc1.setColumns(10);
		tfPerMisc1.setBounds(301, 347, 30, 20);
		contentPane.add(tfPerMisc1);
		
		label_5 = new JLabel("+");
		label_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_5.setBounds(293, 347, 14, 20);
		contentPane.add(label_5);
		
		tfPerPen = new JTextField();
		tfPerPen.setText("0");
		tfPerPen.setColumns(10);
		tfPerPen.setBounds(339, 347, 30, 20);
		contentPane.add(tfPerPen);
		
		label_6 = new JLabel("-");
		label_6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_6.setBounds(331, 347, 14, 20);
		contentPane.add(label_6);
		
		lblNv = new JLabel("1/2 Nv");
		lblNv.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		lblNv.setBounds(178, 324, 39, 20);
		contentPane.add(lblNv);
		
		lblMod_1 = new JLabel("Atr.");
		lblMod_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		lblMod_1.setBounds(222, 324, 39, 20);
		contentPane.add(lblMod_1);
		
		lblRaa = new JLabel("Ra\u00E7a");
		lblRaa.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		lblRaa.setBounds(259, 324, 39, 20);
		contentPane.add(lblRaa);
		
		lblMisc = new JLabel("Misc");
		lblMisc.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		lblMisc.setBounds(301, 324, 39, 20);
		contentPane.add(lblMisc);
		
		lblPenalidadeDaArmadura = new JLabel("Penalidade");
		lblPenalidadeDaArmadura.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		lblPenalidadeDaArmadura.setBounds(346, 308, 64, 20);
		contentPane.add(lblPenalidadeDaArmadura);
		
		lblArmadura = new JLabel("Armadura");
		lblArmadura.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		lblArmadura.setBounds(346, 321, 64, 20);
		contentPane.add(lblArmadura);
		
		JLabel lblArcanismoint = new JLabel("Arcanismo (Int)");
		lblArcanismoint.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblArcanismoint.setBounds(30, 379, 98, 20);
		contentPane.add(lblArcanismoint);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.setBounds(138, 379, 30, 20);
		contentPane.add(textField_3);
		
		JLabel label_8 = new JLabel("=");
		label_8.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_8.setBounds(172, 378, 14, 20);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("+");
		label_9.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_9.setBounds(214, 379, 14, 20);
		contentPane.add(label_9);
		
		tfPerInt = new JTextField();
		tfPerInt.setText("0");
		tfPerInt.setColumns(10);
		tfPerInt.setBounds(222, 379, 30, 20);
		contentPane.add(tfPerInt);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setColumns(10);
		textField_6.setBounds(259, 379, 30, 20);
		contentPane.add(textField_6);
		
		JLabel label_10 = new JLabel("+");
		label_10.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_10.setBounds(251, 379, 14, 20);
		contentPane.add(label_10);
		
		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setColumns(10);
		textField_7.setBounds(301, 379, 30, 20);
		contentPane.add(textField_7);
		
		JLabel label_11 = new JLabel("+");
		label_11.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_11.setBounds(293, 379, 14, 20);
		contentPane.add(label_11);
		
		JLabel lblAtletismofor = new JLabel("Atletismo (For)");
		lblAtletismofor.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblAtletismofor.setBounds(30, 410, 98, 20);
		contentPane.add(lblAtletismofor);
		
		textField_9 = new JTextField();
		textField_9.setText("0");
		textField_9.setColumns(10);
		textField_9.setBounds(138, 410, 30, 20);
		contentPane.add(textField_9);
		
		JLabel label_14 = new JLabel("=");
		label_14.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_14.setBounds(172, 409, 14, 20);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("+");
		label_15.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_15.setBounds(214, 410, 14, 20);
		contentPane.add(label_15);
		
		tfPerFor2 = new JTextField();
		tfPerFor2.setText("0");
		tfPerFor2.setColumns(10);
		tfPerFor2.setBounds(222, 410, 30, 20);
		contentPane.add(tfPerFor2);
		
		textField_12 = new JTextField();
		textField_12.setText("0");
		textField_12.setColumns(10);
		textField_12.setBounds(259, 410, 30, 20);
		contentPane.add(textField_12);
		
		JLabel label_16 = new JLabel("+");
		label_16.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_16.setBounds(251, 410, 14, 20);
		contentPane.add(label_16);
		
		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setColumns(10);
		textField_13.setBounds(301, 410, 30, 20);
		contentPane.add(textField_13);
		
		JLabel label_17 = new JLabel("+");
		label_17.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_17.setBounds(293, 410, 14, 20);
		contentPane.add(label_17);
		
		textField_14 = new JTextField();
		textField_14.setText("0");
		textField_14.setColumns(10);
		textField_14.setBounds(339, 410, 30, 20);
		contentPane.add(textField_14);
		
		JLabel label_18 = new JLabel("-");
		label_18.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_18.setBounds(331, 410, 14, 20);
		contentPane.add(label_18);
		
		JLabel lblBlefecar = new JLabel("Blefe (Car)");
		lblBlefecar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblBlefecar.setBounds(30, 442, 98, 20);
		contentPane.add(lblBlefecar);
		
		textField_15 = new JTextField();
		textField_15.setText("0");
		textField_15.setColumns(10);
		textField_15.setBounds(138, 442, 30, 20);
		contentPane.add(textField_15);
		
		JLabel label_20 = new JLabel("=");
		label_20.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_20.setBounds(172, 441, 14, 20);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("+");
		label_21.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_21.setBounds(214, 442, 14, 20);
		contentPane.add(label_21);
		
		tfPerCar = new JTextField();
		tfPerCar.setText("0");
		tfPerCar.setColumns(10);
		tfPerCar.setBounds(222, 442, 30, 20);
		contentPane.add(tfPerCar);
		
		textField_18 = new JTextField();
		textField_18.setText("0");
		textField_18.setColumns(10);
		textField_18.setBounds(259, 442, 30, 20);
		contentPane.add(textField_18);
		
		JLabel label_22 = new JLabel("+");
		label_22.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_22.setBounds(251, 442, 14, 20);
		contentPane.add(label_22);
		
		textField_19 = new JTextField();
		textField_19.setText("0");
		textField_19.setColumns(10);
		textField_19.setBounds(301, 442, 30, 20);
		contentPane.add(textField_19);
		
		JLabel label_23 = new JLabel("+");
		label_23.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_23.setBounds(293, 442, 14, 20);
		contentPane.add(label_23);
		
		JLabel lblDiplomaciacar = new JLabel("Diplomacia (Car)");
		lblDiplomaciacar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblDiplomaciacar.setBounds(30, 474, 98, 20);
		contentPane.add(lblDiplomaciacar);
		
		textField_21 = new JTextField();
		textField_21.setText("0");
		textField_21.setColumns(10);
		textField_21.setBounds(138, 474, 30, 20);
		contentPane.add(textField_21);
		
		JLabel label_26 = new JLabel("=");
		label_26.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_26.setBounds(172, 473, 14, 20);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("+");
		label_27.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_27.setBounds(214, 474, 14, 20);
		contentPane.add(label_27);
		
		tfPerCar2 = new JTextField();
		tfPerCar2.setText("0");
		tfPerCar2.setColumns(10);
		tfPerCar2.setBounds(222, 474, 30, 20);
		contentPane.add(tfPerCar2);
		
		textField_24 = new JTextField();
		textField_24.setText("0");
		textField_24.setColumns(10);
		textField_24.setBounds(259, 474, 30, 20);
		contentPane.add(textField_24);
		
		JLabel label_28 = new JLabel("+");
		label_28.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_28.setBounds(251, 474, 14, 20);
		contentPane.add(label_28);
		
		textField_25 = new JTextField();
		textField_25.setText("0");
		textField_25.setColumns(10);
		textField_25.setBounds(301, 474, 30, 20);
		contentPane.add(textField_25);
		
		JLabel label_29 = new JLabel("+");
		label_29.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_29.setBounds(293, 474, 14, 20);
		contentPane.add(label_29);
		
		JLabel lblExploraosab = new JLabel("Explora\u00E7\u00E3o (Sab)");
		lblExploraosab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblExploraosab.setBounds(30, 506, 105, 20);
		contentPane.add(lblExploraosab);
		
		textField_27 = new JTextField();
		textField_27.setText("0");
		textField_27.setColumns(10);
		textField_27.setBounds(138, 506, 30, 20);
		contentPane.add(textField_27);
		
		JLabel label_32 = new JLabel("=");
		label_32.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_32.setBounds(172, 505, 14, 20);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel("+");
		label_33.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_33.setBounds(214, 506, 14, 20);
		contentPane.add(label_33);
		
		tfPerSab = new JTextField();
		tfPerSab.setText("0");
		tfPerSab.setColumns(10);
		tfPerSab.setBounds(222, 506, 30, 20);
		contentPane.add(tfPerSab);
		
		textField_30 = new JTextField();
		textField_30.setText("0");
		textField_30.setColumns(10);
		textField_30.setBounds(259, 506, 30, 20);
		contentPane.add(textField_30);
		
		JLabel label_34 = new JLabel("+");
		label_34.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_34.setBounds(251, 506, 14, 20);
		contentPane.add(label_34);
		
		textField_31 = new JTextField();
		textField_31.setText("0");
		textField_31.setColumns(10);
		textField_31.setBounds(301, 506, 30, 20);
		contentPane.add(textField_31);
		
		JLabel label_35 = new JLabel("+");
		label_35.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_35.setBounds(293, 506, 14, 20);
		contentPane.add(label_35);
		
		JLabel lblFurtividadedes = new JLabel("Furtividade (Des)");
		lblFurtividadedes.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblFurtividadedes.setBounds(30, 538, 98, 20);
		contentPane.add(lblFurtividadedes);
		
		textField_33 = new JTextField();
		textField_33.setText("0");
		textField_33.setColumns(10);
		textField_33.setBounds(138, 538, 30, 20);
		contentPane.add(textField_33);
		
		JLabel label_38 = new JLabel("=");
		label_38.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_38.setBounds(172, 537, 14, 20);
		contentPane.add(label_38);
		
		JLabel label_39 = new JLabel("+");
		label_39.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_39.setBounds(214, 538, 14, 20);
		contentPane.add(label_39);
		
		tfPerDes = new JTextField();
		tfPerDes.setText("0");
		tfPerDes.setColumns(10);
		tfPerDes.setBounds(222, 538, 30, 20);
		contentPane.add(tfPerDes);
		
		textField_36 = new JTextField();
		textField_36.setText("0");
		textField_36.setColumns(10);
		textField_36.setBounds(259, 538, 30, 20);
		contentPane.add(textField_36);
		
		JLabel label_40 = new JLabel("+");
		label_40.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_40.setBounds(251, 538, 14, 20);
		contentPane.add(label_40);
		
		textField_37 = new JTextField();
		textField_37.setText("0");
		textField_37.setColumns(10);
		textField_37.setBounds(301, 538, 30, 20);
		contentPane.add(textField_37);
		
		JLabel label_41 = new JLabel("+");
		label_41.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_41.setBounds(293, 538, 14, 20);
		contentPane.add(label_41);
		
		textField_38 = new JTextField();
		textField_38.setText("0");
		textField_38.setColumns(10);
		textField_38.setBounds(339, 538, 30, 20);
		contentPane.add(textField_38);
		
		JLabel label_42 = new JLabel("-");
		label_42.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_42.setBounds(331, 538, 14, 20);
		contentPane.add(label_42);
		
		JLabel lblHistriaint = new JLabel("Hist\u00F3ria (Int)");
		lblHistriaint.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblHistriaint.setBounds(30, 570, 98, 20);
		contentPane.add(lblHistriaint);
		
		textField_39 = new JTextField();
		textField_39.setText("0");
		textField_39.setColumns(10);
		textField_39.setBounds(138, 570, 30, 20);
		contentPane.add(textField_39);
		
		JLabel label_44 = new JLabel("=");
		label_44.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_44.setBounds(172, 569, 14, 20);
		contentPane.add(label_44);
		
		JLabel label_45 = new JLabel("+");
		label_45.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_45.setBounds(214, 570, 14, 20);
		contentPane.add(label_45);
		
		tfPerInt2 = new JTextField();
		tfPerInt2.setText("0");
		tfPerInt2.setColumns(10);
		tfPerInt2.setBounds(222, 570, 30, 20);
		contentPane.add(tfPerInt2);
		
		textField_42 = new JTextField();
		textField_42.setText("0");
		textField_42.setColumns(10);
		textField_42.setBounds(259, 570, 30, 20);
		contentPane.add(textField_42);
		
		JLabel label_46 = new JLabel("+");
		label_46.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_46.setBounds(251, 570, 14, 20);
		contentPane.add(label_46);
		
		textField_43 = new JTextField();
		textField_43.setText("0");
		textField_43.setColumns(10);
		textField_43.setBounds(301, 570, 30, 20);
		contentPane.add(textField_43);
		
		JLabel label_47 = new JLabel("+");
		label_47.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_47.setBounds(293, 570, 14, 20);
		contentPane.add(label_47);
		
		JLabel lblIntimidaofor = new JLabel("Intimida\u00E7\u00E3o (For)");
		lblIntimidaofor.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblIntimidaofor.setBounds(30, 602, 105, 20);
		contentPane.add(lblIntimidaofor);
		
		textField_45 = new JTextField();
		textField_45.setText("0");
		textField_45.setColumns(10);
		textField_45.setBounds(138, 602, 30, 20);
		contentPane.add(textField_45);
		
		JLabel label_50 = new JLabel("=");
		label_50.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_50.setBounds(172, 601, 14, 20);
		contentPane.add(label_50);
		
		JLabel label_51 = new JLabel("+");
		label_51.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_51.setBounds(214, 602, 14, 20);
		contentPane.add(label_51);
		
		tfPerFor3 = new JTextField();
		tfPerFor3.setText("0");
		tfPerFor3.setColumns(10);
		tfPerFor3.setBounds(222, 602, 30, 20);
		contentPane.add(tfPerFor3);
		
		textField_48 = new JTextField();
		textField_48.setText("0");
		textField_48.setColumns(10);
		textField_48.setBounds(259, 602, 30, 20);
		contentPane.add(textField_48);
		
		JLabel label_52 = new JLabel("+");
		label_52.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_52.setBounds(251, 602, 14, 20);
		contentPane.add(label_52);
		
		textField_49 = new JTextField();
		textField_49.setText("0");
		textField_49.setColumns(10);
		textField_49.setBounds(301, 602, 30, 20);
		contentPane.add(textField_49);
		
		JLabel label_53 = new JLabel("+");
		label_53.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_53.setBounds(293, 602, 14, 20);
		contentPane.add(label_53);
		
		JLabel lblIntuiosab = new JLabel("Intui\u00E7\u00E3o (Sab)");
		lblIntuiosab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblIntuiosab.setBounds(30, 634, 98, 20);
		contentPane.add(lblIntuiosab);
		
		textField_51 = new JTextField();
		textField_51.setText("0");
		textField_51.setColumns(10);
		textField_51.setBounds(138, 634, 30, 20);
		contentPane.add(textField_51);
		
		JLabel label_56 = new JLabel("=");
		label_56.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_56.setBounds(172, 633, 14, 20);
		contentPane.add(label_56);
		
		JLabel label_57 = new JLabel("+");
		label_57.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_57.setBounds(214, 634, 14, 20);
		contentPane.add(label_57);
		
		tfPerSab2 = new JTextField();
		tfPerSab2.setText("0");
		tfPerSab2.setColumns(10);
		tfPerSab2.setBounds(222, 634, 30, 20);
		contentPane.add(tfPerSab2);
		
		textField_54 = new JTextField();
		textField_54.setText("0");
		textField_54.setColumns(10);
		textField_54.setBounds(259, 634, 30, 20);
		contentPane.add(textField_54);
		
		JLabel label_58 = new JLabel("+");
		label_58.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_58.setBounds(251, 634, 14, 20);
		contentPane.add(label_58);
		
		textField_55 = new JTextField();
		textField_55.setText("0");
		textField_55.setColumns(10);
		textField_55.setBounds(301, 634, 30, 20);
		contentPane.add(textField_55);
		
		JLabel label_59 = new JLabel("+");
		label_59.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_59.setBounds(293, 634, 14, 20);
		contentPane.add(label_59);
		
		JLabel lblLadinagemdes = new JLabel("Ladinagem (Des)");
		lblLadinagemdes.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblLadinagemdes.setBounds(30, 666, 98, 20);
		contentPane.add(lblLadinagemdes);
		
		textField_57 = new JTextField();
		textField_57.setText("0");
		textField_57.setColumns(10);
		textField_57.setBounds(138, 666, 30, 20);
		contentPane.add(textField_57);
		
		JLabel label_62 = new JLabel("=");
		label_62.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_62.setBounds(172, 665, 14, 20);
		contentPane.add(label_62);
		
		JLabel label_63 = new JLabel("+");
		label_63.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_63.setBounds(214, 666, 14, 20);
		contentPane.add(label_63);
		
		tfPerDes3 = new JTextField();
		tfPerDes3.setText("0");
		tfPerDes3.setColumns(10);
		tfPerDes3.setBounds(222, 666, 30, 20);
		contentPane.add(tfPerDes3);
		
		textField_60 = new JTextField();
		textField_60.setText("0");
		textField_60.setColumns(10);
		textField_60.setBounds(259, 666, 30, 20);
		contentPane.add(textField_60);
		
		JLabel label_64 = new JLabel("+");
		label_64.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_64.setBounds(251, 666, 14, 20);
		contentPane.add(label_64);
		
		textField_61 = new JTextField();
		textField_61.setText("0");
		textField_61.setColumns(10);
		textField_61.setBounds(301, 666, 30, 20);
		contentPane.add(textField_61);
		
		JLabel label_65 = new JLabel("+");
		label_65.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_65.setBounds(293, 666, 14, 20);
		contentPane.add(label_65);
		
		textField_62 = new JTextField();
		textField_62.setText("0");
		textField_62.setColumns(10);
		textField_62.setBounds(339, 666, 30, 20);
		contentPane.add(textField_62);
		
		JLabel label_66 = new JLabel("-");
		label_66.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_66.setBounds(331, 666, 14, 20);
		contentPane.add(label_66);
		
		JLabel lblManhacar = new JLabel("Manha (Car)");
		lblManhacar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblManhacar.setBounds(30, 698, 98, 20);
		contentPane.add(lblManhacar);
		
		textField_63 = new JTextField();
		textField_63.setText("0");
		textField_63.setColumns(10);
		textField_63.setBounds(138, 698, 30, 20);
		contentPane.add(textField_63);
		
		JLabel label_68 = new JLabel("=");
		label_68.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_68.setBounds(172, 697, 14, 20);
		contentPane.add(label_68);
		
		JLabel label_69 = new JLabel("+");
		label_69.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_69.setBounds(214, 698, 14, 20);
		contentPane.add(label_69);
		
		tfPerCar3 = new JTextField();
		tfPerCar3.setText("0");
		tfPerCar3.setColumns(10);
		tfPerCar3.setBounds(222, 698, 30, 20);
		contentPane.add(tfPerCar3);
		
		textField_66 = new JTextField();
		textField_66.setText("0");
		textField_66.setColumns(10);
		textField_66.setBounds(259, 698, 30, 20);
		contentPane.add(textField_66);
		
		JLabel label_70 = new JLabel("+");
		label_70.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_70.setBounds(237, 697, 14, 20);
		contentPane.add(label_70);
		
		textField_67 = new JTextField();
		textField_67.setText("0");
		textField_67.setColumns(10);
		textField_67.setBounds(301, 698, 30, 20);
		contentPane.add(textField_67);
		
		JLabel label_71 = new JLabel("+");
		label_71.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_71.setBounds(293, 698, 14, 20);
		contentPane.add(label_71);
		
		JLabel lblNaturezasab = new JLabel("Natureza (Sab)");
		lblNaturezasab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblNaturezasab.setBounds(30, 730, 98, 20);
		contentPane.add(lblNaturezasab);
		
		textField_69 = new JTextField();
		textField_69.setText("0");
		textField_69.setColumns(10);
		textField_69.setBounds(138, 730, 30, 20);
		contentPane.add(textField_69);
		
		JLabel label_74 = new JLabel("=");
		label_74.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_74.setBounds(172, 729, 14, 20);
		contentPane.add(label_74);
		
		JLabel label_75 = new JLabel("+");
		label_75.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_75.setBounds(214, 730, 14, 20);
		contentPane.add(label_75);
		
		tfPerSab3 = new JTextField();
		tfPerSab3.setText("0");
		tfPerSab3.setColumns(10);
		tfPerSab3.setBounds(222, 730, 30, 20);
		contentPane.add(tfPerSab3);
		
		textField_72 = new JTextField();
		textField_72.setText("0");
		textField_72.setColumns(10);
		textField_72.setBounds(259, 730, 30, 20);
		contentPane.add(textField_72);
		
		JLabel label_76 = new JLabel("+");
		label_76.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_76.setBounds(251, 730, 14, 20);
		contentPane.add(label_76);
		
		textField_73 = new JTextField();
		textField_73.setText("0");
		textField_73.setColumns(10);
		textField_73.setBounds(301, 730, 30, 20);
		contentPane.add(textField_73);
		
		JLabel label_77 = new JLabel("+");
		label_77.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_77.setBounds(293, 730, 14, 20);
		contentPane.add(label_77);
		
		JLabel lblPerceposab = new JLabel("Percep\u00E7\u00E3o (Sab)");
		lblPerceposab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblPerceposab.setBounds(30, 762, 98, 20);
		contentPane.add(lblPerceposab);
		
		textField_75 = new JTextField();
		textField_75.setText("0");
		textField_75.setColumns(10);
		textField_75.setBounds(138, 762, 30, 20);
		contentPane.add(textField_75);
		
		JLabel label_80 = new JLabel("=");
		label_80.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_80.setBounds(172, 761, 14, 20);
		contentPane.add(label_80);
		
		JLabel label_81 = new JLabel("+");
		label_81.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_81.setBounds(214, 762, 14, 20);
		contentPane.add(label_81);
		
		tfPerSab4 = new JTextField();
		tfPerSab4.setText("0");
		tfPerSab4.setColumns(10);
		tfPerSab4.setBounds(222, 762, 30, 20);
		contentPane.add(tfPerSab4);
		
		textField_78 = new JTextField();
		textField_78.setText("0");
		textField_78.setColumns(10);
		textField_78.setBounds(259, 762, 30, 20);
		contentPane.add(textField_78);
		
		JLabel label_82 = new JLabel("+");
		label_82.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_82.setBounds(251, 762, 14, 20);
		contentPane.add(label_82);
		
		textField_79 = new JTextField();
		textField_79.setText("0");
		textField_79.setColumns(10);
		textField_79.setBounds(301, 762, 30, 20);
		contentPane.add(textField_79);
		
		JLabel label_83 = new JLabel("+");
		label_83.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_83.setBounds(293, 762, 14, 20);
		contentPane.add(label_83);
		
		JLabel lblReligioint = new JLabel("Religi\u00E3o (Int)");
		lblReligioint.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblReligioint.setBounds(30, 794, 98, 20);
		contentPane.add(lblReligioint);
		
		textField_81 = new JTextField();
		textField_81.setText("0");
		textField_81.setColumns(10);
		textField_81.setBounds(138, 794, 30, 20);
		contentPane.add(textField_81);
		
		JLabel label_86 = new JLabel("=");
		label_86.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_86.setBounds(172, 793, 14, 20);
		contentPane.add(label_86);
		
		JLabel label_87 = new JLabel("+");
		label_87.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_87.setBounds(214, 794, 14, 20);
		contentPane.add(label_87);
		
		tfPerInt3 = new JTextField();
		tfPerInt3.setText("0");
		tfPerInt3.setColumns(10);
		tfPerInt3.setBounds(222, 794, 30, 20);
		contentPane.add(tfPerInt3);
		
		textField_84 = new JTextField();
		textField_84.setText("0");
		textField_84.setColumns(10);
		textField_84.setBounds(259, 794, 30, 20);
		contentPane.add(textField_84);
		
		JLabel label_88 = new JLabel("+");
		label_88.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_88.setBounds(251, 794, 14, 20);
		contentPane.add(label_88);
		
		textField_85 = new JTextField();
		textField_85.setText("0");
		textField_85.setColumns(10);
		textField_85.setBounds(301, 794, 30, 20);
		contentPane.add(textField_85);
		
		JLabel label_89 = new JLabel("+");
		label_89.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_89.setBounds(293, 794, 14, 20);
		contentPane.add(label_89);
		
		JLabel lblSocorrosab = new JLabel("Socorro (Sab)");
		lblSocorrosab.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblSocorrosab.setBounds(30, 826, 98, 20);
		contentPane.add(lblSocorrosab);
		
		textField_87 = new JTextField();
		textField_87.setText("0");
		textField_87.setColumns(10);
		textField_87.setBounds(138, 826, 30, 20);
		contentPane.add(textField_87);
		
		JLabel label_92 = new JLabel("=");
		label_92.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_92.setBounds(172, 825, 14, 20);
		contentPane.add(label_92);
		
		JLabel label_93 = new JLabel("+");
		label_93.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_93.setBounds(214, 826, 14, 20);
		contentPane.add(label_93);
		
		tfPerSab5 = new JTextField();
		tfPerSab5.setText("0");
		tfPerSab5.setColumns(10);
		tfPerSab5.setBounds(222, 826, 30, 20);
		contentPane.add(tfPerSab5);
		
		textField_90 = new JTextField();
		textField_90.setText("0");
		textField_90.setColumns(10);
		textField_90.setBounds(259, 826, 30, 20);
		contentPane.add(textField_90);
		
		JLabel label_94 = new JLabel("+");
		label_94.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_94.setBounds(251, 826, 14, 20);
		contentPane.add(label_94);
		
		textField_91 = new JTextField();
		textField_91.setText("0");
		textField_91.setColumns(10);
		textField_91.setBounds(301, 826, 30, 20);
		contentPane.add(textField_91);
		
		JLabel label_95 = new JLabel("+");
		label_95.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_95.setBounds(293, 826, 14, 20);
		contentPane.add(label_95);
		
		JLabel lblTolernciacon = new JLabel("Toler\u00E2ncia (Con)");
		lblTolernciacon.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblTolernciacon.setBounds(30, 858, 98, 20);
		contentPane.add(lblTolernciacon);
		
		textField_93 = new JTextField();
		textField_93.setText("0");
		textField_93.setColumns(10);
		textField_93.setBounds(138, 858, 30, 20);
		contentPane.add(textField_93);
		
		JLabel label_98 = new JLabel("=");
		label_98.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_98.setBounds(172, 857, 14, 20);
		contentPane.add(label_98);
		
		JLabel label_99 = new JLabel("+");
		label_99.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_99.setBounds(214, 858, 14, 20);
		contentPane.add(label_99);
		
		tfPerCon = new JTextField();
		tfPerCon.setText("0");
		tfPerCon.setColumns(10);
		tfPerCon.setBounds(222, 858, 30, 20);
		contentPane.add(tfPerCon);
		
		textField_96 = new JTextField();
		textField_96.setText("0");
		textField_96.setColumns(10);
		textField_96.setBounds(259, 858, 30, 20);
		contentPane.add(textField_96);
		
		JLabel label_100 = new JLabel("+");
		label_100.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_100.setBounds(251, 858, 14, 20);
		contentPane.add(label_100);
		
		textField_97 = new JTextField();
		textField_97.setText("0");
		textField_97.setColumns(10);
		textField_97.setBounds(301, 858, 30, 20);
		contentPane.add(textField_97);
		
		JLabel label_101 = new JLabel("+");
		label_101.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_101.setBounds(293, 858, 14, 20);
		contentPane.add(label_101);
		
		textField_98 = new JTextField();
		textField_98.setText("0");
		textField_98.setColumns(10);
		textField_98.setBounds(339, 858, 30, 20);
		contentPane.add(textField_98);
		
		JLabel label_102 = new JLabel("-");
		label_102.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_102.setBounds(331, 858, 14, 20);
		contentPane.add(label_102);
		
		JRadioButton rbAcro = new JRadioButton("");
		rbAcro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbAcro.isSelected()) {
					tfAcrValue.setText(Integer.toString(Integer.parseInt(tfAcrValue.getText()) + 5));
				} else {
					tfAcrValue.setText(Integer.toString(Integer.parseInt(tfAcrValue.getText()) - 5));
					
				}
			}
		});
		rbAcro.setBounds(10, 347, 21, 23);
		contentPane.add(rbAcro);
		
		JRadioButton rbAtle = new JRadioButton("");
		rbAtle.setBounds(10, 410, 21, 23);
		contentPane.add(rbAtle);
		
		JRadioButton brBlef = new JRadioButton("");
		brBlef.setBounds(10, 442, 21, 23);
		contentPane.add(brBlef);
		
		JRadioButton rbArca = new JRadioButton("");
		rbArca.setBounds(10, 379, 21, 23);
		contentPane.add(rbArca);
		
		JRadioButton rbDiplo = new JRadioButton("");
		rbDiplo.setBounds(10, 474, 21, 23);
		contentPane.add(rbDiplo);
		
		JRadioButton rbExplo = new JRadioButton("");
		rbExplo.setBounds(10, 506, 21, 23);
		contentPane.add(rbExplo);
		
		JRadioButton rbFurti = new JRadioButton("");
		rbFurti.setBounds(10, 540, 21, 23);
		contentPane.add(rbFurti);
		
		JRadioButton rbHisto = new JRadioButton("");
		rbHisto.setBounds(10, 570, 21, 23);
		contentPane.add(rbHisto);
		
		JRadioButton rbInti = new JRadioButton("");
		rbInti.setBounds(10, 602, 21, 23);
		contentPane.add(rbInti);
		
		rbIntu = new JRadioButton("");
		rbIntu.setBounds(10, 634, 21, 23);
		contentPane.add(rbIntu);
		
		rbLadi = new JRadioButton("");
		rbLadi.setBounds(10, 666, 21, 23);
		contentPane.add(rbLadi);
		
		brManh = new JRadioButton("");
		brManh.setBounds(10, 698, 21, 23);
		contentPane.add(brManh);
		
		brNatu = new JRadioButton("");
		brNatu.setBounds(10, 730, 21, 23);
		contentPane.add(brNatu);
		
		rbPerce = new JRadioButton("");
		rbPerce.setBounds(10, 762, 21, 23);
		contentPane.add(rbPerce);
		
		rbRelig = new JRadioButton("");
		rbRelig.setBounds(10, 794, 21, 23);
		contentPane.add(rbRelig);
		
		rbSocor = new JRadioButton("");
		rbSocor.setBounds(10, 826, 21, 23);
		contentPane.add(rbSocor);
		
		rbToler = new JRadioButton("");
		rbToler.setBounds(10, 858, 21, 23);
		contentPane.add(rbToler);
		
		lblTrein = new JLabel("+5 Trein.");
		lblTrein.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		lblTrein.setBounds(10, 322, 64, 20);
		contentPane.add(lblTrein);
		
		nivel = new JTextField();
		nivel.setHorizontalAlignment(SwingConstants.CENTER);
		nivel.setText("0");
		nivel.setColumns(10);
		nivel.setBounds(182, 347, 26, 533);
		contentPane.add(nivel);
		
	}
}
