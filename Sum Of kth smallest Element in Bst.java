


//https://ide.geeksforgeeks.org/VHw6ez8kBH


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

class Sum_Kth_Smallest_Element_Bst {
    Node root;
    static int sum=0,i=0;
    void inOrder(Node node,int k)
    {
        if(node==null)
           return;
        inOrder(node.left,k);
        if(i<k)
          sum+=node.data;
         i++;
        inOrder(node.right,k);
    }
    
    
	public static void main (String[] args) {
	    Sum_Kth_Smallest_Element_Bst tree=new Sum_Kth_Smallest_Element_Bst();
	    tree.root=new Node(20);
	    tree.root.left=new Node(10);
	    tree.root.right=new Node(30);
	    tree.root.left.left=new Node(5);
	    tree.root.left.right=new Node(15);
	    tree.root.right.left=new Node(25);
	    tree.root.right.right=new Node(35);
	    tree.inOrder(tree.root,5);
	    
	    System.out.println(sum);
	    
		
	}
}
