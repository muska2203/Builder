package dkovalenko.tests.builder.office;

import dkovalenko.tests.builder.Item;
import dkovalenko.tests.builder.Room;
import dkovalenko.tests.builder.RoomBuilder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OfficeBuilder implements RoomBuilder {

    private List<Item> items = new ArrayList<>();

    @Override
    public RoomBuilder addTable() {
        items.add(new OfficeItem("Стол"));
        return this;
    }

    @Override
    public RoomBuilder addChair() {
        items.add(new OfficeItem("Стул"));
        return this;
    }

    @Override
    public RoomBuilder addMirror() {
        items.add(new OfficeItem("Зеркало"));
        return this;
    }

    @Override
    public RoomBuilder addCupboard() {
        items.add(new OfficeItem("Шкаф"));
        return this;
    }

    @Override
    public RoomBuilder addComputer() {
        items.add(new OfficeItem("Компьютер"));
        return this;
    }

    @Override
    public Room build() {
        return new Office(items);
    }

    private static class Office implements Room {

        private List<Item> items;

        private Office(List<Item> items) {
            this.items = items;
            this.items.sort(Comparator.comparing(Item::getName));
        }

        @Override
        public String getFullInfo() {
            StringBuilder info = new StringBuilder("В офисе находятся объекты:\n");
            for (Item item : items) {
                info.append(item.getName()).append("\n");
            }
            return info.toString();
        }

        @Override
        public List<Item> getAllItems() {
            return items;
        }
    }
}
