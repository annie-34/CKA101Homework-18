package hw4;

import java.util.Scanner;

public class H4 {
public static void main(String[] args) {
	Scanner wun=new Scanner(System.in);
	System.out.print("要借多少:");
	int borrow=wun.nextInt();
	int count=0;
	int[] people= {25,32,8,19,27};
	int []money= {2500,800,500,1000,1200};
	for(int i=0;i<money.length;i++) {
		if(money[i]>=borrow) {
			System.out.print(people[i]+" ");
			count++;
		}
			
		}System.out.println("共 " + count + " 人");
		wun.close();
	}
}
