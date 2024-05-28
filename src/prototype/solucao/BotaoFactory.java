package prototype.solucao;

import prototype.Botao;

public class BotaoFactory {
	
	public static Botao getInstance(Botao prototype){
		Botao clone = new Botao();
		clone.setAltura(prototype.getAltura());
		clone.setCor(prototype.getCor());
		clone.setLargura(prototype.getLargura());
		clone.setTipoBorda(prototype.getTipoBorda());
		return clone;
	}
}
