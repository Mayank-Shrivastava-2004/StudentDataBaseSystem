package com.iggpc.sds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iggpc.sds.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
