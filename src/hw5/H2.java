package hw5;

public class H2 {
	public void randAvg() {
		System.out.print("本次亂數結果: ");
		int sum = 0;
		for(int i=0;i<10;i++) {
			int r=(int)(Math.random()*101);
			System.out.print(r+" ");
			sum+=r;
	}System.out.println();
		int avg=sum/10;System.out.print("平均數字為:"+avg);
	}
	public static void main(String[] args) {
		H2 test=new H2();
		test.randAvg();
	}
}