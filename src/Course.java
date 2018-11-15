import java.util.*;

public class Course {
	private ArrayList<Course> prereqs;
	public String courseName;
	public String courseID;
	private double creditHours;
	private String semesterOffered;
	
	public Course(String name, String ID, double credit) {
		this.prereqs = new ArrayList<Course>();
		this.courseName = name;
		this.courseID = ID;
		this.creditHours = credit;
//		this.semesterOffered = semester;
	}
	
	public void setPrereqs(ArrayList<Course> p) {
		this.prereqs = p;
	}
}
