package com.graphics;

import javax.swing.JFrame;

public class UnderstandGraphics {

	public static void main(String[] args) {
		JFrame frm = new JFrame("����ͼ"); //�������壻frame���ṹ��
		frm.setLayout(null);
		DrawPanel p = new DrawPanel(); //�������JPanel���
		p.setBounds(0, 0, 800, 400);
		frm.getContentPane().add(p);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(400, 200, 800, 400);
		frm.setVisible(true);
		
	}

}
