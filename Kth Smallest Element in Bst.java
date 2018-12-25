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

class Kth_Smallest_element_Bst
{
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
    int getValue(int k)
    {
        return v.get(k-1);
    }
   
    public static void main (String[] args) {
        Kth_Smallest_element_Bst tree=new Kth_Smallest_element_Bst();
        tree.root=new Node(20);
        tree.root.left=new Node(8);
        tree.root.right=new Node(22);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(12);
        tree.root.left.right.left=new Node(10);
        tree.root.left.right.right=new Node(14);
        tree.inOrder(tree.root);
        
        System.out.println(tree.getValue(3));
    }
}
