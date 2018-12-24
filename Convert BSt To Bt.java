
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
class Sum{
    int sum=0;
}
class Convert_Bst_Bt
{
    Node root;
    Sum ob=new Sum();
    void convertTreeUtil(Node node,Sum sum_ptr)
    {
          if(node==null)
            return;
        convertTreeUtil(node.right,sum_ptr);
        sum_ptr.sum=sum_ptr.sum+node.data;
        node.data=sum_ptr.sum;
        convertTreeUtil(node.left,sum_ptr);
    }
    void convertTree(Node node)
    {
        if(node==null)
         return;
      convertTreeUtil(node,ob);
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
        Convert_Bst_Bt tree=new Convert_Bst_Bt();
        tree.root=new Node(5);
        tree.root.left=new Node(2);
        tree.root.right=new Node(13);
        System.out.println("\nBefore Conversion");
        tree.preOrder(tree.root);
        tree.convertTree(tree.root);
        System.out.println("\nAfter Conversion");
        tree.preOrder(tree.root);
        
    }
}
