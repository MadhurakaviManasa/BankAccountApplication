package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	
	public static List<String[]> read(String file){ 
		List<String[]> list = new LinkedList<String[]>();
		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));			
			while((line = br.readLine()) != null) {
				String[] records = line.split(",");
				list.add(records);
			}
		}
		catch (Exception e) {
			System.out.println(e);	
		}
		
		return list;
	} 
}
