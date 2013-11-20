package com.jokul.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;// ID
	@Column(name = "student_no")
	private Integer studentNo;// 学号
	@Column(name = "name")
	private String name;// 姓名
	
	@Column(name = "sex")
	private String sex;// 性别
	
	@Column(name = "birthdate")
	private Date birthdate;// 出生日期
	
	@Column(name = "card_no")
	private String cardNo;// 身份证号
	
	@Column(name = "department")
	private String department;// 院、系
	
	@Column(name = "major")
	private String major;// 专业
	
	@Column(name = "grade")
	private String grade;// 班级
	
	@Column(name = "join_date")
	private Date joinDate;// 入学时间
	
	@Column(name = "education")
	private String education;// 学历
	
	@Column(name = "photo")
	private String photo;// 照片

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(Integer studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
