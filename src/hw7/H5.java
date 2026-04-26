package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class H5 {
	public static void main(String[] args) throws Exception {
		File ob=new File("C:\\data\\Object.ser");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ob))) {
			Animal a = (Animal) ois.readObject();
			a.speak();
			Animal b = (Animal) ois.readObject();
			b.speak();
			Animal c = (Animal) ois.readObject();
			c.speak();
			Animal d = (Animal) ois.readObject();
			d.speak();

		}
	}
}
