/*2016.03.04 - 2*/
public class ArrayUtil {
	
	public static int[] concat(final int[] a, final int[] b) {  //a, b�� ���� ����ϸ� �ȵǴϱ�!!
		int[] c = null;
		//a Ȥ�� b�� null�̸� length���� ������ ���Ƿ� Ȯ���� ���ְ� ����.
		
		//�Ʒ��� �������� �ڵ�....!
		int length = ((a==null) ? 0 : a.length) + ((b==null) ? 0 : b.length) ;
		c = new int[length];
		int destPos = 0;
		if(a!=null) {
			System.arraycopy(a, 0, c, destPos, a.length);
			destPos = a.length;
		}
		if(b!=null) {
			System.arraycopy(a, 0, c, destPos, b.length);
			//����� ���� 4���� �־��µ� �ξ� ����� ����.......
		}
		return c;
		
		/*if (a == null && b == null) {
			return null;
		} else if (a == null && b != null) {
			c = new int[a.length + b.length];
			System.arraycopy(b,0,c,0,b.length);
			return c;
		} else if(a != null && b != null) {
			c = new int[a.length + b.length];
			System.arraycopy(a,0,c,0,a.length);
			return c;
		} else {
			c = new int[a.length + b.length];
			//����!!!
			System.arraycopy(a, 0, c, 0, a.length);
			System.arraycopy(b, 0, c, a.length, b.length);
			return c;*/
			/*
			 * 
			 * int length = ((a==null) :? 0 : a.length) + (b==null) :? 0 : b.length) ;
			 * ��õ�� ���ص� �̷��� �� ���� �ִ�.. ��.
			 * 
			 * int aLength, bLength;
      			aLength = bLength = 0;
      			if(a != null)
         			aLength = a.length;
      			if(b != null)
         				bLength = b.length;
      			c = new int[aLength + bLength];
      			for(int i=0;i<aLength;i++)
         			c[i] = a[i];
      			for(int i=0;i<bLength;i++)
         			c[aLength+i] = b[i];
			
		}*/
	}
	
	public static boolean equals(int[] a, int[] b) {
		/*���������� �߿��ؿ�*/
		if ( a== null || b == null) {
			return false;
		}
		/*���̰� Ʋ���� ���� ���� ����*/
		if (a.length != b.length) {
			return false;
		}
			
		for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}		
		}
		return true;
	}
}
