/*2016. 03. 04 03�� �ڷᱸ�� ���͵� �ڵ� ������*/
public class TreeMain {
	 TreeNode root = null;
	    public static void main(String[] args) {
	    	 //�̷��� �ϸ� ���ư��ٰ� ��
	    	TreeNode treeRoot = new TreeNode(4);
	    	treeRoot.add(treeRoot, 20);
	    	treeRoot.add(treeRoot, 10);
	    	treeRoot.add(treeRoot, 30);
	    	treeRoot.add(treeRoot, 25);
	    	treeRoot.add(treeRoot, 32);
	    	treeRoot.add(treeRoot, 6);
	    	treeRoot.add(treeRoot, 8);
	    	treeRoot.add(treeRoot, 7);
	    	treeRoot.add(treeRoot, 24);
//	    	treeRoot.delete(treeRoot, treeRoot, 30);
	    	treeRoot.inOrder(treeRoot);
//  		tree.root.preOrder(tree.root);
//  		tree.root.postOrder(tree.root);

	 	    /*�ȵǴ� �ڵ�
	        TreeNode tree = new TreeNode(2);
	        tree.root = new TreeNode(4);
	        tree.root.add(tree.root, 2);
	        tree.root.add(tree.root, 6);
	        tree.root.add(tree.root, 5);
	        tree.root.add(tree.root, 1);
	        tree.root.add(tree.root, 3);
	        tree.root.add(tree.root, 7);
	        tree.root.inOrder(tree.root);
//	        tree.root.preOrder(tree.root);
//	        tree.root.postOrder(tree.root);
*/	        
	    }
}
