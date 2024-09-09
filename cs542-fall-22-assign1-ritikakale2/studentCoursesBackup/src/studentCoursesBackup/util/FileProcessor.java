package studentCoursesBackup.util;

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


import java.io.*;


public class FileProcessor {
	
	
    public HashMap<String, ArrayList<Integer>> readStudentInput(String fileName) {
		
		HashMap<String, ArrayList<Integer>> courseEnrolled = new HashMap<String, ArrayList<Integer>>();
		try {
			
			File file = new File(fileName);      // creates a new file instance
			FileReader fr = new FileReader(file);        // reads the file
			BufferedReader br = new BufferedReader(fr);    // creates a buffering character input
			StringBuffer sb = new StringBuffer();         // constructs a string buffer with no
			String line;
			
			while ((line = br.readLine()) != null) {
				String[] l = line.split(":");
				courseEnrolled.put(l[0], new ArrayList<Integer> (Arrays.asList(Integer.parseInt(l[1]),Integer.parseInt(l[2]))));
			}
			
			fr.close(); // closes the stream and release the resources
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return courseEnrolled;
	}
	
}
