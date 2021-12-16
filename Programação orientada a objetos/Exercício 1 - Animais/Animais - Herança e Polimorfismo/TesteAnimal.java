package POO.heranca.polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		cachorro animal1 = new cachorro("Pepita","2","latir","correr");
		cavalo animal2 = new cavalo("Joãozinho","4","relinchar","correr");
		preguica animal3 = new preguica("Tina","6","guinchar","subir em árvores");
		
		System.out.println("\nColetando dados dos animais...");
		System.out.println("\nO animal é: "+animal1.getNomeClasse()+"\nO nome é: "+animal1.getNome()+"\nCom a idade de: "+animal1.getIdade()+" anos\nO som que o animal emite é: "+animal1.getSom()+"\nE sua característica é: "+animal1.getCaracteristica());
		System.out.println("\nO animal é: "+animal2.getNomeClasse()+"\nO nome é: "+animal2.getNome()+"\nCom a idade de: "+animal2.getIdade()+" anos\nO som que o animal emite é: "+animal2.getSom()+"\nE sua característica é: "+animal2.getCaracteristica());
		System.out.println("\nO animal é: "+animal3.getNomeClasse()+"\nO nome é: "+animal3.getNome()+"\nCom a idade de: "+animal3.getIdade()+" anos\nO som que o animal emite é: "+animal3.getSom()+"\nE sua característica é: "+animal3.getCaracteristica());
		System.out.println("\nFim do programa. Todos os dados foram exibidos.");
	}

}
