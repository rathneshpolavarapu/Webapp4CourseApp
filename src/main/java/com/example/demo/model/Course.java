package com.example.demo.model;

public class Course {

	private String courseId;
	private String courseName;
	private Double coursePrice;
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(Double coursePrice) {
		this.coursePrice = coursePrice;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice + "]";
	}
	public Course(String courseId, String courseName, Double coursePrice) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
