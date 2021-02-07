package com.Entity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Entity.Object.Student;
import com.Entity.ObjectDAO.StudentDao;

@Service
@Transactional
public class Serviceimpl implements ServiceDAO {
	
	StudentDao dao;
	
	@Autowired
	public void setDAO(StudentDao s){
		this.dao = s;
	}
	
	public void addStudent(Student s) {
		dao.addStudent(s);
	}

	public void deleteStudent(int id) {
		dao.deleteStudent(id);
	}

	public List<Student> showStudents() {
		return dao.showStudents();
	}

}
