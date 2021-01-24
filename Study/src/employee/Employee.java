package employee;

/**
 * 직원(Employee) 클래스를 상속하는 매니저(Manager) 클래스를 정의하고 사용하는 프로그램을 작성하시오.

- Employee 클래스
  필드: 봉급(salary)
  메소드:
     봉급의 getter/setter
     getTax - 세금액(봉급의 10%)을 리턴
     봉급을 매개변수로 받아 초기화 하는 생성자
----------------------------------------------------------
목적
- 상속에서 생성자 정의와 메소드 오버라이딩을 연습한다.
 *
 */
public class Employee {
	private int salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int salary) {
		super();
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double getTax() {
		return salary / 10;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}

}
