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
import java.awt.ScrollPane;
import java.awt.TextArea;

import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;

import java.awt.Canvas;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextPane;

import java.awt.TextField;

import javax.swing.JScrollBar;
import org.eclipse.wb.swing.FocusTraversalOnArray;

public class FramePrincipal extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField tfAcrobaciaValue;
	private JTextField tfPerDes1;
	private JTextField tfAcrobaciaRaca;
	private JTextField tfAcrobaciaMisc;
	private JTextField tfPerPen1;
	private JTextField tfArcanismoValue;
	private JTextField tfPerInt1;
	private JTextField tfArcanismoRaca;
	private JTextField tfArcanismoMisc;
	private JTextField tfAtletismoValue;
	private JTextField tfPerFor1;
	private JTextField tfAtletismoRaca;
	private JTextField tfAtletismoMisc;
	private JTextField tfPerPen2;
	private JTextField tfBlefeValue;
	private JTextField tfPerCar1;
	private JTextField tfBlefeRaca;
	private JTextField tfBlefeMisc;
	private JTextField tfDiplomaciaValue;
	private JTextField tfPerCar2;
	private JTextField tfDiplomaciaRaca;
	private JTextField tfDiplomaciaMisc;
	private JTextField tfExploracaoValue;
	private JTextField tfPerSab1;
	private JTextField tfExploracaoRaca;
	private JTextField tfExploracaoMisc;
	private JTextField tfFurtividadeValue;
	private JTextField tfPerDes2;
	private JTextField tfFurtividadeRaca;
	private JTextField tfFurtividadeMisc;
	private JTextField tfPerPen3;
	private JTextField tfHistoriaValue;
	private JTextField tfPerInt2;
	private JTextField tfHistoriaRaca;
	private JTextField tfHistoriaMisc;
	private JTextField tfIntimidacaoValue;
	private JTextField tfPerFor2;
	private JTextField tfIntimidacaoRaca;
	private JTextField tfIntimidacaoMisc;
	private JTextField tfIntuicaoValue;
	private JTextField tfPerSab2;
	private JTextField tfIntuicaoRaca;
	private JTextField tfIntuicaoMisc;
	private JTextField tfLadinagemValue;
	private JTextField tfPerDes3;
	private JTextField tfLadinagemRaca;
	private JTextField tfLadinagemMisc;
	private JTextField tfPerPen4;
	private JTextField tfManhaValue;
	private JTextField tfPerCar3;
	private JTextField tfManhaRaca;
	private JTextField tfManhaMisc;
	private JTextField tfNaturezaValue;
	private JTextField tfPerSab3;
	private JTextField tfNaturezaRaca;
	private JTextField tfNaturezaMisc;
	private JTextField tfPercepcaoValue;
	private JTextField tfPerSab4;
	private JTextField tfPercepcaoRaca;
	private JTextField tfPercepcaoMisc;
	private JTextField tfReligiaoValue;
	private JTextField tfPerInt3;
	private JTextField tfReligiaoRaca;
	private JTextField tfReligiaoMisc;
	private JTextField tfSocorroValue;
	private JTextField tfPerSab5;
	private JTextField tfSocorroRaca;
	private JTextField tfSocorroMisc;
	private JTextField tfToleranciaValue;
	private JTextField tfPerCon;
	private JTextField tfToleranciaRaca;
	private JTextField tfToleranciaMisc;
	private JTextField tfPerPen5;
	private JTextField tfPericiaNivel;
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
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField textField_108;
	private JTextField textField_109;
	private JTextField textField_110;
	private JTextField textField_111;
	private JTextField textField_112;
	private JTextField textField_113;
	private JTextField textField_114;
	private JTextField textField_115;
	private JTextField textField_116;
	private JTextField textField_117;
	private JTextField textField_118;
	private JTextField textField_119;
	private JTextField textField_122;
	private JTextField textField_123;
	private JTextField textField_124;
	private JTextField textField_125;
	private JTextField textField_126;
	private JTextField textField_127;
	private JTextField textField_128;
	private JTextField textField_129;
	private JTextField textField_130;
	private JTextField textField_131;
	private JTextField textField_132;
	private JTextField textField_133;
	private JTextField textField_134;
	private JTextField textField_135;
	private JTextField textField_136;
	private JTextField textField_137;
	private JTextField textField_138;
	private JTextField textField_139;
	private JTextField textField_140;
	private JTextField textField_141;
	private JTextField textField_142;
	private JTextField textField_143;
	private JTextField textField_144;
	private JTextField textField_145;
	private JTextField textField_146;
	private JTextField textField_147;
	private JTextField textField_148;
	private JTextField textField_149;
	private JTextField textField_150;
	private JTextField textField_151;
	private JTextField textField_152;
	private JTextField textField_153;
	private JTextField textField_154;
	private JTextField textField_155;
	private JTextField textField_156;
	private JTextField textField_157;
	private JTextField textField_158;
	private JTextField textField_159;
	private JTextField textField_160;
	private JTextField textField_161;
	private JTextField textField_162;
	private JTextField textField_163;
	private JTextField textField_164;
	private JTextField textField_165;
	private JTextField textField_166;
	private JTextField textField_167;
	private JTextField textField_168;

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
		setBounds(100, 100, 1278, 985);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Página 1", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_1.setBounds(0, 0, 1270, 958);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Nome do Personagem");
		label.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label.setBounds(10, 19, 162, 42);
		panel_1.add(label);
		
		textField = new JTextField(" ");
		textField.setColumns(10);
		textField.setBounds(10, 11, 217, 20);
		panel_1.add(textField);
		
		JButton button = new JButton("Gerar");
		button.setBounds(1130, 864, 115, 65);
		panel_1.add(button);
		
		JLabel label_1 = new JLabel("N\u00EDvel");
		label_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_1.setBounds(237, 11, 39, 59);
		panel_1.add(label_1);
		
		JComboBox<Object> comboBox = new JComboBox<Object>(new Object[]{});
		comboBox.setBounds(237, 11, 50, 20);
		panel_1.add(comboBox);
		
		JLabel label_2 = new JLabel("Idade");
		label_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_2.setBounds(297, 11, 39, 59);
		panel_1.add(label_2);
		
		textField_1 = new JTextField(" ");
		textField_1.setColumns(10);
		textField_1.setBounds(297, 11, 39, 20);
		panel_1.add(textField_1);
		
		JLabel label_3 = new JLabel("Sexo");
		label_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_3.setBounds(346, 11, 50, 59);
		panel_1.add(label_3);
		
		JComboBox<Object> comboBox_1 = new JComboBox<Object>(new Object[]{});
		comboBox_1.setBounds(346, 11, 98, 20);
		panel_1.add(comboBox_1);
		
		JLabel label_4 = new JLabel("Tend\u00EAncia");
		label_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_4.setBounds(454, 11, 64, 59);
		panel_1.add(label_4);
		
		JComboBox<Object> comboBox_2 = new JComboBox<Object>(new Object[]{});
		comboBox_2.setBounds(454, 11, 139, 20);
		panel_1.add(comboBox_2);
		
		JLabel label_5 = new JLabel("Divindade");
		label_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_5.setBounds(603, 11, 64, 59);
		panel_1.add(label_5);
		
		JComboBox<Object> comboBox_3 = new JComboBox<Object>(new Object[]{});
		comboBox_3.setBounds(603, 11, 139, 20);
		panel_1.add(comboBox_3);
		
		JLabel label_6 = new JLabel("Companhia ou Afilia\u00E7\u00E3o");
		label_6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_6.setBounds(752, 11, 162, 59);
		panel_1.add(label_6);
		
		textField_2 = new JTextField(" ");
		textField_2.setColumns(10);
		textField_2.setBounds(752, 11, 217, 20);
		panel_1.add(textField_2);
		
		JLabel label_7 = new JLabel("Trilha Exemplar");
		label_7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_7.setBounds(978, 62, 162, 42);
		panel_1.add(label_7);
		
		textField_3 = new JTextField(" ");
		textField_3.setColumns(10);
		textField_3.setBounds(978, 52, 217, 20);
		panel_1.add(textField_3);
		
		JLabel label_8 = new JLabel("XP");
		label_8.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_8.setBounds(978, 11, 162, 59);
		panel_1.add(label_8);
		
		textField_4 = new JTextField(" ");
		textField_4.setColumns(10);
		textField_4.setBounds(978, 11, 217, 20);
		panel_1.add(textField_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "PER\u00CDCIAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 332, 452, 597);
		panel_1.add(panel_2);
		
		Panel panel_3 = new Panel();
		panel_3.setLayout(null);
		panel_3.setBounds(6, 16, 436, 571);
		panel_2.add(panel_3);
		
		JLabel label_9 = new JLabel("Valor");
		label_9.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_9.setBounds(128, 16, 39, 20);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("Acrobacia (Des)");
		label_10.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_10.setBounds(20, 39, 98, 20);
		panel_3.add(label_10);
		
		tfAcrobaciaValue = new JTextField();
		tfAcrobaciaValue.setText("0");
		tfAcrobaciaValue.setColumns(10);
		tfAcrobaciaValue.setBounds(128, 39, 30, 20);
		panel_3.add(tfAcrobaciaValue);
		
		JLabel label_11 = new JLabel("=");
		label_11.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_11.setBounds(162, 38, 14, 20);
		panel_3.add(label_11);
		
		JLabel label_12 = new JLabel("+");
		label_12.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_12.setBounds(204, 39, 14, 20);
		panel_3.add(label_12);
		
		tfPerDes1 = new JTextField();
		tfPerDes1.setText("0");
		tfPerDes1.setColumns(10);
		tfPerDes1.setBounds(212, 39, 30, 20);
		panel_3.add(tfPerDes1);
		
		tfAcrobaciaRaca = new JTextField();
		tfAcrobaciaRaca.setText("0");
		tfAcrobaciaRaca.setColumns(10);
		tfAcrobaciaRaca.setBounds(249, 39, 30, 20);
		panel_3.add(tfAcrobaciaRaca);
		
		JLabel label_13 = new JLabel("+");
		label_13.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_13.setBounds(241, 39, 14, 20);
		panel_3.add(label_13);
		
		tfAcrobaciaMisc = new JTextField();
		tfAcrobaciaMisc.setText("0");
		tfAcrobaciaMisc.setColumns(10);
		tfAcrobaciaMisc.setBounds(291, 39, 30, 20);
		panel_3.add(tfAcrobaciaMisc);
		
		JLabel label_14 = new JLabel("+");
		label_14.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_14.setBounds(283, 39, 14, 20);
		panel_3.add(label_14);
		
		tfPerPen1 = new JTextField();
		tfPerPen1.setText("0");
		tfPerPen1.setColumns(10);
		tfPerPen1.setBounds(329, 39, 30, 20);
		panel_3.add(tfPerPen1);
		
		JLabel label_15 = new JLabel("-");
		label_15.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_15.setBounds(321, 39, 14, 20);
		panel_3.add(label_15);
		
		JLabel label_16 = new JLabel("1/2 Nv");
		label_16.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_16.setBounds(168, 16, 39, 20);
		panel_3.add(label_16);
		
		JLabel label_17 = new JLabel("Atr.");
		label_17.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_17.setBounds(212, 16, 39, 20);
		panel_3.add(label_17);
		
		JLabel label_18 = new JLabel("Ra\u00E7a");
		label_18.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_18.setBounds(249, 16, 39, 20);
		panel_3.add(label_18);
		
		JLabel label_19 = new JLabel("Misc");
		label_19.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_19.setBounds(291, 16, 39, 20);
		panel_3.add(label_19);
		
		JLabel label_20 = new JLabel("Penalidade");
		label_20.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		label_20.setBounds(329, 3, 64, 20);
		panel_3.add(label_20);
		
		JLabel label_21 = new JLabel("Armadura");
		label_21.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		label_21.setBounds(329, 16, 64, 20);
		panel_3.add(label_21);
		
		JLabel label_22 = new JLabel("Arcanismo (Int)");
		label_22.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_22.setBounds(20, 71, 98, 20);
		panel_3.add(label_22);
		
		tfArcanismoValue = new JTextField();
		tfArcanismoValue.setText("0");
		tfArcanismoValue.setColumns(10);
		tfArcanismoValue.setBounds(128, 71, 30, 20);
		panel_3.add(tfArcanismoValue);
		
		JLabel label_23 = new JLabel("=");
		label_23.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_23.setBounds(162, 70, 14, 20);
		panel_3.add(label_23);
		
		JLabel label_24 = new JLabel("+");
		label_24.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_24.setBounds(204, 71, 14, 20);
		panel_3.add(label_24);
		
		tfPerInt1 = new JTextField();
		tfPerInt1.setText("0");
		tfPerInt1.setColumns(10);
		tfPerInt1.setBounds(212, 71, 30, 20);
		panel_3.add(tfPerInt1);
		
		tfArcanismoRaca = new JTextField();
		tfArcanismoRaca.setText("0");
		tfArcanismoRaca.setColumns(10);
		tfArcanismoRaca.setBounds(249, 71, 30, 20);
		panel_3.add(tfArcanismoRaca);
		
		JLabel label_25 = new JLabel("+");
		label_25.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_25.setBounds(241, 71, 14, 20);
		panel_3.add(label_25);
		
		tfArcanismoMisc = new JTextField();
		tfArcanismoMisc.setText("0");
		tfArcanismoMisc.setColumns(10);
		tfArcanismoMisc.setBounds(291, 71, 30, 20);
		panel_3.add(tfArcanismoMisc);
		
		JLabel label_26 = new JLabel("+");
		label_26.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_26.setBounds(283, 71, 14, 20);
		panel_3.add(label_26);
		
		JLabel label_27 = new JLabel("Atletismo (For)");
		label_27.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_27.setBounds(20, 102, 98, 20);
		panel_3.add(label_27);
		
		tfAtletismoValue = new JTextField();
		tfAtletismoValue.setText("0");
		tfAtletismoValue.setColumns(10);
		tfAtletismoValue.setBounds(128, 102, 30, 20);
		panel_3.add(tfAtletismoValue);
		
		JLabel label_28 = new JLabel("=");
		label_28.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_28.setBounds(162, 101, 14, 20);
		panel_3.add(label_28);
		
		JLabel label_29 = new JLabel("+");
		label_29.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_29.setBounds(204, 102, 14, 20);
		panel_3.add(label_29);
		
		tfPerFor1 = new JTextField();
		tfPerFor1.setText("0");
		tfPerFor1.setColumns(10);
		tfPerFor1.setBounds(212, 102, 30, 20);
		panel_3.add(tfPerFor1);
		
		tfAtletismoRaca = new JTextField();
		tfAtletismoRaca.setText("0");
		tfAtletismoRaca.setColumns(10);
		tfAtletismoRaca.setBounds(249, 102, 30, 20);
		panel_3.add(tfAtletismoRaca);
		
		JLabel label_30 = new JLabel("+");
		label_30.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_30.setBounds(241, 102, 14, 20);
		panel_3.add(label_30);
		
		tfAtletismoMisc = new JTextField();
		tfAtletismoMisc.setText("0");
		tfAtletismoMisc.setColumns(10);
		tfAtletismoMisc.setBounds(291, 102, 30, 20);
		panel_3.add(tfAtletismoMisc);
		
		JLabel label_31 = new JLabel("+");
		label_31.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_31.setBounds(283, 102, 14, 20);
		panel_3.add(label_31);
		
		tfPerPen2 = new JTextField();
		tfPerPen2.setText("0");
		tfPerPen2.setColumns(10);
		tfPerPen2.setBounds(329, 102, 30, 20);
		panel_3.add(tfPerPen2);
		
		JLabel label_32 = new JLabel("-");
		label_32.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_32.setBounds(321, 102, 14, 20);
		panel_3.add(label_32);
		
		JLabel label_33 = new JLabel("Blefe (Car)");
		label_33.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_33.setBounds(20, 134, 98, 20);
		panel_3.add(label_33);
		
		tfBlefeValue = new JTextField();
		tfBlefeValue.setText("0");
		tfBlefeValue.setColumns(10);
		tfBlefeValue.setBounds(128, 134, 30, 20);
		panel_3.add(tfBlefeValue);
		
		JLabel label_34 = new JLabel("=");
		label_34.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_34.setBounds(162, 133, 14, 20);
		panel_3.add(label_34);
		
		JLabel label_35 = new JLabel("+");
		label_35.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_35.setBounds(204, 134, 14, 20);
		panel_3.add(label_35);
		
		tfPerCar1 = new JTextField();
		tfPerCar1.setText("0");
		tfPerCar1.setColumns(10);
		tfPerCar1.setBounds(212, 134, 30, 20);
		panel_3.add(tfPerCar1);
		
		tfBlefeRaca = new JTextField();
		tfBlefeRaca.setText("0");
		tfBlefeRaca.setColumns(10);
		tfBlefeRaca.setBounds(249, 134, 30, 20);
		panel_3.add(tfBlefeRaca);
		
		JLabel label_36 = new JLabel("+");
		label_36.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_36.setBounds(241, 134, 14, 20);
		panel_3.add(label_36);
		
		tfBlefeMisc = new JTextField();
		tfBlefeMisc.setText("0");
		tfBlefeMisc.setColumns(10);
		tfBlefeMisc.setBounds(291, 134, 30, 20);
		panel_3.add(tfBlefeMisc);
		
		JLabel label_37 = new JLabel("+");
		label_37.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_37.setBounds(283, 134, 14, 20);
		panel_3.add(label_37);
		
		JLabel label_38 = new JLabel("Diplomacia (Car)");
		label_38.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_38.setBounds(20, 166, 98, 20);
		panel_3.add(label_38);
		
		tfDiplomaciaValue = new JTextField();
		tfDiplomaciaValue.setText("0");
		tfDiplomaciaValue.setColumns(10);
		tfDiplomaciaValue.setBounds(128, 166, 30, 20);
		panel_3.add(tfDiplomaciaValue);
		
		JLabel label_39 = new JLabel("=");
		label_39.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_39.setBounds(162, 165, 14, 20);
		panel_3.add(label_39);
		
		JLabel label_40 = new JLabel("+");
		label_40.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_40.setBounds(204, 166, 14, 20);
		panel_3.add(label_40);
		
		tfPerCar2 = new JTextField();
		tfPerCar2.setText("0");
		tfPerCar2.setColumns(10);
		tfPerCar2.setBounds(212, 166, 30, 20);
		panel_3.add(tfPerCar2);
		
		tfDiplomaciaRaca = new JTextField();
		tfDiplomaciaRaca.setText("0");
		tfDiplomaciaRaca.setColumns(10);
		tfDiplomaciaRaca.setBounds(249, 166, 30, 20);
		panel_3.add(tfDiplomaciaRaca);
		
		JLabel label_41 = new JLabel("+");
		label_41.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_41.setBounds(241, 166, 14, 20);
		panel_3.add(label_41);
		
		tfDiplomaciaMisc = new JTextField();
		tfDiplomaciaMisc.setText("0");
		tfDiplomaciaMisc.setColumns(10);
		tfDiplomaciaMisc.setBounds(291, 166, 30, 20);
		panel_3.add(tfDiplomaciaMisc);
		
		JLabel label_42 = new JLabel("+");
		label_42.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_42.setBounds(283, 166, 14, 20);
		panel_3.add(label_42);
		
		JLabel label_43 = new JLabel("Explora\u00E7\u00E3o (Sab)");
		label_43.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_43.setBounds(20, 198, 105, 20);
		panel_3.add(label_43);
		
		tfExploracaoValue = new JTextField();
		tfExploracaoValue.setText("0");
		tfExploracaoValue.setColumns(10);
		tfExploracaoValue.setBounds(128, 198, 30, 20);
		panel_3.add(tfExploracaoValue);
		
		JLabel label_44 = new JLabel("=");
		label_44.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_44.setBounds(162, 197, 14, 20);
		panel_3.add(label_44);
		
		JLabel label_45 = new JLabel("+");
		label_45.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_45.setBounds(204, 198, 14, 20);
		panel_3.add(label_45);
		
		tfPerSab1 = new JTextField();
		tfPerSab1.setText("0");
		tfPerSab1.setColumns(10);
		tfPerSab1.setBounds(212, 198, 30, 20);
		panel_3.add(tfPerSab1);
		
		tfExploracaoRaca = new JTextField();
		tfExploracaoRaca.setText("0");
		tfExploracaoRaca.setColumns(10);
		tfExploracaoRaca.setBounds(249, 198, 30, 20);
		panel_3.add(tfExploracaoRaca);
		
		JLabel label_46 = new JLabel("+");
		label_46.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_46.setBounds(241, 198, 14, 20);
		panel_3.add(label_46);
		
		tfExploracaoMisc = new JTextField();
		tfExploracaoMisc.setText("0");
		tfExploracaoMisc.setColumns(10);
		tfExploracaoMisc.setBounds(291, 198, 30, 20);
		panel_3.add(tfExploracaoMisc);
		
		JLabel label_47 = new JLabel("+");
		label_47.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_47.setBounds(283, 198, 14, 20);
		panel_3.add(label_47);
		
		JLabel label_48 = new JLabel("Furtividade (Des)");
		label_48.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_48.setBounds(20, 230, 98, 20);
		panel_3.add(label_48);
		
		tfFurtividadeValue = new JTextField();
		tfFurtividadeValue.setText("0");
		tfFurtividadeValue.setColumns(10);
		tfFurtividadeValue.setBounds(128, 230, 30, 20);
		panel_3.add(tfFurtividadeValue);
		
		JLabel label_49 = new JLabel("=");
		label_49.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_49.setBounds(162, 229, 14, 20);
		panel_3.add(label_49);
		
		JLabel label_50 = new JLabel("+");
		label_50.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_50.setBounds(204, 230, 14, 20);
		panel_3.add(label_50);
		
		tfPerDes2 = new JTextField();
		tfPerDes2.setText("0");
		tfPerDes2.setColumns(10);
		tfPerDes2.setBounds(212, 230, 30, 20);
		panel_3.add(tfPerDes2);
		
		tfFurtividadeRaca = new JTextField();
		tfFurtividadeRaca.setText("0");
		tfFurtividadeRaca.setColumns(10);
		tfFurtividadeRaca.setBounds(249, 230, 30, 20);
		panel_3.add(tfFurtividadeRaca);
		
		JLabel label_51 = new JLabel("+");
		label_51.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_51.setBounds(241, 230, 14, 20);
		panel_3.add(label_51);
		
		tfFurtividadeMisc = new JTextField();
		tfFurtividadeMisc.setText("0");
		tfFurtividadeMisc.setColumns(10);
		tfFurtividadeMisc.setBounds(291, 230, 30, 20);
		panel_3.add(tfFurtividadeMisc);
		
		JLabel label_52 = new JLabel("+");
		label_52.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_52.setBounds(283, 230, 14, 20);
		panel_3.add(label_52);
		
		tfPerPen3 = new JTextField();
		tfPerPen3.setText("0");
		tfPerPen3.setColumns(10);
		tfPerPen3.setBounds(329, 230, 30, 20);
		panel_3.add(tfPerPen3);
		
		JLabel label_53 = new JLabel("-");
		label_53.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_53.setBounds(321, 230, 14, 20);
		panel_3.add(label_53);
		
		JLabel label_54 = new JLabel("Hist\u00F3ria (Int)");
		label_54.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_54.setBounds(20, 262, 98, 20);
		panel_3.add(label_54);
		
		tfHistoriaValue = new JTextField();
		tfHistoriaValue.setText("0");
		tfHistoriaValue.setColumns(10);
		tfHistoriaValue.setBounds(128, 262, 30, 20);
		panel_3.add(tfHistoriaValue);
		
		JLabel label_55 = new JLabel("=");
		label_55.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_55.setBounds(162, 261, 14, 20);
		panel_3.add(label_55);
		
		JLabel label_56 = new JLabel("+");
		label_56.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_56.setBounds(204, 262, 14, 20);
		panel_3.add(label_56);
		
		tfPerInt2 = new JTextField();
		tfPerInt2.setText("0");
		tfPerInt2.setColumns(10);
		tfPerInt2.setBounds(212, 262, 30, 20);
		panel_3.add(tfPerInt2);
		
		tfHistoriaRaca = new JTextField();
		tfHistoriaRaca.setText("0");
		tfHistoriaRaca.setColumns(10);
		tfHistoriaRaca.setBounds(249, 262, 30, 20);
		panel_3.add(tfHistoriaRaca);
		
		JLabel label_57 = new JLabel("+");
		label_57.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_57.setBounds(241, 262, 14, 20);
		panel_3.add(label_57);
		
		tfHistoriaMisc = new JTextField();
		tfHistoriaMisc.setText("0");
		tfHistoriaMisc.setColumns(10);
		tfHistoriaMisc.setBounds(291, 262, 30, 20);
		panel_3.add(tfHistoriaMisc);
		
		JLabel label_58 = new JLabel("+");
		label_58.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_58.setBounds(283, 262, 14, 20);
		panel_3.add(label_58);
		
		JLabel label_59 = new JLabel("Intimida\u00E7\u00E3o (For)");
		label_59.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_59.setBounds(20, 294, 105, 20);
		panel_3.add(label_59);
		
		tfIntimidacaoValue = new JTextField();
		tfIntimidacaoValue.setText("0");
		tfIntimidacaoValue.setColumns(10);
		tfIntimidacaoValue.setBounds(128, 294, 30, 20);
		panel_3.add(tfIntimidacaoValue);
		
		JLabel label_60 = new JLabel("=");
		label_60.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_60.setBounds(162, 293, 14, 20);
		panel_3.add(label_60);
		
		JLabel label_61 = new JLabel("+");
		label_61.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_61.setBounds(204, 294, 14, 20);
		panel_3.add(label_61);
		
		tfPerFor2 = new JTextField();
		tfPerFor2.setText("0");
		tfPerFor2.setColumns(10);
		tfPerFor2.setBounds(212, 294, 30, 20);
		panel_3.add(tfPerFor2);
		
		tfIntimidacaoRaca = new JTextField();
		tfIntimidacaoRaca.setText("0");
		tfIntimidacaoRaca.setColumns(10);
		tfIntimidacaoRaca.setBounds(249, 294, 30, 20);
		panel_3.add(tfIntimidacaoRaca);
		
		JLabel label_62 = new JLabel("+");
		label_62.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_62.setBounds(241, 294, 14, 20);
		panel_3.add(label_62);
		
		tfIntimidacaoMisc = new JTextField();
		tfIntimidacaoMisc.setText("0");
		tfIntimidacaoMisc.setColumns(10);
		tfIntimidacaoMisc.setBounds(291, 294, 30, 20);
		panel_3.add(tfIntimidacaoMisc);
		
		JLabel label_63 = new JLabel("+");
		label_63.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_63.setBounds(283, 294, 14, 20);
		panel_3.add(label_63);
		
		JLabel label_64 = new JLabel("Intui\u00E7\u00E3o (Sab)");
		label_64.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_64.setBounds(20, 326, 98, 20);
		panel_3.add(label_64);
		
		tfIntuicaoValue = new JTextField();
		tfIntuicaoValue.setText("0");
		tfIntuicaoValue.setColumns(10);
		tfIntuicaoValue.setBounds(128, 326, 30, 20);
		panel_3.add(tfIntuicaoValue);
		
		JLabel label_65 = new JLabel("=");
		label_65.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_65.setBounds(162, 325, 14, 20);
		panel_3.add(label_65);
		
		JLabel label_66 = new JLabel("+");
		label_66.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_66.setBounds(204, 326, 14, 20);
		panel_3.add(label_66);
		
		tfPerSab2 = new JTextField();
		tfPerSab2.setText("0");
		tfPerSab2.setColumns(10);
		tfPerSab2.setBounds(212, 326, 30, 20);
		panel_3.add(tfPerSab2);
		
		tfIntuicaoRaca = new JTextField();
		tfIntuicaoRaca.setText("0");
		tfIntuicaoRaca.setColumns(10);
		tfIntuicaoRaca.setBounds(249, 326, 30, 20);
		panel_3.add(tfIntuicaoRaca);
		
		JLabel label_67 = new JLabel("+");
		label_67.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_67.setBounds(241, 326, 14, 20);
		panel_3.add(label_67);
		
		tfIntuicaoMisc = new JTextField();
		tfIntuicaoMisc.setText("0");
		tfIntuicaoMisc.setColumns(10);
		tfIntuicaoMisc.setBounds(291, 326, 30, 20);
		panel_3.add(tfIntuicaoMisc);
		
		JLabel label_68 = new JLabel("+");
		label_68.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_68.setBounds(283, 326, 14, 20);
		panel_3.add(label_68);
		
		JLabel label_69 = new JLabel("Ladinagem (Des)");
		label_69.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_69.setBounds(20, 358, 98, 20);
		panel_3.add(label_69);
		
		tfLadinagemValue = new JTextField();
		tfLadinagemValue.setText("0");
		tfLadinagemValue.setColumns(10);
		tfLadinagemValue.setBounds(128, 358, 30, 20);
		panel_3.add(tfLadinagemValue);
		
		JLabel label_70 = new JLabel("=");
		label_70.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_70.setBounds(162, 357, 14, 20);
		panel_3.add(label_70);
		
		JLabel label_71 = new JLabel("+");
		label_71.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_71.setBounds(204, 358, 14, 20);
		panel_3.add(label_71);
		
		tfPerDes3 = new JTextField();
		tfPerDes3.setText("0");
		tfPerDes3.setColumns(10);
		tfPerDes3.setBounds(212, 358, 30, 20);
		panel_3.add(tfPerDes3);
		
		tfLadinagemRaca = new JTextField();
		tfLadinagemRaca.setText("0");
		tfLadinagemRaca.setColumns(10);
		tfLadinagemRaca.setBounds(249, 358, 30, 20);
		panel_3.add(tfLadinagemRaca);
		
		JLabel label_72 = new JLabel("+");
		label_72.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_72.setBounds(241, 358, 14, 20);
		panel_3.add(label_72);
		
		tfLadinagemMisc = new JTextField();
		tfLadinagemMisc.setText("0");
		tfLadinagemMisc.setColumns(10);
		tfLadinagemMisc.setBounds(291, 358, 30, 20);
		panel_3.add(tfLadinagemMisc);
		
		JLabel label_73 = new JLabel("+");
		label_73.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_73.setBounds(283, 358, 14, 20);
		panel_3.add(label_73);
		
		tfPerPen4 = new JTextField();
		tfPerPen4.setText("0");
		tfPerPen4.setColumns(10);
		tfPerPen4.setBounds(329, 358, 30, 20);
		panel_3.add(tfPerPen4);
		
		JLabel label_74 = new JLabel("-");
		label_74.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_74.setBounds(321, 358, 14, 20);
		panel_3.add(label_74);
		
		JLabel label_75 = new JLabel("Manha (Car)");
		label_75.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_75.setBounds(20, 390, 98, 20);
		panel_3.add(label_75);
		
		tfManhaValue = new JTextField();
		tfManhaValue.setText("0");
		tfManhaValue.setColumns(10);
		tfManhaValue.setBounds(128, 390, 30, 20);
		panel_3.add(tfManhaValue);
		
		JLabel label_76 = new JLabel("=");
		label_76.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_76.setBounds(162, 389, 14, 20);
		panel_3.add(label_76);
		
		JLabel label_77 = new JLabel("+");
		label_77.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_77.setBounds(204, 390, 14, 20);
		panel_3.add(label_77);
		
		tfPerCar3 = new JTextField();
		tfPerCar3.setText("0");
		tfPerCar3.setColumns(10);
		tfPerCar3.setBounds(212, 390, 30, 20);
		panel_3.add(tfPerCar3);
		
		tfManhaRaca = new JTextField();
		tfManhaRaca.setText("0");
		tfManhaRaca.setColumns(10);
		tfManhaRaca.setBounds(249, 390, 30, 20);
		panel_3.add(tfManhaRaca);
		
		JLabel label_78 = new JLabel("+");
		label_78.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_78.setBounds(227, 389, 14, 20);
		panel_3.add(label_78);
		
		tfManhaMisc = new JTextField();
		tfManhaMisc.setText("0");
		tfManhaMisc.setColumns(10);
		tfManhaMisc.setBounds(291, 390, 30, 20);
		panel_3.add(tfManhaMisc);
		
		JLabel label_79 = new JLabel("+");
		label_79.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_79.setBounds(283, 390, 14, 20);
		panel_3.add(label_79);
		
		JLabel label_80 = new JLabel("Natureza (Sab)");
		label_80.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_80.setBounds(20, 422, 98, 20);
		panel_3.add(label_80);
		
		tfNaturezaValue = new JTextField();
		tfNaturezaValue.setText("0");
		tfNaturezaValue.setColumns(10);
		tfNaturezaValue.setBounds(128, 422, 30, 20);
		panel_3.add(tfNaturezaValue);
		
		JLabel label_81 = new JLabel("=");
		label_81.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_81.setBounds(162, 421, 14, 20);
		panel_3.add(label_81);
		
		JLabel label_82 = new JLabel("+");
		label_82.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_82.setBounds(204, 422, 14, 20);
		panel_3.add(label_82);
		
		tfPerSab3 = new JTextField();
		tfPerSab3.setText("0");
		tfPerSab3.setColumns(10);
		tfPerSab3.setBounds(212, 422, 30, 20);
		panel_3.add(tfPerSab3);
		
		tfNaturezaRaca = new JTextField();
		tfNaturezaRaca.setText("0");
		tfNaturezaRaca.setColumns(10);
		tfNaturezaRaca.setBounds(249, 422, 30, 20);
		panel_3.add(tfNaturezaRaca);
		
		JLabel label_83 = new JLabel("+");
		label_83.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_83.setBounds(241, 422, 14, 20);
		panel_3.add(label_83);
		
		tfNaturezaMisc = new JTextField();
		tfNaturezaMisc.setText("0");
		tfNaturezaMisc.setColumns(10);
		tfNaturezaMisc.setBounds(291, 422, 30, 20);
		panel_3.add(tfNaturezaMisc);
		
		JLabel label_84 = new JLabel("+");
		label_84.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_84.setBounds(283, 422, 14, 20);
		panel_3.add(label_84);
		
		JLabel label_85 = new JLabel("Percep\u00E7\u00E3o (Sab)");
		label_85.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_85.setBounds(20, 454, 98, 20);
		panel_3.add(label_85);
		
		tfPercepcaoValue = new JTextField();
		tfPercepcaoValue.setText("0");
		tfPercepcaoValue.setColumns(10);
		tfPercepcaoValue.setBounds(128, 454, 30, 20);
		panel_3.add(tfPercepcaoValue);
		
		JLabel label_86 = new JLabel("=");
		label_86.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_86.setBounds(162, 453, 14, 20);
		panel_3.add(label_86);
		
		JLabel label_87 = new JLabel("+");
		label_87.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_87.setBounds(204, 454, 14, 20);
		panel_3.add(label_87);
		
		tfPerSab4 = new JTextField();
		tfPerSab4.setText("0");
		tfPerSab4.setColumns(10);
		tfPerSab4.setBounds(212, 454, 30, 20);
		panel_3.add(tfPerSab4);
		
		tfPercepcaoRaca = new JTextField();
		tfPercepcaoRaca.setText("0");
		tfPercepcaoRaca.setColumns(10);
		tfPercepcaoRaca.setBounds(249, 454, 30, 20);
		panel_3.add(tfPercepcaoRaca);
		
		JLabel label_88 = new JLabel("+");
		label_88.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_88.setBounds(241, 454, 14, 20);
		panel_3.add(label_88);
		
		tfPercepcaoMisc = new JTextField();
		tfPercepcaoMisc.setText("0");
		tfPercepcaoMisc.setColumns(10);
		tfPercepcaoMisc.setBounds(291, 454, 30, 20);
		panel_3.add(tfPercepcaoMisc);
		
		JLabel label_89 = new JLabel("+");
		label_89.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_89.setBounds(283, 454, 14, 20);
		panel_3.add(label_89);
		
		JLabel label_90 = new JLabel("Religi\u00E3o (Int)");
		label_90.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_90.setBounds(20, 486, 98, 20);
		panel_3.add(label_90);
		
		tfReligiaoValue = new JTextField();
		tfReligiaoValue.setText("0");
		tfReligiaoValue.setColumns(10);
		tfReligiaoValue.setBounds(128, 486, 30, 20);
		panel_3.add(tfReligiaoValue);
		
		JLabel label_91 = new JLabel("=");
		label_91.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_91.setBounds(162, 485, 14, 20);
		panel_3.add(label_91);
		
		JLabel label_92 = new JLabel("+");
		label_92.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_92.setBounds(204, 486, 14, 20);
		panel_3.add(label_92);
		
		tfPerInt3 = new JTextField();
		tfPerInt3.setText("0");
		tfPerInt3.setColumns(10);
		tfPerInt3.setBounds(212, 486, 30, 20);
		panel_3.add(tfPerInt3);
		
		tfReligiaoRaca = new JTextField();
		tfReligiaoRaca.setText("0");
		tfReligiaoRaca.setColumns(10);
		tfReligiaoRaca.setBounds(249, 486, 30, 20);
		panel_3.add(tfReligiaoRaca);
		
		JLabel label_93 = new JLabel("+");
		label_93.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_93.setBounds(241, 486, 14, 20);
		panel_3.add(label_93);
		
		tfReligiaoMisc = new JTextField();
		tfReligiaoMisc.setText("0");
		tfReligiaoMisc.setColumns(10);
		tfReligiaoMisc.setBounds(291, 486, 30, 20);
		panel_3.add(tfReligiaoMisc);
		
		JLabel label_94 = new JLabel("+");
		label_94.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_94.setBounds(283, 486, 14, 20);
		panel_3.add(label_94);
		
		JLabel label_95 = new JLabel("Socorro (Sab)");
		label_95.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_95.setBounds(20, 518, 98, 20);
		panel_3.add(label_95);
		
		tfSocorroValue = new JTextField();
		tfSocorroValue.setText("0");
		tfSocorroValue.setColumns(10);
		tfSocorroValue.setBounds(128, 518, 30, 20);
		panel_3.add(tfSocorroValue);
		
		JLabel label_96 = new JLabel("=");
		label_96.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_96.setBounds(162, 517, 14, 20);
		panel_3.add(label_96);
		
		JLabel label_97 = new JLabel("+");
		label_97.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_97.setBounds(204, 518, 14, 20);
		panel_3.add(label_97);
		
		tfPerSab5 = new JTextField();
		tfPerSab5.setText("0");
		tfPerSab5.setColumns(10);
		tfPerSab5.setBounds(212, 518, 30, 20);
		panel_3.add(tfPerSab5);
		
		tfSocorroRaca = new JTextField();
		tfSocorroRaca.setText("0");
		tfSocorroRaca.setColumns(10);
		tfSocorroRaca.setBounds(249, 518, 30, 20);
		panel_3.add(tfSocorroRaca);
		
		JLabel label_98 = new JLabel("+");
		label_98.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_98.setBounds(241, 518, 14, 20);
		panel_3.add(label_98);
		
		tfSocorroMisc = new JTextField();
		tfSocorroMisc.setText("0");
		tfSocorroMisc.setColumns(10);
		tfSocorroMisc.setBounds(291, 518, 30, 20);
		panel_3.add(tfSocorroMisc);
		
		JLabel label_99 = new JLabel("+");
		label_99.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_99.setBounds(283, 518, 14, 20);
		panel_3.add(label_99);
		
		JLabel label_100 = new JLabel("Toler\u00E2ncia (Con)");
		label_100.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_100.setBounds(20, 550, 98, 20);
		panel_3.add(label_100);
		
		tfToleranciaValue = new JTextField();
		tfToleranciaValue.setText("0");
		tfToleranciaValue.setColumns(10);
		tfToleranciaValue.setBounds(128, 550, 30, 20);
		panel_3.add(tfToleranciaValue);
		
		JLabel label_101 = new JLabel("=");
		label_101.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_101.setBounds(162, 549, 14, 20);
		panel_3.add(label_101);
		
		JLabel label_102 = new JLabel("+");
		label_102.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_102.setBounds(204, 550, 14, 20);
		panel_3.add(label_102);
		
		tfPerCon = new JTextField();
		tfPerCon.setText("0");
		tfPerCon.setColumns(10);
		tfPerCon.setBounds(212, 550, 30, 20);
		panel_3.add(tfPerCon);
		
		tfToleranciaRaca = new JTextField();
		tfToleranciaRaca.setText("0");
		tfToleranciaRaca.setColumns(10);
		tfToleranciaRaca.setBounds(249, 550, 30, 20);
		panel_3.add(tfToleranciaRaca);
		
		JLabel label_103 = new JLabel("+");
		label_103.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_103.setBounds(241, 550, 14, 20);
		panel_3.add(label_103);
		
		tfToleranciaMisc = new JTextField();
		tfToleranciaMisc.setText("0");
		tfToleranciaMisc.setColumns(10);
		tfToleranciaMisc.setBounds(291, 550, 30, 20);
		panel_3.add(tfToleranciaMisc);
		
		JLabel label_104 = new JLabel("+");
		label_104.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_104.setBounds(283, 550, 14, 20);
		panel_3.add(label_104);
		
		tfPerPen5 = new JTextField();
		tfPerPen5.setText("0");
		tfPerPen5.setColumns(10);
		tfPerPen5.setBounds(329, 550, 30, 20);
		panel_3.add(tfPerPen5);
		
		JLabel label_105 = new JLabel("-");
		label_105.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_105.setBounds(321, 550, 14, 20);
		panel_3.add(label_105);
		
		JRadioButton rbAcrobacia = new JRadioButton("");
		rbAcrobacia.setBounds(0, 39, 21, 23);
		panel_3.add(rbAcrobacia);
		
		JRadioButton rbAtletismo = new JRadioButton("");
		rbAtletismo.setBounds(0, 102, 21, 23);
		panel_3.add(rbAtletismo);
		
		JRadioButton rbBlefe = new JRadioButton("");
		rbBlefe.setBounds(0, 134, 21, 23);
		panel_3.add(rbBlefe);
		
		JRadioButton rbArcanismo = new JRadioButton("");
		rbArcanismo.setBounds(0, 71, 21, 23);
		panel_3.add(rbArcanismo);
		
		JRadioButton rbDiplomacia = new JRadioButton("");
		rbDiplomacia.setBounds(0, 166, 21, 23);
		panel_3.add(rbDiplomacia);
		
		JRadioButton rbExploracao = new JRadioButton("");
		rbExploracao.setBounds(0, 198, 21, 23);
		panel_3.add(rbExploracao);
		
		JRadioButton rbFurtividade = new JRadioButton("");
		rbFurtividade.setBounds(0, 232, 21, 23);
		panel_3.add(rbFurtividade);
		
		JRadioButton rbHistoria = new JRadioButton("");
		rbHistoria.setBounds(0, 262, 21, 23);
		panel_3.add(rbHistoria);
		
		JRadioButton rbIntimidacao = new JRadioButton("");
		rbIntimidacao.setBounds(0, 294, 21, 23);
		panel_3.add(rbIntimidacao);
		
		JRadioButton rbIntuicao = new JRadioButton("");
		rbIntuicao.setBounds(0, 326, 21, 23);
		panel_3.add(rbIntuicao);
		
		JRadioButton rbLadinagem = new JRadioButton("");
		rbLadinagem.setBounds(0, 358, 21, 23);
		panel_3.add(rbLadinagem);
		
		JRadioButton rbManha = new JRadioButton("");
		rbManha.setBounds(0, 390, 21, 23);
		panel_3.add(rbManha);
		
		JRadioButton rbNatureza = new JRadioButton("");
		rbNatureza.setBounds(0, 422, 21, 23);
		panel_3.add(rbNatureza);
		
		JRadioButton rbPercepcao = new JRadioButton("");
		rbPercepcao.setBounds(0, 454, 21, 23);
		panel_3.add(rbPercepcao);
		
		JRadioButton rbReligiao = new JRadioButton("");
		rbReligiao.setBounds(0, 486, 21, 23);
		panel_3.add(rbReligiao);
		
		JRadioButton rbSocorro = new JRadioButton("");
		rbSocorro.setBounds(0, 518, 21, 23);
		panel_3.add(rbSocorro);
		
		JRadioButton rbTolerancia = new JRadioButton("");
		rbTolerancia.setBounds(0, 550, 21, 23);
		panel_3.add(rbTolerancia);
		
		JLabel label_106 = new JLabel("+5 Trein.");
		label_106.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		label_106.setBounds(0, 14, 64, 20);
		panel_3.add(label_106);
		
		tfPericiaNivel = new JTextField();
		tfPericiaNivel.setText("0");
		tfPericiaNivel.setHorizontalAlignment(SwingConstants.CENTER);
		tfPericiaNivel.setColumns(10);
		tfPericiaNivel.setBounds(172, 39, 26, 533);
		panel_3.add(tfPericiaNivel);
		
		JButton periciaButton = new JButton("OK");
		periciaButton.setBounds(369, 537, 66, 23);
		panel_3.add(periciaButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "ATRIBUTOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(10, 55, 188, 279);
		panel_1.add(panel_4);
		
		Panel panel_5 = new Panel();
		panel_5.setLayout(null);
		panel_5.setBounds(6, 16, 176, 257);
		panel_4.add(panel_5);
		
		JLabel label_107 = new JLabel("FOR");
		label_107.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_107.setBounds(10, 37, 50, 20);
		panel_5.add(label_107);
		
		tfFor = new JTextField();
		tfFor.setText("0");
		tfFor.setColumns(10);
		tfFor.setBounds(54, 37, 30, 20);
		panel_5.add(tfFor);
		
		JLabel label_108 = new JLabel("CON");
		label_108.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_108.setBounds(10, 68, 39, 20);
		panel_5.add(label_108);
		
		tfCon = new JTextField("0");
		tfCon.setColumns(10);
		tfCon.setBounds(54, 68, 30, 20);
		panel_5.add(tfCon);
		
		JLabel label_109 = new JLabel("DES");
		label_109.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_109.setBounds(10, 99, 30, 20);
		panel_5.add(label_109);
		
		tfDes = new JTextField("0");
		tfDes.setColumns(10);
		tfDes.setBounds(54, 99, 30, 20);
		panel_5.add(tfDes);
		
		JLabel label_110 = new JLabel("INT");
		label_110.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_110.setBounds(10, 130, 39, 20);
		panel_5.add(label_110);
		
		tfInt = new JTextField("0");
		tfInt.setColumns(10);
		tfInt.setBounds(54, 130, 30, 20);
		panel_5.add(tfInt);
		
		JLabel label_111 = new JLabel("SAB");
		label_111.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_111.setBounds(10, 161, 39, 20);
		panel_5.add(label_111);
		
		tfSab = new JTextField("0");
		tfSab.setColumns(10);
		tfSab.setBounds(54, 161, 30, 20);
		panel_5.add(tfSab);
		
		JLabel label_112 = new JLabel("CAR");
		label_112.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_112.setBounds(10, 192, 30, 20);
		panel_5.add(label_112);
		
		tfCar = new JTextField("0");
		tfCar.setColumns(10);
		tfCar.setBounds(54, 192, 30, 20);
		panel_5.add(tfCar);
		
		JLabel label_113 = new JLabel("Valor");
		label_113.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_113.setBounds(54, 12, 39, 20);
		panel_5.add(label_113);
		
		tfModFor = new JTextField("0");
		tfModFor.setColumns(10);
		tfModFor.setBounds(134, 37, 30, 20);
		panel_5.add(tfModFor);
		
		tfModCon = new JTextField("0");
		tfModCon.setColumns(10);
		tfModCon.setBounds(134, 68, 30, 20);
		panel_5.add(tfModCon);
		
		tfModDes = new JTextField("0");
		tfModDes.setColumns(10);
		tfModDes.setBounds(134, 99, 30, 20);
		panel_5.add(tfModDes);
		
		tfModInt = new JTextField("0");
		tfModInt.setColumns(10);
		tfModInt.setBounds(134, 130, 30, 20);
		panel_5.add(tfModInt);
		
		tfModSab = new JTextField("0");
		tfModSab.setColumns(10);
		tfModSab.setBounds(134, 161, 30, 20);
		panel_5.add(tfModSab);
		
		tfModCar = new JTextField("0");
		tfModCar.setColumns(10);
		tfModCar.setBounds(134, 192, 30, 20);
		panel_5.add(tfModCar);
		
		JLabel label_114 = new JLabel("Classe");
		label_114.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_114.setBounds(94, 11, 39, 20);
		panel_5.add(label_114);
		
		textField_91 = new JTextField("0");
		textField_91.setColumns(10);
		textField_91.setBounds(94, 37, 30, 20);
		panel_5.add(textField_91);
		
		textField_92 = new JTextField("0");
		textField_92.setColumns(10);
		textField_92.setBounds(94, 68, 30, 20);
		panel_5.add(textField_92);
		
		textField_93 = new JTextField("0");
		textField_93.setColumns(10);
		textField_93.setBounds(94, 99, 30, 20);
		panel_5.add(textField_93);
		
		textField_94 = new JTextField("0");
		textField_94.setColumns(10);
		textField_94.setBounds(94, 130, 30, 20);
		panel_5.add(textField_94);
		
		textField_95 = new JTextField("0");
		textField_95.setColumns(10);
		textField_95.setBounds(94, 161, 30, 20);
		panel_5.add(textField_95);
		
		textField_96 = new JTextField("0");
		textField_96.setColumns(10);
		textField_96.setBounds(94, 192, 30, 20);
		panel_5.add(textField_96);
		
		JLabel label_115 = new JLabel("Mod");
		label_115.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_115.setBounds(139, 12, 39, 20);
		panel_5.add(label_115);
		
		JButton atributeButton = new JButton("Calcular Atributos");
		atributeButton.setBounds(10, 223, 125, 23);
		panel_5.add(atributeButton);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "A\u00C7\u00C3O", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(208, 54, 761, 85);
		panel_1.add(panel_6);
		
		Panel panel_7 = new Panel();
		panel_7.setLayout(null);
		panel_7.setBounds(6, 16, 745, 63);
		panel_6.add(panel_7);
		
		JLabel label_116 = new JLabel("Misc");
		label_116.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_116.setBounds(218, 11, 81, 20);
		panel_7.add(label_116);
		
		JLabel label_117 = new JLabel("mDes");
		label_117.setFont(new Font("Microsoft YaHei", Font.PLAIN, 10));
		label_117.setBounds(176, 12, 39, 19);
		panel_7.add(label_117);
		
		JLabel label_118 = new JLabel("1/2 Nv");
		label_118.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_118.setBounds(127, 11, 39, 20);
		panel_7.add(label_118);
		
		JLabel label_119 = new JLabel("Valor");
		label_119.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_119.setBounds(80, 11, 39, 21);
		panel_7.add(label_119);
		
		JLabel label_120 = new JLabel("Iniciativa");
		label_120.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		label_120.setBounds(10, 34, 65, 20);
		panel_7.add(label_120);
		
		textField_97 = new JTextField();
		textField_97.setText("0");
		textField_97.setColumns(10);
		textField_97.setBounds(76, 35, 30, 20);
		panel_7.add(textField_97);
		
		JLabel label_121 = new JLabel("=");
		label_121.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_121.setBounds(113, 34, 14, 20);
		panel_7.add(label_121);
		
		JLabel label_122 = new JLabel("+");
		label_122.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_122.setBounds(166, 34, 14, 20);
		panel_7.add(label_122);
		
		textField_98 = new JTextField();
		textField_98.setText("0");
		textField_98.setColumns(10);
		textField_98.setBounds(174, 34, 30, 20);
		panel_7.add(textField_98);
		
		JLabel label_123 = new JLabel("+");
		label_123.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_123.setBounds(206, 34, 14, 20);
		panel_7.add(label_123);
		
		textField_99 = new JTextField();
		textField_99.setText("0");
		textField_99.setColumns(10);
		textField_99.setBounds(214, 34, 30, 20);
		panel_7.add(textField_99);
		
		textField_100 = new JTextField();
		textField_100.setText("0");
		textField_100.setHorizontalAlignment(SwingConstants.CENTER);
		textField_100.setColumns(10);
		textField_100.setBounds(130, 34, 26, 20);
		panel_7.add(textField_100);
		
		textField_101 = new JTextField();
		textField_101.setText("0");
		textField_101.setColumns(10);
		textField_101.setBounds(501, 34, 30, 20);
		panel_7.add(textField_101);
		
		JLabel label_124 = new JLabel("-");
		label_124.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_124.setBounds(493, 34, 14, 20);
		panel_7.add(label_124);
		
		JLabel label_125 = new JLabel("Misc");
		label_125.setFont(new Font("Microsoft YaHei", Font.PLAIN, 10));
		label_125.setBounds(463, 12, 39, 19);
		panel_7.add(label_125);
		
		textField_102 = new JTextField();
		textField_102.setText("0");
		textField_102.setColumns(10);
		textField_102.setBounds(461, 34, 30, 20);
		panel_7.add(textField_102);
		
		JLabel label_126 = new JLabel("+");
		label_126.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_126.setBounds(453, 34, 14, 20);
		panel_7.add(label_126);
		
		JLabel label_127 = new JLabel("Classe");
		label_127.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_127.setBounds(414, 11, 39, 20);
		panel_7.add(label_127);
		
		textField_103 = new JTextField();
		textField_103.setText("0");
		textField_103.setHorizontalAlignment(SwingConstants.CENTER);
		textField_103.setColumns(10);
		textField_103.setBounds(417, 34, 26, 20);
		panel_7.add(textField_103);
		
		JLabel label_128 = new JLabel("=");
		label_128.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_128.setBounds(400, 34, 14, 20);
		panel_7.add(label_128);
		
		JLabel label_129 = new JLabel("Valor");
		label_129.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_129.setBounds(367, 11, 39, 21);
		panel_7.add(label_129);
		
		textField_104 = new JTextField();
		textField_104.setText("0");
		textField_104.setColumns(10);
		textField_104.setBounds(363, 35, 30, 20);
		panel_7.add(textField_104);
		
		JLabel label_130 = new JLabel("Deslocamento");
		label_130.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		label_130.setBounds(264, 34, 100, 20);
		panel_7.add(label_130);
		
		JLabel label_131 = new JLabel("Penalidade");
		label_131.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		label_131.setBounds(501, 0, 64, 20);
		panel_7.add(label_131);
		
		JLabel label_132 = new JLabel("Armadura");
		label_132.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		label_132.setBounds(501, 13, 64, 20);
		panel_7.add(label_132);
		
		JLabel label_133 = new JLabel("Pontos de A\u00E7\u00E3o");
		label_133.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		label_133.setBounds(600, 9, 135, 20);
		panel_7.add(label_133);
		
		textField_105 = new JTextField();
		textField_105.setText("1");
		textField_105.setHorizontalAlignment(SwingConstants.CENTER);
		textField_105.setColumns(10);
		textField_105.setBounds(633, 34, 30, 20);
		panel_7.add(textField_105);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Vida, Sentidos e Resist\u00EAncias", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(473, 352, 297, 577);
		panel_1.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(10, 16, 281, 551);
		panel_8.add(panel_9);
		
		JLabel label_134 = new JLabel("PV");
		label_134.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		label_134.setBounds(57, 11, 18, 20);
		panel_9.add(label_134);
		
		textField_106 = new JTextField();
		textField_106.setText("0");
		textField_106.setColumns(10);
		textField_106.setBounds(85, 13, 30, 20);
		panel_9.add(textField_106);
		
		JLabel label_135 = new JLabel("Sangrando");
		label_135.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_135.setBounds(10, 53, 65, 20);
		panel_9.add(label_135);
		
		textField_107 = new JTextField();
		textField_107.setText("0");
		textField_107.setColumns(10);
		textField_107.setBounds(85, 54, 30, 20);
		panel_9.add(textField_107);
		
		JLabel label_136 = new JLabel("1/2 PV");
		label_136.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_136.setBounds(85, 32, 39, 20);
		panel_9.add(label_136);
		
		JLabel label_137 = new JLabel("Pulsos de Cura");
		label_137.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_137.setBounds(10, 107, 96, 20);
		panel_9.add(label_137);
		
		JLabel label_138 = new JLabel("Pulsos por Dia");
		label_138.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_138.setBounds(10, 153, 96, 20);
		panel_9.add(label_138);
		
		textField_108 = new JTextField();
		textField_108.setText("0");
		textField_108.setColumns(10);
		textField_108.setBounds(102, 107, 30, 20);
		panel_9.add(textField_108);
		
		textField_109 = new JTextField();
		textField_109.setText("0");
		textField_109.setColumns(10);
		textField_109.setBounds(102, 153, 30, 20);
		panel_9.add(textField_109);
		
		JLabel label_139 = new JLabel("=");
		label_139.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_139.setBounds(142, 106, 14, 20);
		panel_9.add(label_139);
		
		textField_110 = new JTextField();
		textField_110.setText("0");
		textField_110.setHorizontalAlignment(SwingConstants.CENTER);
		textField_110.setColumns(10);
		textField_110.setBounds(159, 106, 26, 20);
		panel_9.add(textField_110);
		
		JLabel label_140 = new JLabel("1/4 PV");
		label_140.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_140.setBounds(159, 84, 39, 20);
		panel_9.add(label_140);
		
		JLabel label_141 = new JLabel("+");
		label_141.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_141.setBounds(195, 106, 14, 20);
		panel_9.add(label_141);
		
		textField_111 = new JTextField();
		textField_111.setText("0");
		textField_111.setColumns(10);
		textField_111.setBounds(203, 106, 30, 20);
		panel_9.add(textField_111);
		
		JLabel label_142 = new JLabel("Misc");
		label_142.setFont(new Font("Microsoft YaHei", Font.PLAIN, 10));
		label_142.setBounds(203, 86, 39, 19);
		panel_9.add(label_142);
		
		JLabel label_143 = new JLabel("+");
		label_143.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_143.setBounds(235, 106, 14, 20);
		panel_9.add(label_143);
		
		textField_112 = new JTextField();
		textField_112.setText("0");
		textField_112.setColumns(10);
		textField_112.setBounds(243, 106, 30, 20);
		panel_9.add(textField_112);
		
		JLabel label_144 = new JLabel("Misc");
		label_144.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_144.setBounds(243, 84, 30, 20);
		panel_9.add(label_144);
		
		JLabel label_145 = new JLabel("=");
		label_145.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_145.setBounds(142, 153, 14, 20);
		panel_9.add(label_145);
		
		textField_113 = new JTextField();
		textField_113.setText("0");
		textField_113.setHorizontalAlignment(SwingConstants.CENTER);
		textField_113.setColumns(10);
		textField_113.setBounds(159, 153, 26, 20);
		panel_9.add(textField_113);
		
		JLabel label_146 = new JLabel("Classe");
		label_146.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_146.setBounds(156, 130, 39, 20);
		panel_9.add(label_146);
		
		JLabel label_147 = new JLabel("+");
		label_147.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_147.setBounds(195, 153, 14, 20);
		panel_9.add(label_147);
		
		textField_114 = new JTextField();
		textField_114.setText("0");
		textField_114.setColumns(10);
		textField_114.setBounds(203, 153, 30, 20);
		panel_9.add(textField_114);
		
		JLabel label_148 = new JLabel("mCon");
		label_148.setFont(new Font("Microsoft YaHei", Font.PLAIN, 10));
		label_148.setBounds(205, 131, 39, 19);
		panel_9.add(label_148);
		
		JLabel label_149 = new JLabel("+");
		label_149.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_149.setBounds(235, 153, 14, 20);
		panel_9.add(label_149);
		
		textField_115 = new JTextField();
		textField_115.setText("0");
		textField_115.setColumns(10);
		textField_115.setBounds(243, 153, 30, 20);
		panel_9.add(textField_115);
		
		JLabel label_150 = new JLabel("Misc");
		label_150.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_150.setBounds(245, 130, 30, 20);
		panel_9.add(label_150);
		
		textField_116 = new JTextField();
		textField_116.setText("0");
		textField_116.setColumns(10);
		textField_116.setBounds(85, 238, 30, 20);
		panel_9.add(textField_116);
		
		JLabel label_151 = new JLabel("=");
		label_151.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_151.setBounds(117, 198, 14, 20);
		panel_9.add(label_151);
		
		JLabel label_152 = new JLabel("10 +");
		label_152.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_152.setBounds(138, 199, 30, 20);
		panel_9.add(label_152);
		
		textField_117 = new JTextField();
		textField_117.setText("0");
		textField_117.setColumns(10);
		textField_117.setBounds(165, 200, 30, 20);
		panel_9.add(textField_117);
		
		JLabel label_153 = new JLabel("Intui\u00E7\u00E3o");
		label_153.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		label_153.setBounds(10, 198, 65, 20);
		panel_9.add(label_153);
		
		JLabel label_154 = new JLabel("Passiva");
		label_154.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_154.setBounds(10, 217, 65, 20);
		panel_9.add(label_154);
		
		JLabel label_155 = new JLabel("Passiva");
		label_155.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_155.setBounds(10, 255, 65, 20);
		panel_9.add(label_155);
		
		JLabel label_156 = new JLabel("Percep\u00E7\u00E3o");
		label_156.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		label_156.setBounds(10, 236, 96, 20);
		panel_9.add(label_156);
		
		textField_118 = new JTextField();
		textField_118.setText("0");
		textField_118.setColumns(10);
		textField_118.setBounds(85, 200, 30, 20);
		panel_9.add(textField_118);
		
		JLabel label_157 = new JLabel("=");
		label_157.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_157.setBounds(117, 236, 14, 20);
		panel_9.add(label_157);
		
		JLabel label_158 = new JLabel("10 +");
		label_158.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_158.setBounds(138, 237, 30, 20);
		panel_9.add(label_158);
		
		textField_119 = new JTextField();
		textField_119.setText("0");
		textField_119.setColumns(10);
		textField_119.setBounds(165, 238, 30, 20);
		panel_9.add(textField_119);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 83, 285, 13);
		panel_9.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 184, 285, 13);
		panel_9.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 319, 285, 13);
		panel_9.add(separator_2);
		
		TextField textField_120 = new TextField();
		textField_120.setBounds(8, 361, 265, 20);
		panel_9.add(textField_120);
		
		TextField textField_121 = new TextField();
		textField_121.setBounds(8, 410, 265, 20);
		panel_9.add(textField_121);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(8, 462, 263, 80);
		panel_9.add(textArea);
		
		JLabel label_159 = new JLabel("Resist\u00EAncias");
		label_159.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_159.setBounds(8, 335, 96, 20);
		panel_9.add(label_159);
		
		JLabel label_160 = new JLabel("B\u00F4nus nos testes de resist\u00EAncia");
		label_160.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_160.setBounds(8, 384, 188, 20);
		panel_9.add(label_160);
		
		JLabel label_161 = new JLabel("Defesa e Pulso de Cura");
		label_161.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_161.setBounds(8, 436, 188, 20);
		panel_9.add(label_161);
		
		JLabel label_162 = new JLabel("Vis\u00E3o");
		label_162.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
		label_162.setBounds(10, 286, 96, 20);
		panel_9.add(label_162);
		
		textField_122 = new JTextField();
		textField_122.setColumns(10);
		textField_122.setBounds(85, 288, 148, 20);
		panel_9.add(textField_122);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(472, 426, 1, 292);
		panel_1.add(separator_3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "ATAQUES", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_10.setBounds(645, 139, 387, 211);
		panel_1.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(6, 16, 373, 184);
		panel_10.add(panel_11);
		
		JComboBox<Object> comboBox_4 = new JComboBox<Object>(new Object[]{});
		comboBox_4.setBounds(10, 11, 139, 22);
		panel_11.add(comboBox_4);
		
		JComboBox<Object> comboBox_5 = new JComboBox<Object>(new Object[]{});
		comboBox_5.setBounds(10, 100, 139, 22);
		panel_11.add(comboBox_5);
		
		textField_123 = new JTextField();
		textField_123.setText("0");
		textField_123.setHorizontalAlignment(SwingConstants.CENTER);
		textField_123.setColumns(10);
		textField_123.setBounds(17, 145, 26, 22);
		panel_11.add(textField_123);
		
		JLabel label_163 = new JLabel("1/2 Nv");
		label_163.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_163.setBounds(10, 121, 39, 20);
		panel_11.add(label_163);
		
		textField_124 = new JTextField();
		textField_124.setText("0");
		textField_124.setHorizontalAlignment(SwingConstants.CENTER);
		textField_124.setColumns(10);
		textField_124.setBounds(56, 144, 26, 22);
		panel_11.add(textField_124);
		
		JLabel label_164 = new JLabel("mAtr");
		label_164.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_164.setBounds(53, 121, 39, 20);
		panel_11.add(label_164);
		
		textField_125 = new JTextField();
		textField_125.setText("0");
		textField_125.setHorizontalAlignment(SwingConstants.CENTER);
		textField_125.setColumns(10);
		textField_125.setBounds(91, 145, 26, 22);
		panel_11.add(textField_125);
		
		JLabel label_165 = new JLabel("Classe");
		label_165.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_165.setBounds(88, 122, 39, 20);
		panel_11.add(label_165);
		
		JLabel label_166 = new JLabel("Prof.");
		label_166.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_166.setBounds(124, 122, 39, 20);
		panel_11.add(label_166);
		
		textField_126 = new JTextField();
		textField_126.setText("0");
		textField_126.setHorizontalAlignment(SwingConstants.CENTER);
		textField_126.setColumns(10);
		textField_126.setBounds(124, 145, 26, 22);
		panel_11.add(textField_126);
		
		textField_127 = new JTextField();
		textField_127.setText("0");
		textField_127.setHorizontalAlignment(SwingConstants.CENTER);
		textField_127.setColumns(10);
		textField_127.setBounds(154, 145, 26, 22);
		panel_11.add(textField_127);
		
		JLabel label_167 = new JLabel("Tal.");
		label_167.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_167.setBounds(151, 121, 39, 20);
		panel_11.add(label_167);
		
		JLabel label_168 = new JLabel("Melh.");
		label_168.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_168.setBounds(183, 122, 39, 20);
		panel_11.add(label_168);
		
		textField_128 = new JTextField();
		textField_128.setText("0");
		textField_128.setHorizontalAlignment(SwingConstants.CENTER);
		textField_128.setColumns(10);
		textField_128.setBounds(183, 145, 26, 22);
		panel_11.add(textField_128);
		
		textField_129 = new JTextField();
		textField_129.setText("0");
		textField_129.setHorizontalAlignment(SwingConstants.CENTER);
		textField_129.setColumns(10);
		textField_129.setBounds(214, 144, 26, 22);
		panel_11.add(textField_129);
		
		JLabel label_169 = new JLabel("Misc");
		label_169.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_169.setBounds(214, 121, 39, 20);
		panel_11.add(label_169);
		
		JLabel label_170 = new JLabel("B\u00F4nus");
		label_170.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_170.setBounds(263, 121, 45, 20);
		panel_11.add(label_170);
		
		textField_130 = new JTextField();
		textField_130.setText("0");
		textField_130.setColumns(10);
		textField_130.setBounds(265, 146, 30, 20);
		panel_11.add(textField_130);
		
		JLabel label_171 = new JLabel("=");
		label_171.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_171.setBounds(243, 145, 10, 20);
		panel_11.add(label_171);
		
		JLabel label_172 = new JLabel("Dado");
		label_172.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_172.setBounds(318, 121, 45, 20);
		panel_11.add(label_172);
		
		textField_131 = new JTextField();
		textField_131.setText("1d6");
		textField_131.setColumns(10);
		textField_131.setBounds(320, 146, 30, 20);
		panel_11.add(textField_131);
		
		JLabel label_173 = new JLabel("+");
		label_173.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_173.setBounds(303, 145, 10, 20);
		panel_11.add(label_173);
		
		textField_132 = new JTextField();
		textField_132.setText("0");
		textField_132.setHorizontalAlignment(SwingConstants.CENTER);
		textField_132.setColumns(10);
		textField_132.setBounds(17, 55, 26, 22);
		panel_11.add(textField_132);
		
		JLabel label_174 = new JLabel("1/2 Nv");
		label_174.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_174.setBounds(10, 31, 39, 20);
		panel_11.add(label_174);
		
		textField_133 = new JTextField();
		textField_133.setText("0");
		textField_133.setHorizontalAlignment(SwingConstants.CENTER);
		textField_133.setColumns(10);
		textField_133.setBounds(56, 54, 26, 22);
		panel_11.add(textField_133);
		
		JLabel label_175 = new JLabel("mAtr");
		label_175.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_175.setBounds(53, 31, 39, 20);
		panel_11.add(label_175);
		
		textField_134 = new JTextField();
		textField_134.setText("0");
		textField_134.setHorizontalAlignment(SwingConstants.CENTER);
		textField_134.setColumns(10);
		textField_134.setBounds(91, 55, 26, 22);
		panel_11.add(textField_134);
		
		JLabel label_176 = new JLabel("Classe");
		label_176.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_176.setBounds(88, 32, 39, 20);
		panel_11.add(label_176);
		
		JLabel label_177 = new JLabel("Prof.");
		label_177.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_177.setBounds(124, 32, 39, 20);
		panel_11.add(label_177);
		
		textField_135 = new JTextField();
		textField_135.setText("0");
		textField_135.setHorizontalAlignment(SwingConstants.CENTER);
		textField_135.setColumns(10);
		textField_135.setBounds(124, 55, 26, 22);
		panel_11.add(textField_135);
		
		textField_136 = new JTextField();
		textField_136.setText("0");
		textField_136.setHorizontalAlignment(SwingConstants.CENTER);
		textField_136.setColumns(10);
		textField_136.setBounds(154, 55, 26, 22);
		panel_11.add(textField_136);
		
		JLabel label_178 = new JLabel("Tal.");
		label_178.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_178.setBounds(151, 31, 39, 20);
		panel_11.add(label_178);
		
		JLabel label_179 = new JLabel("Melh.");
		label_179.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_179.setBounds(183, 32, 39, 20);
		panel_11.add(label_179);
		
		textField_137 = new JTextField();
		textField_137.setText("0");
		textField_137.setHorizontalAlignment(SwingConstants.CENTER);
		textField_137.setColumns(10);
		textField_137.setBounds(183, 55, 26, 22);
		panel_11.add(textField_137);
		
		textField_138 = new JTextField();
		textField_138.setText("0");
		textField_138.setHorizontalAlignment(SwingConstants.CENTER);
		textField_138.setColumns(10);
		textField_138.setBounds(214, 54, 26, 22);
		panel_11.add(textField_138);
		
		JLabel label_180 = new JLabel("Misc");
		label_180.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_180.setBounds(214, 31, 39, 20);
		panel_11.add(label_180);
		
		JLabel label_181 = new JLabel("B\u00F4nus");
		label_181.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_181.setBounds(263, 31, 45, 20);
		panel_11.add(label_181);
		
		textField_139 = new JTextField();
		textField_139.setText("0");
		textField_139.setColumns(10);
		textField_139.setBounds(265, 56, 30, 20);
		panel_11.add(textField_139);
		
		JLabel label_182 = new JLabel("=");
		label_182.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_182.setBounds(243, 55, 10, 20);
		panel_11.add(label_182);
		
		JLabel label_183 = new JLabel("Dado");
		label_183.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_183.setBounds(318, 31, 45, 20);
		panel_11.add(label_183);
		
		textField_140 = new JTextField();
		textField_140.setText("1d6");
		textField_140.setColumns(10);
		textField_140.setBounds(320, 56, 30, 20);
		panel_11.add(textField_140);
		
		JLabel label_184 = new JLabel("+");
		label_184.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_184.setBounds(303, 55, 10, 20);
		panel_11.add(label_184);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "DEFESAS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_12.setBounds(208, 139, 427, 203);
		panel_1.add(panel_12);
		
		Panel panel_13 = new Panel();
		panel_13.setLayout(null);
		panel_13.setBounds(6, 16, 415, 177);
		panel_12.add(panel_13);
		
		JLabel label_185 = new JLabel("CA");
		label_185.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_185.setBounds(12, 34, 30, 20);
		panel_13.add(label_185);
		
		textField_141 = new JTextField();
		textField_141.setText("0");
		textField_141.setColumns(10);
		textField_141.setBounds(38, 34, 30, 20);
		panel_13.add(textField_141);
		
		JLabel label_186 = new JLabel("Valor");
		label_186.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_186.setBounds(42, 11, 39, 20);
		panel_13.add(label_186);
		
		JLabel label_187 = new JLabel("=");
		label_187.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_187.setBounds(75, 33, 14, 20);
		panel_13.add(label_187);
		
		JLabel label_188 = new JLabel("+");
		label_188.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_188.setBounds(162, 34, 14, 20);
		panel_13.add(label_188);
		
		textField_142 = new JTextField();
		textField_142.setText("0");
		textField_142.setHorizontalAlignment(SwingConstants.CENTER);
		textField_142.setColumns(10);
		textField_142.setBounds(126, 34, 26, 117);
		panel_13.add(textField_142);
		
		JLabel label_189 = new JLabel("1/2 Nv");
		label_189.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_189.setBounds(123, 11, 39, 20);
		panel_13.add(label_189);
		
		JLabel label_190 = new JLabel("+");
		label_190.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_190.setBounds(202, 34, 14, 20);
		panel_13.add(label_190);
		
		textField_143 = new JTextField();
		textField_143.setText("0");
		textField_143.setColumns(10);
		textField_143.setBounds(170, 34, 30, 20);
		panel_13.add(textField_143);
		
		JLabel label_191 = new JLabel("Atr.");
		label_191.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_191.setBounds(172, 11, 39, 20);
		panel_13.add(label_191);
		
		JLabel label_192 = new JLabel("+");
		label_192.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_192.setBounds(239, 34, 14, 20);
		panel_13.add(label_192);
		
		textField_144 = new JTextField();
		textField_144.setText("0");
		textField_144.setColumns(10);
		textField_144.setBounds(210, 34, 30, 20);
		panel_13.add(textField_144);
		
		JLabel label_193 = new JLabel("Armadura");
		label_193.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		label_193.setBounds(202, 11, 50, 20);
		panel_13.add(label_193);
		
		textField_145 = new JTextField();
		textField_145.setText("0");
		textField_145.setColumns(10);
		textField_145.setBounds(247, 34, 30, 20);
		panel_13.add(textField_145);
		
		JLabel label_194 = new JLabel("Misc");
		label_194.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_194.setBounds(250, 11, 39, 20);
		panel_13.add(label_194);
		
		JLabel label_195 = new JLabel("10 +");
		label_195.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_195.setBounds(96, 34, 30, 20);
		panel_13.add(label_195);
		
		JLabel label_196 = new JLabel("+");
		label_196.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_196.setBounds(280, 34, 14, 20);
		panel_13.add(label_196);
		
		textField_146 = new JTextField();
		textField_146.setText("0");
		textField_146.setColumns(10);
		textField_146.setBounds(288, 34, 30, 20);
		panel_13.add(textField_146);
		
		JLabel label_197 = new JLabel("Misc");
		label_197.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_197.setBounds(288, 11, 39, 20);
		panel_13.add(label_197);
		
		JLabel label_198 = new JLabel("+");
		label_198.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_198.setBounds(280, 66, 14, 20);
		panel_13.add(label_198);
		
		textField_147 = new JTextField();
		textField_147.setText("0");
		textField_147.setColumns(10);
		textField_147.setBounds(288, 66, 30, 20);
		panel_13.add(textField_147);
		
		JLabel label_199 = new JLabel("+");
		label_199.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_199.setBounds(239, 66, 14, 20);
		panel_13.add(label_199);
		
		textField_148 = new JTextField();
		textField_148.setText("0");
		textField_148.setColumns(10);
		textField_148.setBounds(247, 66, 30, 20);
		panel_13.add(textField_148);
		
		JLabel label_200 = new JLabel("+");
		label_200.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_200.setBounds(202, 66, 14, 20);
		panel_13.add(label_200);
		
		textField_149 = new JTextField();
		textField_149.setText("0");
		textField_149.setColumns(10);
		textField_149.setBounds(210, 66, 30, 20);
		panel_13.add(textField_149);
		
		JLabel label_201 = new JLabel("+");
		label_201.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_201.setBounds(162, 66, 14, 20);
		panel_13.add(label_201);
		
		textField_150 = new JTextField();
		textField_150.setText("0");
		textField_150.setColumns(10);
		textField_150.setBounds(170, 66, 30, 20);
		panel_13.add(textField_150);
		
		JLabel label_202 = new JLabel("10 +");
		label_202.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_202.setBounds(96, 66, 30, 20);
		panel_13.add(label_202);
		
		JLabel label_203 = new JLabel("=");
		label_203.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_203.setBounds(75, 65, 14, 20);
		panel_13.add(label_203);
		
		textField_151 = new JTextField();
		textField_151.setText("0");
		textField_151.setColumns(10);
		textField_151.setBounds(38, 66, 30, 20);
		panel_13.add(textField_151);
		
		JLabel label_204 = new JLabel("FORT");
		label_204.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_204.setBounds(3, 66, 33, 20);
		panel_13.add(label_204);
		
		JLabel label_205 = new JLabel("+");
		label_205.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_205.setBounds(280, 98, 14, 20);
		panel_13.add(label_205);
		
		textField_152 = new JTextField();
		textField_152.setText("0");
		textField_152.setColumns(10);
		textField_152.setBounds(288, 98, 30, 20);
		panel_13.add(textField_152);
		
		JLabel label_206 = new JLabel("+");
		label_206.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_206.setBounds(239, 98, 14, 20);
		panel_13.add(label_206);
		
		textField_153 = new JTextField();
		textField_153.setText("0");
		textField_153.setColumns(10);
		textField_153.setBounds(247, 98, 30, 20);
		panel_13.add(textField_153);
		
		JLabel label_207 = new JLabel("+");
		label_207.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_207.setBounds(202, 98, 14, 20);
		panel_13.add(label_207);
		
		textField_154 = new JTextField();
		textField_154.setText("0");
		textField_154.setColumns(10);
		textField_154.setBounds(210, 98, 30, 20);
		panel_13.add(textField_154);
		
		JLabel label_208 = new JLabel("+");
		label_208.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_208.setBounds(162, 98, 14, 20);
		panel_13.add(label_208);
		
		textField_155 = new JTextField();
		textField_155.setText("0");
		textField_155.setColumns(10);
		textField_155.setBounds(170, 98, 30, 20);
		panel_13.add(textField_155);
		
		JLabel label_209 = new JLabel("10 +");
		label_209.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_209.setBounds(96, 98, 30, 20);
		panel_13.add(label_209);
		
		JLabel label_210 = new JLabel("=");
		label_210.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_210.setBounds(75, 97, 14, 20);
		panel_13.add(label_210);
		
		textField_156 = new JTextField();
		textField_156.setText("0");
		textField_156.setColumns(10);
		textField_156.setBounds(38, 98, 30, 20);
		panel_13.add(textField_156);
		
		JLabel label_211 = new JLabel("REFL");
		label_211.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_211.setBounds(5, 98, 30, 20);
		panel_13.add(label_211);
		
		JLabel label_212 = new JLabel("+");
		label_212.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_212.setBounds(280, 130, 14, 20);
		panel_13.add(label_212);
		
		textField_157 = new JTextField();
		textField_157.setText("0");
		textField_157.setColumns(10);
		textField_157.setBounds(288, 130, 30, 20);
		panel_13.add(textField_157);
		
		JLabel label_213 = new JLabel("+");
		label_213.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_213.setBounds(239, 130, 14, 20);
		panel_13.add(label_213);
		
		textField_158 = new JTextField();
		textField_158.setText("0");
		textField_158.setColumns(10);
		textField_158.setBounds(247, 130, 30, 20);
		panel_13.add(textField_158);
		
		JLabel label_214 = new JLabel("+");
		label_214.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_214.setBounds(202, 130, 14, 20);
		panel_13.add(label_214);
		
		textField_159 = new JTextField();
		textField_159.setText("0");
		textField_159.setColumns(10);
		textField_159.setBounds(210, 130, 30, 20);
		panel_13.add(textField_159);
		
		JLabel label_215 = new JLabel("+");
		label_215.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_215.setBounds(162, 130, 14, 20);
		panel_13.add(label_215);
		
		textField_160 = new JTextField();
		textField_160.setText("0");
		textField_160.setColumns(10);
		textField_160.setBounds(170, 130, 30, 20);
		panel_13.add(textField_160);
		
		JLabel label_216 = new JLabel("10 +");
		label_216.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_216.setBounds(96, 130, 30, 20);
		panel_13.add(label_216);
		
		JLabel label_217 = new JLabel("=");
		label_217.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_217.setBounds(75, 129, 14, 20);
		panel_13.add(label_217);
		
		textField_161 = new JTextField();
		textField_161.setText("0");
		textField_161.setColumns(10);
		textField_161.setBounds(38, 130, 30, 20);
		panel_13.add(textField_161);
		
		JLabel label_218 = new JLabel("VONT");
		label_218.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_218.setBounds(0, 130, 53, 20);
		panel_13.add(label_218);
		
		JLabel label_219 = new JLabel("+");
		label_219.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_219.setBounds(317, 130, 14, 20);
		panel_13.add(label_219);
		
		textField_162 = new JTextField();
		textField_162.setText("0");
		textField_162.setColumns(10);
		textField_162.setBounds(325, 130, 30, 20);
		panel_13.add(textField_162);
		
		JLabel label_220 = new JLabel("+");
		label_220.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_220.setBounds(317, 98, 14, 20);
		panel_13.add(label_220);
		
		textField_163 = new JTextField();
		textField_163.setText("0");
		textField_163.setColumns(10);
		textField_163.setBounds(325, 98, 30, 20);
		panel_13.add(textField_163);
		
		JLabel label_221 = new JLabel("+");
		label_221.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_221.setBounds(317, 66, 14, 20);
		panel_13.add(label_221);
		
		textField_164 = new JTextField();
		textField_164.setText("0");
		textField_164.setColumns(10);
		textField_164.setBounds(325, 66, 30, 20);
		panel_13.add(textField_164);
		
		JLabel label_222 = new JLabel("+");
		label_222.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_222.setBounds(317, 34, 14, 20);
		panel_13.add(label_222);
		
		textField_165 = new JTextField();
		textField_165.setText("0");
		textField_165.setColumns(10);
		textField_165.setBounds(325, 34, 30, 20);
		panel_13.add(textField_165);
		
		JLabel label_223 = new JLabel("Classe");
		label_223.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_223.setBounds(325, 11, 39, 20);
		panel_13.add(label_223);
		
		JLabel label_224 = new JLabel("Escudo");
		label_224.setFont(new Font("Microsoft YaHei", Font.PLAIN, 9));
		label_224.setBounds(370, 11, 50, 20);
		panel_13.add(label_224);
		
		JLabel label_225 = new JLabel("+");
		label_225.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_225.setBounds(358, 34, 14, 20);
		panel_13.add(label_225);
		
		textField_166 = new JTextField();
		textField_166.setText("0");
		textField_166.setColumns(10);
		textField_166.setBounds(370, 34, 30, 20);
		panel_13.add(textField_166);
		
		JLabel label_226 = new JLabel("+");
		label_226.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
		label_226.setBounds(358, 98, 14, 20);
		panel_13.add(label_226);
		
		textField_167 = new JTextField();
		textField_167.setText("0");
		textField_167.setColumns(10);
		textField_167.setBounds(370, 98, 30, 20);
		panel_13.add(textField_167);
		
		JButton defesaButton = new JButton("Calcular Defesa");
		defesaButton.setBounds(290, 154, 125, 23);
		panel_13.add(defesaButton);
		
		JLabel label_227 = new JLabel("Destino \u00C9pico");
		label_227.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		label_227.setBounds(978, 108, 162, 42);
		panel_1.add(label_227);
		
		textField_168 = new JTextField(" ");
		textField_168.setColumns(10);
		textField_168.setBounds(978, 98, 217, 20);
		panel_1.add(textField_168);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Idiomas Conhecidos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_14.setBounds(1042, 139, 218, 195);
		panel_1.add(panel_14);
		
		Panel panel_15 = new Panel();
		panel_15.setLayout(null);
		panel_15.setBounds(6, 16, 202, 167);
		panel_14.add(panel_15);
		
		TextField textField_169 = new TextField();
		textField_169.setBounds(10, 10, 182, 20);
		panel_15.add(textField_169);
		
		TextField textField_170 = new TextField();
		textField_170.setBounds(10, 36, 182, 20);
		panel_15.add(textField_170);
		
		TextField textField_171 = new TextField();
		textField_171.setBounds(10, 62, 182, 20);
		panel_15.add(textField_171);
		
		TextField textField_172 = new TextField();
		textField_172.setBounds(10, 88, 182, 20);
		panel_15.add(textField_172);
		
		TextField textField_173 = new TextField();
		textField_173.setBounds(10, 114, 182, 20);
		panel_15.add(textField_173);
		
		TextField textField_174 = new TextField();
		textField_174.setBounds(10, 140, 182, 20);
		panel_15.add(textField_174);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Aspectos Raciais", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_16.setBounds(780, 361, 480, 180);
		panel_1.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(6, 16, 464, 158);
		panel_16.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Caracter\u00EDsticas de Classe", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_18.setBounds(780, 547, 480, 314);
		panel_1.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBounds(6, 16, 464, 292);
		panel_18.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		tabbedPane.addTab("Página 2", null, panel_20, null);
		panel_20.setLayout(null);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Poderes Sem Limite", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_23.setBounds(6, 16, 290, 186);
		panel_20.add(panel_23);
		panel_23.setLayout(null);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBounds(6, 16, 278, 164);
		panel_23.add(panel_21);
		panel_21.setLayout(null);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(10, 10, 258, 133);
		panel_21.add(textArea_1);
		
		JPanel panel_22 = new JPanel();
		panel_22.setLayout(null);
		panel_22.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Poderes Por Encontro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_22.setBounds(10, 215, 290, 186);
		panel_20.add(panel_22);
		
		JPanel panel_24 = new JPanel();
		panel_24.setLayout(null);
		panel_24.setBounds(6, 16, 278, 164);
		panel_22.add(panel_24);
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setBounds(10, 10, 258, 133);
		panel_24.add(textArea_2);
		
		JPanel panel_25 = new JPanel();
		panel_25.setLayout(null);
		panel_25.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Poderes Di\u00E1rios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_25.setBounds(10, 411, 290, 186);
		panel_20.add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setLayout(null);
		panel_26.setBounds(6, 16, 278, 164);
		panel_25.add(panel_26);
		
		TextArea textArea_3 = new TextArea();
		textArea_3.setBounds(10, 10, 258, 133);
		panel_26.add(textArea_3);
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Poderes Utilit\u00E1rios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_27.setBounds(10, 608, 290, 186);
		panel_20.add(panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setLayout(null);
		panel_28.setBounds(6, 16, 278, 164);
		panel_27.add(panel_28);
		
		TextArea textArea_4 = new TextArea();
		textArea_4.setBounds(10, 10, 258, 133);
		panel_28.add(textArea_4);
		
		JPanel panel_29 = new JPanel();
		panel_29.setLayout(null);
		panel_29.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Rituais", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_29.setBounds(10, 805, 290, 117);
		panel_20.add(panel_29);
		
		JPanel panel_30 = new JPanel();
		panel_30.setLayout(null);
		panel_30.setBounds(6, 16, 274, 98);
		panel_29.add(panel_30);
		
		TextArea textArea_5 = new TextArea();
		textArea_5.setBounds(10, 10, 258, 75);
		panel_30.add(textArea_5);
		
		JPanel panel_31 = new JPanel();
		panel_31.setLayout(null);
		panel_31.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Moedas e outros Equipamentos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_31.setBounds(320, 16, 290, 186);
		panel_20.add(panel_31);
		
		JPanel panel_32 = new JPanel();
		panel_32.setLayout(null);
		panel_32.setBounds(6, 16, 278, 164);
		panel_31.add(panel_32);
		
		TextArea textArea_6 = new TextArea();
		textArea_6.setBounds(10, 10, 258, 133);
		panel_32.add(textArea_6);
		
		JPanel panel_33 = new JPanel();
		panel_33.setLayout(null);
		panel_33.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Equipamento Principal", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_33.setBounds(320, 213, 396, 250);
		panel_20.add(panel_33);
		
		JPanel panel_34 = new JPanel();
		panel_34.setLayout(null);
		panel_34.setBounds(10, 22, 378, 217);
		panel_33.add(panel_34);
		
		TextField textField_175 = new TextField();
		textField_175.setBounds(81, 10, 284, 22);
		panel_34.add(textField_175);
		
		TextField textField_176 = new TextField();
		textField_176.setBounds(81, 44, 284, 22);
		panel_34.add(textField_176);
		
		TextField textField_177 = new TextField();
		textField_177.setBounds(81, 72, 284, 22);
		panel_34.add(textField_177);
		
		TextField textField_178 = new TextField();
		textField_178.setBounds(81, 100, 284, 22);
		panel_34.add(textField_178);
		
		TextField textField_179 = new TextField();
		textField_179.setBounds(81, 128, 284, 22);
		panel_34.add(textField_179);
		
		TextField textField_180 = new TextField();
		textField_180.setBounds(81, 156, 284, 22);
		panel_34.add(textField_180);
		
		JLabel lblArma = new JLabel("Arma 1");
		lblArma.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblArma.setBounds(25, 10, 50, 20);
		panel_34.add(lblArma);
		
		JLabel lblArma_1 = new JLabel("Arma 2");
		lblArma_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblArma_1.setBounds(25, 44, 50, 20);
		panel_34.add(lblArma_1);
		
		JLabel lblArma_2 = new JLabel("Arma 3");
		lblArma_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblArma_2.setBounds(25, 72, 50, 20);
		panel_34.add(lblArma_2);
		
		JLabel lblArma_3 = new JLabel("Arma 4");
		lblArma_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblArma_3.setBounds(25, 100, 50, 20);
		panel_34.add(lblArma_3);
		
		JLabel lblArmadura = new JLabel("Armadura");
		lblArmadura.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblArmadura.setBounds(10, 131, 65, 20);
		panel_34.add(lblArmadura);
		
		JLabel lblEscudo = new JLabel("Escudo");
		lblEscudo.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblEscudo.setBounds(25, 156, 50, 20);
		panel_34.add(lblEscudo);
		
		TextField textField_181 = new TextField();
		textField_181.setBounds(81, 184, 284, 22);
		panel_34.add(textField_181);
		
		JLabel lblOutro = new JLabel("Misc");
		lblOutro.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		lblOutro.setBounds(41, 187, 34, 20);
		panel_34.add(lblOutro);
		
		JPanel panel_35 = new JPanel();
		panel_35.setLayout(null);
		panel_35.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalhes Misc", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_35.setBounds(320, 464, 416, 314);
		panel_20.add(panel_35);
		
		JPanel panel_36 = new JPanel();
		panel_36.setLayout(null);
		panel_36.setBounds(6, 16, 394, 282);
		panel_35.add(panel_36);
		
		TextArea textArea_7 = new TextArea();
		textArea_7.setBounds(10, 10, 374, 262);
		panel_36.add(textArea_7);
		
		Personagem p = new Personagem();
		
	}
}
