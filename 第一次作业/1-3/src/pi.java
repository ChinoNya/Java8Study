import java.util.*;
public class pi
{
	public static void main(String[] args){
		double pi=0.0,num=1.0;
		while(num<10e6){
			if(num%4==1){
				pi+=1/num;
			}else{
				pi-=1/num;
			}
			num+=2.0;
		}
		System.out.println(pi*4);
	}
}