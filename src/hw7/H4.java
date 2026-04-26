package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class H4  {
public static void main(String[] args)  throws IOException {
	File ee=new File("c:\\data");
	if(!ee.exists()) {
		ee.mkdir();
	}
	File ob=new File("C:\\data\\Object.ser");
	Animal a=new Dog("Peter");
	Animal b=new Dog("Mary");
	Animal c=new Cat("james");
	Animal d=new Cat("Annie");
	/*  FileOutputStream ff =new FileOutputStream(ob);
	 	ObjectOutputStream oo =new ObjectOutputStream(ff);
	 	跟下面是一樣的
	 */
	try (ObjectOutputStream oo =new ObjectOutputStream(new FileOutputStream(ob))) {
	    oo.writeObject(a);
	    oo.writeObject(b);
	    oo.writeObject(c);
	    oo.writeObject(d);
	}
	a.speak();
	b.speak();
	c.speak();
	d.speak();
	
	}
	
}
	 
 

