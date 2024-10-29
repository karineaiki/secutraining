package com.example.secutraining;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.secutraining.entities.DemoEntity;
import com.example.secutraining.entities.Role;
import com.example.secutraining.repositories.DemoRepository;
import com.example.secutraining.repositories.RoleRepository;

@SpringBootApplication
public class SecutrainingApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "dev");
		SpringApplication.run(SecutrainingApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(DemoRepository demoRepository, RoleRepository roleRepository) {
		return args -> {
			demoRepository.save(new DemoEntity("Tacos"));

			Role roleUser = new Role();
			roleUser.setName("ROLE_USER");
			roleRepository.save(roleUser);
			Role roleAdmin = new Role();
			roleAdmin.setName("ROLE_ADMIN");
			roleRepository.save(roleAdmin);
		};
	}

}
