package hw3;

import java.util.Scanner;

public class Hw3 { 
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("阿文..你不喜歡甚麼數字:");
	String choose=sc.next();
	int count =0;
	while (choose.length() != 1 || choose.charAt(0) < '1' || choose.charAt(0) > '9') {
		System.out.print("請重新輸入1~9之間的數字:");
		choose = sc.next();
	}
	for (int i = 1; i <= 49; i++) {
		String s = String.valueOf(i);
		if (!s.contains(choose)) {
			System.out.print(i+" ");
			count++;
			System.out.println();
		}
	}
	System.out.println("總共有 " + count + " 個數字可以選");
}
}
