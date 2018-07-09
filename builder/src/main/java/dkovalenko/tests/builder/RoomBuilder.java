package dkovalenko.tests.builder;

import dkovalenko.tests.builder.office.OfficeBuilder;

public interface RoomBuilder {

    RoomBuilder addTable();

    RoomBuilder addChair();

    RoomBuilder addMirror();

    RoomBuilder addCupboard();

    RoomBuilder addComputer();

    Room build();
}
