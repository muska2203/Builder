package dkovalenko.tests.builder.office;

import dkovalenko.tests.builder.Item;

public class OfficeItem implements Item {

    private String name;

    public OfficeItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name + " для офисного помещения";
    }
}
