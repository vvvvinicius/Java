package POO.heranca;

public class Animal {

	// Declarando atributos da classe Animal
	
		private String nome;
		private String idade;
		private String som;
	
	// Declarando método construtor
		
	public Animal (String nome, String idade, String som)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}
	
	// Declaração dos demais métodos da classe
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
}
