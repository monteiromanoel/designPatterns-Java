package builder.solucao;

import builder.Animal;

public class AnimalComBuilder {
	
	public static void main(String[] args) {
		Animal animal =  Animal
				.builder()
					.especie("Cachorro")
					.cor("Caramelo")
					.raca("Vira Lata")
					.build();
		
		System.out.println(animal);
	}

}
