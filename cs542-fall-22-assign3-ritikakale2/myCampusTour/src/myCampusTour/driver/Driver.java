package myCampusTour.driver;
import myCampusTour.myTour.*;
import myCampusTour.builderWorkshop.*;
import myCampusTour.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;


/**
 * @author placeholder
 *
 */
public class Driver {
	
	public static void main(String[] args) {
		
		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

	    if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}
		
		System.out.println("Hello World! Lets get started with the assignment");

		try{
                       File file = new File("error.txt");
                       file.createNewFile();
                       FileWriter writer = new FileWriter(file);

                        writer.flush();
                        writer.close();

                    }catch(IOException e){
                         e.printStackTrace();

                    }
		finally
		{
           
		}


      // Using Builder Pattern
 
        System.out.println("\nFor Tour 1");
		Tour tour1 = new Tour("SOM", "onFoot" , "CS542", "eventCenter", "queue");          //passing user choices as enum
		Builder obj = new Builder();                                                       //workshop
		obj.construct(tour1);

		System.out.println("\n------------------------------------------------");
		
		System.out.println("\nFor Tour 2");
		Tour tour2 = new Tour("Watson", "busRide" , "CS540", "univeristyUnion", "online");
		Builder obj1 = new Builder();
		obj.construct(tour2);
		}
}
