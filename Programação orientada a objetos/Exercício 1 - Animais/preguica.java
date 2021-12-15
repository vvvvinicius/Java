package POO.heranca;

public class preguica extends Animal {
	
	// Declarando atributos da classe preguica
	private String subirArvore;
	
	// Declarando m�todo construtor
	public preguica(String nome, String idade, String som, String subirArvore)
	{
		// Declarando o uso da superclasse
		super(nome, idade, som);
		this.subirArvore = subirArvore;
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nConsultando dados da pregui�a...\n\nO nome da pregui�a �: "+getNome()+"\nEla tem: "+getIdade()+" anos\nO som que emite �: "+getSom()+"\nE sua caracter�stica �: "+subirArvore);
	}
	
}
