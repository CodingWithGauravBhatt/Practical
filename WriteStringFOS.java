package Today4Mar;
import java.io.FileOutputStream;
// write byte to String using FOS--- write byte with file output stream
public class WriteStringFOS {
	public static void main(String[] args) {
		try {
	FileOutputStream f = new FileOutputStream("D:\\java2.text");
	//write byte to string
	f.write(99); //byte value (Ascii value)
	f.close();
	System.out.println("Done");
		}
	catch (Exception e) {
		System.out.println(e);
		}
	}
	}