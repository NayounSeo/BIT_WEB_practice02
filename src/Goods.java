
public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public void setPrice(int price) {
		//�׷��� ���� ���� �� �˾ƺ����� �ʾ�..?�̤Ф̤� ���÷�»....
		if (price <0) {
			price = 0;
		} //else�Ƚᵵ �� �ȴ� �ڹ� ����? �� ���µ��� �޶� �׷���!
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