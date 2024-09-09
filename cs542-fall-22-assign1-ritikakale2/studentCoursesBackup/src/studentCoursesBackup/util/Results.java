package studentCoursesBackup.util;
import java.util.LinkedHashMap;
import java.io.FileWriter;
public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	
    //StudentImpl studImpl = new StudentImpl();

    FileWriter fw=null;
    public void printLogs(String msg) {

        try{
            fw = new FileWriter("errorLog.txt",true);
            fw.write(msg);;
            fw.write("\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }

    public void printCourses(int id, LinkedHashMap<Integer,String> courseEnrolled, double capacity) {
		System.out.println("ID : " + id + " " + ":: Courses : "+ courseEnrolled.values() + ":: Satisfaction rate : "  +String.format("%.2f",capacity)); // to print output 
        	
	}
}

