package prototype.rpg;

public class FichaPersonagem {

	private String nome;
	private String raca;
	private int level;
	private ClassePersonagemEnum classe;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ClassePersonagemEnum getClasse() {
		return classe;
	}

	public void setClasse(ClassePersonagemEnum classe) {
		this.classe = classe;
	}

}
