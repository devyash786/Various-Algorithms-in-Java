import java.util.Scanner;
class BinarySearchTree { 
class Node { 
		int key; 
		Node left, right; 
       public Node(int item) { 
			key = item; 
			left = right = null; 
		} 
	} 
static Node root; 
BinarySearchTree() { 
		root = null; 
	} 
void insert(int key) { 
	root = insertRec(root, key); 
	} 
	Node insertRec(Node root, int key) { 
		if (root == null) { 
			root = new Node(key); 
			return root; 
		} 
    if (key < root.key) 
			root.left = insertRec(root.left, key); 
		else if (key > root.key) 
			root.right = insertRec(root.right, key); 	
		return root; 
	} 
    void inorder() { 
	inorderRec(root); 
	} 
    void inorderRec(Node root) { 
		if (root != null) { 
			inorderRec(root.left); 
			System.out.print(root.key + " "); 
			inorderRec(root.right); 
		} 
	} 
	 boolean printAncestors(Node node, int target)  
    { if (node == null) 
            return false; 
   
        if (node.key == target) 
            return true; 
      if (printAncestors(node.left, target) 
                || printAncestors(node.right, target))  
        { 
            System.out.print(node.key + " "); 
            return true; 
        }
        return false; 
    } 
  public static void main(String[] args) { 
		BinarySearchTree tree = new BinarySearchTree(); 
       Scanner sc=new Scanner(System.in);
	 char ch='0';
	 do{
	     System.out.println("Enter value");
		 int n=sc.nextInt();
		 tree.insert(n);
		 System.out.println("Do you wish to continue, y or n");
		  ch=sc.next().charAt(0);
		}while(ch!='n');
	  System.out.println("Inorder of Binary Tree is:");	
      tree.inorder(); 
	  int ance;
	  System.out.println();
	  System.out.println("Enter node whose ancestors are to be known:");
      ance=sc.nextInt();
	  System.out.println("Ancestors are:");
	  tree.printAncestors(root,ance);
	   
	} 
} 
