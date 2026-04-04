package hw4;
//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)
public class H3 {
	public static void main(String[] args) {
		String[] s= {"mercury","venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count=0;
		for(int i=0;i<s.length;i++) {
			String word=s[i];
			for(int j=0;j<word.length();j++) {
				char c=word.charAt(j);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
			}
		}System.out.println("共有"+count+"個母音");
	}

}
