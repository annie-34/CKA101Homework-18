package hw7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class H2 {
public static void main(String[] args) {
	Set<Integer> set=new HashSet<>();
	while(set.size()!=10) {
		int r=(int)(Math.random()*1000)+1;
		set.add(r);	
	}
	FileWriter fr=null;
	try {
		fr=new FileWriter("Data.txt", true);
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			int num=it.next();
			System.out.println(num+" ");
			fr.write(num+" ");
		}
		fr.write("\r\n");
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
		if(fr!=null) {
			fr.close();}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}
