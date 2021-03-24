import java.util.*;
import java.math.*;
public class Sqrt
{
	public static void main(String[] args){
		double a=0.0,xn=0.0,xm=0.0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		xm=a/2;
		xn=0.5*(xm+a/xm);
		while(Math.abs(xm-xn)>10e-5){
			xm=xn;
			xn=0.5*(xm+a/xm);
		}
		System.out.println("sqrt("+a+")="+xm);
	}
}
