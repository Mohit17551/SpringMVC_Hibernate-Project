package com.Entity.Service;

import java.util.List;

import com.Entity.Object.Student;

public interface ServiceDAO {
	public void addStudent(Student s);
	public void deleteStudent(int id);
	public List<Student> showStudents();
}
