/*2016.03.04 - 2*/
public class ArrayUtil {
	
	public static int[] concat(final int[] a, final int[] b) {  //a, b는 내가 사용하면 안되니까!!
		int[] c = null;
		//a 혹은 b가 null이면 length에서 에러가 나므로 확인을 해주고 쓴다.
		
		//아래는 선생님의 코드....!
		int length = ((a==null) ? 0 : a.length) + ((b==null) ? 0 : b.length) ;
		c = new int[length];
		int destPos = 0;
		if(a!=null) {
			System.arraycopy(a, 0, c, destPos, a.length);
			destPos = a.length;
		}
		if(b!=null) {
			System.arraycopy(a, 0, c, destPos, b.length);
			//경우의 수가 4개나 있었는데 훨씬 깔끔해 졌다.......
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
			//주의!!!
			System.arraycopy(a, 0, c, 0, a.length);
			System.arraycopy(b, 0, c, a.length, b.length);
			return c;*/
			/*
			 * 
			 * int length = ((a==null) :? 0 : a.length) + (b==null) :? 0 : b.length) ;
			 * 추천은 안해도 이렇게 할 수도 있다.. 왕.
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
		/*간단하지만 중요해요*/
		if ( a== null || b == null) {
			return false;
		}
		/*길이가 틀려도 비교할 것이 없다*/
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
