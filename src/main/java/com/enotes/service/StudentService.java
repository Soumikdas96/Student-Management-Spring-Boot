package com.enotes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enotes.entity.Student;
import com.enotes.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	
	public void addStudent(Student s)
	{
		repo.save(s);
	}
	
	public List<Student> getAllStudents()
	{
		return repo.findAll();
	}
	
	public Student getStuById(int id)
	{
		Optional<Student> s = repo.findById(id);
		if(s.isPresent())
		{
			return s.get();
		}
		else
		{
			return null;
		}
	}
	
	public void deleteStu(int id)
	{
		repo.deleteById(id);
	}
	
}
