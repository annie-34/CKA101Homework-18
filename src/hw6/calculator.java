package hw6;
public class calculator {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setXY(int x,int y) throws calException {
		if(x==0&&y==0) {
			throw new calException("0的0次方沒有意義") ;
		}else if(y<0) {
			throw new calException("次方為負數，結果回傳不為整數");
		}else {
			this.x=x;
			this.y=y;
		}
	}
	public int powerXY  (int x,int y) throws calException {
		setXY(x,y);
		int result=0;
		result=(int) Math.pow(x, y);
		return result;
	}

}
