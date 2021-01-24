package bank;

/**
 * 다음과 같은 은행계좌 프로그램을 작성하시오.

- BankAccount 클래스 - 은행계좌를 나타내는 클래스
    필드 : 잔액(balance)
     메소드 : 입금(deposit)
              잔액조회(getBalance) ****
              출금(withdraw) ****

Q: getBalance()의 매개변수와 리턴 타입은?  -- 매개변수 없고, 잔액 리턴
Q: withdraw()의 매개변수와 리턴 타입은? -- 매개변수는 출금액
 *
 */
public class BankAccount {
	private int balance;

	//입금
	public void deposit(int num) {
		balance += num;
	}
	//잔액
	public int getBalance() {
		return balance;
	}
	//출금
	public void withdraw(int num) {
		if(num > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= num;
	}
}
