package com.graphics;

import javax.swing.JFrame;

public class UnderstandGraphics {

	public static void main(String[] args) {
		JFrame frm = new JFrame("理解绘图"); //创建窗体；frame：结构类
		frm.setLayout(null);
		DrawPanel p = new DrawPanel(); //创建面层JPanel组件
		p.setBounds(0, 0, 800, 400);
		frm.getContentPane().add(p);
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setBounds(400, 200, 800, 400);
		frm.setVisible(true);
		
	}

}
