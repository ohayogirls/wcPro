package ldx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Output {
	private String filename;
	public Output() throws IOException{
		this.filename="result.txt";
		File output = new File(filename);
		output.createNewFile();

	}
	public boolean out(String s) throws IOException{
		FileWriter fw = new FileWriter(filename,false);  
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        bw.flush();
        bw.close();
        fw.close();
        return true;
	}
}
