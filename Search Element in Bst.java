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
class Search_Bst {
    Node root;
    Node search(Node node,int key)
    {
        if(node==null||node.data==key)
           return node;
        if(node.data>key)
         return search(node.left,key);
              
     return search(node.right,key);
    }
	public static void main (String[] args) {
	Search_Bst tree=new Search_Bst();	
	tree.root=new Node(8);
	tree.root.left=new Node(5);
	tree.root.right=new Node(10);
	tree.root.left.left=new Node(3);
	if(tree.search(tree.root,50)!=null)
	   System.out.println("Find");
	else
	  System.out.println("Not Find");
	}
}
