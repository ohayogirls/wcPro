package ldx;

import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException{
		String filename = args[0];
		Input in = new Input(filename);
		Core core = new Core(in.readToString());
		Output out = new Output();
		out.out(core.getresults1(core.CountWord()));
	}
}
