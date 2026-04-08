package hw3;

import java.util.Scanner;

public class H1Version1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("數字1(請輸入三個整數):");
		int num1=sc.nextInt();
		System.out.print("數字2(請輸入三個整數):");
		int num2 =sc.nextInt();
		System.out.print("數字3(請輸入三個整數):");
		int num3 =sc.nextInt();
		if(num1+num2<=num3||num2+num3<=num1||num1+num3<=num2) {
			System.out.println("不是三角形");
		}else {
			if(num1==num2&&num2==num3) {
			System.out.println("正三角形");
		}else if(num1==num2||num2==num3||num1==num3) {
			System.out.println("等腰三角形");
		}
		else {
			System.out.println("其他三角形");
		}
		//進階
		int max=Math.max(num1,Math.max(num2, num3));
		int sumSquares=num1*num1+num2*num2+num3*num3-max*max;
		if(max*max==sumSquares) {
			System.out.println("也是直角三角形");
		}
	

	}
		sc.close();
	}
}


