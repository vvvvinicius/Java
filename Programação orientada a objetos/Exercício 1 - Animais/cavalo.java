package POO.heranca;

public class cavalo extends Animal {
	
		// Declarando atributos da classe cavalo
		private String corre;
	
		// Declarando método construtor
		public cavalo (String nome, String idade, String som, String corre)
	{
		// Declarando o uso da superclasse
		super(nome,idade,som);
		this.corre = corre;
	}
	
		// Declaração dos demais métodos da classe
		
		public void imprimirInfo()
		{
			System.out.println("\nConsultando dados do cavalo...\n\nO nome do cavalo é: "+getNome()+"\nEle tem: "+getIdade()+" anos\nO som que emite é: "+getSom()+"\nE sua característica é: "+corre);
		}
		
		public String getCorre() {
		return corre;
	}
		public void setCorre(String corre) {
		this.corre = corre;
	}
	
	
}
