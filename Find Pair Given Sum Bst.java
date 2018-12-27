

//https://ide.geeksforgeeks.org/hMsdhS0Ut6


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

class Find_Pair_GivenSum_Bst {
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
    boolean getPair(int sum)
    {
        int i,j;
        boolean f=false;
        for(i=0;i<v.size()-1;i++)
        {
            for(j=i+1;j<v.size();j++)
            {
                if((v.get(i)+v.get(j))==sum)
                 {
                     System.out.println(v.get(i)+" "+v.get(j));
                     f=true;
                 }
            }
        }
        if(f==true)
          return true;
        else
          return false;
    }
    
    
	public static void main (String[] args) {
	    Find_Pair_GivenSum_Bst tree=new Find_Pair_GivenSum_Bst();
	    tree.root=new Node(15);
	    tree.root.left=new Node(10);
	    tree.root.right=new Node(20);
	    tree.root.left.left=new Node(8);
	    tree.root.left.right=new Node(12);
	    tree.root.right.left=new Node(16);
	    tree.root.right.right=new Node(25);
	    tree.inOrder(tree.root);
	    if(tree.getPair(28)==false)
	       System.out.println("Not Found");
	    }
}
