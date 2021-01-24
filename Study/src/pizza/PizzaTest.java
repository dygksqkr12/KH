package pizza;
/**
 * PizzaTest 클래스: main 메소드에서 다음을 수행
 * (1) 피자를 하나 생성
 * (2) 피자의 브랜드, 지름, 가격을 적절히 지정
 * (3) 피자의 광고 문구(브랜드, 지름, 가격을 언급)를 출력
 * - 주의: 브랜드, 지름, 가격 출력시 리터럴을 사용하지 말고, 
 * 		 210쪽 라인 9와 같이 피자 객체의 필드를 사용할 것
 */
public class PizzaTest {

	public static void main(String[] args) {
//		Pizza pz = new Pizza();
//		pz.setBrands("도미노피자");
//		pz.setDiameter(20);
//		pz.setInteger(20000);
		
		//파라미터 생성자
		Pizza pz = new Pizza("도미노", 20, 20000);
		Pizza pz1 = new Pizza("피자헛", 20, 22000);
		
//		System.out.println(pz.getBrands() + " " +pz.getDiameter() + " " +pz.getInteger());
		System.out.println(pz);
		System.out.println(pz1);
	}

}
