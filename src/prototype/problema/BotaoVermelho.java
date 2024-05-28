package prototype.problema;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao{
	
	public BotaoVermelho(){
		setCor("Vermelho");
		setAltura(30);
		setLargura(90);
		setTipoBorda(TipoBordaEnum.FINA);
	}
}
