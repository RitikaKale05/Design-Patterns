
package studentRecordsBackupTree.bst;
import studentRecordsBackupTree.util.Results;

public class BST {
   

    public Node root;

	public BST(){  
          root = null;  
      }   
    
   public void insertNode(int id) {  
    root = add(root, id);
          
   }
   Node add(Node root, int id){
    if(root == null)
    {
        root = new Node(id);
        return root;
    }
    if(id < root.id){
        root.left = add(root.left,id);
    }
    else if(id > root.id){
        root.right = add(root.right,id);
    }
    return root;
   }

   public void print(Node root, Results res)
   {
    if(root != null){
        print(root.left,res);
        //System.out.print(root.id + " --> ");
        res.write(root.id+",");
        print(root.right,res);
    }
   }
   public int printSumBST(Node root)
   {
    if (root == null)
    {
        return 0;
    }
    return root.id + printSumBST(root.left) + printSumBST(root.right);
   }
   public void updatedValueBST(Node root, int updatedvalue){
    if(root != null)
    {
        updatedValueBST(root.left, updatedvalue);
        root.id += updatedvalue;
        updatedValueBST(root.right, updatedvalue);
    }
   }
   public void update(int id,BST backup1, BST backup2)  // Observer pattern 
   {
    backup1.insertNode(id);
    backup2.insertNode(id);
        
   }
   

}