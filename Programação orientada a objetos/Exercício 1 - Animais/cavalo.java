package POO.heranca;

public class cavalo extends Animal {
	
		// Declarando atributos da classe cavalo
		private String corre;
	
		// Declarando m�todo construtor
		public cavalo (String nome, String idade, String som, String corre)
	{
		// Declarando o uso da superclasse
		super(nome,idade,som);
		this.corre = corre;
	}
	
		// Declara��o dos demais m�todos da classe
		
		public void imprimirInfo()
		{
			System.out.println("\nConsultando dados do cavalo...\n\nO nome do cavalo �: "+getNome()+"\nEle tem: "+getIdade()+" anos\nO som que emite �: "+getSom()+"\nE sua caracter�stica �: "+corre);
		}
		
		public String getCorre() {
		return corre;
	}
		public void setCorre(String corre) {
		this.corre = corre;
	}
	
	
}
