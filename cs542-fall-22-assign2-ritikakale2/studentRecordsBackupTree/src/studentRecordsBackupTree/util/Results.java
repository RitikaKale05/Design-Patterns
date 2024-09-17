package studentRecordsBackupTree.util;
import studentRecordsBackupTree.driver.Driver;
import java.io.FileOutputStream;

import java.io.FileWriter;
import java.io.IOException;


public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	String fileName;
    FileWriter fw = null;
    FileOutputStream fo = null;
    public Results(String fileName){
    
    
        try
        {
            fo = new FileOutputStream(fileName);

        }
        catch(IOException e){
               Driver.fp.write("While processing output file: "+e.getMessage()+"\n");
        }
    }
    public void write(String msg)
    {
        try{
            byte[] bytes = msg.getBytes();
            fo.write(bytes);

        }catch (IOException e)
        {
            Driver.fp.write("While processing output file: "+e.getMessage()+"\n");

        }

    }
   
}
