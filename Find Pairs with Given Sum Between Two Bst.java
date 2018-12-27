

//https://ide.geeksforgeeks.org/6bbfg2zQmU

//Time Complexity O(n)
//Auxiliary Space Complexity O(n)

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
class Find_paire_With_Given_Sum_Between_TwoTree {
    Node root1,root2;
    void inOrder(Node node,Vector<Integer> v)
    {
        if(node==null)
          return;
        inOrder(node.left,v);
        v.add(node.data);
        inOrder(node.right,v);
    }
    void getSum(Node node1,Node node2,int sum)
    {
        Vector<Integer> v1=new Vector<Integer>();
        Vector<Integer> v2=new Vector<Integer>();
        boolean f=false;
        inOrder(node1,v1);
        inOrder(node2,v2);
        int l=0;
        int r=v2.size()-1;
        while(l<v1.size()&&r>=0)
        {
            if(v1.get(l)+v2.get(r)==sum)
            {
                System.out.println(v1.get(l)+" "+v2.get(r));
                l++;
                r--;
                f=true;
            }
            else if(v1.get(l)+v2.get(r)<sum)
             l++;
             else
             r--;
        }
        if(f==false)
         System.out.println("Not Found");
    }
	public static void main (String[] args) {
	  Find_paire_With_Given_Sum_Between_TwoTree tree=new Find_paire_With_Given_Sum_Between_TwoTree();
	  tree.root1=new Node(8);
	  tree.root1.left=new Node(3);
	  tree.root1.right=new Node(10);
	  tree.root1.left.left=new Node(1);
	  tree.root1.left.right=new Node(6);
	  tree.root1.left.right.left=new Node(5);
	  tree.root1.left.right.right=new Node(7);
	  tree.root1.right.right=new Node(14);
	  tree.root1.right.right.left=new Node(13);
	  
	  
	  tree.root2=new Node(5);
	  tree.root2.left=new Node(2);
	  tree.root2.right=new Node(18);
	  tree.root2.left.left=new Node(1);
	  tree.root2.left.right=new Node(3);
	  tree.root2.left.right.right=new Node(4);
	  
	  tree.getSum(tree.root1,tree.root2,10);
		
	}
}
