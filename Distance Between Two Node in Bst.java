
//https://ide.geeksforgeeks.org/8M846HsiEl

//Sources

//https://www.geeksforgeeks.org/shortest-distance-between-two-nodes-in-bst/


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
    Node root;
   int distanceFromRoot(Node node,int a)
   {
       if(node.data==a)
         return 0;
       if(node.data>a)
         return 1+distanceFromRoot(node.left,a);
        return 1+distanceFromRoot(node.right,a); 
   }
   int distance(Node node,int a,int b)
   {
       if(a>b)
        {
            a^=b;
            b^=a;
            a^=b;
        }
        return actualDistance(node,a,b);
   }
   int actualDistance(Node node,int a,int b)
   {
       if(node==null)
         return 0;
       if(node.data>a&&node.data>b)
         return actualDistance(node.left,a,b);
       if(node.data<a&&node.data<b)
         return actualDistance(node.right,a,b);
      if(node.data>=a&&node.data<=b)
      return distanceFromRoot(node,a)+distanceFromRoot(node,b);
      return 0;
   }
	public static void main (String[] args) {
	    Iterative_Search_Bst tree=new Iterative_Search_Bst();
	    tree.root=new Node(10);
	    tree.root.left=new Node(6);
	    tree.root.right=new Node(20);
	    tree.root.left.left=new Node(3);
	    tree.root.left.right=new Node(8);
	    System.out.println(tree.distance(tree.root,3,20));
	
	}
}
