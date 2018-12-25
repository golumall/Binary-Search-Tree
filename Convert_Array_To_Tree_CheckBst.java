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

class Convert_Array_To_Tree_CheckBst
{
    Node root;
    
   
    Node constructTree(Node node,int a[],int i,int n)
    {
        if(i<n)
        {
            Node temp=new Node(a[i]);
            node=temp;
            node.left=constructTree(node.left,a,2*i+1,n);
            node.right=constructTree(node.right,a,2*i+2,n);
        }
        return node;
    }
    
    boolean isBst(Node node,int min,int max)
    {
        if(node==null)
           return true;
        if(root.data<=min||root.data>max)
           return false;
        return isBst(root.left,min,root.data)&&isBst(root.right,root.data,max);
        
    }
   
    
    public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       Convert_Array_To_Tree_CheckBst tree=new Convert_Array_To_Tree_CheckBst();
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       tree.root=tree.constructTree(tree.root,a,0,n);
       
       if(tree.isBst(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE))
         System.out.println("YES");
       else
       System.out.println("NO");
         
       
        
        
    }
}
