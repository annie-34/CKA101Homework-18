package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Train {
	private int number;
	private String  type;
	private String start;
	private String dest;
	private double price;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Train(int number,String type, String start,String dest,double price) {
		this.number=number;
		this.type=type;
		this.start=start;
		this.dest=dest;
		this.price=price;
	}
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Train train = (Train) obj;
	    return number == train.number;
	}
	public int hashCode() {
	    return Integer.hashCode(number);
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}
	
	public static void main(String[] args) {
		Set<Train> s=new HashSet<>();
		Train t1=new Train(202,"普悠瑪","樹林","花蓮",400);
		Train t2=new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3=new Train(118, "自強", "高雄", "台北", 500);
		Train t4=new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5=new Train(122, "自強", "台中", "花蓮", 600);
		Train t6=new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7=new Train(1254, "區間", "屏東", "基隆", 700);
		s.add(t1);
		s.add(t2);
		s.add(t3);
		s.add(t4);
		s.add(t5);
		s.add(t6);
		s.add(t7);
		System.out.println("=====forEach=========");
		for (Train t : s) {
		    System.out.println(t);
		}
		System.out.println("========傳統for迴圈============");
		List<Train> list=new ArrayList<>(s);
		list.sort((a, b) -> b.getNumber() - a.getNumber());
		for (int i=0;i<list.size();i++) {
			Train tr=list.get(i);
		    System.out.println(tr);
		}
		System.out.println("======Iterator======");
		Iterator<Train> it=s.iterator();
		while(it.hasNext()) {
			Train oo=it.next();
			System.out.println(oo);
		}
		
	}

}
