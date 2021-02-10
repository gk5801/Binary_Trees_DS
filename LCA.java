package BST;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right =null; 
	}
}
class binarysearch
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
	Node lca(Node root,int n1,int n2)
	{
			if(root == null)
				return null;
			if(n1 < root.data && n2<root.data)
				return lca(root.left,n1,n2);
			if(n1 > root.data &&  n2>root.data)
				return lca(root.right,n1,n2);
			return root;
	}
}
public class LCA 
{
	public static void main(String[] args) 
	{
		binarysearch bs = new binarysearch();
		Node root = null;
		root = bs.insert(root,1);
		root = bs.insert(root,2);
		root = bs.insert(root,3);
		root = bs.insert(root,4);
		root = bs.insert(root,5);
		root = bs.insert(root,6);
		root = bs.insert(root,7);
		System.out.println(bs.lca(root,5,3).data);
//		System.out.println(bs.search(root,1));
	}
}
