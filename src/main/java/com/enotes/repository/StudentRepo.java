package com.enotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enotes.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
