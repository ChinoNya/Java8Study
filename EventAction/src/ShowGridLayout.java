import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ShowGridLayout extends JFrame{
	private JLabel j1;
	private JButton ok,cancel;
	private JTextField jt;
	private JPanel jp1,jp2;
	private JButton[] jb;
	private static String str="";
	public ShowGridLayout() {
		j1=new JLabel("请输入手机号");
		ok=new JButton("确认");
		cancel=new JButton("取消");
		jt=new JTextField(15);
		jp1=new JPanel();
		jp2=new JPanel();
		jb=new JButton[10];
		for(int i=0;i<10;i++) {
			jb[i]=new JButton(new Integer(i).toString());
			jb[i].addActionListener(new Lis());
		}
		ok.addActionListener(new Lis());
		cancel.addActionListener(new Lis());
	}
	public void lanuchFrame() {
		Container c=getContentPane();
		GridLayout g1=new GridLayout(4,3,5,5);
		jp1.add(j1);
		jp1.add(jt);
		jp2.setLayout(g1);
		for(int i=1;i<10;i++) {
			jp2.add(jb[i]);
		}
		jp2.add(jb[0]);
		jp2.add(ok);
		jp2.add(cancel);
		c.add(jp1,"North");
		c.add(jp2,"Center");
		setTitle("智商测试");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
	}
	class Lis implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object source=e.getSource();
			if(source==ok) {
				if(str.length()!=11)
					JOptionPane.showMessageDialog(null, "连个号码都输不对，找个厂上班吧","错误提示",JOptionPane.ERROR_MESSAGE);
				else {
					JOptionPane.showMessageDialog(null,"啊哈，你输入的号码是这个吧："+str,"提示！",JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else {
				if(source==cancel) {
					str="";
					jt.setText(str);
				}
				else {
					str+=e.getActionCommand();
					jt.setText(str);
				}
			}
		}
	}
	public static void main(String[] args) {
		ShowGridLayout sg=new ShowGridLayout();
		sg.lanuchFrame();
	}
}
