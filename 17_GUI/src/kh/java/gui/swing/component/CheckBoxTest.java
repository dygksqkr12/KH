package kh.java.gui.swing.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class CheckBoxTest extends JFrame {

	JLabel resultLabel;
	
	public CheckBoxTest(int x, int y, String title) {
		MyUtil.init(this, x, y, title);
		
		topPanel();
		selectPanel();
		reultPanel();
	}

	private void topPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("과일을 선택하세요.");
		panel.add(label);
		add(panel, BorderLayout.NORTH);
	}

	private void selectPanel() {
		JPanel panel = new JPanel();
		JCheckBox[] chks = {
			new JCheckBox("바나나"),	
			new JCheckBox("딸기"),	
			new JCheckBox("아보카도"),	
		};
		
		//이벤트핸들러 처리
		for(JCheckBox chk : chks) {
			//각 checkbox객체에 이벤트리스너 바인딩
			chk.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					System.out.println("actionPerformed!");
					List<String> checkedList = new ArrayList<>();
					for(JCheckBox chk : chks) {
						if(chk.isSelected())
							checkedList.add(chk.getText());
					}
					
					if(checkedList.isEmpty()) {
						resultLabel.setText("아무것도 선택하지 않았습니다.");
					}
					else {
						resultLabel.setText(checkedList + "를 선택했습니다.");
					}
					
				}
				//갓윤수형의 풀이
//				@Override
//                public void actionPerformed(ActionEvent e) {
//                    String s = "";
//                    int count=0;
//                    for(JCheckBox d : chks) {
//                        if(d.isSelected()) {
//                            s +=d.getText()+" ";
//                            count++;
//                        }
//                    }
//                    if(count!=0)
//                        resultLabel.setText(s);
//                    else
//                        resultLabel.setText("아무것도 선택하지 않았습니다.");
//                }
			});
		}
		
		for(JCheckBox chk : chks)
			panel.add(chk);
		
		add(panel);
	}

	private void reultPanel() {
		JPanel panel = new JPanel();
		resultLabel = new JLabel("아무 과일도 선택하지 않았습니다.");
		panel.add(resultLabel);
		add(panel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new CheckBoxTest(300, 200, "체크박스").setVisible(true);
	}

}
