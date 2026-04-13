package hw5;

import java.util.Random;
public class H4 {
	public static String Random(int length) {
	    String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	    Random random = new Random();
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < length; i++) {
	        int number = random.nextInt(62);
	        sb.append(str.charAt(number));
	    }
	    return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為:"+"\n"+H4.Random(8));
	}
}
