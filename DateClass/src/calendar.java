import java.util.*;
public class calendar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("请输入年份:");
		int year=sc.nextInt();
		System.out.printf("请输入月份:");
		int month=sc.nextInt();
		sc.close();
		Calendar cal = Calendar.getInstance();
		cal.set(year,month-1,1);
		int index=cal.get(Calendar.DAY_OF_WEEK)-1;
		int lastDay=cal.getActualMaximum(cal.DAY_OF_MONTH);
		//char[] title= {'日','一','二','三','四','五','六','七'};
		System.out.println(" 日 一 二 三 四 五 六");
		for(int i=0;i<index;i++) 
			System.out.printf("%s","   ");
		for(int i=1;i<=7-index;i++) 
			System.out.printf("%2d ",i);
		System.out.printf("\n");
		for(int i=8-index;i<=lastDay;i++) {
			System.out.printf("%2d ", i);
			if((i+index)%7==0)
				System.out.printf("\n");
		}
	}
}
