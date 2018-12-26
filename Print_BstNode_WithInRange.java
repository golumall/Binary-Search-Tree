

//https://ide.geeksforgeeks.org/zmlrzeqYLS



import java.util.Vector;
class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class Print_BstNode_WithInRange{
    Node root;
    void inOrder(Node node,int k1,int k2)
    {
        if(node==null)
           return;
        if(node.data>=k1&&node.data<=k2)
              System.out.print(node.data+" ");
      inOrder(node.left,k1,k2);
        inOrder(node.right,k1,k2);
    }
    
    
	public static void main (String[] args) {
	    Print_BstNode_WithInRange tree=new Print_BstNode_WithInRange();
	    tree.root=new Node(6);
	    tree.root.left=new Node(-13);
	    tree.root.right=new Node(14);
	    tree.root.left.right=new Node(-8);
	    tree.root.right.left=new Node(13);
	    tree.root.right.right=new Node(15);
	    tree.root.right.left.left=new Node(7);
	    
	    tree.inOrder(tree.root,6,14);
	    
	  
	
	}
}
