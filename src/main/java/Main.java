public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Васька");
        CatWrapper wrapper = new CatWrapper(cat);
        System.out.println(cat.getName());
        System.out.println(wrapper.getName());

    }
}


class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class CatWrapper extends Cat {
    private Cat original;

    public CatWrapper(Cat cat) {
        super(cat.getName());
        this.original = cat;
    }

    public String getName() {
        return "Кот по имени " + original.getName();
    }

    public void setName(String name) {
        original.setName(name);
    }

}