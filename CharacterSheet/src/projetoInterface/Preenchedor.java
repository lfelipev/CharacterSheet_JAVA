package projetoInterface;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Personagem.Personagem;

public class Preenchedor {
	
	/**
	 * 
	 * @param text
	 * @param modificador
	 */
	public void setModificador(JTextField text, int modificador) {
		text.setText(Integer.toString(modificador));
	}
	
	/**
	 * 
	 * @param p
	 * @param tfValorAtributo
	 * @param tfModificador
	 * @param tfPerFor1
	 * @param tfPerFor2
	 */
	public void forca(Personagem p, JTextField tfValorAtributo, JTextField tfModificador,
			JTextField tfPerFor1, JTextField tfPerFor2) {
		p.setFor(Integer.parseInt(tfValorAtributo.getText()));
		p.setmFor(p.getFor()/4);
		tfModificador.setText(Integer.toString(p.getmFor()));
		
		int modificador = p.getmFor();
		setModificador(tfPerFor1, modificador);
		setModificador(tfPerFor2, modificador);
		setModificador(tfModificador, modificador);
	}
	
	/**
	 * 
	 * @param p
	 * @param tfValorAtributo
	 * @param tfModificador
	 * @param tfPerCon
	 * @param tfReflModCon
	 * @param tfPulseCon
	 */
	public void constituicao(Personagem p, JTextField tfValorAtributo, JTextField tfModificador, 
			JTextField tfPerCon, JTextField tfReflModCon, JTextField tfPulseCon) {
		p.setCon(Integer.parseInt(tfValorAtributo.getText()));
		p.setmCon(p.getCon()/4);
		
		int modificador = p.getmCon();
		setModificador(tfPerCon, modificador);
		setModificador(tfModificador, modificador);
		setModificador(tfReflModCon, modificador);
		setModificador(tfPulseCon, modificador);
	}
	
	/**
	 * 
	 * @param p
	 * @param tfValorAtributo
	 * @param tfModificador
	 * @param tfPerDes1
	 * @param tfPerDes2
	 * @param tfPerDes3
	 * @param tfReflModDes
	 * @param tfInitiativeDes
	 */
	public void destreza(Personagem p, JTextField tfValorAtributo, JTextField tfModificador, 
			JTextField tfPerDes1, JTextField tfPerDes2, JTextField tfPerDes3, JTextField tfReflModDes, JTextField tfInitiativeDes) {
		p.setDes(Integer.parseInt(tfValorAtributo.getText()));
		p.setmDes(p.getDes()/4);
		
		int modificador = p.getmDes();
		setModificador(tfPerDes1, modificador);
		setModificador(tfPerDes2, modificador);
		setModificador(tfPerDes3, modificador);
		setModificador(tfModificador, modificador);
		setModificador(tfReflModDes, modificador);
		setModificador(tfInitiativeDes, modificador);
	}
	
	/**
	 * 
	 * @param p
	 * @param tfValorAtributo
	 * @param tfModificador
	 * @param tfPerInt1
	 * @param tfPerInt2
	 * @param tfPerInt3
	 */
	public void inteligencia(Personagem p, JTextField tfValorAtributo, JTextField tfModificador, 
			JTextField tfPerInt1, JTextField tfPerInt2, JTextField tfPerInt3) {
		p.setInt(Integer.parseInt(tfValorAtributo.getText()));
		p.setmInt(p.getInt()/4);
		
		int modificador = p.getmInt();
		setModificador(tfPerInt1, modificador);
		setModificador(tfPerInt2, modificador);
		setModificador(tfPerInt3, modificador);
		setModificador(tfModificador, modificador);
	}
	
	/**
	 * 
	 * @param p
	 * @param tfValorAtributo
	 * @param tfModificador
	 * @param tfPerSab1
	 * @param tfPerSab2
	 * @param tfPerSab3
	 * @param tfPerSab4
	 * @param tfPerSab5
	 * @param tfVontModSab
	 */
	public void sabedoria(Personagem p, JTextField tfValorAtributo, JTextField tfModificador, 
			JTextField tfPerSab1, JTextField tfPerSab2, JTextField tfPerSab3, 
			JTextField tfPerSab4, JTextField tfPerSab5, JTextField tfVontModSab) {
		p.setSab(Integer.parseInt(tfValorAtributo.getText()));
		p.setmSab(p.getSab()/4);
		
		int modificador = p.getmSab();
		setModificador(tfPerSab1, modificador);
		setModificador(tfPerSab2, modificador);
		setModificador(tfPerSab3, modificador);
		setModificador(tfPerSab4, modificador);
		setModificador(tfPerSab5, modificador);
		setModificador(tfModificador, modificador);
		setModificador(tfVontModSab, modificador);
	}
	
	/**
	 * 
	 * @param p
	 * @param tfValorAtributo
	 * @param tfModificador
	 * @param tfPerCar1
	 * @param tfPerCar2
	 * @param tfPerCar3
	 */
	public void carisma(Personagem p, JTextField tfValorAtributo, JTextField tfModificador,
			JTextField tfPerCar1, JTextField tfPerCar2, JTextField tfPerCar3) {
		p.setCar(Integer.parseInt(tfValorAtributo.getText()));
		p.setmCar(p.getCar()/4);

		int modificador = p.getmCar();
		setModificador(tfPerCar1, modificador);
		setModificador(tfPerCar2, modificador);
		setModificador(tfPerCar3, modificador);
		setModificador(tfModificador, modificador);
	}
	
	/**
	 * 
	 * @param p
	 * @param tField
	 */
	public void nome(Personagem p, JTextField tField) {
		tField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent e) {System.out.println("Antes"); }
			public void insertUpdate(DocumentEvent e) { 
				p.setNomeDoPersonagem(tField.getText());
			}
			public void removeUpdate(DocumentEvent e) {
				p.setNomeDoPersonagem(tField.getText());
			}
		});	
	}
	
	/**
	 * 
	 * @param p
	 * @param tField
	 */
	public void idade(Personagem p, JTextField tField) {
		tField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent e) {System.out.println("Antes"); }
			public void insertUpdate(DocumentEvent e) { 
				p.setIdade(tField.getText());
			}
			public void removeUpdate(DocumentEvent e) {
				p.setIdade(tField.getText());
			}
		});	
	}
	
	/**
	 * 
	 * @param modificador
	 * @param nivel
	 * @param race
	 * @param misc
	 * @param pen
	 * @return
	 */
	public int setPericiaInt(JRadioButton rb, JTextField modificador, JTextField nivel, JTextField race, JTextField misc,
			JTextField pen) {
		int button = 0;
		if(rb.isSelected()) {
			button = 5;
		}
		
		int mod = Integer.parseInt(modificador.getText());
		int nvl = Integer.parseInt(nivel.getText());
		int rce = Integer.parseInt(race.getText());
		int msc = Integer.parseInt(misc.getText());
		int penality = Integer.parseInt(pen.getText());
		
		return button + mod + nvl + rce + msc - penality;
	}
	
	/**
	 * 
	 * @param rb
	 * @param modificador
	 * @param nivel
	 * @param race
	 * @param misc
	 * @return
	 */
	public int setPericiaInt(JRadioButton rb, JTextField modificador, JTextField nivel, JTextField race, JTextField misc) {
		int button = 0;
		if(rb.isSelected()) {
			button = 5;
		}
		
		int mod = Integer.parseInt(modificador.getText());
		int nvl = Integer.parseInt(nivel.getText());
		int rce = Integer.parseInt(race.getText());
		int msc = Integer.parseInt(misc.getText());
		
		return mod + nvl + rce + msc + button;
	}
	
	/**
	 * 
	 * @param rb 
	 * @param value
	 * @param modificador
	 * @param nivel
	 * @param race
	 * @param misc
	 * @param penality
	 */
	public void setPericiaValue(JRadioButton rb, JTextField value, JTextField modificador,
			JTextField nivel, JTextField race, JTextField misc, JTextField penality) {
		
		value.setText(Integer.toString(setPericiaInt(rb, modificador, nivel, race, misc, penality)));
	}

	/**
	 * 
	 * @param rb
	 * @param value
	 * @param midificador
	 * @param nivel
	 * @param race
	 * @param misc
	 */
	public void setPericiaValue(JRadioButton rb, JTextField value,
			JTextField midificador, JTextField nivel, JTextField race,
			JTextField misc) {
		
		value.setText(Integer.toString(setPericiaInt(rb, midificador, nivel, race, misc)));
	}
	
	/**
	 * 
	 * @param rb
	 * @param value
	 * @param midificador
	 * @param nivel
	 * @param race
	 * @param misc
	 * @param tfPassive
	 * @param tfPassiveValue
	 */
	public void setPericiaValue(JRadioButton rb, JTextField value,
			JTextField midificador, JTextField nivel, JTextField race,
			JTextField misc, JTextField tfPassive, JTextField tfPassiveValue) {
		
		value.setText(Integer.toString(setPericiaInt(rb, midificador, nivel, race, misc)));
		tfPassive.setText(Integer.toString(setPericiaInt(rb, midificador, nivel, race, misc) + 10));
		tfPassiveValue.setText(Integer.toString(setPericiaInt(rb, midificador, nivel, race, misc)));
	}

	/**
	 * 
	 * @param p
	 * @param tfInitiativeValue
	 * @param tfInitiativeNivel
	 * @param tfInitiativeMisc
	 */
	public void initiative(Personagem p, JTextField tfInitiativeValue,
			JTextField tfInitiativeNivel, JTextField tfInitiativeMisc) {
		
		int initiative = 0;
		int nvl = Integer.parseInt(tfInitiativeNivel.getText());
		int misc = Integer.parseInt(tfInitiativeMisc.getText());
		initiative = nvl + misc + p.getmDes();
		
		setModificador(tfInitiativeValue, initiative);
		p.setIniciativa(initiative);
	}


	/**
	 * 
	 * @param cb
	 * @param p
	 * @param text
	 */
	public void atributeAtaque(JComboBox<?> cb, Personagem p, JTextField text) {
		if(cb.getSelectedIndex() == 0) {
			text.setText("0");
		} 
		else if(cb.getSelectedIndex() == 1) {
			text.setText(Integer.toString(p.getmFor()));
		}
		else if(cb.getSelectedIndex() == 2) {
			text.setText(Integer.toString(p.getmCon()));
		}
		else if(cb.getSelectedIndex() == 3) {
			text.setText(Integer.toString(p.getmDes()));
		}
		else if(cb.getSelectedIndex() == 4) {
			text.setText(Integer.toString(p.getmInt()));
		}
		else if(cb.getSelectedIndex() == 5) {
			text.setText(Integer.toString(p.getmSab()));
		}
		else if(cb.getSelectedIndex() == 6) {
			text.setText(Integer.toString(p.getmCar()));
		}
	}


}
