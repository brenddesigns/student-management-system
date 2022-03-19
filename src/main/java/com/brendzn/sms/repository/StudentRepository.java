package com.brendzn.sms.repository;

import com.brendzn.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
