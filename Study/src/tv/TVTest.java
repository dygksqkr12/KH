package tv;

/**
 * - TelevisionTest 클래스: main 메소드에서 다음을 수행
  (1) 크기가 3인 텔레비전 배열에 텔레비전을 생성하여 저장
  (2) 텔레비전 채널을 7, 9, 11로 지정
  (3) 반복문을 이용하여 배열에 저장된 모든 텔레비전의 채널을 출력
 * @author yohan
 *
 */
public class TVTest {

	public static void main(String[] args) {
		TV[] ch = new TV[3];
		ch[0] = new TV(7);
		ch[1] = new TV(9);
		ch[2] = new TV(11);
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}

}
