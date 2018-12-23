

//Sources
//https://www.geeksforgeeks.org/sorted-linked-list-to-balanced-bst/

class LNode
{
	int data;
	LNode prev,next;
	LNode(int data)
	{
	this.data=data;
	prev=next=null;
	}
}
class TNode
{
	int data;
	TNode left,right;
	TNode(int data)
	{
	this.data=data;
	left=right=null;
	}
}
class Convert_SortedList_To_BST
{
	static LNode head;
	TNode sortedListToBst()
	{
	    int n=countNode(head);
	    return sortedListToBstRecur(n);
	}
	TNode sortedListToBstRecur(int n)
	{
	    if(n<=0)
	     return null;
	  TNode left=sortedListToBstRecur(n/2);
	  TNode root=new TNode(head.data);
	  root.left=left;
	  head=head.next;
	  root.right=sortedListToBstRecur(n-n/2-1);
	  return root;
	}
	void push(int data)
	{
	LNode temp=new LNode(data);
	temp.prev=null;
	temp.next=head;
	if(head!=null)
	   head.prev=temp;
	head=temp;


	}
	int countNode(LNode node)
	{
	int c=0;
	LNode temp=node;
	while(temp!=null)
	{
	temp=temp.next;
	c++;
	}
	return c;
	}
	void printList(LNode node)
	{
	LNode temp=node;
	while(temp!=null)
	{
      System.out.print(temp.data+" ");
      temp=temp.next;
	}
	}
	void preOrder(TNode node)
	{
	if(node==null)
	  return;
	  System.out.print(node.data+" ");
	  preOrder(node.left);
	  preOrder(node.right);
	}
	public static void main (String[] args) {
	    Convert_SortedList_To_BST tree=new Convert_SortedList_To_BST();
	    tree.push(7);
	    tree.push(6);
	    tree.push(5);
	    tree.push(4);
	    tree.push(3);
	    tree.push(2);
	    tree.push(1);
	 System.out.println("List");
	   tree.printList(head);
	 System.out.println("\npreOrder Of Tree");
	 
	 tree.preOrder(tree.sortedListToBst());
	}
}
