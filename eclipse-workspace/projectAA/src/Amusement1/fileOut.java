package Amusement1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class fileOut extends Output {
	public static void dataWrite() throws IOException {		
		if(file.exists() == false) {
			isFileExist = false;
		} else {
			isFileExist = true;
		}
		fw = new FileWriter("amusement.csv", true);	
		fw.write("\uFEFF");
		if(isFileExist == false) {
			String head = "날짜," + "권종," +"연령구분," + "수량," + "가격," + "우대사항\n";
			fw.write(head);
		}	
		int cnt = 0;
		for(int i = 0;i<output.size();i++) {
			fw.append(output.get(i));
			fw.append(",");
			cnt++;
			if(cnt%6 == 0) {
				fw.append("\n");
			}
		}
		fw.write(fw.toString());
		fw.append("\n");	
		cnt = 0;
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
