package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{

	private static final SimpleDateFormat sdf = new SimpleDateFormat();
	
	private Date dataFabricao;
	
	public ProdutoUsado() {}

	public ProdutoUsado(String nome, Double preco, Date dataFabricao) {
		super(nome, preco);
		this.dataFabricao = dataFabricao;
	}
	public Date getDataFabricao() {
		return dataFabricao;
	}
	public void setDataFabricao(Date dataFabricao) {
		this.dataFabricao = dataFabricao;
	}
	@Override
	public String toString() {
		return super.getNome()+" (usado) $"+super.getPreco()+" (Data de fabricação: )"+sdf.format(dataFabricao);
	}
}