

//https://ide.geeksforgeeks.org/vXAsJ8Kdn9

import java.util.Vector;
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
class Find_Closest_Element_Bst {
    Node root;
    static int diff=Integer.MAX_VALUE,key=0;
    void getClosestValue(Node node,int k)
    {
        if(node==null)
          return;
        if(diff>Math.abs(node.data-k))
        {
            diff=Math.abs(node.data-k);
            key=node.data;
        }
        if(k>node.data)
          getClosestValue(node.right,k);
        else
        getClosestValue(node.left,k);
        
    }
    void prinValue()
    {
        System.out.println(key);
    }
    
    	public static void main (String[] args) {
	  Find_Closest_Element_Bst tree=new Find_Closest_Element_Bst();
	  tree.root=new Node(9);
	  tree.root.left=new Node(4);
	  tree.root.right=new Node(17);
	  tree.root.left.left=new Node(3);
	  tree.root.left.right=new Node(6);
	  tree.root.left.right.left=new Node(5);
	  tree.root.left.right.right=new Node(7);
	  tree.root.right.right=new Node(22);
	  tree.root.right.right.left=new Node(20);
	 
	  
	  tree.getClosestValue(tree.root,12);
	  tree.prinValue();
		
	}
}
