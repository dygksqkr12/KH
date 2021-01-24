package employee;

/**
 * - Manager 클래스 - Employee를 상속
  필드: 보너스(bonus)
  메소드:
     보너스의 getter/setter
     봉급과 보너스를 매개변수로 받아 초기화 하는 생성자 
     getTax 오버라이드 - 매니저의 속성에 적합하게 세금액(봉급과 보너스 총액의 10%)을 리턴
 * @author YOHAN
 *
 */
public class Manager1 extends Employee1 {
	private int bonus;


	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double getTax() {
		return (getSalary() + bonus) / 10;
	}

	public Manager1(int salary, int bonus) {
		super(salary);
		this.bonus = bonus;
	}


}
