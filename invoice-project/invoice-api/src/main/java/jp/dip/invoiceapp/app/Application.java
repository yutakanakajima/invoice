package jp.dip.invoiceapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 */
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

	/**
	 * 
	 *
	 * @param args 
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
