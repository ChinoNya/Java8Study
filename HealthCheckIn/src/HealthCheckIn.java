import java.util.*;
public class HealthCheckIn {
	public static void main(String[] args) {
		System.out.println("请输入温度(以,间隔)");
		Scanner sc=new Scanner(System.in);
		String str=sc.next().toString();
		String[] num=str.split(",");
		double[] health=new double[num.length];
		for(int i=0;i<num.length;i++) {
			health[i]=Integer.parseInt(num[i]);
			//System.out.println(health[i]);
		}
		System.out.println("请输入学生学号和体温");
		int id=sc.nextInt();
		double temperature=sc.nextDouble();
		System.out.println(id+temperature);
	}
}
