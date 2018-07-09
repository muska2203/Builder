package dkovalenko.tests.builder.flat;

import dkovalenko.tests.builder.Item;
import dkovalenko.tests.builder.Room;
import dkovalenko.tests.builder.RoomBuilder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LivingRoomBuilder implements RoomBuilder {

    private List<Item> items = new ArrayList<>();

    @Override
    public RoomBuilder addTable() {
        items.add(new LivingRoomItem("Стол"));
        return this;
    }

    @Override
    public RoomBuilder addChair() {
        items.add(new LivingRoomItem("Стул"));
        return this;
    }

    @Override
    public RoomBuilder addMirror() {
        items.add(new LivingRoomItem("Зеркало"));
        return this;
    }

    @Override
    public RoomBuilder addCupboard() {
        items.add(new LivingRoomItem("Шкаф"));
        return this;
    }

    @Override
    public RoomBuilder addComputer() {
        items.add(new LivingRoomItem("Компьютер"));
        return this;
    }

    public Room build() {
        return new Flat(items);
    }

    private static class Flat implements Room {

        private List<Item> items;

        private Flat(List<Item> items) {
            this.items = items;
            this.items.sort(Comparator.comparing(Item::getName));
        }

        @Override
        public String getFullInfo() {
            StringBuilder info = new StringBuilder("В квартире находятся объекты:\n");
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
