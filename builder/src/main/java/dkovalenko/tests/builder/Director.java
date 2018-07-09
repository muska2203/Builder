package dkovalenko.tests.builder;

public class Director {

    private RoomBuilder builder;

    public Director(RoomBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(RoomBuilder builder) {
        this.builder = builder;
    }

    public Room buildSmallRoom() {
        return builder
                .addChair()
                .addTable()
                .addComputer()
                .addCupboard()
                .addMirror()
                .build();
    }

    public Room buildDoubleRoom() {
        return builder
                .addChair()
                .addTable()
                .addComputer()
                .addCupboard()
                .addMirror()
                .addChair()
                .addTable()
                .addComputer()
                .addCupboard()
                .addMirror()
                .build();
    }

}
