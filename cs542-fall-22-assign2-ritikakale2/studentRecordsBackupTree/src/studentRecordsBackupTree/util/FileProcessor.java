package studentRecordsBackupTree.util;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class FileProcessor {
    String fileName;

    FileWriter fw = null;
    FileOutputStream fo = null;
    public FileProcessor(String fileName)
    {
        try{
            fo = new FileOutputStream(fileName);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
	
    public void write(String msg)
    {
        try{
            byte[] bytes = msg.getBytes();
            fo.write(bytes);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
}
