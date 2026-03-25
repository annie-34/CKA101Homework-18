package hw1;

public class CountSecond {
public static void main(String[]args) {
	int q1=256559;
	int days=q1/86400;
	int remain=q1%86400;
	int hours=remain/3600;
	int hoursremain=remain%3600;
	int min=hoursremain/60;
	int seconds=hoursremain%60;
	System.out.println(q1+"秒為"+days+"天"+hours+"小時"+min+"分鐘"+seconds+"秒");
	
}
}
