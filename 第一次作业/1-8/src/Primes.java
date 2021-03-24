import java.math.*;
public class Primes {
	public static void main(String[] args) {
		for(int i=100;i<=200;i++) {
			int flag=0;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0)
					flag=1;
			}
			if(flag==0)
				System.out.println(i);
		}
	}
}
