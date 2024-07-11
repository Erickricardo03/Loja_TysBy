package loja_virtual_TysBy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "loja_virtual_TysBy.model")
@ComponentScan(basePackages = "loja_virtual_TysBy.*")
@EnableJpaRepositories(basePackages = {"loja_virtual_TysBy.repository"})
@EnableTransactionManagement
@Service
@Repository
public class LojaTysByApplication {


	public static void main(String[] args) {
		SpringApplication.run(LojaTysByApplication.class, args);
	}

}
