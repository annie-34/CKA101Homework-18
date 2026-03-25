package hw1;
//複利算式resalt=1500000*(1+0.02)^10
public class Bank {
	public static void main(String[]args) {
		double bankMoney =1500000;
		for(int i =1;i<=10;i++) {
			bankMoney=bankMoney*(1+0.02);
		}
		System.out.print("本金加利息共有:");
		System.out.printf("%.2f", bankMoney);	
		System.out.print("元");
	}

}
