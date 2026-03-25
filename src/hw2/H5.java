package hw2;

public class H5 {
	public static void main(String[] args) {
		int count =0;
		for(int i =1;i<=49;i++) {
			if(i%10!=4&&i/10!=4) {
				System.out.println(i+" ");
				count++;			
			}
		}
		System.out.println("總共有"+count+"個數可選");
	
	}

}
