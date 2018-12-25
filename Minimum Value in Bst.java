/*package whatever //do not write package name here */

import java.io.*;
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class Min_ValueIn_Bst {
    Node root;
    int minValue(Node node)
    {
    if(node==null)
      return 0;
    while(node.left!=null)
       node=node.left;
       return node.data;
     }
    
	public static void main (String[] args) {
	Min_ValueIn_Bst tree=new Min_ValueIn_Bst();
	tree.root=new Node(20);
	tree.root.left=new Node(8);
	tree.root.right=new Node(22);
	tree.root.left.left=new Node(4);
	tree.root.left.right=new Node(12);
	tree.root.left.right.left=new Node(10);
	tree.root.left.right.right=new Node(13);
	System.out.println(tree.minValue(tree.root));
	}
}
