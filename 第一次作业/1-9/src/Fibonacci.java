
public class Fibonacci {
	public static void main(String[] args) {
		int fx=0,fy=1,fz;
		for(int i=0;i<40;i++) {
			fz=fx+fy;
			System.out.println(fz);
			fx=fy;
			fy=fz;
		}
	}
}
