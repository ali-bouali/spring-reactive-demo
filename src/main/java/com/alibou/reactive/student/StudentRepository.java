package com.alibou.reactive.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

// @Repository
public interface StudentRepository extends ReactiveCrudRepository<Student, Long> {

  Flux<Student> findAllByFirstnameContainingIgnoreCase(String firstname);

}
