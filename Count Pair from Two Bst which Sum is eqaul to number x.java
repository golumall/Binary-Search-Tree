

//https://ide.geeksforgeeks.org/getfQ2cQg8


class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class Iterative_Search_Bst {
    Node root1,root2;
    int count=0;
    void search(Node node,int a)
    {
        if(node==null)
          return;
          if(node.data==a)
          count++;
        if(node.data>a)
          search(node.left,a);
         search(node.right,a); 
          
    }
    void printValue()
    {
        System.out.println(count);
    }
    void preOrder(Node node1,Node node2,int x)
    {
        if(node1==null)
          return;
         search(node2,x-node1.data);
         preOrder(node1.left,node2,x);
         preOrder(node1.right,node2,x);
    }
   
	public static void main (String[] args) {
	    Iterative_Search_Bst tree=new Iterative_Search_Bst();
	    tree.root1=new Node(5);
	    tree.root1.left=new Node(3);
	    tree.root1.right=new Node(7);
	    tree.root1.left.left=new Node(2);
	    tree.root1.left.right=new Node(4);
	    tree.root1.right.left=new Node(6);
	    tree.root1.right.right=new Node(8);
	    
	      tree.root2=new Node(10);
	    tree.root2.left=new Node(6);
	    tree.root2.right=new Node(15);
	    tree.root2.left.left=new Node(3);
	    tree.root2.left.right=new Node(8);
	    tree.root2.right.left=new Node(11);
	    tree.root2.right.right=new Node(18);
	    tree.preOrder(tree.root1,tree.root2,16);
	    tree.printValue();
	
	}
}
