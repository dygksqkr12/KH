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
 *
 */
public class ManagerTest {

	public static void main(String[] args) {
//		(1) 봉급을 1000으로 초기화 한 직원 생성
		Employee m1 = new Employee(1000);
//		(2) 직원 봉급, 세금액을 조회하여 출력
		System.out.println("직원");
		System.out.println("salary = " + m1.getSalary());
		System.out.println("tax = " + m1.getTax());
//		(3) 봉급을 1000, 보너스를 500로 초기화 한 매니저 생성
		Manager m2 = new Manager(1000, 500);
//		(4) 매니저의 봉급, 보너스, 세금액을 조회하여 출력
		System.out.println("매니저");
		System.out.println("salary = " + m2.getSalary());
		System.out.println("bonus = " + m2.getBonus());
		System.out.println("tax = " + m2.getTax());
	}

}
