package by.nahodkin.newgolosovaniesbrosuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NewGolosovanieSbrosUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewGolosovanieSbrosUserApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(@Autowired UpdateUserNewGolosovanie updateUserNewGolosovanie) {
        return args -> {
            updateUserNewGolosovanie.update();
        };
    }
}
