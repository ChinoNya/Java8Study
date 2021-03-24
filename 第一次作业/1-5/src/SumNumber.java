import java.util.*;
public class SumNumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		String number=String.valueOf(num);
		int sum=0;
		for(int i=0;i<number.length();i++){
			sum+=number.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
