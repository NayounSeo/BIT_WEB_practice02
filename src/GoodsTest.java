
public class GoodsTest {
	public static void main(String[] args) {
		Goods camera = new Goods();
//		camera.price = -1000;
//		price는 private이라서 안돼요~~
		camera.setPrice(-1000);
		System.out.println(camera.getPrice());
		camera.setName("Andelica");
		camera.setPrice(100000);
		camera.setCountSold(10);
		camera.setCountStock(200);
		System.out.println(camera);
	}

}
