import java.util.Random;
import java.util.*;
public class captcha{
    public Boolean randNum(Scanner sc){
        Random rand=new Random();
        int r1=rand.nextInt(50);
        int r2=rand.nextInt(50);
        System.out.printf("%d+%d=\n",r1,r2);
        int r=sc.nextInt();
        if(r==r1+r2)
            return true;
        else
            return false;
    }
    public Boolean randString(Scanner sc){
    	String val = "";
    	Random rand = new Random();
    	for(int i=0;i<6;i++) {
    		if(rand.nextInt(2)%2==0) {
    			int base = rand.nextInt(2)%2==0?65:97;
    			val+=(char)(base+rand.nextInt(26));
    		}else
    			val+=String.valueOf(rand.nextInt(10));
    	}
    	System.out.printf("%s\n", val);
    	String str=sc.nextLine();
    	if(str.equalsIgnoreCase(val))
    		return true;
    	else
    		return false;
    }
    public static void main(String[] args){
        captcha code = new captcha();
    	Scanner sc=new Scanner(System.in);
		while(true) {
			Boolean flag=false;
			Random rand=new Random();
			if(rand.nextInt(2)%2==0)
				 flag=code.randNum(sc); 
			else 
				 flag=code.randString(sc);
			if(flag)
				 break;
		}
		sc.close();
    }
}