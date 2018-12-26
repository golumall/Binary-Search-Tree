

//https://ide.geeksforgeeks.org/cG3DHsIuhv


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
class Check_Two_Bst_Containes_Same_Elements {
    static Vector<Integer> v1=new Vector<Integer>();
    static Vector<Integer> v2=new Vector<Integer>();
    Node root1,root2;
    static int f=0;
    void inOrder(Node node)
    {
        if(node==null)
          return;
        inOrder(node.left);
        if(f==0)
         v1.add(node.data);
         else
         v2.add(node.data);
         inOrder(node.right);
    }
    boolean check()
    {
        if(v1.size()!=v2.size())
          return false;
        for(int i=0;i<v1.size();i++)
        {
            if(v1.get(i)!=v2.get(i))
               return false;
        }
        return true;
    }
	public static void main (String[] args) {
	    Check_Two_Bst_Containes_Same_Elements tree=new Check_Two_Bst_Containes_Same_Elements();
	    tree.root1=new Node(15);
	    tree.root1.left=new Node(10);
	    tree.root1.right=new Node(20);
	    tree.root1.left.left=new Node(5);
	    tree.root1.left.right=new Node(12);
	    tree.root1.right.right=new Node(25);
	    tree.inOrder(tree.root1);
	    f=1;
	    tree.root2=new Node(15);
	    tree.root2.left=new Node(12);
	    tree.root2.right=new Node(20);
	    tree.root2.left.left=new Node(5);
	    tree.root2.left.left.right=new Node(10);
	    tree.root2.right.right=new Node(25);
	    tree.inOrder(tree.root2);
	    if(tree.check())
	    System.out.println("YES");
	    else
	    System.out.println("NO");
	    
		
	}
}
