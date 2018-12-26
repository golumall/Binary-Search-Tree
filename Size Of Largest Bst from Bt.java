

//https://ide.geeksforgeeks.org/XrGJcpm5gT


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

class Largest_Bst_in_Bt {
    Node root;
    Vector<Integer> v=new Vector<Integer>();
    void inOrder(Node node)
    {
        if(node==null)
           return;
        inOrder(node.left);
        v.add(node.data);
        inOrder(node.right);
    }
    int calculateSize()
    {
        int s1=0,s2=0;
        for(int i=1;i<v.size();i++)
        {
            if(v.get(i-1)-v.get(i)<0)
               s2++;
             else
             {
                 
                 if(s1<s2)
                   s1=s2;
                 s2=0;  
             }
        }
        if(s1<s2)
           s1=++s2;
        return s1;
    }
    
	public static void main (String[] args) {
	    Largest_Bst_in_Bt tree=new Largest_Bst_in_Bt();
	    tree.root=new Node(50);
	    tree.root.left=new Node(30);
	    tree.root.right=new Node(60);
	   tree.root.left.left=new Node(5);
	    tree.root.left.right=new Node(20);
	    tree.root.right.left=new Node(45);
	    tree.root.right.right=new Node(70);
	    tree.root.right.right.left=new Node(65);
	    tree.root.right.right.right=new Node(80);
	    tree.inOrder(tree.root);
	    System.out.println(tree.calculateSize());
	
	}
}
