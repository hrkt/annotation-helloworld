package io.hrkt.annotation_helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.hrkt.annotation_helloworld.annotation.PrintHelloWorld;

@SpringBootApplication
public class Main implements CommandLineRunner{
    
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

    @Override
    @PrintHelloWorld
    public void run(String... args) throws Exception {
    }
}
