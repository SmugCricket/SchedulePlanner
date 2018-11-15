import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SchedulePlanner {
	private ArrayList<Course> classesForMajor = new ArrayList<Course>();
	// read in a list of classes required courses
	public void loadCourses() {
		String txtSplitBy = ", ";
		String courseName = "";
		String courseID = "";
		double creditHours = 0.0;
		
			FileReader reader;
			try {
				reader = new FileReader("BiologicalEngineeringCourses.txt");
				Scanner in = new Scanner (reader);
				
				while(in.hasNextLine()) {
					String line = in.nextLine();
					String[] currentLine = line.split(txtSplitBy);
					
					courseID = currentLine[0];
					courseName = currentLine[1];
					creditHours = Double.parseDouble(currentLine[3]);
					
					classesForMajor.add(new Course(courseName, courseID, creditHours));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	
	// compare to a list of courses that have already been taken
	// generate a schedule based on some constraints, number of desired semesters etc.
	// must know what the prerequisites to each class are
	}
	
