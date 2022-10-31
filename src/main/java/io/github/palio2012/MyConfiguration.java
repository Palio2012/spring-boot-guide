package io.github.palio2012;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class MyConfiguration {

    @Bean
    public CommandLineRunner execute () {
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }

}
