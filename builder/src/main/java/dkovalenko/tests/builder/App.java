package dkovalenko.tests.builder;

import dkovalenko.tests.builder.builder.OfficeBuilder;

public class App {

    public static void main(String[] args) {
        OfficeBuilder officeBuilder = new OfficeBuilder();
        Office office = officeBuilder
                .addComputer()
                .addComputer()
                .addChair()
                .addMirror()
                .addChair()
                .addComputer()
                .addChair()
                .build();
        System.out.println(office.getFullInfo());
    }
}
