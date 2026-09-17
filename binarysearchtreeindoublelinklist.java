class Node{
	int data;
	Node right;
	Node left;
	public Node(int data){
		this.data=data;
	}
	
}
public class binarysearchtreeindoublelinklist{
	 Node root;
	
	 
	 public boolean isEmpty()
	 {
		 return root==null;
	 }
	 public Node insert(Node cnode,int data)
	 {
		 if(cnode==null)
		 {
			 cnode=new Node(data);
			 return cnode;
		 }
		 if(data<cnode.data){
			 cnode.left=insert(cnode.left,data);
		 }
		 else if(data>cnode.data)
		 {
			 cnode.right=insert(cnode.right,data);
		 }
		 return cnode;
	 }
	 public void inorder(Node current) {
        if (current != null) {
            inorder(current.left);
            System.out.print(current.data + " ");
            inorder(current.right);
        }
    }
	public void preorder(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preorder(current.left);
            preorder(current.right);
        }
    }
	public void postorder(Node current) {
        if (current != null) {
            postorder(current.left);
            postorder(current.right);
            System.out.print(current.data + " ");
        }
    }
	public boolean Search(int data)
	{
		Node current=root;
		while(current!=null)
		{
			if(data=current.data)
			{
				return true;
			}
			else if(data<current.data)
			{
				current=current.left;
			}
			else{
				current=current.right;
			}
		}
	}
	//tearcher method
	public boolean search(Node root,int data)
	{
		if(root==null){
			return false;
		}
		if(data==root.data)
		{
			return true;
		}
		else if(data<root.data){
			return search(root.left,data);
		}
		else{
			return search(root.right,data);
		}
	}
	 public int findMin(Node current) {
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }
	public Node Delete(Node node,int value)
	{
		if(node==null){
			return null;
		}
		if (value < node.data) {
			node.left = delete(node.left, value);
		}
		else if (value>node.data)
		{
			node.right=delete(node.right,value);
		}
		else{
			//case1
			if(node.left && node.right==null)
			{
				return null;
			}
			//case2 right child only
			if(node.left==null){
				return node.right;
			}
			//caase3 leftchild only
			if(node.right==null)
			{
				return node.left;
			}
			 // Case 4: two children
            int smallestValue = findMin(node.right);
            node.data = smallestValue;
            node.right = delete(node.right, smallestValue);
		}
		return node;
	}

	 
	 public static void main(String [] args)
	 {
		 binarysearchtreeindoublelinklist tree = newbinarysearchtreeindoublelinklist();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder: ");
        tree.inorder();

        System.out.print("Preorder: ");
        tree.preorder();

        System.out.print("Postorder: ");
        tree.postorder();

	 }
}
