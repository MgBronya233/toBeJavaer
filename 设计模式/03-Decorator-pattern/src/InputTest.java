import MyInputStream.LowerCaseInputSteam;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try (InputStream in =
                     new LowerCaseInputSteam(
                             new BufferedInputStream(
                                     new FileInputStream("03-Decorator-pattern/src/test.txt")
                             )
                     )) {

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
