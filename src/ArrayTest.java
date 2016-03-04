import java.util.Arrays;  //�� �ڵ����� �߰��� ��
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
		//�迭 ��ü�� ������
		System.out.println(System.identityHashCode(c));
		
		String s = new String("hello");
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(System.identityHashCode(s));
		
		//�迭�� ����
		int[] intArray = null;
		int[] intArray3 = new int[20];
		int[] intArray4 = { 0, 1, 2, 3, 4, 5};
		int[] intArray5;
		//intArray5 = {10, 20, 30, 40};  ����� ���ÿ� �ʱ�ȭ�� ���������� �̷��Դ� �ȵȴ�!!
		
		//�迭  Out Of Bound ����
		/*try {
			intArray2[10] = 10;
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index out of Bound Error");
		}*/
		
	/*	��! ��������
		Student[] sArray = new Student[5];
		��ü�� new Student(); ����� ����� �ſ���??
		�׷��� new Student[5]������ �׳� 5�� ����ڴٰ� ��⸸ ���ذŰ� 
		�Ʒ����� �ϳ��� ���� �������� ��!!!@@@ ���� Practice 2�� �ڵ带 ������ ����?
		Goods[] goods = new Goods[3];
		for(i=0; i<3; i++) {
			goods[i] = new Goods();
		}
		�䷸�� ������ϴ�~~
		*/
		//�ٲ� �׸� �˷ϴ޷� �ʹ� ���� ������ �����ȿ��� ������ �߰� ��ħ���� �� �ų���
		//Array utility class ���
		//int[] intArray6 = {20, 30, 10, 20, 1, 9};
		//int index = Arrays.binarySearch(intArray6, 20);
		//��.... �׳� �Ϸ� �ߴ��� ������ �ȵǼ� ���Ѵٰ�.......���������������� �����Լ��� ���� �ִ����� �� ��
		//�̰��� binarySearch�� ����������~
		int[] intArray6 = {1,9,10, 20, 20, 30};
		int index = Arrays.binarySearch(intArray6, 20);
		System.out.println("���� �˻� ��� : " + index);  //4�� ��µȴ�.
		
		//Sorting
		int[] intArray7 = {100, 20, 1500, 20, 1, 5, 6};
		Arrays.sort(intArray7);  //sorting~~~~
		//*******************************************************************************
		System.out.println(Arrays.toString(intArray7));
		//soString : ��ü�� �ܺ� ǥ���� ���� ��ü�� ���ڿ��� ��ȯ�ϴ� ��
		
		//static�� ���� - static�Լ��� ��ü�� �������� �ʰ�  class �̸����� ������.
		//main�� java�� ��ü�� ������ ����. class�̸�.main���� ������.
		//�̷� Ŭ������  utility class���....
		
		//System.out. ���� println(int[])�� ����.... char�� �ִµ� int�� ����....
		//��� object�� �޴� �ְ� �̽�.
		
		int[] intArray8 = {1, 5, 6, 20, 100, 1500};
		boolean b = Arrays.equals(intArray7, intArray8);
		System.out.println(b);
		
		
		Arrays.fill(intArray8, -10);
		System.out.println(Arrays.toString(intArray8));  //�� ä��������....
		
		//�迭 ����
		int[] src = {10, 20, 30, 40, 50};
		int[] dest1 = src;  //���� �迭 ��ü ����.
		System.out.println(Arrays.toString(dest1));
		int[] dest2 = new int[src.length];
		System.out.println(Arrays.toString(dest2));
		
		//MyArrayUtil �׽�Ʈ �غ���
		boolean b2 = ArrayUtil.equals(src, dest1);
		System.out.println(b2);
		
		
	}

}
