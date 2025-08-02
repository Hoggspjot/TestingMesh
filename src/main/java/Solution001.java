import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Solution001 {

    public static String decodeToString(String input) {
        return Arrays.stream(input.trim().split("\\s*,\\s*"))
                .map(it -> Character.toString(Integer.parseInt(it)))
                .collect(Collectors.joining());
    }

    public static String getFromFile(String path) throws IOException {
        String s = Files.readString(Paths.get(path));
        return decodeToString(s);
    }

    public static void main(String[] args) {

        try {
            String result = getFromFile("G:\\JavaGlobal\\JavaSomePractice\\Test\\src\\main\\resources\\text2.txt");
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
