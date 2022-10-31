package io.github.palio2012;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

@Configuration
public class AnimalConfiguration {

    @Bean (name = "dog")
    public Animal dog() {
        return new Animal() {
            @Override
            public void makingNoise() {
                System.out.println("Bark Bark");
            }
        };
    }
    @Bean (name = "cat")
    public Animal cat () {
        return new Animal() {
            @Override
            public void makingNoise() {
                System.out.println("Miau Miau");
            }
        };
    }
}
