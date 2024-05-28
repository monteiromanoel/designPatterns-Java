package prototype.problema.rpg;

import prototype.rpg.ClassePersonagemEnum;
import prototype.rpg.FichaPersonagem;

public class PersonagemGoblin extends FichaPersonagem {
	
	public PersonagemGoblin(){
		setNome("Urlok");
		setRaca("Goblin");
		setLevel(1);
		setClasse(ClassePersonagemEnum.LADINO);
	}
}
