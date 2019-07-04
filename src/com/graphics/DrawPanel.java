package com.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

class DrawPanel extends JPanel {
	public void paint(Graphics g) {  //在该paint()方法中，使用系统传入的Graphics对象g绘制图形
		g.setColor(Color.black);
		
		g.drawString("理解绘图", 20, 20); //在以（20,20）为左下角坐标绘制字符串
		
		g.drawLine(20, 20, 90, 90); //绘制从（20,20）到（90,90）的直线
		g.drawRect(100, 20, 70, 70); //绘制从（100,20）为左上角坐标，宽为70，高为70的矩形
		g.drawRoundRect(200, 20, 70, 70, 30, 30); //绘制圆角矩形（30横|纵向直径）
		g.fillRoundRect(300, 20, 70, 70, 30, 30); //绘制填充圆角矩形
		
		g.drawArc(20, 100, 70, 70, 0, 180); //绘制圆弧或椭圆弧
		g.draw3DRect(100, 100, 70, 70, true);
		g.drawOval(200, 100, 70, 40); //在以（200,100）左上角坐标，宽70高40的矩形中画圆或椭圆
		g.fillOval(300, 100, 70, 40); //绘制填充椭圆
	}

}
