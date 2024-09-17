package studentRecordsBackupTree.driver;
import studentRecordsBackupTree.util.*;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * @author Ritika Kale
 *
 */
public class Driver{
	public static FileProcessor fp;
	public static Results res;
	public static IntermediateClass imc;
	public static MyLogger log;

	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

	   if (args.length != 5 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")
				|| args[3].equals("${arg3}") || args[4].equals("${arg4}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 5 argumnets.");
			System.exit(0);
		}
		
		System.out.print("Hello World! Lets get started with the assignment");
         
        try{
        imc = new IntermediateClass();  
		fp = new FileProcessor(args[2]);    // To pass error file
		log = new MyLogger();
        
		//log.setDebugValue (args[3]);
		imc.setInputFileName(args[0]);
		imc.processInput();


	    res = new Results(args[1]);
		IntermediateClass.updatedvalue = Integer.parseInt(args[4]);
		imc.printData(res);
		imc.printSum(res);
		imc.printUpdatedSum(res);
		imc.printSum(res);
        System.out.println("\n");

		BufferedReader in = new BufferedReader(new FileReader("bstOutput.txt"));
        String line = in.readLine();
        while(line != null)
        {
             System.out.println(line);
             line = in.readLine();
        }
           in.close();

		}catch(Exception e)
		{
			fp.write("Processing error "+ e.getMessage()+ "\n");
		}
		finally
		{
           
		}

	}

}