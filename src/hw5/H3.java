package hw5;

public class H3 {
	public int maxElement(int x[][]) {
		int max=x[0][0];
		for(int i=0;i<=x.length-1;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(max<x[i][j] ) {
					max=x[i][j];
				}
			}
		}return max;
	}
	public double maxElement(double x[][]) {
		double big=x[0][0];
		for(int i=0;i<=x.length-1;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(big<x[i][j] ) {
					big=x[i][j];
				}
			}
		}
		return big;
	}
public static void main(String[] args) {
	int [][] intArray= {{1,6,3},{9,5,2}};
	double [][]doubleArray= {{1.2,3.5,2.2},{7.4,2.1,8.2}};	
	H3 w=new H3();
	System.out.println(w.maxElement(intArray));
	System.out.println(w.maxElement(doubleArray));	
}
}
