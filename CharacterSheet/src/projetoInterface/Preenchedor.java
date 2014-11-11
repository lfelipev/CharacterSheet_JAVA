package projetoInterface;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Personagem.Personagem;

public class Preenchedor {
	public void forca(Personagem p, JTextField tfValorAtributo, JTextField tfModificador) {
		p.setFor(Integer.parseInt(tfValorAtributo.getText()) + Integer.parseInt(tfModificador.getText()));
		p.setmFor(p.getFor()/4 - (p.getFor()%4));
		tfModificador.setText(Integer.toString(p.getmFor()));
	}
	
	public void constituicao(Personagem p, JTextField tfValorAtributo, JTextField tfModificador) {
		p.setCon(Integer.parseInt(tfValorAtributo.getText()) + Integer.parseInt(tfModificador.getText()));
		p.setmCon(p.getCon()/4 - (p.getCon()%4));
		tfModificador.setText(Integer.toString(p.getmCon()));
	}
	
	public void destreza(Personagem p, JTextField tfValorAtributo, JTextField tfModificador) {
		p.setDes(Integer.parseInt(tfValorAtributo.getText()) + Integer.parseInt(tfModificador.getText()));
		p.setmDes(p.getDes()/4 - (p.getDes()%4));
		tfModificador.setText(Integer.toString(p.getmDes()));
	}
	
	public void inteligencia(Personagem p, JTextField tfValorAtributo, JTextField tfModificador) {
		p.setInt(Integer.parseInt(tfValorAtributo.getText()) + Integer.parseInt(tfModificador.getText()));
		p.setmInt(p.getInt()/4 - (p.getInt()%4));
		tfModificador.setText(Integer.toString(p.getmInt()));
	}
	
	public void sabedoria(Personagem p, JTextField tfValorAtributo, JTextField tfModificador) {
		p.setSab(Integer.parseInt(tfValorAtributo.getText()) + Integer.parseInt(tfModificador.getText()));
		p.setmSab(p.getSab()/4 - (p.getSab()%4));
		tfModificador.setText(Integer.toString(p.getmSab()));
	}
	
	public void carisma(Personagem p, JTextField tfValorAtributo, JTextField tfModificador) {
		p.setCar(Integer.parseInt(tfValorAtributo.getText()) + Integer.parseInt(tfModificador.getText()));
		p.setmCar(p.getCar()/4 - (p.getCar()%4));
		tfModificador.setText(Integer.toString(p.getmCar()));
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

	public void acrobatics(Personagem p, JTextField tfModificador, JTextField tfPericia, JTextField tfAcrValue) {
		/**tfPericia.setText(Integer.toString(p.getmDes()));
		if(!p.isAcrobaciaDone()) {
			tfAcrValue.setText(Integer.toString(Integer.parseInt(tfAcrValue.getText()) + p.getmDes()));
			p.setAcrobaciaDone(true);
		}
		else {
			return;
		} **/
		
		//p.setDes(Integer.parseInt(tfValorAtributo.getText()) + Integer.parseInt(tfModificador.getText()));
		//p.setmDes(p.getDes()/4);
		
		//p.setCon(Integer.parseInt(tfValorAtributo.getText()) + Integer.parseInt(tfModificador.getText()));
		//p.setmCon(p.getCon()/4);
		//tfModificador.setText(Integer.toString(p.getmCon()));
		
		
	}
	
	

}
