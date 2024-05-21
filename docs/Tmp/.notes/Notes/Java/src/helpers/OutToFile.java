package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class OutToFile
{
	 PrintStream printStream;

	public OutToFile(String fileName)
	{
		PrintStream printStream = null;
		try {
			printStream = new PrintStream(new FileOutputStream(new File("listings/" +fileName)));
			System.setOut(printStream);
			System.setErr(printStream);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
