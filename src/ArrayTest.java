import java.util.Arrays;  //헐 자동으로 추가해 줌
/*2016. 03. 04*/
public class ArrayTest {
	int[] intArray2 = null;
	
	public static void main(String[] args) {
		char[] c = new char[3];
		c[0] = 'B';
		c[1] = 'I';
		c[2] = 'T';
		
		System.out.println(c.length);
		System.out.println(c);
		//배열 객체의 참조값
		System.out.println(System.identityHashCode(c));
		
		String s = new String("hello");
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(System.identityHashCode(s));
		
		//배열의 선언
		int[] intArray = null;
		int[] intArray3 = new int[20];
		int[] intArray4 = { 0, 1, 2, 3, 4, 5};
		int[] intArray5;
		//intArray5 = {10, 20, 30, 40};  선언과 동시에 초기화는 가능하지만 이렇게는 안된다!!
		
		//배열  Out Of Bound 예외
		/*try {
			intArray2[10] = 10;
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index out of Bound Error");
		}*/
		
	/*	자! 예제에서
		Student[] sArray = new Student[5];
		객체는 new Student(); 해줘야 생기는 거였지??
		그런데 new Student[5]에서는 그냥 5개 만들겠다고 얘기만 해준거고 
		아래에서 하나씩 새로 만들어줘야 해!!!@@@ 어제 Practice 2의 코드를 가져와 볼까?
		Goods[] goods = new Goods[3];
		for(i=0; i<3; i++) {
			goods[i] = new Goods();
		}
		요렇게 썼었습니다~~
		*/
		//바꾼 테마 알록달록 너무 예뻥 오늘은 버스안에서 생각도 했고 아침부터 좀 신난당
		//Array utility class 사용
		//int[] intArray6 = {20, 30, 10, 20, 1, 9};
		//int index = Arrays.binarySearch(intArray6, 20);
		//는.... 그냥 하려 했더니 소팅이 안되서 못한다고.......ㅎㅎㅎㅎㅎㅎㅎㅎ 소팅함수도 따로 있다지만 걍 함
		//이것이 binarySearch의 단점데스네~
		int[] intArray6 = {1,9,10, 20, 20, 30};
		int index = Arrays.binarySearch(intArray6, 20);
		System.out.println("이진 검색 결과 : " + index);  //4가 출력된다.
		
		//Sorting
		int[] intArray7 = {100, 20, 1500, 20, 1, 5, 6};
		Arrays.sort(intArray7);  //sorting~~~~
		//*******************************************************************************
		System.out.println(Arrays.toString(intArray7));
		//soString : 객체의 외부 표현을 위해 객체를 문자열로 변환하는 것
		
		//static에 대해 - static함수는 객체로 접근하지 않고  class 이름으로 접근함.
		//main도 java가 객체를 만들지 않음. class이름.main으로 접근함.
		//이런 클래스가  utility class라고....
		
		//System.out. 에는 println(int[])는 없어.... char는 있는데 int는 없어....
		//대신 object를 받는 애가 이썽.
		
		int[] intArray8 = {1, 5, 6, 20, 100, 1500};
		boolean b = Arrays.equals(intArray7, intArray8);
		System.out.println(b);
		
		
		Arrays.fill(intArray8, -10);
		System.out.println(Arrays.toString(intArray8));  //다 채워버렸으....
		
		//배열 복사
		int[] src = {10, 20, 30, 40, 50};
		int[] dest1 = src;  //같은 배열 객체 참조.
		System.out.println(Arrays.toString(dest1));
		int[] dest2 = new int[src.length];
		System.out.println(Arrays.toString(dest2));
		
		//MyArrayUtil 테스트 해보기
		boolean b2 = ArrayUtil.equals(src, dest1);
		System.out.println(b2);
		
		
	}

}
