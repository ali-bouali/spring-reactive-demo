package com.alibou.reactive;

import com.alibou.reactive.student.Student;
import com.alibou.reactive.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(StudentRepository repository) {
		return args -> {
			for (int i = 0; i < 3000; i++) {
				repository.save(
						Student.builder()
								.firstname("Test" + i)
								.lastname("test" + i)
								.age(i)
								.build()
				).subscribe();
			}
		};
	}

}
