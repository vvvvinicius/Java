//Crie uma classe patinete e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

package POO;

public class Patinete
{

	// Declarando atributos da classe
	private String lote;
	private String cor;
	private String modelo;
	private String tamanho;
	private String comprador;
	
	// Declarando m�todo construtor
	
	public Patinete (String lote, String cor, String modelo, String tamanho, String comprador)
	{
		this.lote = lote;
		this.cor = cor;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.comprador = comprador;
	}
	
	// Declara��o dos demais m�todos da classe
	
	public void imprimirInfo()
	{
		System.out.println("\nConsultando informa��es sobre o patinete... \n\nLote: "+lote+"\nCor: "+cor+"\nModelo: "+modelo+"\nTamanho: "+tamanho+"\n\nFoi vendido para a "+comprador);
	}
	
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	
}
