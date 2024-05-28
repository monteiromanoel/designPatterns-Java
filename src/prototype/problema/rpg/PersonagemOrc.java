package prototype.problema.rpg;

import prototype.rpg.ClassePersonagemEnum;
import prototype.rpg.FichaPersonagem;

public class PersonagemOrc extends FichaPersonagem{
	
	public PersonagemOrc(){
		setNome("Razuurl");
		setRaca("Orc");
		setLevel(10);
		setClasse(ClassePersonagemEnum.GUERREIRO);
	}

}
