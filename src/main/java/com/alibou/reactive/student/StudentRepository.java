package com.alibou.reactive.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student, Long> {

  Flux<Student> findAllByFirstnameContainingIgnoreCase(String firstname);

}
