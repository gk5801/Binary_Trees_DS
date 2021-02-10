package BST;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data  = data;
		this.left    = null;
		this.right = null;
	}
}
class BSTok
{
	Node insert (Node root,int data)
	{
		    if(root  == null)
		    {	
				root = new Node(data);
		        return root;
	    	}
		    if(data<=root.data)
		    	root.left = insert(root.left,data);
		    else
		    {
		    	root.right = insert(root.right,data);
		    }
		   return root;
	}
//	boolean search(Node root,int data)
//	{
//		if(root == null)
//			return false;
//		
//		if(root.data == data)
//			return true;
//		
//		if(data<=root.data)
//			return search(root.left,data);
//		else
//			return search(root.left,data);
//	}
	int min(Node root)
	{
		if(root == null)
			return -1;
		while(root.left!=null)
		{
			root = root.left;
		}
		return root.data;
	}
	Node delete(Node root,int data)
	{
		if(root == null)
			return null;
		if(data<root.data)
			root.left = delete(root.left,data);
		else if(data>root.data)
			root.right = delete(root.right,data);
		else
			{
					if(root.left == null) 						  		  // No child and 1 child cases
						return root.right;					    		 //						"
					else if (root.right == null)					//					 		"
						return root.left;						   		   //							"
				
					else														// 2 child case
					{
						root.data = min(root.right);
						root.right = delete(root.right,root.data);
					}
			}
		return root;
}
	void printA(Node root)
	{
		if(root == null)
			return;
	
		printA(root.left);
		System.out.print(root.data + " ");
		printA(root.right);
	}
}
public class Deletion
{
	public static void main(String[] args) 
	{
		BSTok b = new BSTok();
		Node root = null;

		root = b.insert(root,8);
		root = b.insert(root,3);
		root = b.insert(root,10);
		root = b.insert(root,1);
		root = b.insert(root,6);
		root = b.insert(root,14);
		root = b.insert(root,2);
		root = b.insert(root,4);
		root = b.insert(root,7);
		root = b.insert(root,13);
		
		b.delete(root, 8);
		b.printA(root);
	}

}
