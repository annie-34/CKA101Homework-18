package hw9;

public class H1 implements Runnable {
	int sr=1;
	String name;
//	static boolean gameOver=false;
	public H1() {	
	}
	public H1(String name) {
		this.name=name;
	}
	public void run() {
		while(sr>0) {
			System.out.println(name+"吃第"+sr+"碗飯");
			sr++;
			if(sr>10) {
				System.out.println(name+"吃完了");
				break;
			}
				try {
					int sleeptime=(int)(Math.random()*2501)+500;
					Thread.sleep(sleeptime);
				}catch(Exception e) {
				
			}
		
			}	
		}
	public static void main(String[] args) {
			H1 a1=new H1("饅頭人");
			Thread b1= new Thread(a1);
			H1 a2=new H1("詹姆士");
			Thread b2=new Thread(a2);
			System.out.println("====大胃王比賽開始=====");
			b1.start();
			b2.start();
			try {
				b1.join();
				b2.join();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("====大胃王比賽結束=====");
	}
	

}
