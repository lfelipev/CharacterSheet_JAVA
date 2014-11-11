package Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Personagem.Personagem;

public class FileManager {
	
	public void createFile(Personagem p) {
		
		File personagem = new File("../Interface TEste/file.txt");
		
		try {
			personagem.createNewFile();
			FileWriter fw = new FileWriter(personagem);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("#####################################################################");
			bw.newLine();
			bw.write("##### Nome do Personagem: "+p.getNomeDoPersonagem()+" ### Nível: "+p.getNivel()+" ### Idade: "+p.getIdade());
			bw.newLine();
			bw.write("##### FOR "+p.getFor()+" ### Mod: "+p.getmFor());
			bw.newLine();
			bw.write("##### CON "+p.getCon()+" ### Mod: "+p.getmCon());
			bw.newLine();
			bw.write("##### DES "+p.getDes()+" ### Mod: "+p.getmDes());
			bw.newLine();
			bw.write("##### INT "+p.getInt()+" ### Mod: "+p.getmInt());
			bw.newLine();
			bw.write("##### SAB "+p.getSab()+" ### Mod: "+p.getmSab());
			bw.newLine();
			bw.write("##### CAR "+p.getCar()+" ### Mod: "+p.getmCar());
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		personagem.mkdir();
		System.out.println("gerado");
	}
	

}
