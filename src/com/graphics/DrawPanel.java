package com.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

class DrawPanel extends JPanel {
	public void paint(Graphics g) {  //�ڸ�paint()�����У�ʹ��ϵͳ�����Graphics����g����ͼ��
		g.setColor(Color.black);
		
		g.drawString("����ͼ", 20, 20); //���ԣ�20,20��Ϊ���½���������ַ���
		
		g.drawLine(20, 20, 90, 90); //���ƴӣ�20,20������90,90����ֱ��
		g.drawRect(100, 20, 70, 70); //���ƴӣ�100,20��Ϊ���Ͻ����꣬��Ϊ70����Ϊ70�ľ���
		g.drawRoundRect(200, 20, 70, 70, 30, 30); //����Բ�Ǿ��Σ�30��|����ֱ����
		g.fillRoundRect(300, 20, 70, 70, 30, 30); //�������Բ�Ǿ���
		
		g.drawArc(20, 100, 70, 70, 0, 180); //����Բ������Բ��
		g.draw3DRect(100, 100, 70, 70, true);
		g.drawOval(200, 100, 70, 40); //���ԣ�200,100�����Ͻ����꣬��70��40�ľ����л�Բ����Բ
		g.fillOval(300, 100, 70, 40); //���������Բ
	}

}
