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
		
		System.out.println("2019�� " + food.getMenu() + "������ " + food.getPrice()+ "���̾���.");
		food.addPrice(500);
		System.out.println("2020�� " + food.getMenu() + "������ " + food.getPrice()+ "���� ���̴�.");
	}
}
