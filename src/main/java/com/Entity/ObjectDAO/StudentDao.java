package com.Entity.ObjectDAO;

import java.util.List;

import com.Entity.Object.Student;

public interface StudentDao {
	public void addStudent(Student s);
	public void deleteStudent(int id);
	public List<Student> showStudents();
}
