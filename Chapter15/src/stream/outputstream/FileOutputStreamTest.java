package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {

		byte[] bs = new byte[26];
		byte data = 65;
		for(int i=0; i < bs.length; i++) {
			bs[i] = data++;
		}
		try( FileOutputStream fos = new FileOutputStream("output3.txt")){	//이어서쓰고싶다면true
			fos.write(bs, 2, 10);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
