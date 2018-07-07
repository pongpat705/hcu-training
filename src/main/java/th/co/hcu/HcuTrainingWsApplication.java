package th.co.hcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="th.co.hcu")
public class HcuTrainingWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcuTrainingWsApplication.class, args);
	}
}
