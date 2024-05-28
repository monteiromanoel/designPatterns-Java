package factoryMethod.problema;

import factoryMethod.ProdutoDigital;
import factoryMethod.ProdutoFisico;

public class TesteProduto {
	public static void main(String[] args) {
		
		ProdutoFisico pf = new ProdutoFisico();
		pf.setPossuiDimensoesFisicas(true);
		
		ProdutoDigital pd = new ProdutoDigital();
		pd.setPossuiDimensoesFisicas(false);	
	}
}
