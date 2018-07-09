package dkovalenko.tests.builder;

public class StandardItem implements Item {

    String name;

    public StandardItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
