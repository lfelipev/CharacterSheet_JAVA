package Personagem;

public class Personagem {
	private String nomeDoPersonagem;
	private String idade;
	private int nivel = 1;
	
	//atributos, modificadores
	private int For, mFor;
	private int Con, mCon;
	private int Des, mDes;
	private int Int, mInt;
	private int Sab, mSab;
	private int Car, mCar;
	
	//17 perícias
	private int acrobacia;
	private boolean acrobaciaDone = false;
	
	public void setNomeDoPersonagem(String nomeDoPersonagem) {
		this.nomeDoPersonagem = nomeDoPersonagem;
	}
	
	public String getNomeDoPersonagem() {
		return this.nomeDoPersonagem;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getFor() {
		return For;
	}

	public void setFor(int for1) {
		For = for1;
	}

	public int getCon() {
		return Con;
	}

	public void setCon(int con) {
		Con = con;
	}

	public int getDes() {
		return Des;
	}

	public void setDes(int des) {
		Des = des;
	}

	public int getInt() {
		return Int;
	}

	public void setInt(int i) {
		Int = i;
	}

	public int getSab() {
		return Sab;
	}

	public void setSab(int sab) {
		Sab = sab;
	}

	public int getCar() {
		return Car;
	}

	public void setCar(int car) {
		Car = car;
	}

	public int getmCar() {
		return mCar;
	}

	public void setmCar(int mCar) {
		this.mCar = mCar;
	}

	public int getmSab() {
		return mSab;
	}

	public void setmSab(int mSab) {
		this.mSab = mSab;
	}

	public int getmInt() {
		return mInt;
	}

	public void setmInt(int mInt) {
		this.mInt = mInt;
	}

	public int getmDes() {
		return mDes;
	}

	public void setmDes(int mDes) {
		this.mDes = mDes;
	}

	public int getmCon() {
		return mCon;
	}

	public void setmCon(int mCon) {
		this.mCon = mCon;
	}

	public int getmFor() {
		return mFor;
	}

	public void setmFor(int mFor) {
		this.mFor = mFor;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public int getAcrobacia() {
		return acrobacia;
	}

	public void setAcrobacia(int acrobacia) {
		this.acrobacia = acrobacia;
	}

	public boolean isAcrobaciaDone() {
		return acrobaciaDone;
	}

	public void setAcrobaciaDone(boolean acrobaciaDone) {
		this.acrobaciaDone = acrobaciaDone;
	}

}
