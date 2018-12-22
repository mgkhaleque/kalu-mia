package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2{
	
	@SuppressWarnings("resource")
	public static void main(String []args) {
		
		String path = " ";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("we coudn't find the file");
		}
		
		String data = " ";
		
		try {
			br = new BufferedReader(fr);
			while ((data = br.readLine()) !=null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(" we couldnt read the file");
		}
		
		finally {
			if (fr !=null) {
				fr = null;
			}
			if (br !=null) {
				br = null;
			}
			System.out.println("where is my result?");
		}
			
			
		}
	}

