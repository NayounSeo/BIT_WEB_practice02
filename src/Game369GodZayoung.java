
public class Game369GodZayoung {
	static int count = 0; // 側 判呪 姥拝 岩
	public static void divide(int n) {
		if ( n < 1 ) // 奄煽紫景 1.蟹喚 呪亜 希 戚雌 蒸生檎,
			return;
		int num = n % 10; // 析税 切軒研 閤焼辞,
	    if( num % 3 == 0 && num != 0) // 3税 壕呪稽 恭嬢 走檎, 3,6,9
	    	//生焼焼焼 嬢他走 掩嬢走檎 陥 匝析 号狛戚 赤革....
	    	//%3戚虞艦ぬばぬばぬばぬ 益軒壱 0幻...焼.....
	    	//神潅 戚背亜 鞠澗 杏 左艦 舛源 雌殿亜 照疏焼辞 照石縛揮 杏猿
	    	//益係惟 肱壱粛願ぞぞ
	    	count++;
	    divide(n/10); // 10生稽 蟹寛爽壱 仙瑛 硲窒,
	    //人.... 仙瑛硲窒....
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
					   System.out.print("側");
				   System.out.println("");
				   }
			}
	   }
}

