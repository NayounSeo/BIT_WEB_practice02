/*2016. 03. 04 03의 자료구조 스터디 코드 수정본*/
public class TreeNode {
	int value;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int value) {
		this.value = value;
		// Q : 왜 노드인데 l,r 안가져가....?
		// A : 바로 null로 처리된다고 한다.
	}

	TreeNode add(TreeNode node, int value) {
		// node는 다음 탐색을 위한 변수
		// 다음 노드가 없을 때 - 맨 끝을 만났을 때 추가한다.
		if (node == null) {
			node = new TreeNode(value);
			return node;
		}
		// 노드 값보다 value가 크면 오른쪽
		if (node.value < value) {
			node.right = add(node.right, value);
		}
		// 노드 값보다 value가 작으면 왼쪽
		else {
			node.left = add(node.left, value);
		}
		// 하면 add는 멀쩡히 돌아감.. 아마
		return node;
	}

	void inOrder(TreeNode node) {
		if (node == null) {

		} else if (node.left == null && node.right == null) {
			// 끝이면 출력한다.
			System.out.println(node.value);
		} else if (node.left != null) {
			inOrder(node.left);
			// 돌아온 뒤에는 출력한다.
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
			// 중순위와 비교해 여기가 달라졌음!
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
			// 갔다온 다음에 인쇄하도록 한다.
			// 코드가 이 부분만 계속 바뀌는구만...
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.value);
		} else if (node.right != null) {
			System.out.println(node.value);
			postOrder(node.right);
		}
	}

	// 예닮이가 구현한 delete!!

/*    boolean delete(TreeNode root, TreeNode node, int data) {
         노드가 null이면 false 반환 
-        if (node == null) {
+        if (node  == null) {
            return false;
        }

        해당 노드가 삭제할 노드라면 
       if (node.value == data) {
            삭제할 노드에 접근할 변수 
           TreeNode tmp = node;
            삭제할 노드를 실제로 삭제하기 위해 부모 노드를 저장 
           TreeNode preTmp = node;

            삭제한 노드를 채우는 노드에 대한 우선순위
            * 1. 왼쪽 자식 노드를 기준으로 하는 서브 트리에서 값이 가장 큰 노드
            * 2. 오른쪽 자식 노드를 기준으로 하는 서브 트리에서 값이 가장 작은 노드 
            왼쪽부터 탐색 
           if (tmp.left != null) {
                왼쪽 자식 노드로 이동 
               tmp = tmp.left;

                오른쪽 자식으로 끝까지 이동 
                while (true) {
                    if (tmp.right == null) {
                        int tmpValue = tmp.value;
-                        root.value = tmpValue;
-                         삭제할 부모 노드로부터 연결 해제 
-                        preTmp.right = null;
+                        node.value = tmpValue;
+                         삭제한 노드에 의해 생기는 빈 공간 연결 
+                        preTmp.left = tmp.left;
+                         삭제할 노드 
+                        tmp = null;
                        return true;
                    }
                    preTmp = tmp;
                   tmp = tmp.right;
               }
           }
            왼쪽 노드가 없다면 오른쪽 노드 탐색 
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

        왼쪽 자식 노드의 서브 트리에서 삭제할 노드를 찾지 못했다면
        * 오른쪽 자식 노드의 서브트리에서 삭제할 노드를 탐색 
       if (delete(root, node.left, data) == false) {
           delete(root, node.right, data);
       }
        삭제할 대상이 없음 
       return false;
   }*/
}