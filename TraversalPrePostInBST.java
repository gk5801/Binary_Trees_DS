package BST;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
class Bst1
{
	Node insert(Node root,int data)
	{
		    if(root  == null)
		    {	
				root = new Node(data);
		        return root;
	    	}
		    if(data<=root.data)
		    	root.left = insert(root.left,data);
		    else
		    	root.right = insert(root.right,data);
		   return root;
	}
	boolean search(Node root,int data)
	{
		if(root == null)
			return false;
		
		if(root.data == data)
			return true;
		
		if(data<=root.data)
			return search(root.left,data);
		else
			return search(root.right,data);
	}
		void prefix(Node root)
		{
			if(root == null)
				return;
			System.out.print(root.data + " ");
			prefix(root.left);
			prefix(root.right);
		}
		void infix(Node root)
		{

			if(root == null)
				return;
			infix(root.left);
			System.out.print(root.data + " ");
			infix(root.right);
		}
		void postfix(Node root)
		{

			if(root == null)
				return;
			postfix(root.left);
			postfix(root.right);
			System.out.print(root.data + " ");
		}
		void printA(Node root)
		{
			if(root == null)
				return;
			System.out.print(root.data+" ");
			printA(root.left);
			printA(root.right);
		}
}
public class TraversalPrePostInBST 
{
	public static void main(String[] args) 
	{
		Bst1 b = new Bst1();
		Node root = null;
		root = b.insert(root,15);
		root = b.insert(root,10);
		root = b.insert(root,20);
		root = b.insert(root,8);
		root = b.insert(root,12);
		root = b.insert(root,17);
		root = b.insert(root,25);
		

		System.out.print("Prefix : ");
		b.prefix(root);
		System.out.println();
		
		System.out.print("Infix : ");
		b.infix(root);
		System.out.println();
		
		System.out.print("Postfix : ");
		b.postfix(root);
		
		System.out.println();
		b.printA(root);
		
		
	}
}
