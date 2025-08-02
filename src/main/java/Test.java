import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {


        List<Block> blocks = List.of(
                new Block(1),
                new Block(2),
                new Block(3),
                new Block(4),
                new Block(5),
                new Block(6)

        );


        blocks.stream()
                .peek(Block::squash)
                .filter(s -> s.getParameter() < 0)
                .forEach(System.out::println);

        Stream<String> stream = Stream.of("qweq", "weqeqw")
                .filter(s -> s.length() > 4);

        Stream<Foo> stream1 = Stream.empty();

        Stream<String> stream2 = Arrays.stream("gently down the stream".split(" "));


        Path dir = Paths.get("G:\\JavaGlobal\\JavaSomePractice\\Test\\src\\main\\resources\\");
        Stream<Path> stream3 = Files.list(dir);
        stream3.forEach(System.out::println);
       // Stream<Path> stream4 = Files.lines(path)
//        List<String> list = stream3
//                .map


        Stream<Foo> s1 = Stream.empty();
        Stream<Foo> s2 = Stream.empty();
        Stream<Foo> s = Stream.concat(s1, s2);

        Stream<Double> randoms = Stream.generate(Math::random);

        IntStream range = IntStream.range(0, 10);
        range.forEach(System.out::println);

//        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]})
//                .mapToInt(t ->t[0]);




    }
}


class Block {
    int parameter;

    public Block(int parameter) {
        this.parameter = parameter;
    }

    public void setParameter(int parameter) {
        this.parameter = parameter;
    }

    public void squash() {
        setParameter(this.parameter - 1);
    }

    public int getParameter() {
        return parameter;
    }
}