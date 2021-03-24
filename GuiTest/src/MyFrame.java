import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame{
	public static void main(String[] args) {
		MyFrame mf=new MyFrame();
		JButton jb=new JButton("这是一个按钮");
		mf.setTitle("This is a GUI");
		mf.setLocation(50, 50);
		mf.setSize(400, 400*1080/1920);
		Container c=mf.getContentPane();
		c.setBackground(Color.pink);
		c.add(jb);
		c.setLayout(new FlowLayout());
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
