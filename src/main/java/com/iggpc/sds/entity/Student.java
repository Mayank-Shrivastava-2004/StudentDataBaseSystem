package com.iggpc.sds.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name ="enrollmentNo",nullable = false)
	private String enrollmentNo;

	@Column(name ="rollNo",nullable = false)
	private String rollNo;

	@Column(name ="first_name",nullable = false)
	private String firstname;

	@Column(name ="last_name")
	private String lastname;

	@Column(name ="fathers_name")
	private String fathersName;

	@Column(name ="phoneNo")
	private String phoneNo;

	@Column(name ="gender")
	private String gender;

	@Column(name="DOB")
	private String dob;

	@Column(name="Email")
	private String email;
	
	public Student() {
		
	}

	public Student(Long id, String enrollmentNo, String rollNo, String firstname, String lastname, String fathersName, String phoneNo, String gender, String dob, String email) {
		this.id = id;
		this.enrollmentNo = enrollmentNo;
		this.rollNo = rollNo;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fathersName = fathersName;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
