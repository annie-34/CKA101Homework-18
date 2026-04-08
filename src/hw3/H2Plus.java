package hw3;

import java.util.Random;
import java.util.Scanner;

public class H2Plus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("開始猜數字吧:");
		Random r=new Random();
		int max =100;
		int min =0;
		int secret=r.nextInt(max-min)+min;
		while(true) {
			int guess=sc.nextInt();
			if(guess>max||guess<min) {
				System.out.println("請重新確定範圍");
			}
			if(guess==secret) {
				System.out.print("答對了!答案是:"+secret);
				break;
			}else if(guess<secret) {
				min=guess;
				System.out.print("正確答案介於"+guess+"~"+max+"之間"+"\n"+"請再猜一個數字");
			}else if(guess>secret) {
				max=guess;
				System.out.print("正確答案介於"+min+"~"+guess+"之間"+"\n"+"請再猜一個數字");
			}
			}sc.close();
		}
	}


