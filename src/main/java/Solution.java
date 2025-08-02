import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {


        try {
            Files.write(Paths.get("G:\\JavaGlobal\\JavaSomePractice\\Test\\src\\main\\resources\\test.txt"),
                    "Hello\n".getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            byte[] b = Files.readAllBytes(Paths.get("G:\\JavaGlobal\\JavaSomePractice\\Test\\src\\main\\resources\\test.txt"));
            System.out.println(Arrays.toString(b));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            List<String> s = Files.readAllLines(Paths.get("G:\\JavaGlobal\\JavaSomePractice\\Test\\src\\main\\resources\\test.txt"));
            System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }








    }
}
