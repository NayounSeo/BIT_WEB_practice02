
public class Game369GodZayoung {
	static int count = 0; // 짝 횟수 구할 답
	public static void divide(int n) {
		if ( n < 1 ) // 기저사례 1.나눌 수가 더 이상 없으면,
			return;
		int num = n % 10; // 일의 자리를 받아서,
	    if( num % 3 == 0 && num != 0) // 3의 배수로 떨어 지면, 3,6,9
	    	//으아아아 어쩐지 길어지면 다 줄일 방법이 있네....
	    	//%3이라니ㅜㅠㅜㅠㅜㅠㅜ 그리고 0만...아.....
	    	//오늘 이해가 되는 걸 보니 정말 상태가 안좋아서 안읽혔던 걸까
	    	//그렇게 믿고싶닿ㅎㅎ
	    	count++;
	    divide(n/10); // 10으로 나눠주고 재귀 호출,
	    //와.... 재귀호출....
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
					   System.out.print("짝");
				   System.out.println("");
				   }
			}
	   }
}

