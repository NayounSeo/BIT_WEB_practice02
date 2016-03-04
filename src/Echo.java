
public class Echo {
	 public static void main( String[] args ){ 
		 for( int i = 0; i < args.length; i++){ 
			 System.out.println( args[ i ] );  //args로 parameter를 받아온다.
		  } 
		 for(String arg : args) {
			 System.out.println(arg);
		 }
	 } 
} 
//java Echo wow wow1 wow2  -> 하면 세개를 그냥 출력한다는거지???? 
//시작할때부터 parameter를 넘기는 경우를 얘기하는거지? -> yes 
//Eclipse에서는 어떻게? 실행시킬때 그냥 하면 비어있는 객체로 생각해서 아무것도 출력없이 
//에러없음
//argument는 오른쪽버튼 눌러서 Run as에서 Run configuration이용. 
//Argument에다가 program argument를 넣으면 된다. 오오 
//연수가 필기 보내줬읍니당~~

