package projectAA;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class fileOut extends PrintMoney {
	public static void dataWrite(ArrayList<String> al) throws IOException {		
		File file = new File("C:\\Users\\kopo32\\Desktop\\exchange.csv");
		if(file.exists() == false) {
			isFileExist = false;
		} else {
			isFileExist = true;
		}
		fw = new FileWriter("C:\\Users\\kopo32\\Desktop\\exchange.csv", true);	
		fw.write("\uFEFF");
		if(isFileExist == false) {
			String head = "날짜," + "환전국가," + "바꿀 가격," + "환전결과," + "거스름돈" + "\n";
			fw.write(head);
		}	
		
		for(int i = 0;i<output.size();i++) {
			fw.append(output.get(i));
			fw.append(",");
		}
		fw.write(fw.toString());
		fw.append("\n");
		output.clear();
		//fw.close();
	}

	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
