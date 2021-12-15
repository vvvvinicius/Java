package POO.heranca;

public class testeAnimais {

	public static void main(String[] args) {
		
		cachorro cachorro = new cachorro("Pepita","2","latir","correr");
		cachorro.imprimirInfo();
		cavalo cavalo = new cavalo("Joãozinho","4","relinchar","correr");
		cavalo.imprimirInfo();
		preguica preguica = new preguica("Tina","6","guinchar","subir em árvores");
		preguica.imprimirInfo();
	}

}
