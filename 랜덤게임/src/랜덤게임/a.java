package ·£´ý°ÔÀÓ;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.JFrame;

public class a extends JFrame{
	int num1,num2,num3;
	
	a(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		setSize(300,300);
		setTitle("·£´ý°ÔÀÓ");
		setVisible(true);
		
		JButton btn1 = new JButton(""+num1);
		JButton btn2 = new JButton(""+num2);
		JButton btn3 = new JButton(""+num3);
		JLabel jl = new JLabel("°á°ú : ");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(jl);
		c.requestFocus();
		c.setFocusable(true);
		
		setVisible(true);
		
		c.addKeyListener(new KeyListener(){
			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if(key == KeyEvent.VK_ENTER) {
					num1 = (int)(Math.random()*5);
					btn1.setText(""+num1);
					
					num2 = (int)(Math.random()*5);
					btn2.setText(""+num2);
					
					num3 = (int)(Math.random()*5);
					btn3.setText(""+num3);
					
					int tmp = (num1&num2)&num3;
					
					if(num1==num2&& num1==num3) {
						jl.setText("°á°ú : ´çÃ·");
					}
					else {
						jl.setText("°á°ú : ²Î");
					}
				}
			}
		});
	}
public static void main(String[] args) {
	new a();
}
}


