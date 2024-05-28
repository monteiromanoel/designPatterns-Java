package factoryMethod.solucao;

import java.math.BigDecimal;

import factoryMethod.Produto;
import factoryMethod.TipoProdutoEnum;

public class TesteProdutoComFactory {
	public static void main(String[] args) {
		Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
		// instanciando os outros atributos da classe produto
		produtoDigital.setPreco(BigDecimal.valueOf(250.00));
		produtoDigital.setDescricao("Livro Digital");
		
		Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
		
		Produto produtoServico = ProdutoFactory.getInstance(TipoProdutoEnum.SERVICO);
		
		System.out.println(produtoDigital);
		System.out.println(produtoFisico);
		System.out.println(produtoServico);
		
	}
}
