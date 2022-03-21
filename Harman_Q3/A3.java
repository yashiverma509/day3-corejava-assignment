package a3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class A3 {

	private static ObjectOutputStream oos;
	private static ObjectInputStream oos2;

	public static void main(String[] args) {

		Address address=new Address("A21, Preet vihar", "delhi", "India");
		Employee employee=
				new Employee(121, "raj", address, 400000);
		
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("temp.ser")));
		oos.writeObject(employee);
		} catch (IOException e) {
		
		e.printStackTrace();
		}
		
		
		employee=null;
	try {
		oos2 = new ObjectInputStream(new FileInputStream(new File("temp.ser")));
			employee=(Employee) oos2.readObject();
			System.out.println(employee);
		} catch (IOException e) {
		e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		}
	
		
	}

