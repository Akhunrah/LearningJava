public class TestBinaryTree {
	public static void main(String[] args){
		BinaryTree<String> tree = new BinaryTree<String>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		
		//traverse tree
		System.out.print("Inorder (sorted):" );
		tree.inorder();
		System.out.print("\nPostorder: ");
		tree.postorder();
		System.out.print("\nPreorder: ");
		tree.preorder();
		System.out.print("\nBreadth: ");
		tree.breadth();
		System.out.print("\nThe number of nodes is " + tree.getSize());
		System.out.print("\nThe diameter of the tree is " + tree.depth());
		System.out.print("\nNumber of Leaves: " + tree.countLeaves());
		System.out.print("\nNumber of Non-Leaves: " + tree.countNonLeaves());
		
	}
}