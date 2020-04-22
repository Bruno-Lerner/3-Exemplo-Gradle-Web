package lerner.bruno.exemplogradleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 14/04/2020 11:15
 */
@SpringBootApplication
public class ExemplogradlewebApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExemplogradlewebApplication.class, args);

		System.out.println("Exemplo com server TomCat!");
	}
}
