package com.Entity.Object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity(name = "student")
@Table(name="project")
public class Student {
	
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	
	@NotNull(message = "Enter some value")
	@Size(min=2, message = "Enter more")
	@Column(name="fname")
	String fname;
	
	@NotNull(message = "Enter some value")
	@Size(min=2, message = "Enter more")
	@Column(name="lname")
	String lname;
	
	@NotNull(message = "Enter email")
	@Email(message= "Enter email")
	@Pattern(regexp=".+@.+\\..+", message="Please provide a valid email address")
	@Column(name="email")
	String email;

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Student(){
		
	}

	public Student( String fname, String lname, String email) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	
}
