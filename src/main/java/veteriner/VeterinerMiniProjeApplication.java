package veteriner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"veteriner"})
public class VeterinerMiniProjeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinerMiniProjeApplication.class, args);
	}

}
