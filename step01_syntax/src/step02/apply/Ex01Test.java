package step02.apply;

public class Ex01Test {

	String menu;
	int price;
	
	Ex01Test() {}
	
	void addPrice(int addPrice) {
		price = price + addPrice;
	}
	int getPrice() {
		return price;
	}
	String getMenu() {
		return menu;
	}
	
	public static void main(String[] args) {
		
		Ex01Test food = new Ex01Test();
		//System.out.println(food);
		food.menu = "Bean Paste Soup";
		food.price = 5000;
		
		System.out.println("2019년 " + food.getMenu() + "가격은 " + food.getPrice()+ "원이었다.");
		food.addPrice(500);
		System.out.println("2020년 " + food.getMenu() + "가격은 " + food.getPrice()+ "원일 것이다.");
	}
}
