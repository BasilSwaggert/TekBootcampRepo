package com.company;

public class Printer {

    private int tonerLevel;
    private int pages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public void fillToner(int tonerFill) {
        if(tonerLevel < 0 || tonerLevel > 100) {
            System.out.println("Error");
        }
        this.tonerLevel = tonerLevel + tonerFill;
        System.out.println("Toner level is at " + tonerLevel);
    }

    public void pagesPrinted(int numberOfPages) {
        int count = 0;
        while(count < numberOfPages) {
            count++;
            System.out.println(count + " pages printed.");

        }
        System.out.println(numberOfPages + " pages printed.");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPages() {
        return pages;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
