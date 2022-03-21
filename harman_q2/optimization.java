package a3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Optimization {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		try {
		FileInputStream fr = new 
					 FileInputStream("D:\\lectures\\Gate\\power system");
	   FileOutputStream fw = new FileOutputStream("D:\\lectures\\Gate\\power system");
	   fr.close();
	   fw.close();
			
			BufferedInputStream fr1 = new BufferedInputStream(new FileInputStream("D:\\lectures\\Gate\\power system"));
			BufferedOutputStream fw1 = new BufferedOutputStream(
					new FileOutputStream("D:\\lectures\\Gate\\power system"));
			int i = 0;
			while ((i = fr.read()) != -1) {
				fw1.write(i);
			}
			fw1.close();
			 fr1.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();

		System.out.println("time taken : " + (end - start) + " ms");
		
	
		System.out.println("file is written");
	}
}
