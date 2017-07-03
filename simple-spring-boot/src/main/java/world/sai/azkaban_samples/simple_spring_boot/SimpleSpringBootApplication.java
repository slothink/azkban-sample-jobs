package world.sai.azkaban_samples.simple_spring_boot;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class SimpleSpringBootApplication {
    public static void main(String[] args) {
        try {
            String batchId = UUID.randomUUID().toString();

            SpringApplication app = new SpringApplication(SimpleSpringBootApplication.class);
            app.setWebEnvironment(false);
            ConfigurableApplicationContext context = app.run(args);
            System.exit(0);
        } catch (RuntimeException e) {
            System.exit(1);
        }
    }
}