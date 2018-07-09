package dkovalenko.tests.builder.flat;

import dkovalenko.tests.builder.Item;

public class LivingRoomItem implements Item {

    private String name;

    public LivingRoomItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name + " для жилой комнаты";
    }
}
