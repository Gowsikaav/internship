package basic.multiple;

import basic.lunch;

public class Hotel extends basic.multiple.meals implements basic.multiple.morningtiffen, lunch, basic.multiple.nightdinner {
    public static void main(String[] args) {
        Hotel hh = new Hotel();
        hh.dinner();
        hh.tiffen();
        hh.lunch();
        hh.meals();
    }

    @Override
    public void lunch() {
        System.out.println("lunch");

    }

    @Override
    public void tiffen() {
        System.out.println("tiffen");

    }

    @Override
    public void dinner() {
        System.out.println("dinner");

    }
}







