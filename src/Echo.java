
public class Echo {
	 public static void main( String[] args ){ 
		 for( int i = 0; i < args.length; i++){ 
			 System.out.println( args[ i ] );  //args�� parameter�� �޾ƿ´�.
		  } 
		 for(String arg : args) {
			 System.out.println(arg);
		 }
	 } 
} 
//java Echo wow wow1 wow2  -> �ϸ� ������ �׳� ����Ѵٴ°���???? 
//�����Ҷ����� parameter�� �ѱ�� ��츦 ����ϴ°���? -> yes 
//Eclipse������ ���? �����ų�� �׳� �ϸ� ����ִ� ��ü�� �����ؼ� �ƹ��͵� ��¾��� 
//��������
//argument�� �����ʹ�ư ������ Run as���� Run configuration�̿�. 
//Argument���ٰ� program argument�� ������ �ȴ�. ���� 
//������ �ʱ� ���������ϴ�~~

