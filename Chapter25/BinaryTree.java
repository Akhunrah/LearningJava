import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E extends Comparable<E>> extends AbstractTree<E>{
	
	protected TreeNode<E> root;
	protected int size = 0;
	
	public BinaryTree(){}
	
	public BinaryTree(E[] objects){
		for(int i = 0; i < objects.length; i++)
			insert(objects[i]);
	}
	
	public boolean search(E e){
		TreeNode<E> current = root;
		
		while(current != null){
			if(e.compareTo(current.element) < 0)
				current = current.left;
			else if(e.compareTo(current.element) > 0)
				current = current.right;
			else
				return true;
		}
		return false;
	}
	
	public boolean insert(E e){
		if(root == null)
			root = createNewNode(e);
		else{
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while(current != null){
				if(e.compareTo(current.element) < 0){
					parent = current;
					current = current.left;
				}
				else if(e.compareTo(current.element) > 0){
					parent = current;
					current = current.right;
				}
				else
					return false;
			}
			if(e.compareTo(parent.element) < 0)
				parent.left = createNewNode(e);
			else
				parent.right = createNewNode(e);
		}
		size++;
		return true;
	}
	
	protected TreeNode<E> createNewNode(E e){
		return new TreeNode<E>(e);
	}
	
	public void inorder(){
		inorder(root);
	}
	
	protected void inorder(TreeNode<E> root){
		if(root == null) return;
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}
	
	public void postorder(){
		postorder(root);
	}
	
	protected void postorder(TreeNode<E> root){
		if(root == null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element + " ");
	}
	
	public void preorder(){
		preorder(root);
	}
	
	protected void preorder(TreeNode<E> root){
		if(root == null) return;
		System.out.print(root.element + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static class TreeNode<E extends Comparable<E>>{
		E element;
		TreeNode<E> left;
		TreeNode<E> right;
		
		public TreeNode(E e){
			element = e;
		}
	}
	
	public int getSize(){
		return size;
	}
	
	public TreeNode getRoot(){
		return root;
	}
	
	public ArrayList<TreeNode<E>> path(E e){
		ArrayList<TreeNode<E>> list = new ArrayList<TreeNode<E>>();
		TreeNode<E> current = root;
		
		while(current != null){
			list.add(current);
			if(e.compareTo(current.element) < 0){
				current = current.left;
			}
			else if(e.compareTo(current.element) > 0){
				current = current.right;
			}
			else
				break;
		}
		
		return list;
	}
	
	public boolean delete(E e){
		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		
		while(current != null){
			if(e.compareTo(current.element) < 0){
				parent = current;
				current = current.left;
			}
			else if(e.compareTo(current.element) > 0){
				parent = current;
				current = current.right;
			}
			else
				break;
		}
		
		if(current == null)
			return false;
		
		//Case 1: No left children. Connect the parent with the right child.
		if(current.left == null){
			if(parent == null){
				root = current.right;
			}
			else{
				if( e.compareTo(parent.element) < 0)
					parent.left = current.right;
				else;
					parent.right = current.right;
			}
		}
		else{
			// Case 2: Current has a left child.
			// Locate the rightmost node in the left subtree
			// and also its parent.
			TreeNode<E> parentOfRightMost = current;
			TreeNode<E> rightMost = current.left;
			
			while(rightMost.right != null){
				parentOfRightMost = rightMost;
				rightMost=rightMost.right;
			}
			current.element= rightMost.element;
			if(parentOfRightMost.right==rightMost)
				parentOfRightMost.right=rightMost.left;
			else
				parentOfRightMost.left=rightMost.left;
		}
		size--;
		return true;
	}
	
	public java.util.Iterator iterator(){
		return inorderIterator();
	}
	
	public java.util.Iterator inorderIterator(){
		return new InorderIterator();
	}
	
 	class InorderIterator implements java.util.Iterator{
		private ArrayList<E> list = new ArrayList<E>();
		private int current = 0;
		
		public InorderIterator(){
			inorder();
		}
		
		private void inorder(){
			inorder(root);
		}
		
		private void inorder(TreeNode<E> root){
			if(root == null) return;
			inorder(root.left);
			list.add(root.element);
			inorder(root.right);
		}
		
		public boolean hasNext(){
			if(current < list.size())
				return true;
			return false;
		}
		
		public Object next(){
			return list.get(current++);
		}
		
		// Remove the current element and refresh the list.
		public void remove(){
			delete(list.get(current));
			list.clear();
			inorder();
		}
	}
	
	public void clear(){
		root = null;
		size = 0;
	} 
	
	// Exercise 25.1 additions:
	public void breadth(){
		ArrayList<TreeNode> arrayList = breadthFirstTraversal(root);
		
		for(int i = 0; i < arrayList.size(); i++){
			System.out.print((arrayList.get(i)).element + " ");
		}
	}
	
	public ArrayList<TreeNode> breadthFirstTraversal(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<TreeNode> arrayList = new ArrayList<TreeNode>();
		
		if (root == null){
			return null;
		}
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node = (TreeNode)queue.poll();
			if(node.left != null) queue.offer(node.left);
			if(node.right != null) queue.offer(node.right);
			arrayList.add(node);
		}
		return arrayList;
	}
	
	
	public int depth(){
		return depth(root);
	}
	
	
 	public int depth(TreeNode<E> root){
		if(root == null) return 0;
		return Math.max(1+maxPathLength(root.left)+maxPathLength(root.right),Math.max(depth(root.left),depth(root.right)));
	}
	
	public int maxPathLength(TreeNode<E> root){
		if(root == null){
			return 0;
		}
		int rightLength=maxPathLength(root.right);
		int leftLength=maxPathLength(root.left);
		if(rightLength > leftLength)
			return 1 + rightLength;
		else
			return 1 + leftLength;
	}
	
	// Exercise 25.5 and 25.6 additions:
	public int countLeaves(){
		return countLeaves(root);
	}
	
	public int countLeaves(TreeNode<E> root){
		if(root == null) 
			return 0;
		else if(root.left == null && root.right == null) 
			return 1;
		else 
			return countLeaves(root.left)+countLeaves(root.right);
	}
	
	public int countNonLeaves(){
		return size - countLeaves();
	}
} 