
public class GoodsTest {
	public static void main(String[] args) {
		Goods camera = new Goods();
//		camera.price = -1000;
//		price�� private�̶� �ȵſ�~~
		camera.setPrice(-1000);
		System.out.println(camera.getPrice());
		camera.setName("Andelica");
		camera.setPrice(100000);
		camera.setCountSold(10);
		camera.setCountStock(200);
		System.out.println(camera);
	}

}
