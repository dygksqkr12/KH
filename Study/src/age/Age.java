package age;

import java.util.Scanner;

/**
 * 하한 ~ 상한 범위의 여러 학생 나이를 입력받아 각 연령의 학생이 몇명씩인가를 세는 프로그램을 작성하시오.

- 입력: 나이 하한, 나이 상한, 학생수(n), 타당한 나이 n개  <-- 반드시 이 순서로 입력받을 것
- 출력: 연령별 학생 수

- 범위에 벗어난 나이를 입력하면 다시 입력 받을 것
- 배열의 길이는 넉넉히 잡지 말고, 필요한 자료 수에 꼭 맞도록 생성할 것
- 학생 수나 나이 상한, 하한을 아래 예로 고정하면 안됨

- 실행 예:
hw4_1: 홍길동

나이 하한 입력: 19
나이 상한 입력: 24
학생 수 입력: 5

나이 입력: 12
범위를 벗어났습니다. 다시 입력하세요.
나이 입력: 26
범위를 벗어났습니다. 다시 입력하세요.
나이 입력: 19
나이 입력: 23
나이 입력: 23
나이 입력: 21
나이 입력: 23

나이  학생수
19 1
20 0
21 1
22 0
23 3
24 0
 * @author yohan
 *
 */
public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("나이 하한 입력 : ");
        int min = sc.nextInt();
        System.out.print("나이 상한 입력 : ");
        int max = sc.nextInt();
        System.out.print("학생 수 입력 : ");
        int num = sc.nextInt();
        int length = max-min+1;
        
        int[] countArr = new int[length];
        
        for (int i = 0; i < num; i++) {
            System.out.print("나이 입력 : ");
            int input = sc.nextInt();
            if(input>=min && input<=max)
                countArr[input-min]++;
            else {
                System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
                i--;
            }
        }
        System.out.println("나이      학생수");
        for (int i = 0; i < length; i++) {
            
            System.out.println((min+i) + "   " +countArr[i]);
        }
	}

}
