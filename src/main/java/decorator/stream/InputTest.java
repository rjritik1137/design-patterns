package decorator.stream;

import decorator.stream.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputTest {
    public static void main(String[] args) throws IOException { int c;
        Path currentPath = Paths.get("").toAbsolutePath();
        String streamPath = currentPath.toString() + "/src/main/java/decorator/stream/hello.txt";
        System.out.println(streamPath);
        try {
            InputStream in =
                    new LowerCaseInputStream( new BufferedInputStream(
                            new FileInputStream(streamPath)));

            while((c = in.read()) >= 0) { System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } }
}