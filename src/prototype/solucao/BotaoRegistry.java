package prototype.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoRegistry {
	
	private static BotaoRegistry botaoRegistry;
	
	// Map responsável por registrar os protótipos
	private static Map<String, Botao> REGISTRY = new HashMap<>();
	
	static {
		Botao botaoAmarelo = new Botao();
		botaoAmarelo.setCor("Amarelo");
		botaoAmarelo.setLargura(125);
		botaoAmarelo.setAltura(35);
		botaoAmarelo.setTipoBorda(TipoBordaEnum.GROSSA);
		
		Botao botaoVermelho = new Botao();
		botaoVermelho.setCor("Vermelho");
		botaoVermelho.setLargura(100);
		botaoVermelho.setAltura(30);
		botaoVermelho.setTipoBorda(TipoBordaEnum.TRACEJADA);
		
		Botao botaoAzul = new Botao();
		botaoAzul.setCor("Azul");
		botaoAzul.setLargura(150);
		botaoAzul.setAltura(40);
		botaoAzul.setTipoBorda(TipoBordaEnum.FINA);
		
		REGISTRY.put("BTN_AMARELO", botaoAmarelo);
		REGISTRY.put("BTN_VERMELHO", botaoVermelho);
		REGISTRY.put("BTN_AZUL", botaoAzul);
	}
	
	
	
	public static BotaoRegistry getInstance() {
		if (Objects.isNull(botaoRegistry)) {
			botaoRegistry = new BotaoRegistry();
			return botaoRegistry;
		}
		return botaoRegistry;
	}
	
	public static Botao getBotao(String chave) {
		return BotaoFactory.getInstance(REGISTRY.get(chave));
	}

	// Classe para se criar um registro não existente no Map
	public static void addRegistry(String chave, Botao botao) {
		REGISTRY.put(chave, botao);
	}
	

}
