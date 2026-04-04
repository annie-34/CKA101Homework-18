package hw4;

public class H1 {
public static void main(String[] args) {
	int[] n={29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
	int sum =0;
	
	for(int i=0;i<n.length;i++) {
		sum+=n[i];		
	}
		int avg=sum/n.length;
	System.out.println("平均值為:"+avg);
		System.out.print("小於平均:");
	for(int i=0;i<n.length;i++) {
		if(n[i]<avg) {
			System.out.print(" "+n[i]+" ");
		}
	}
	}

}

