

//https://ide.geeksforgeeks.org/Pg72MzwBVO
//Sources
//https://www.geeksforgeeks.org/count-bst-subtrees-that-lie-in-given-range/



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

class Count_Bst_In_Range {
    Node root;
    static int count=0;
    boolean range(Node node,int a,int b)
    {
        return (node.data>=a&&node.data<=b);
    }
    boolean countBst(Node node,int low,int high)
    {
        if(node==null)
          return true;
       boolean l=countBst(node.left,low,high);
       boolean r=countBst(node.right,low,high);
       if(l&&r&&range(node,low,high))
       {
           count++;
           return true;
       }
       return false;
    }
    
    
	public static void main (String[] args) {
	    Count_Bst_In_Range tree=new Count_Bst_In_Range();
	    tree.root=new Node(10);
	    tree.root.left=new Node(5);
	    tree.root.right=new Node(50);
	    tree.root.left.left=new Node(1);
	    tree.root.right.left=new Node(40);
	    tree.root.right.right=new Node(100);
	    tree.countBst(tree.root,1,50);
	    System.out.println(count);
		
	}
}
