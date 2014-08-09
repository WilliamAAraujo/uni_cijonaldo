package br.com.curso.jaxb;
import javax.xml.bind.annotation.XmlRootElement;
//Marcacao de elemento principal
@XmlRootElement
public class Produto {
	//Definicao de atributos
	private String nome;
	private String descricao;
	private double preco;
	private Categoria categoria;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

    // Metodo de get e set
	

}
