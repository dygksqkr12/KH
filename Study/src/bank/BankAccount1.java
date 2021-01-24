package bank;

/**
 * ---------------------------------------------------------
다음과 같은 은행계좌 프로그램을 작성하시오.

- BankAccount 클래스 - 은행계좌를 나타내는 클래스
    필드 : 잔액(balance) int
     메소드 : 입금(deposit) void, 파라미터 있음
              잔액조회(getBalance) int 파라미터 없음
              출금(withdraw) void 파라미터 있음, 잔액부족시 경고문 출력, 출금 x
 */
public class BankAccount1 {
	//잔액
	private int balance;
	
	//입금
	public void deposit(int num) {
		balance += num;
		System.out.println(num + "원 입금");
	}
	//잔액조회
	public int getBalance() {
//		System.out.println("잔액 : " + balance + "원");
		return balance;
	}
	//출금
	public void withdraw(int num) {
		if(balance < num) {
			System.out.println("잔액이 부족합니다.");
		} else {
			System.out.println(num + "원 출금");
			balance -= num;
		}
	}
}	
