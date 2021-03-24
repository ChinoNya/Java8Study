import java.util.*;

public class FallenBall
{
	public static void main(String[] args){
		double distance=0.0,high=100.0;
		for(int i=0;i<10;i++){
			high/=2;
			distance+=high*2;
		}
		System.out.println("all distance="+distance+" 10th high="+high); 
	}
}
