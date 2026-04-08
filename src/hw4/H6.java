package hw4;

public class H6 {
	public static void main(String[] args) {
		int [][]s= {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}};
		int []count=new int[8];
		for(int i=0;i<s.length;i++) {
			int max=s[i][0];
			for(int j=1;j<s[i].length;j++) {
				if(max>s[i][j]) {
					max=s[i][j];
				}
			}
			for(int j = 0; j <s[i].length ; j++) {
		        if(s[i][j] == max) {
		            count[j]++;  
		        }
		    }
		}
		for(int i =0;i<count.length;i++) {
			System.out.println("學生" + (i+1) + "最高分出現 " + count[i] + " 次");
		    
		}
	}
}
