package Today4Mar;
import java.io.FileOutputStream;
// write String to byte array--- write byte with file output stream
public class WriteByteFOS {
public static void main(String[] args) {
	try {
FileOutputStream f = new FileOutputStream("D:\\java.text");
String s = "Hey Whatsup";
byte b[]=s.getBytes();
f.write(b);
f.close();
System.out.println("Done");
	}
catch (Exception e) {
	System.out.println(e);
	}
}
}