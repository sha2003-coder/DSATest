class BTreeADT {
    int[] treeArray;
    int maxSize;
    int currentSize;

    public BTreeADT(int maxSize) {
        this.maxSize = maxSize;
        this.treeArray = new int[maxSize];
        this.currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void insert(int data) {
        if (isFull()) {
            System.out.println("Tree is full.");
        } else {
            treeArray[currentSize] = data;
            currentSize++;
            System.out.println("Inserted " + data);
        }
    }

    public int search(int data) {
        if (isEmpty()){
			System.out.println("Tree is empty.");			
        } else {
			for (int i = 0; i < currentSize; i++) {
				if (treeArray[i] == data) {
					return i;
				}
			}
        }
		return -1;
    }

    public boolean delete(int data) {
        int index = search(data);        
        if (index == -1) {
            System.out.println("Element not found.");
            return false;
        } else {
            treeArray[index] = treeArray[currentSize - 1];
            treeArray[currentSize - 1] = 0;
            currentSize--;
            System.out.println("Deleted " + data + " from the tree.");
            return true;
        }
    }

public void inorderTraversal(int index) {
    if (isEmpty()) {
        System.out.println("Tree is empty.");
    } else {
        if (index < 0 || index >= currentSize) {
            System.out.println("Index is not correct!");
            return;
        } 
        else if (treeArray[index] == 0) {
            System.out.print("- ");
            return;
        } 
        else {
            inorderTraversal(2 * index + 1);
            System.out.print(treeArray[index] + " ");
            inorderTraversal(2 * index + 2);
        }
    }
}   // <-- closes inorderTraversal()


public void searchElement(int data) {
    if (isEmpty()) {
        System.out.println("Tree is empty");
    } 
    else {
        for (int i = 0; i < currentSize; i++) {
            if (treeArray[i] == data) {
                System.out.println("Element found!");
                return;
            }
        }

        System.out.println("Element not found!");
    }
}

    public void preorderTraversal(int index) {
		if (isEmpty()) System.out.println("Tree is empty.");			
        else {
			if (index < 0 || index >= currentSize){
				System.out.println("Index is not correct!");
				return;
			} else if (treeArray[index] == 0) {
				System.out.print("- ");
				return;
			} else {
				System.out.print(treeArray[index] + " ");
				preorderTraversal(2 * index + 1);
				preorderTraversal(2 * index + 2);
			} 
		}
    }

    public void postorderTraversal(int index) {
		if (isEmpty()) System.out.println("Tree is empty.");			
        else {
			if (index < 0 || index >= currentSize){
				System.out.println("Index is not correct!");
				return;
			} else if (treeArray[index] == 0) {
				System.out.print("- ");
				return;
			} else {
				postorderTraversal(2 * index + 1);
				postorderTraversal(2 * index + 2);
				System.out.print(treeArray[index] + " ");
			} 
		}
    }
	
	
}

public class BinaryTreeArray {
    public static void main(String[] args) {
        BTreeADT binaryTree = new BTreeADT(10);
		
		System.out.println("Levelorder Traversal:");
        binaryTree.levelOrderTraversal();
        System.out.println();
		
	
		
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(9);
        binaryTree.insert(2);
        binaryTree.insert(0);
        binaryTree.insert(0);
        binaryTree.insert(1);
		binaryTree.insert(0);
		binaryTree.insert(8);

        System.out.println("Levelorder Traversal:");
        binaryTree.levelOrderTraversal();
        System.out.println();
		
		System.out.println("Inorder Traversal:");
        binaryTree.inorderTraversal(0);
        System.out.println();

        System.out.println("Preorder Traversal:");
        binaryTree.preorderTraversal(-1);
        System.out.println();

        System.out.println("Postorder Traversal:");
        binaryTree.postorderTraversal(0);
        System.out.println();
		
		System.out.println("Postorder Traversal from 1st index node:");
        binaryTree.postorderTraversal(1);
        System.out.println();

        System.out.println("Searching for 9: " + binaryTree.search(9));
        System.out.println("Searching for 6: " + binaryTree.search(6));

        System.out.println("Deleting 3: " + binaryTree.delete(3));

        System.out.println("Inorder Traversal after deleting 3:");
        binaryTree.inorderTraversal(0);
        System.out.println();		
    }
}





















