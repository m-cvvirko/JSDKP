package pl.achp.sinktools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.gft.achpayments.sinktools.repository")
public class SinkToolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinkToolsApplication.class, args);
	}

}
