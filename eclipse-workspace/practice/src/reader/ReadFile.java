package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{
	
	public static void main (String []args) throws IOException {
		
		String path = "/Users/zibonibrahim/Documents/MGK/gd.text";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		fr = new FileReader (path);
		br = new BufferedReader (fr);
		
		String data = " ";
		
		while ((data = br.readLine()) !=null) {
			System.out.println(data);
		}
		
		
	}
	
	
	
	
}
/*
 public class ReadFile{
 
 public static void main(String []args){
 
 String path = "";
 
 FileReader fr = null;
 BufferedReader br = null;
 
 fr = new FileReader(path);
 br = new BufferedReader (fr);
 
 
 String data = "";
 
 while ((data = br.readLine()) != null){
 Sysout.out.println (data);
 }
 
 
 }
 
 
 }

*/