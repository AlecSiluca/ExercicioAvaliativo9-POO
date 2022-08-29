package entities;

import java.text.SimpleDateFormat;

public class Produto {

	private static final SimpleDateFormat sdf = new SimpleDateFormat();
	
	private String nome;
	private Double preco;
	
	public Produto() {}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() { 
		return nome+" $"+String.format("%.2f", preco);
	}
}