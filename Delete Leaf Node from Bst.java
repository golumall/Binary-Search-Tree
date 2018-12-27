

//https://ide.geeksforgeeks.org/SwCCAXpkHz



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

class Delete_LeafNode_Bst {
    Node root;
    Node deleteLeaf(Node node)
    {
        if(node==null)
          return null;
       if(node.left==null&&node.right==null)
       {
          node=null;
          return null;
       }
        node.left=deleteLeaf(node.left);
        node.right=deleteLeaf(node.right);
        return node;
    }
    void inOrder(Node node)
    {
        if(node==null)
           return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    
    
	public static void main (String[] args) {
	    Delete_LeafNode_Bst tree=new Delete_LeafNode_Bst();
	    tree.root=new Node(20);
	    tree.root.left=new Node(10);
	    tree.root.right=new Node(30);
	    tree.root.left.left=new Node(5);
	    tree.root.left.right=new Node(15);
	    tree.root.right.left=new Node(25);
	    tree.root.right.right=new Node(35);
	    tree.inOrder(tree.root);
	    
	    System.out.println();
	    tree.inOrder(tree.deleteLeaf(tree.root));
		
	}
}
