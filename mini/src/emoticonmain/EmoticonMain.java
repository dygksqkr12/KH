package emoticonmain;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EmoticonMain {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		//제목지정
		f.setTitle("EmoticonMain");
		//크기지정
		f.setSize(700, 600);
		//위치지정
//		f.setLocation(0,0);
		f.setLocationRelativeTo(null); // 가운데 띄우기
		
		//X버튼시 종료
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//자식 컴포넌트 추가
		f.add(new JLabel("하이"));
		
		//시각화처리
		f.setVisible(true);
	}
}
