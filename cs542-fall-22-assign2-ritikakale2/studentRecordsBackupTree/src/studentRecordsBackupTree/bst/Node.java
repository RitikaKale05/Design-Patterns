
package studentRecordsBackupTree.bst;

public class Node {
	
    int id; 
    String desc = " ";
    Node left;
    Node right;

        public Node(int id){ 
            this.id = id; 
            this.desc = "Description";
            this.left = this.right = null; 
        } 
}
