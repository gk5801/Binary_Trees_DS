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
class BStrees
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
	int Min(Node root)
	{
			if(root == null)
			{
				System.out.println("No element exists");
				return -1; //OR System.exit(0); 
			}
		while(root.left!=null)
		{
			root = root.left;
	    }
		return root.data;
	}
	int Max(Node root)
	{
			if(root == null)
			{
				System.out.println("No element exists");
		        return -1;
			}
		while(root.right!=null)
		{
			root = root.right;
	    }
		return root.data;
	}
}
public class MinMaxElement
{
	public static void main(String[] args) 
	{
		BStrees b = new BStrees();
		Node root = null;
		root = b.insert(root,15);
		root = b.insert(root,10);
		root = b.insert(root,20);
		root = b.insert(root,8);
		root = b.insert(root,12);
		root = b.insert(root,17);
		root = b.insert(root,25);
		
		System.out.println(b.Min(root));
		System.out.println(b.Max(root));
	}
}
