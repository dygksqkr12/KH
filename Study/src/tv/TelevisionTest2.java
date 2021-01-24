package tv;

/**
 * - TelevisionTest 클래스: main 메소드에서 다음을 수행 
 * (1) 크기가 3인 텔레비전 배열에 텔레비전을 생성하여 저장 
 * (2) * 텔레비전 채널을 7, 9, 11로 지정 
 * (3) 반복문을 이용하여 배열에 저장된 모든 텔레비전의 채널을 출력
 * 
 * - 힌트: 유인물 문제5-3
 *
 */
public class TelevisionTest2 {

	public static void main(String[] args) {
//		(1) 크기가 3인 텔레비전 배열에 텔레비전을 생성하여 저장 
		Television2[] tv = new Television2[3];
//		(2) * 텔레비전 채널을 7, 9, 11로 지정 
		tv[0] = new Television2(7);
		tv[1] = new Television2(9);
		tv[2] = new Television2(11);
//		(3) 반복문을 이용하여 배열에 저장된 모든 텔레비전의 채널을 출력
		for (int i = 0; i < tv.length; i++) {
			System.out.println(tv[i]);
		}
	}

}
