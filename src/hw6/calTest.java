package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calTest {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	calculator c1=new calculator();
	while(true) {
	try {
		System.out.print("請輸入x值:");
		int x =sc.nextInt();
		System.out.print("請輸入y值:");
		int y =sc.nextInt();
		int rr=c1.powerXY(x,y);
		System.out.println(x+"的"+y+"次方等於"+rr);
		break;
		}catch(InputMismatchException i) {
		System.out.println("輸入格式錯誤");
		sc.nextLine();
	}	catch(calException c) {
		System.out.println(c.getMessage());
	
}sc.close();
}
}
}