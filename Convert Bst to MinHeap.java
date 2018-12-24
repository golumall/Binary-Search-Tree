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

class Convert_Bst_MinHeap
{
    Node root;
    static Vector<Integer> v=new Vector<Integer>();
    int i=0;
    
    void store(Node node)
    {
        if(node==null)
          return;
        store(node.left);
        v.add(node.data);
        store(node.right);
        
    }
    Node constructTree(Node node,int i)
    {
        if(i<v.size())
        {
            Node temp=new Node((int)v.get(i));
            node=temp;
            node.left=constructTree(node.left,2*i+1);
            node.right=constructTree(node.right,2*i+2);
        }
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
        Convert_Bst_MinHeap tree=new Convert_Bst_MinHeap();
        tree.root=new Node(8);
        tree.root.left=new Node(4);
        tree.root.right=new Node(12);
        tree.root.left.left=new Node(2);
        tree.root.left.right=new Node(6);
        tree.root.right.left=new Node(10);
        tree.root.right.right=new Node(14);
        
        System.out.println("\nBefore Conversion");
        tree.preOrder(tree.root);
        tree.store(tree.root);
        
        System.out.println("\nAfter Conversion");
       // System.out.println(v);
        tree.preOrder(tree.constructTree(tree.root,0));
        
    }
}
