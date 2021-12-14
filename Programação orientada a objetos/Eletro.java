/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
*/

package POO;

public class Eletro {

	// Declarando atributos da classe
	
	private String tipo;
	private String tamanho;
	private String cor;
	private String fabricacao;
	private String lote;
	
	// Declarando m�todo construtor
	public Eletro(String tipo, String tamanho, String cor, String fabricacao, String lote)
	{
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.cor = cor;
		this.fabricacao = fabricacao;
		this.lote = lote;
	}
	
	// Declara��o dos demais m�todos da classe
	public void imprimirInfo()
	{
		System.out.println("\nConsultando informa��es sobre o eletr�nico...\n\nO tipo do eletr�nico �: "+tipo+"\nCom o tamanho de: "+tamanho+"\nCor: "+cor+"\nAno de fabrica��o: "+fabricacao+"\nLote: "+lote);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(String fabricacao) {
		this.fabricacao = fabricacao;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}
	
	
}
