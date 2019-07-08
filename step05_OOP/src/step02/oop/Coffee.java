/* 과제 내용
 * 1. 오늘 학습한 상속, 다형성 review
 * 2. 이해한 범위 내에서 메소드 하나 추가 개발
 */
package step02.oop;
class Beverage extends Object {
	String name;
	String size;
	int dice;
	
	Beverage() {
		super();
	}
	void myBvrg() {
		System.out.print("음료 : " + name + ", 사이즈: " + size );
	}
	int rollTheDice() {
		dice = (int) (6*Math.random());
		return Math.round(dice);
	}
}


public class Coffee extends Beverage {
	int NumOfShots;
	
	Coffee() { super();	}
	Coffee(int NumOfShots) {
		super();
		this.NumOfShots = NumOfShots;
	}
	String diceEvent() {
		super.rollTheDice();
		String coupon;
		if(dice == 1) {
			coupon = "샷 추가";
		}else if(dice == 2) {
			coupon = "얼음 추가";
		}else if(dice == 3) {
			coupon = "꽝! 다음 기회를 노려주세요.";
		}else if(dice == 4) {
			coupon = "사이즈 업";
		}else if(dice == 5) {
			coupon = "하나 더";
		}else if(dice == 6) {
			coupon = "꽝! 다음 기회를 노려주세요.";
		}else {
			coupon = "다시 한 번 굴려주세요!";
		}
		return coupon;
	}
	void myBvrg() {
		super.myBvrg();
		System.out.println(", 에스프레소" + NumOfShots + "샷");
	}

	static Object getRequirment() {
		return "\t\t\t< 요구사항: 크림 빼고 부탁드려요:) >";
	}
	
	public static void main(String[] args) {
		Coffee barista = new Coffee(3);
		barista.name = "Americano";
		barista.size = "Grande";
		barista.myBvrg();
		System.out.println("당첨결과: " + barista.diceEvent() + "\n");
		
		Beverage latte = new Coffee();
		latte.name = "Greentea Latte";
		latte.size = "Venti";
		Coffee greantea = (Coffee) latte;
		greantea.NumOfShots = 2;
		greantea.myBvrg();
		String rq = (String)getRequirment();
		System.out.println(rq);
		System.out.println("당첨결과: " + greantea.diceEvent());
	}

}
