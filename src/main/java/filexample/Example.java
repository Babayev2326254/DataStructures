package filexample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("file.txt");
        writer.write("Hello World");
        writer.close();

        FileReader reader = new FileReader("file.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();


    }
}
