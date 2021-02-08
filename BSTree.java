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
	class BST
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
		void printA(Node root)
		{
			if(root == null)
				return;
			System.out.print(root.data + " ");
			printA(root.left);
			printA(root.right);
		}
	}
	public class BSTree 
	{
		public static void main(String[] args) 
		{
			BST b = new BST();
			Node root = null;
			System.out.println(b.search(root,8));
			root = b.insert(root,10);
			root = b.insert(root,11);
			root = b.insert(root,12);
			root = b.insert(root,14);
			root = b.insert(root,15);
			System.out.println(b.search(root,10));
			System.out.println(b.search(root,1));
			b.printA(root);
		}
	
	}
