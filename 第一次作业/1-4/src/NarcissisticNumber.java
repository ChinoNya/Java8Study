import java.util.*;
public class NarcissisticNumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		String number=String.valueOf(num);
		for(int i=0;i<3;i++){
			char temp=number.charAt(i);
			flag+=Math.pow(temp-'0',3);
		}
		if(flag==num)
			System.out.print(num+" is a narcissistic number");
		else
			System.out.println(num+" is not a narcissistic number");
		//Scanner��close();
	}
}
