import javax.swing.*;
public class DisplayBinaryTree extends JApplet{
	public DisplayBinaryTree(){
		add(new BinaryTreeView(new BinaryTree<Integer>()));
	}
	
	public static void main(String[] args){
		DisplayBinaryTree display = new DisplayBinaryTree();
		display.setVisible(true);
	}
}