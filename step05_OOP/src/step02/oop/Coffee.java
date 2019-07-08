/* ���� ����
 * 1. ���� �н��� ���, ������ review
 * 2. ������ ���� ������ �޼ҵ� �ϳ� �߰� ����
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
		System.out.print("���� : " + name + ", ������: " + size );
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
			coupon = "�� �߰�";
		}else if(dice == 2) {
			coupon = "���� �߰�";
		}else if(dice == 3) {
			coupon = "��! ���� ��ȸ�� ����ּ���.";
		}else if(dice == 4) {
			coupon = "������ ��";
		}else if(dice == 5) {
			coupon = "�ϳ� ��";
		}else if(dice == 6) {
			coupon = "��! ���� ��ȸ�� ����ּ���.";
		}else {
			coupon = "�ٽ� �� �� �����ּ���!";
		}
		return coupon;
	}
	void myBvrg() {
		super.myBvrg();
		System.out.println(", ����������" + NumOfShots + "��");
	}

	static Object getRequirment() {
		return "\t\t\t< �䱸����: ũ�� ���� ��Ź�����:) >";
	}
	
	public static void main(String[] args) {
		Coffee barista = new Coffee(3);
		barista.name = "Americano";
		barista.size = "Grande";
		barista.myBvrg();
		System.out.println("��÷���: " + barista.diceEvent() + "\n");
		
		Beverage latte = new Coffee();
		latte.name = "Greentea Latte";
		latte.size = "Venti";
		Coffee greantea = (Coffee) latte;
		greantea.NumOfShots = 2;
		greantea.myBvrg();
		String rq = (String)getRequirment();
		System.out.println(rq);
		System.out.println("��÷���: " + greantea.diceEvent());
	}

}
