package projetoInterface;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Personagem.Personagem;

public class Preenchedor {
	
	public void setModificador(JTextField text, int modificador) {
		text.setText(Integer.toString(modificador));
	}
	
	
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
	
	public void constituicao(Personagem p, JTextField tfValorAtributo, JTextField tfModificador, 
			JTextField tfPerCon) {
		p.setCon(Integer.parseInt(tfValorAtributo.getText()));
		p.setmCon(p.getCon()/4);
		
		int modificador = p.getmCon();
		setModificador(tfPerCon, modificador);
		setModificador(tfModificador, modificador);
	}
	
	public void destreza(Personagem p, JTextField tfValorAtributo, JTextField tfModificador, 
			JTextField tfPerDes1, JTextField tfPerDes2, JTextField tfPerDes3) {
		p.setDes(Integer.parseInt(tfValorAtributo.getText()));
		p.setmDes(p.getDes()/4);
		
		int modificador = p.getmDes();
		setModificador(tfPerDes1, modificador);
		setModificador(tfPerDes2, modificador);
		setModificador(tfPerDes3, modificador);
		setModificador(tfModificador, modificador);
	}
	
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
	
	public void sabedoria(Personagem p, JTextField tfValorAtributo, JTextField tfModificador, 
			JTextField tfPerSab1, JTextField tfPerSab2, JTextField tfPerSab3, 
			JTextField tfPerSab4, JTextField tfPerSab5) {
		p.setSab(Integer.parseInt(tfValorAtributo.getText()));
		p.setmSab(p.getSab()/4);
		
		int modificador = p.getmSab();
		setModificador(tfPerSab1, modificador);
		setModificador(tfPerSab2, modificador);
		setModificador(tfPerSab3, modificador);
		setModificador(tfPerSab4, modificador);
		setModificador(tfPerSab5, modificador);
		setModificador(tfModificador, modificador);
	}
	
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


	public void setPericiaValue(JRadioButton rb, JTextField value,
			JTextField midificador, JTextField nivel, JTextField race,
			JTextField misc) {
		
		value.setText(Integer.toString(setPericiaInt(rb, midificador, nivel, race, misc)));
	}
}
