package prototype;

import prototype.solucao.BotaoRegistry;

public class TesteBotaoPrototype {

	public static void main(String[] args) {
		
		// Criação de vários botões usando apenas o clone configurado

		Botao botaoVermelho = BotaoRegistry.getBotao("BTN_VERMELHO");
		System.out.println(botaoVermelho);
		
		Botao botaoAzul = BotaoRegistry.getBotao("BTN_AZUL");
		System.out.println(botaoAzul);
		
		Botao botaoAmarelo = BotaoRegistry.getBotao("BTN_AMARELO");
		System.out.println(botaoAmarelo);
		// Demonstração da alteração de um dos botões.
		botaoAmarelo.setTipoBorda(TipoBordaEnum.FINA);
		botaoAmarelo.setAltura(100);
		System.out.println(botaoAmarelo);
		
		// Criação de um novo botão azul
		Botao botaoAzul2 = BotaoRegistry.getBotao("BTN_AZUL");
		System.out.println(botaoAzul2);
		botaoAzul2.setTipoBorda(TipoBordaEnum.TRACEJADA);
		System.out.println(botaoAzul2);
		
		// Passagem dos parametros pelo para a criação de um novo botão que não existe no map
		String chave = "BTN_PRETO";
		Botao botaoPreto = new Botao();
		botaoPreto.setCor("Preto");
		botaoPreto.setLargura(200);
		botaoPreto.setAltura(50);
		botaoPreto.setTipoBorda(TipoBordaEnum.FINA);
		
		BotaoRegistry.addRegistry(chave, botaoPreto);
		
		// Criação da instância do clone do botão.
		Botao botaoPretoAdicionado = BotaoRegistry.getBotao("BTN_PRETO");
		System.out.println(botaoPretoAdicionado);
	}
}
