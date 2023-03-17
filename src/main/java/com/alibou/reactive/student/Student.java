package com.alibou.reactive.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Builder
@Table("student")
public class Student {

  @Id
  private Long id;
  private String firstname;
  private String lastname;
  private int age;

}
