package com.honglei.data.operate;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class awtText extends JPanel {

	public static void main(String[] args) {
		/*Font font = new Font("Arail",Font.PLAIN,24);
		BufferedImage bi = new BufferedImage(60, 60, BufferedImage.TYPE_INT_RGB);
		FontMetrics fm =bi.getGraphics().getFontMetrics(font);
		System.out.println("acent"+fm.getAscent());
		System.out.println("descent"+fm.getDescent());
		System.out.println("leading"+fm.getLeading());
		System.out.println("height"+fm.getHeight());*/
		
		JFrame frame = new JFrame();
        frame.setTitle("Show Font's Metrics Info");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setContentPane(new awtText());
        frame.setSize(800, 500);
        frame.setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Font ft = new Font("Zfull-GB", 0, 200);
        g2.setFont(ft);
        // ��������ȷ���һ
        FontMetrics fm = g2.getFontMetrics();
        Rectangle2D rc = fm.getStringBounds("By", g2);
        System.out.println("Width:" + rc.getWidth());
        Rectangle2D rcb = fm.getStringBounds("B", g2);
        System.out.println("Width:" + rcb.getWidth());
        Rectangle2D rcy = fm.getStringBounds("y", g2);
        System.out.println("Width:" + rcy.getWidth());
        // ��������ȷ�����
        //FontMetrics fm2 = Toolkit.getDefaultToolkit().getFontMetrics(ft);// �ѹ�ʱ
        //System.out.println("Width:" + fm2.stringWidth("By"));
        // /////////////////////////
        int baseline = 300;
        g2.drawString("By", 200, baseline);
        g2.setColor(Color.red);
        g2.setFont(new Font("Zfull-GB", 0, 15));
        // //////////////////////////////////////���ƿ��
        g2.drawLine(200, 0, 200, 800);
        g2.drawLine(200+(int) rcb.getWidth(), 0, 200+(int) rcb.getWidth(), 800);
        
        g2.drawLine(200 + (int) rc.getWidth(), 0, 200 + (int) rc.getWidth(),
                800);
        g2.drawString("Width", 200 + (int) rcb.getWidth() / 2-10, baseline + 58);
        g2.drawString("Width", 200 + (int) rcb.getWidth()+(int)rcy.getWidth() / 2-10, baseline + 58);
        // ���Կ���Height = Ascent + Descent + Leading
        int ascent = fm.getAscent();
        int descent = fm.getDescent();
        int leading = fm.getLeading();
        int height = fm.getHeight();
        System.out.printf(
                "Height = %d\tAscent = %d\tDescent = %d\tLeading = %d", height,
                ascent, descent, leading);
        System.out.println();
        // �������ϻ���ÿһ����������һ���������Ա�ע
        g2.drawLine(100, baseline, 500, baseline);
        g2.drawLine(100, baseline - ascent, 500, baseline - ascent);
        g2.drawLine(100, baseline + descent, 500, baseline + descent);
        g2.drawLine(100, baseline - ascent - leading, 500, baseline - ascent
                - leading);
        // ָ�����ߵ�λ�ã��������������õķ�Χ��
        g2.drawString("Baseline", 510, baseline);
        g2.drawLine(480, baseline - ascent, 480, baseline);
        // ���Ascent�ķ�Χ
        g2.drawString("Ascent", 510, baseline - ascent / 2);
        g2.drawLine(480, baseline, 480, baseline + descent);
        // ���Descent�ķ�Χ
        g2.drawString("Descent", 510, baseline + descent / 2);
        // ���Leading�ķ�Χ
        g2.drawLine(480, baseline - ascent, 480, baseline - ascent - leading);
        g2.drawString("Leading", 510, baseline - ascent - leading / 2);
        // ���Height�ķ�Χ
        g2.drawLine(100, baseline - ascent - leading, 100, baseline + descent);
        g2.drawString("Height", 30, baseline - ascent - leading + height / 2);
    }
}
