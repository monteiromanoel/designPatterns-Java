package factoryMethod.solucao;

import factoryMethod.Produto;
import factoryMethod.ProdutoDigital;
import factoryMethod.ProdutoFisico;
import factoryMethod.ProdutoServico;
import factoryMethod.TipoProdutoEnum;

public class ProdutoFactory {

	// Classe estática responsável por retornar uma instância de um objeto baseado no tipo dele.
	public static Produto getInstance(TipoProdutoEnum tipo) {

		switch (tipo) {
			case FISICO:
				ProdutoFisico produtoFisico = new ProdutoFisico();
				produtoFisico.setPossuiDimensoesFisicas(true);
				return produtoFisico;
			case DIGITAL:
				ProdutoDigital produtoDigital = new ProdutoDigital();
				produtoDigital.setPossuiDimensoesFisicas(false);
				return produtoDigital;
			case SERVICO:
				ProdutoServico produtoServico = new ProdutoServico();
				produtoServico.setPossuiDimensoesFisicas(false);
				return produtoServico;
			default:
				throw new IllegalArgumentException("Tipo de produto inválido");
		}
	}

}
