
public class Game369GodZayoung {
	static int count = 0; // ¦ Ƚ�� ���� ��
	public static void divide(int n) {
		if ( n < 1 ) // ������� 1.���� ���� �� �̻� ������,
			return;
		int num = n % 10; // ���� �ڸ��� �޾Ƽ�,
	    if( num % 3 == 0 && num != 0) // 3�� ����� ���� ����, 3,6,9
	    	//���ƾƾ� ��¾�� ������� �� ���� ����� �ֳ�....
	    	//%3�̶�Ϥ̤Ф̤Ф̤Ф� �׸��� 0��...��.....
	    	//���� ���ذ� �Ǵ� �� ���� ���� ���°� �����Ƽ� �������� �ɱ�
	    	//�׷��� �ϰ�ʹꤾ��
	    	count++;
	    divide(n/10); // 10���� �����ְ� ��� ȣ��,
	    //��.... ���ȣ��....
	    }
	
	   public static void main(String[] args)
	   {
		   for(int i = 3 ; i < 1000 ; i++) {
			   count = 0;
			   divide(i);
			   if(count > 0)
			   {
				   System.out.print(i+" ");
				   for(int j = 0 ; j < count ; j++)
					   System.out.print("¦");
				   System.out.println("");
				   }
			}
	   }
}

