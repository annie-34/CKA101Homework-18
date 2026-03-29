package hw3;

import java.util.Scanner;

public class H1Verssion2 {
	public static boolean isTriangle(int num1,int num2,int num3) {
		return num1+num2>num3&&num1+num3>num2&&num2+num3>num1;
		
	}
	public static String getType(int num1,int num2,int num3) {
		if(num1==num2&&num2==num3) {
			return"正三角形";
		}else if(num1==num2||num2==num3||num1==num3) {
			return"等腰三角形";
			
		}
		else {
			return"其他三角形";
		}
	}
    public static boolean isRight(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int sumSquares = a * a + b * b + c * c - max * max;
        return max * max == sumSquares;
				}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("數字1(請輸入三個整數):");
	int num1=sc.nextInt();
	System.out.print("數字2(請輸入三個整數):");
	int num2 =sc.nextInt();
	System.out.print("數字3(請輸入三個整數):");
	int num3 =sc.nextInt();
	if(!isTriangle(num1,num2,num3)) {
		System.out.println("不是三角形");
	}else {
		System.out.println(getType(num1,num2,num3));
	if(isRight(num1,num2,num3)) {
		System.out.println("也是直角三角形");
	}
}
}
}