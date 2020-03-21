
public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree main = new BinarySearchTree();
		main.addTreeNode2(3);
		main.addTreeNode2(5);
		main.addTreeNode2(1);
		main.addTreeNode2(4);
		main.addTreeNode2(3);
	}

	TreeNode root;
	

	public void addTreeNode(int value) {

		TreeNode newNode = new TreeNode(value);

		if (this.root == null) {
			this.root = newNode;
			return;
		}

		TreeNode focusNode = root;
		TreeNode parent;

		while (true) {
			parent = focusNode;

			if (value < focusNode.data) {
				focusNode = focusNode.left;
				if (focusNode == null) {
					parent.left = newNode;
					return;
				}
			} else {
				focusNode = focusNode.right;
				parent.right = newNode;
				return;
			}
		}

	}

	public void addTreeNode2(int value) {
		
		TreeNode newNode = new TreeNode(value);
		TreeNode currentNode=root;
		
		if(this.root == null) {
			root = newNode;
			return;
		}
		
		while(true) {
			if(value < currentNode.data) {
				if(currentNode.left==null) {
					currentNode.left = newNode;
					currentNode = root;
					return;
				}
				else {
					currentNode = currentNode.left;
				}
			}
			else {
				if(currentNode.right==null) {
					currentNode.right = newNode;
					currentNode = root;
					return;
				}
				else {
					currentNode = currentNode.right;
				}
			}
		}
		
	}

}
