package dkovalenko.tests.builder.builder;

import dkovalenko.tests.builder.Item;
import dkovalenko.tests.builder.Office;
import dkovalenko.tests.builder.StandardItem;

import java.util.ArrayList;
import java.util.List;

public class OfficeBuilder {

    private List<Item> items = new ArrayList<>();

    public OfficeBuilder addTable() {
        items.add(new StandardItem("Стол"));
        return this;
    }

    public OfficeBuilder addChair() {
        items.add(new StandardItem("Стул"));
        return this;
    }

    public OfficeBuilder addMirror() {
        items.add(new StandardItem("Зеркало"));
        return this;
    }

    public OfficeBuilder addCupboard() {
        items.add(new StandardItem("Шкаф"));
        return this;
    }

    public OfficeBuilder addComputer() {
        items.add(new StandardItem("Компьютер"));
        return this;
    }

    public Office build() {
        return new OfficeImpl(items);
    }

    private static class OfficeImpl implements Office {

        private List<Item> items;

        private OfficeImpl(List<Item> items) {
            this.items = items;
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
