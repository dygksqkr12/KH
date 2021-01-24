package ncs.test7;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScoreFrame extends JFrame {
	int num1 =0;	
	int num2 =0;	
	
	Font font = new Font("HY견고딕", Font.BOLD, 30);
	
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	
	JFormattedTextField jf = new JFormattedTextField();
	
	public ScoreFrame() {
		
		jf.setBounds(0,0,900,900);
		add(jf);
		JFrame jf = new JFrame();

		jf.setTitle("문제 7");
		jf.setBounds(0, 0, 400, 400);

		JLabel jl0 = new JLabel("점수를 입력하세요");
		jl0.setBounds(50, 10, 400, 50);
		jl0.setFont(font);
		jf.add(jl0);

		JLabel jl1 = new JLabel("자바 : ");
		jl1.setBounds(10, 75, 50, 10);
		jf.add(jl1);
		jt1.setBounds(60, 70, 100, 20);
		jf.add(jt1);
		
		JLabel jl2 = new JLabel("SQL : ");
		jl2.setBounds(190, 75, 50, 10);
		jf.add(jl2);
		jt2.setBounds(250, 70, 100, 20);
		jf.add(jt2);
		
		JLabel jl3 = new JLabel("총점 : ");
		jl3.setBounds(10, 265, 50, 10);
		jf.add(jl3);
		jt3.setBounds(60, 260, 100, 20);
		jf.add(jt3);

		JLabel jl4 = new JLabel("평균 : ");
		jl4.setBounds(190, 265, 50, 10);
		jf.add(jl4);
		jt4.setBounds(250, 260, 100, 20);
		jf.add(jt4);

		JButton jb = new JButton("계산하기");
		jb.setBounds(130, 150, 120, 40);
		jf.add(jb);
		
		jb.addActionListener(new ActionHandler());

		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	
	public class ActionHandler implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			num1= Integer.parseInt(jt1.getText()); 
			num2= Integer.parseInt(jt2.getText()); 
			
			int sum = num1+num2;; 
			int avereage = sum/2;; 
			
			String a = Integer.toString(sum); 
			String b = Integer.toString(avereage);  
			
			jt3.setText(a); 
			jt4.setText(b); 
		}
	}
}
