package Amusement1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class fileOut extends Processing {
	public static void dataWrite() throws IOException {		
		if(file.exists() == false) {
			isFileExist = false;
		} else {
			isFileExist = true;
		}
		fw = new FileWriter("C:\\Users\\kopo32\\Desktop\\amusement.csv", true);	
		fw.write("\uFEFF");
		if(isFileExist == false) {
			String head = "날짜," + "권종," + "수량," + "가격," + "우대사항\n";
			fw.write(head);
		}	
		
		for(int i = 0;i<output.size();i++) {
			fw.append(output.get(i));
			fw.append(",");
		}
		fw.write(fw.toString());
		fw.append("\n");	
		//output.clear();
		//fw.close();
	}

	public static void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
