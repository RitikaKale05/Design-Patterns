package studentCoursesBackup.driver;
import studentCoursesBackup.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.io.BufferedWriter;
import java.io.PrintStream;


/**
 * @author Ritika Kale
 *
 */



class StudentImpl {
	
	int id;
	double capacity; //this is students property so have to take students prefrences taken in ArrayList so we can access it there
	static float average=0;
	static int noOfStudents=0;
	
	ArrayList<String> courseList = new ArrayList<String>();
	
	public StudentImpl(int id, ArrayList<String> courseList) {
		super();
		this.id = id;
		this.courseList = courseList;
	}

	//this needs to be made static so that u can save memory because this is same for every stud
	static HashMap<String, ArrayList<Integer>> courses = new HashMap<>();
	LinkedHashMap<Integer,String> courseEnrolled = new LinkedHashMap<>(); //  used this because it dont accept duplicate key or values
	
	FileProcessor fileProcessor = new FileProcessor();
	Results results = new Results();
	public void enrollCourses() {
		int i=0;
		for(String c: courseList) {
			
			if(courses.get(c).get(0) != 0 ) {
				
				int time = courses.get(c).get(1);
			
				if(! courseEnrolled.containsKey(time)) {
					courseEnrolled.put(time, c);
					courses.replace(c,new ArrayList<Integer>(Arrays.asList(courses.get(c).get(0)-1 , time)));
					this.capacity += 9-i;
						
				}
				else {
					results.printLogs("Time Overlapped for : " + courseEnrolled.get(c));
				}
			    if(courseEnrolled.size() == 3) {
				   break;
			    }
			}
		    else {
				results.printLogs("Seats are Fulled for Course" + courseEnrolled.get(c));
			}i++;
		}
		average += this.capacity/3;
		noOfStudents++;
	}

	/**
	* @return id 
	*/
	public int getId() {
		return id;
	}
    
	/**
	* @ return the satisfaction rate for each student
	*/

	public double getCapacity() {
		return capacity/3;
	}
}

public class Driver {

	
	
	public static void main(String[] args) throws IOException {
		
		if (args.length != 5 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")
				|| args[3].equals("${arg3}") || args[4].equals("${arg4}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 5 argumnets.");
			System.exit(0);
		}
		//System.out.println(args[0]);
		
		FileProcessor fileProcess = new FileProcessor();
		Results result = new Results();
		StudentImpl.courses = fileProcess.readStudentInput(args[0]);
		
		FileReader fr = null;
		try {

			File file = new File(args[1]); // creates a new file instance
			fr = new FileReader(file); // reads the file
			BufferedReader br = new BufferedReader(fr);
			PrintStream myconsole = new PrintStream(new File(args[2]));
			System.setOut(myconsole);

			String line;

			while ((line = br.readLine()) != null) {

				String[] l = line.split(" ");
				String[] s =  Arrays.copyOfRange(l, 1, 8);
				 
				StudentImpl stud = new StudentImpl(Integer.parseInt(l[0]), new ArrayList<String> (Arrays.asList(s)));
				stud.enrollCourses();
				result.printCourses(stud.getId(),stud.courseEnrolled,stud.getCapacity());
				
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Average Satisfaction: " + String.format("%.2f",StudentImpl.average / StudentImpl.noOfStudents));
			fr.close(); 
		}
	}
}
