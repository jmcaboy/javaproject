package FileReading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadingMain {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("amusement.csv"));
	}

}
