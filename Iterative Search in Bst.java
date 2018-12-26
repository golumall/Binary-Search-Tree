
//https://ide.geeksforgeeks.org/J7lTMoSxfl


class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class Iterative_Search_Bst {
    Node root;
    boolean search(Node node,int key)
    {
        if(node==null)
          return false;
        while(node!=null)
        {
            if(key>node.data)
               node=node.right;
            else if(key<node.data)
              node=node.left;
              else
              return true;
        }
        return false;
    }
	public static void main (String[] args) {
	    Iterative_Search_Bst tree=new Iterative_Search_Bst();
	    tree.root=new Node(10);
	    tree.root.left=new Node(6);
	    tree.root.right=new Node(20);
	    tree.root.left.left=new Node(3);
	    tree.root.left.right=new Node(8);
	    if(tree.search(tree.root,20))
	    System.out.println("YES");
	    else
	    System.out.println("NO");
	
	}
}
