import java.util.*;
public class HealthCheckIn {
	public static void main(String[] args) {
		System.out.println("�������¶�(��,���)");
		Scanner sc=new Scanner(System.in);
		String str=sc.next().toString();
		String[] num=str.split(",");
		double[] health=new double[num.length];
		for(int i=0;i<num.length;i++) {
			health[i]=Integer.parseInt(num[i]);
			//System.out.println(health[i]);
		}
		System.out.println("������ѧ��ѧ�ź�����");
		int id=sc.nextInt();
		double temperature=sc.nextDouble();
		System.out.println(id+temperature);
	}
}