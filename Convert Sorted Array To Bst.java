/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;
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
class SortedArrayToBst {
 
 Node sortedArryBst(int a[],int s,int e)
 {
     if(s>e)
       return null;
    int mid=(s+e)/2;
    Node node=new Node(a[mid]);
    node.left=sortedArryBst(a,s,mid-1);
    node.right=sortedArryBst(a,mid+1,e);
    return node;
 }
 void preOrder(Node node)
 {
     if(node==null)
       return;
     System.out.print(node.data+" ");
     preOrder(node.left);
     preOrder(node.right);
 }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		SortedArrayToBst tree=new SortedArrayToBst();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		  {
		      a[i]=sc.nextInt();
		      
		  }
		  System.out.println("\nPreOrder Traversal");
		  tree.preOrder(tree.sortedArryBst(a,0,n-1));
		
	}
}
