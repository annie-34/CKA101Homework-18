package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class H1 {
	public static void main(String[] args) {
		Collection<Object> list = new ArrayList<>();
		list.add(100); // Integer
		list.add(3.14); // Double
		list.add(21L); // Long
		list.add(Short.valueOf("100")); // Short
		list.add(5.1); // Double
		list.add("Kitty"); // String
		list.add(100); // Integer (重複的)
		list.add(new Object()); // Object 物件
		list.add("Snoopy"); // String
		list.add(new BigInteger("1000")); // BigInteger (也是 Number 的子類)
		System.out.println("===========傳統for============");
		for (int i = 0; i < list.size(); i++) {
			Object obj = ((ArrayList<Object>) list).get(i);
			System.out.println(obj);

		}
		System.out.println("========forEach========");
		for (Object ooo : list)
			System.out.println(ooo);
		System.out.println("======移除非數字後的=======");
		Iterator<Object> objs = list.iterator();
		while (objs.hasNext()) {
			Object objq = objs.next();
			if (!(objq instanceof Number)) {
				objs.remove();
			}

		}
		for(Object a:list) {
			System.out.println(a);
		}


	}

}
