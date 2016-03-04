
public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public void setPrice(int price) {
		//그런데 뭐야 원래 잘 알아봐주지 않아..?ㅜㅠㅜㅠ 케플러쨩....
		if (price <0) {
			price = 0;
		} //else안써도 잘 된다 자바 한정? 아 들어가는데가 달라서 그렇대!
		this.price = price; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
	
	

}
