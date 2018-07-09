package dkovalenko.tests.builder;

import dkovalenko.tests.builder.flat.LivingRoomBuilder;
import dkovalenko.tests.builder.office.OfficeBuilder;

public class App {

    public static void main(String[] args) {
        Director director = new Director(new LivingRoomBuilder());
        Room room = director.buildDoubleRoom();
        System.out.println(room.getFullInfo());
        director.setBuilder(new OfficeBuilder());
        Room smallOfficeRoom = director.buildSmallRoom();
        System.out.println(smallOfficeRoom.getFullInfo());
    }
}
