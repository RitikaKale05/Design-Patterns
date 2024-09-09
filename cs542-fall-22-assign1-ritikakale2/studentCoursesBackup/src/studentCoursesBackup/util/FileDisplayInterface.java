package studentCoursesBackup.util;

import java.util.LinkedHashMap;

public interface FileDisplayInterface {
	
	public void printCourses(int id, LinkedHashMap<Integer,String> courseEnrolled, double capacity);
}
