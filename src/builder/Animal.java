package builder;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Animal {

	private String especie;
	private String cor;
	private String raca;

}
