package employee;

/**
 * - ManagerTest 클래스의 main 메소드는 다음을 수행

(1) 봉급을 1000으로 초기화 한 직원 생성
(2) 직원 봉급, 세금액을 조회하여 출력

(3) 봉급을 1000, 보너스를 500로 초기화 한 매니저 생성
(4) 매니저의 봉급, 보너스, 세금액을 조회하여 출력

- 실행 예:

lab7_1: 홍길동

직원
salary = 1000
tax = 100

매니저
salary = 1000
bonus = 500
tax = 150

 * @author YOHAN
 *
 */
public class ManagerTest1 {

	public static void main(String[] args) {
		Employee1 e = new Employee1(1000);
		System.out.println(e.getSalary());
		System.out.println(e.getTax());
		
		Manager1 m = new Manager1(1000, 500);
		System.out.println(m.getSalary());
		System.out.println(m.getBonus());
		System.out.println(m.getTax());
	}

}
