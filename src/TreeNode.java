/*2016. 03. 04 03�� �ڷᱸ�� ���͵� �ڵ� ������*/
public class TreeNode {
	int value;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int value) {
		this.value = value;
		// Q : �� ����ε� l,r �Ȱ�����....?
		// A : �ٷ� null�� ó���ȴٰ� �Ѵ�.
	}

	TreeNode add(TreeNode node, int value) {
		// node�� ���� Ž���� ���� ����
		// ���� ��尡 ���� �� - �� ���� ������ �� �߰��Ѵ�.
		if (node == null) {
			node = new TreeNode(value);
			return node;
		}
		// ��� ������ value�� ũ�� ������
		if (node.value < value) {
			node.right = add(node.right, value);
		}
		// ��� ������ value�� ������ ����
		else {
			node.left = add(node.left, value);
		}
		// �ϸ� add�� ������ ���ư�.. �Ƹ�
		return node;
	}

	void inOrder(TreeNode node) {
		if (node == null) {

		} else if (node.left == null && node.right == null) {
			// ���̸� ����Ѵ�.
			System.out.println(node.value);
		} else if (node.left != null) {
			inOrder(node.left);
			// ���ƿ� �ڿ��� ����Ѵ�.
			System.out.println(node.value);
			inOrder(node.right);
		} else if (node.right != null) {
			System.out.println(node.value);
			inOrder(node.right);
		}
	}

	boolean preOrder(TreeNode node) {
		if (node == null) {

		} else if (node.left == null && node.right == null) {
			System.out.println(node.value);
		} else if (node.left != null) {
			// �߼����� ���� ���Ⱑ �޶�����!
			System.out.println(node.value);
			preOrder(node.left);
			preOrder(node.right);
			return true;
		} else if (node.right != null) {
			System.out.println(node.value);
			preOrder(node.right);
		}
		return true;
	}

	void postOrder(TreeNode node) {
		if (node == null) {

		} else if (node.left == null && node.right == null) {
			System.out.println(node.value);
		} else if (node.left != null) {
			// ���ٿ� ������ �μ��ϵ��� �Ѵ�.
			// �ڵ尡 �� �κи� ��� �ٲ�±���...
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.value);
		} else if (node.right != null) {
			System.out.println(node.value);
			postOrder(node.right);
		}
	}

	// �����̰� ������ delete!!

/*    boolean delete(TreeNode root, TreeNode node, int data) {
         ��尡 null�̸� false ��ȯ 
-        if (node == null) {
+        if (node  == null) {
            return false;
        }

        �ش� ��尡 ������ ����� 
       if (node.value == data) {
            ������ ��忡 ������ ���� 
           TreeNode tmp = node;
            ������ ��带 ������ �����ϱ� ���� �θ� ��带 ���� 
           TreeNode preTmp = node;

            ������ ��带 ä��� ��忡 ���� �켱����
            * 1. ���� �ڽ� ��带 �������� �ϴ� ���� Ʈ������ ���� ���� ū ���
            * 2. ������ �ڽ� ��带 �������� �ϴ� ���� Ʈ������ ���� ���� ���� ��� 
            ���ʺ��� Ž�� 
           if (tmp.left != null) {
                ���� �ڽ� ���� �̵� 
               tmp = tmp.left;

                ������ �ڽ����� ������ �̵� 
                while (true) {
                    if (tmp.right == null) {
                        int tmpValue = tmp.value;
-                        root.value = tmpValue;
-                         ������ �θ� ���κ��� ���� ���� 
-                        preTmp.right = null;
+                        node.value = tmpValue;
+                         ������ ��忡 ���� ����� �� ���� ���� 
+                        preTmp.left = tmp.left;
+                         ������ ��� 
+                        tmp = null;
                        return true;
                    }
                    preTmp = tmp;
                   tmp = tmp.right;
               }
           }
            ���� ��尡 ���ٸ� ������ ��� Ž�� 
           else if (tmp.right != null) {
               tmp = tmp.right;

                while (true) {
                    if (tmp.left == null) {
                        int tmpValue = tmp.value;
-                        root.value = tmpValue;
-                        preTmp.right = null;
+                        node.value = tmpValue;
+                        preTmp.right = tmp.right;
+                        tmp = null;
                        return true;
                    }
                    preTmp = tmp;
                   tmp = tmp.left;
               }
           }
       }

        ���� �ڽ� ����� ���� Ʈ������ ������ ��带 ã�� ���ߴٸ�
        * ������ �ڽ� ����� ����Ʈ������ ������ ��带 Ž�� 
       if (delete(root, node.left, data) == false) {
           delete(root, node.right, data);
       }
        ������ ����� ���� 
       return false;
   }*/
}