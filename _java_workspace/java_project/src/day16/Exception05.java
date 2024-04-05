package day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception05 {

	public static void main(String[] args) {
		// IO Exception 발생 예제
		
		
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr);
		
		try {
			String name;
			name = br.readLine();
			System.out.println(name);
			br.close();	
		} catch (Exception e) {
			
		}

	}

}
