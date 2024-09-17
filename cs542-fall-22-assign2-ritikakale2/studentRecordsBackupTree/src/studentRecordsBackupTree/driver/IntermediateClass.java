package studentRecordsBackupTree.driver;
import studentRecordsBackupTree.util.FileProcessor;
import studentRecordsBackupTree.util.Results;
import studentRecordsBackupTree.bst.BST;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//An intermediate class or bst builder class used to process input and update the backup class.

public class IntermediateClass {
    BST mainBST = new BST();
    BST backup1 = new BST();
    BST backup2 = new BST(); //Created three instances from one BST class
    String inputFileName;
    static int updatedvalue;

    FileReader fr = null;

    public void processInput()
    {
        System.out.println(inputFileName);
        File file = new File(inputFileName);
        try{
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null)
            {
                mainBST.insertNode(Integer.parseInt(line));
                mainBST.update(Integer.parseInt(line), backup1, backup2);
            } 
        } catch(FileNotFoundException e)
        {
            Driver.fp.write("While processing input file : FileNotFoundException "+e.getMessage()+"\n");
        }
         catch(IOException e)
        {
            Driver.fp.write("While processing input file "+e.getMessage()+"\n");
        }
        finally
        {
            //fr.close(); 
        }
    }

     public void printData(Results res){
        res.write("Inorder Traversal");
        res.write("\nBST: ");
        mainBST.print(mainBST.root,res);
        res.write("\nBackup-1: ");
        mainBST.print(backup1.root,res);
        res.write("\nBackup-2: ");
        mainBST.print(backup2.root,res);
        res.write("\n\n");

     }
     /**
     return sum of the nodes
      */
     public void printSum(Results res)
     {
       // mainBST.printSumBST(mainBST.root);
        
        res.write("\nBST: "+mainBST.printSumBST(mainBST.root));

        res.write("\nBackup-1: "+backup1.printSumBST(backup1.root));

        res.write("\nBackup-2: "+backup2.printSumBST(backup2.root)+ "\n\n");
     }

    /**
       return updated sum
    */
     public void printUpdatedSum(Results res)
     {
        res.write("Sum of all the B-Numbers After Increment: \n");
        mainBST.updatedValueBST(mainBST.root, updatedvalue);
      
        backup1.updatedValueBST(backup1.root, updatedvalue);
       
        backup2.updatedValueBST(backup2.root, updatedvalue);
     }
     public void setInputFileName(String inputFileName){
        this.inputFileName = inputFileName;
     }
}