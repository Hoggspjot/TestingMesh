import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution001 {
    public static void main(String[] args) {

        try {
            String s = Files.readString(Paths.get("G:\\JavaGlobal\\JavaSomePractice\\Test\\src\\main\\resources\\text2.txt"));
            s = s.trim();
            String[] split = s.split(", ");
            String collect = Arrays.stream(split)
                    .map(it -> Character.toString(Integer.parseInt(it)))
                    .collect(Collectors.joining());
            System.out.println(collect);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
