package stream.inputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class stream {

	public static void main(String[] args) {

		try {
			OutputStream os = new FileOutputStream("s.txt");
			String str = "���� ������ ���� �����ϴ�.";
			byte[] by = str.getBytes();
			os.write(by);
			
			
		}catch(IOException e) {
			System.out.println(e);
		}

}
}
