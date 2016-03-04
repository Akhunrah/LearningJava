import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeView extends JPanel{
	private BinaryTree<Integer> tree;
	private JTextField jtfKey = new JTextField(5);
	private JTextField jtfOut = new JTextField(30);
	private PaintTree paintTree = new PaintTree();
	private JButton jbtInsert = new JButton("Insert");
	private JButton jbtDelete = new JButton("Delete");
	private JButton jbtSearch = new JButton("Search");
	private JButton jbtClear = new JButton("Clear");
	private Queue<BinaryTree.TreeNode> pathQueue = new LinkedList<BinaryTree.TreeNode>();
	private ArrayList<BinaryTree.TreeNode> pathAnim = new ArrayList<BinaryTree.TreeNode>();
	
	
	

	private Timer timer;
/*	= new Timer(1000, new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(!pathQueue.isEmpty()){
				pathAnim.add(pathQueue.poll());
				paintTree.repaint();
			}
			else{
				timer.stop();
				pathAnim.clear();
				paintTree.repaint();
			}
		}
	});*/
	
	public BinaryTreeView(BinaryTree<Integer> tree){
		this.tree = tree;
		setUI();
	}
	
	private void setUI(){
		this.setLayout(new BorderLayout());
		add(paintTree, BorderLayout.CENTER);
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter a key: "));
		panel.add(jtfKey);
		panel.add(jbtSearch);
		panel.add(jbtInsert);
		panel.add(jbtDelete);
		panel.add(jbtClear);
		
		add(panel,BorderLayout.NORTH);
		
		jtfOut.setEditable(false);
		add(jtfOut, BorderLayout.SOUTH);
		
		jbtSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int key = Integer.parseInt(jtfKey.getText());
				pathQueue = new LinkedList(tree.path(key));
				
				timer = new Timer(500,new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(!pathQueue.isEmpty()){
							pathAnim.add(pathQueue.poll());
							paintTree.repaint();
						}
						else{
							timer.stop();
							pathAnim.clear();
							paintTree.repaint();
							if(tree.search(key)){
								jtfOut.setText(key + " is in the tree.");
							}
							else{
								jtfOut.setText(key + " is not in the tree.");
							}
						}
					}
				});

				timer.start();
				jtfKey.setText("");
			}
		});
		
		jbtInsert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int key = Integer.parseInt(jtfKey.getText());
				pathQueue = new LinkedList(tree.path(key));
				
				timer = new Timer(500,new ActionListener(){
					public void actionPerformed(ActionEvent e){
						if(!pathQueue.isEmpty()){
							pathAnim.add(pathQueue.poll());
							paintTree.repaint();
						}
						else{
							timer.stop();
							pathAnim.clear();
							paintTree.repaint();
							if(tree.search(key)){
								jtfOut.setText(key + " is already in the tree.");
							}
							else{
								tree.insert(key);
								jtfOut.setText(key+" was inserted into the tree.");
								paintTree.repaint();
							}
						}
					}
				});

				timer.start();
				jtfKey.setText("");
			}
		});
		
		jbtDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int key = Integer.parseInt(jtfKey.getText());
				if(!tree.search(key)){
					jtfOut.setText(key+" is not in the tree.");
				}
				else{
					tree.delete(key);
					jtfOut.setText(key+" was deleted from the tree.");
					paintTree.repaint();
				}
				jtfKey.setText("");
			}
		});
		
		jbtClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tree.clear();
				jtfOut.setText("");
				paintTree.repaint();
			}
		});
	}
	
	
	class PaintTree extends JPanel{
		private int radius = 20;
		private int vGap = 50;
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			if(tree.getRoot()!= null){
				displayTree(g,tree.getRoot(), getWidth()/2,30,getWidth()/4);
			}
		}
		
		private void displayTree(Graphics g, BinaryTree.TreeNode root, int x, int y, int hGap){
			if(pathAnim.contains(root)){
				g.setColor(Color.CYAN);
				g.fillOval(x-radius,y-radius,2*radius,2*radius);
				g.setColor(Color.BLACK);
			}
			g.drawOval(x-radius,y-radius,2*radius,2*radius);
			g.drawString(root.element+"",x-6,y+4);
			
			if(root.left != null){
				connectLeftChild(g,x-hGap,y+vGap,x,y);
				displayTree(g,root.left,x-hGap,y+vGap,hGap/2);
			}
			
			if(root.right != null){
				connectRightChild(g,x+hGap,y+vGap,x,y);
				displayTree(g,root.right,x+hGap,y+vGap,hGap/2);
			}
		}
		
		private void connectLeftChild(Graphics g, int x1, int y1, int x2, int y2){
			double d = Math.sqrt(vGap*vGap+(x2-x1)*(x2-x1));
			int x11 = (int)(x1+radius*(x2-x1)/d);
			int y11 = (int)(y1-radius*vGap/d);
			int x21 = (int)(x2-radius*(x2-x1)/d);
			int y21 = (int)(y2+radius*vGap/d);
			g.drawLine(x11,y11,x21,y21);
		}
		
		private void connectRightChild(Graphics g, int x1, int y1, int x2, int y2){
			double d = Math.sqrt(vGap*vGap+(x2-x1)*(x2-x1));
			int x11 = (int)(x1-radius*(x1-x2)/d);
			int y11 = (int)(y1-radius*vGap/d);
			int x21 = (int)(x2+radius*(x1-x2)/d);
			int y21 = (int)(y2+radius*vGap/d);
			g.drawLine(x11,y11,x21,y21);
		}
	}
	
	
	
	
}