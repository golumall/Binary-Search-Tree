

//https://ide.geeksforgeeks.org/znIsfFdzls

//Sources
//https://www.geeksforgeeks.org/check-if-given-sorted-sub-sequence-exists-in-binary-search-tree/



import java.util.Scanner;
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

class Check_Subsequence_In_Bst {
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
    boolean check(int a[])
    {
        int i=0,j=0;
        for(i=0;i<v.size();i++)
        {
            if(v.get(i)==a[j])
                j++;
            
            if(j>=a.length)
               break;
        }
        if(j>=a.length)
         return true;
         else
         return false;
    }
	public static void main (String[] args) {
	    Check_Subsequence_In_Bst tree=new Check_Subsequence_In_Bst();
	    tree.root=new Node(8);
	    tree.root.left=new Node(3);
	    tree.root.right=new Node(10);
	    tree.root.left.left=new Node(1);
	    tree.root.left.right=new Node(6);
	    tree.root.left.right.left=new Node(4);
	    tree.root.left.right.right=new Node(7);
	    tree.root.right.right=new Node(14);
	    tree.root.right.right.left=new Node(13);
	    tree.inOrder(tree.root);
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	       a[i]=sc.nextInt();
	  if(tree.check(a))
	    System.out.println("YES");
	  else
	  System.out.println("NO");
	       }
}

