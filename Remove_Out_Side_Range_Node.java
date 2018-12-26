

//https://ide.geeksforgeeks.org/udG69cv6Ew
//Sources
//https://www.geeksforgeeks.org/remove-bst-keys-outside-the-given-range/


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

class Remove_Out_Side_Range_Node{
    Node root;
    void inOrder(Node node)
    {
        if(node==null)
           return;
        inOrder(node.left);
      System.out.print(node.data+" ");
        inOrder(node.right);
    }
    Node removeOutSideRangeNode(Node node,int min,int max)
    {
        if(node==null)
          return null;
         node.left=removeOutSideRangeNode(node.left,min,max);
         node.right=removeOutSideRangeNode(node.right,min,max);
         if(node.data<min)
         {
             Node rchild=node.right;
             node=null;
             return rchild;
         }
         if(node.data>max)
         {
             Node lchild=node.left;
             node=null;
             return lchild;
         }
         return node;
    }
    
	public static void main (String[] args) {
	    Remove_Out_Side_Range_Node tree=new Remove_Out_Side_Range_Node();
	    tree.root=new Node(6);
	    tree.root.left=new Node(-13);
	    tree.root.right=new Node(14);
	    tree.root.left.right=new Node(-8);
	    tree.root.right.left=new Node(13);
	    tree.root.right.right=new Node(15);
	    tree.root.right.left.left=new Node(7);
	    
	    tree.inOrder(tree.root);
	    System.out.println();
	  tree.inOrder(tree.removeOutSideRangeNode(tree.root,-10,13));
	
	}
}
