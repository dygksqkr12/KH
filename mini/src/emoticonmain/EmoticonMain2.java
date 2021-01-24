package emoticonmain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class EmoticonMain2 extends JFrame {
	
	public EmoticonMain2() {
//		JScrollPane scroll = new JScrollPane();
//		 scroll.setBounds(0,0,700,600);
		//프레임
		setTitle("이모티콘");
		setSize(700, 930);
		
		//리사이즈 방지
		setResizable(false);
		//가운데 위치
		setLocationRelativeTo(null);
		//x누르면 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 패널 위치 지정
		setLayout(null);
		//패널
		//첫번째
		JPanel panel1 = new JPanel();
//		panel1.setBackground(Color.MAGENTA);
		JLabel label1 = new JLabel("멍멍이");
		panel1.setBounds(50, 50, 200, 200);
		panel1.add(label1);
		JButton btn1 = new JButton();
		btn1.setIcon(new ImageIcon("images/dog (3).gif"));
		panel1.add(btn1);
		
		JPanel panel2 = new JPanel();
//		panel2.setBackground(Color.gray);
		JLabel label2 = new JLabel("panel2");
		panel2.setBounds(250, 50, 200, 200);
		panel2.add(label2);
		JButton btn2 = new JButton();
		btn2.setIcon(new ImageIcon("images/dog1.gif"));
		panel2.add(btn2);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.blue);
		JLabel label3 = new JLabel("panel3");
		panel3.setBounds(450, 50, 200, 200);
		panel3.add(label3);
		JButton btn3 = new JButton();
		btn3.setIcon(new ImageIcon("images/dog2.gif"));
		panel3.add(btn3);
		
		//두번째
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.cyan);
		JLabel label4 = new JLabel("panel4");
		panel4.setBounds(50, 250, 200, 200);
		panel4.add(label4);
		JButton btn4 = new JButton();
		btn4.setIcon(new ImageIcon("images/dog3.gif"));
		panel4.add(btn4);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.darkGray);
		JLabel label5 = new JLabel("panel5");
		panel5.setBounds(250, 250, 200, 200);
		panel5.add(label5);
		JButton btn5 = new JButton();
		btn5.setIcon(new ImageIcon("images/dog4.gif"));
		panel5.add(btn5);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.green);
		JLabel label6 = new JLabel("panel6");
		panel6.setBounds(450, 250, 200, 200);
		panel6.add(label6);
		JButton btn6 = new JButton();
		btn6.setIcon(new ImageIcon("images/dog5.gif"));
		panel6.add(btn6);
		
		//세번째
		JPanel panel7 = new JPanel();
		panel7.setBackground(Color.LIGHT_GRAY);
		JLabel label7 = new JLabel("panel7");
		panel7.setBounds(50, 450, 200, 200);
		panel7.add(label7);
		JButton btn7 = new JButton();
		btn7.setIcon(new ImageIcon("images/dog6.gif"));
		panel7.add(btn7);
		
		JPanel panel8 = new JPanel();
		panel8.setBackground(Color.orange);
		JLabel label8 = new JLabel("panel8");
		panel8.setBounds(250, 450, 200, 200);
		panel8.add(label8);
		JButton btn8 = new JButton();
		btn8.setIcon(new ImageIcon("images/dog7.gif"));
		panel8.add(btn8);
		
		JPanel panel9 = new JPanel();
		panel9.setBackground(Color.pink);
		JLabel label9 = new JLabel("panel9");
		panel9.setBounds(450, 450, 200, 200);
		panel9.add(label9);
		JButton btn9 = new JButton();
		btn9.setIcon(new ImageIcon("images/dog8.gif"));
		panel9.add(btn9);
		
		//네번째
		JPanel panel10 = new JPanel();
		panel10.setBackground(Color.red);
		JLabel label10 = new JLabel("panel10");
		panel10.setBounds(50, 650, 200, 200);
		panel10.add(label10);
		JButton btn10 = new JButton();
		btn10.setIcon(new ImageIcon("images/dog9.gif"));
		panel10.add(btn10);
		
		JPanel panel11 = new JPanel();
		panel11.setBackground(Color.yellow);
		JLabel label11 = new JLabel("panel11");
		panel11.setBounds(250, 650, 200, 200);
		panel11.add(label11);
		JButton btn11 = new JButton();
		btn11.setIcon(new ImageIcon("images/dog10.gif"));
		panel11.add(btn11);
		
		JPanel panel12 = new JPanel();
		panel12.setBackground(Color.black);
		JLabel label12 = new JLabel("panel12");
		panel12.setBounds(450, 650, 200, 200);
		panel12.add(label12);
		JButton btn12 = new JButton();
		btn12.setIcon(new ImageIcon("images/Dog.gif"));
		panel12.add(btn12);
		
//		JLabel container = new JLabel(new ImageIcon("images/dog.gif"));
//		add(container);
//		
//		pack();//실제 컴포넌트의 크기에 맞게 컨테이너의 크기를 확대/축소한다.
//		
//		ImagePanel panel = new ImagePanel("images/background.jpg");
//		JButton btn = new JButton("안녕");
//		panel.add(btn);
//		add(panel);
//		pack();
		

		
		
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);
		add(panel8);
		add(panel9);
		add(panel10);
		add(panel11);
		add(panel12);
		
//		add(scroll);
		
		setVisible(true);
	}
public class ImagePanel extends JPanel {
		
		private BufferedImage image;
		private int w;
		private int h;
		
		public ImagePanel(String fileName) {
			
			try {
				image = ImageIO.read(new File(fileName));
				w = image.getWidth();
				h = image.getHeight();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * 현재 패널크기를 백그라운드 이미지의 크기로 지정
		 */
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(w, h);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//image객체를 x,y값만큼 떨어뜨려 그리기 메소드
			//boolean java.awt.Graphics.drawImage(Image img, int x, int y, ImageObserver observer)
			g.drawImage(image, 0, 0, null);
		}
}
	public static void main(String[] args) {
		EmoticonMain2 emot = new EmoticonMain2();
		
	}
		
}

