package hw4;

import java.util.Scanner;

public class H5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("請輸入西元年份:");
		int year=sc.nextInt();
		System.out.println("請輸入月份:");
		int month=sc.nextInt();
		System.out.println("請輸入日期:");
		int day =sc.nextInt();
		int sum=0;
		int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 &&year%100!=0)||year%400==0) {
		days[1]=29;
		}
		if(month>12||month<1) {
			System.out.println("日期錯誤");
		}
		if (day<1||day>days[month-1]) {
			System.out.println("日期錯誤");
		}
		for(int i=0;i<month-1;i++) {
			sum+=days[i];
		}
		sum+=day;
		System.out.println("輸入的日期為該年第" + sum + "天");
		sc.close();
		}
	}

	
