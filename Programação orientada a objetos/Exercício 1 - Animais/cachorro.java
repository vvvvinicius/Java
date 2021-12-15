package POO.heranca;

public class cachorro extends Animal {
	
	// Declarando atributos da classe preguica
	private String corre;
	
	// Declarando m�todo construtor
	public cachorro (String nome, String idade, String som, String corre)
	{
		// Declarando o uso da superclasse
		super(nome,idade,som);
		this.corre = corre;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nConsultando dados do cachorro...\n\nO nome do cachorro �: "+getNome()+"\nEle tem: "+getIdade()+" anos\nO som que emite �: "+getSom()+"\nE sua caracter�stica �: "+corre);
	}

	
}
