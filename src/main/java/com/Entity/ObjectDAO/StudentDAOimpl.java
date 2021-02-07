package com.Entity.ObjectDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.Object.Student;

@Repository
public class StudentDAOimpl implements StudentDao {
	
	@Autowired
	private SessionFactory sf;
	
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	public void addStudent(Student s) {
		getSession().save(s);
	}

	public void deleteStudent(int id) {
		Student s = getSession().get(Student.class, id);
		getSession().delete(s);
	}
	
	public List<Student> showStudents() {
		List<Student> s2 = 	(List<Student>) getSession().createQuery("from com.Entity.Object.Student",Student.class).list();
		return s2;
	}

}
