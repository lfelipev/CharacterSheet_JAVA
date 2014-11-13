package Personagem;

public class Personagem {
	private String nomeDoPersonagem;
	private String idade;
	private int nivel;
	
	//atributos, modificadores
	//iniciativa
	private int For, mFor;
	private int Con, mCon;
	private int Des, mDes;
	private int Int, mInt;
	private int Sab, mSab;
	private int Car, mCar;
	private int Iniciativa;
	
	//17 perícias
	private int acrobacia;
	private int arcanismo;
	private int atletismo;
	private int blefe;
	private int diplomacia;
	private int exploracao;
	private int furtividade;
	private int historia;
	private int intimidacao;
	private int intuicao;
	private int ladinagem;
	private int manha;
	private int natureza;
	private int percepcao;
	private int religiao;
	private int socorro;
	private int tolerancia;
	
	public Personagem() {
		this.nomeDoPersonagem = "0";
		this.idade = "0";
		this.nivel = 0;
		this.For = 0;
		this.Con = 0;
		this.Des = 0;
		this.Int = 0;
		this.Sab = 0;
		this.Car = 0;
		this.mFor = 0;
		this.mCon = 0;
		this.mDes = 0;
		this.mInt = 0;
		this.mSab = 0;
		this.mCar = 0;
		this.Iniciativa = 0;
		this.acrobacia = 0;
		this.arcanismo = 0;
		this.atletismo = 0;
		this.blefe = 0;
		this.diplomacia = 0;
		this.setExploracao(0);
		this.furtividade = 0;
		this.historia = 0;
		this.intuicao = 0;
		this.ladinagem = 0;
		this.manha = 0;
		this.natureza = 0;
		this.percepcao = 0;
		this.religiao = 0;
		this.socorro = 0;
		this.tolerancia = 0;
	}
	
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

	public int getIniciativa() {
		return Iniciativa;
	}

	public void setIniciativa(int iniciativa) {
		Iniciativa = iniciativa;
	}

	public int getTolerancia() {
		return tolerancia;
	}

	public void setTolerancia(int tolerancia) {
		this.tolerancia = tolerancia;
	}

	public int getArcanismo() {
		return arcanismo;
	}

	public void setArcanismo(int arcanismo) {
		this.arcanismo = arcanismo;
	}

	public int getAtletismo() {
		return atletismo;
	}

	public void setAtletismo(int atletismo) {
		this.atletismo = atletismo;
	}

	public int getBlefe() {
		return blefe;
	}

	public void setBlefe(int blefe) {
		this.blefe = blefe;
	}

	public int getDiplomacia() {
		return diplomacia;
	}

	public void setDiplomacia(int diplomacia) {
		this.diplomacia = diplomacia;
	}

	public int getFurtividade() {
		return furtividade;
	}

	public void setFurtividade(int furtividade) {
		this.furtividade = furtividade;
	}

	public int getHistoria() {
		return historia;
	}

	public void setHistoria(int historia) {
		this.historia = historia;
	}

	public int getIntimidacao() {
		return intimidacao;
	}

	public void setIntimidacao(int intimidacao) {
		this.intimidacao = intimidacao;
	}

	public int getIntuicao() {
		return intuicao;
	}

	public void setIntuicao(int intuicao) {
		this.intuicao = intuicao;
	}

	public int getLadinagem() {
		return ladinagem;
	}

	public void setLadinagem(int ladinagem) {
		this.ladinagem = ladinagem;
	}

	public int getNatureza() {
		return natureza;
	}

	public void setNatureza(int natureza) {
		this.natureza = natureza;
	}

	public int getManha() {
		return manha;
	}

	public void setManha(int manha) {
		this.manha = manha;
	}

	public int getPercepcao() {
		return percepcao;
	}

	public void setPercepcao(int percepcao) {
		this.percepcao = percepcao;
	}

	public int getReligiao() {
		return religiao;
	}

	public void setReligiao(int religiao) {
		this.religiao = religiao;
	}

	public int getSocorro() {
		return socorro;
	}

	public void setSocorro(int socorro) {
		this.socorro = socorro;
	}

	public int getExploracao() {
		return exploracao;
	}

	public void setExploracao(int exploracao) {
		this.exploracao = exploracao;
	}

}
