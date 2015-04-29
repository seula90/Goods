package Goods;

public class GoodsApp {

	public static void main(String[] args) { // 클래스 이름으로 접근하기 위해 static
	
		Goods camera = new Goods(); //객체화 하는 부분
		
		camera.setName("Nikon"); 
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		Goods camera2 = new Goods("Nikon2",200,300,100000); 
		
		System.out.println("상품이름 : " + camera.getName());
		System.out.println("상품가격 : " + camera.getPrice());
		System.out.println("재고수량 : " + camera.getCountStock());
		System.out.println("팔린수량 : " + camera.getCountSold());
		System.out.println("");
		System.out.println("상품이름 : " + camera2.getName());
		System.out.println("상품가격 : " + camera2.getPrice());
		System.out.println("재고수량 : " + camera2.getCountStock());
		System.out.println("팔린수량 : " + camera2.getCountSold());
	}
}

