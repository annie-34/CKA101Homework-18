package hw2;

public class Three {
	public static void main(String[]args) {
		for(int i=1;i<=100;i++) {
			for(int j=3;j<=i;j++) {
				if(j%2==1) {
					i+=j;
				}
			}
			System.out.println(i);
		}
	}

}
