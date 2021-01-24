package bank;

/**
 * - BankAccountTest 클래스 - main 메소드에서 다음을 수행
   (1) 은행계좌 객체를 하나 생성
   (2) 계좌에 2000원을 입금 -- deposit() 호출
   (3) 계좌에 3000원을 입금 -- deposit() 호출
   (4) 계좌의 잔액 필드를 출력

   (5) 계좌를 잔액조회(getBalance() 호출)하여 잔액을 알아내어 출력 ****
    (6) 계좌에서 1000원을 출금 ****
    (7) 계좌를 잔액조회하여 잔액을 알아내어 출력 ****
 *
 */
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.deposit(2000);
		acc.deposit(3000);
		acc.withdraw(6000);
		
		System.out.println("잔액 : " + acc.getBalance() + "원");
	}

}