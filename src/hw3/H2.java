package hw3;

import java.util.Scanner;

public class H2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("開始猜數字吧:");
	int random=(int)(Math.random()*9)+1;
	while(true) {
		int guess = sc.nextInt();
		if(guess==random) {
			System.out.print("答對了!答案就是"+random);
		break;			
		}else { 
			System.out.print("猜錯囉!再猜一次:");
		}
		
	}sc.close();
}
}

