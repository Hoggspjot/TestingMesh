import java.util.List;

public class Test {
    public static void main(String[] args) {


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