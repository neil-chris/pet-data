package sheridan.chrisnei.assingment2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class PetDataApplication {

    public static void main(String[] args) {
        log.info("Invoked PetDataApplication.main()");
        SpringApplication.run(PetDataApplication.class, args);
    }

}
