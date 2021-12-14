/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
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
	
	// Declarando método construtor
	public Eletro(String tipo, String tamanho, String cor, String fabricacao, String lote)
	{
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.cor = cor;
		this.fabricacao = fabricacao;
		this.lote = lote;
	}
	
	// Declaração dos demais métodos da classe
	public void imprimirInfo()
	{
		System.out.println("\nConsultando informações sobre o eletrônico...\n\nO tipo do eletrônico é: "+tipo+"\nCom o tamanho de: "+tamanho+"\nCor: "+cor+"\nAno de fabricação: "+fabricacao+"\nLote: "+lote);
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
