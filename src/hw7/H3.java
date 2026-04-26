package hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class H3 {
	public void copyfile(File f1,File f2) throws IOException {
		
			
		if(!f1.exists()) {
			System.out.println("不存在");
			return;
		}
			try{
		
			FileReader in =new FileReader(f1);
			FileWriter out=new FileWriter(f2);
			char [] buffer=new char[1028];
			int length=0;
			while((length =in.read(buffer))!=-1) {
				out.write(buffer,0,length);
			}
			in.close();
			out.close();
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			}
		
	}

