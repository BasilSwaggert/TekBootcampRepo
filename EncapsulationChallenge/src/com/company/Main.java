package com.company;

public class Main {

    public static void main(String[] args) {

        PrinterTim printer = new PrinterTim(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printer was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printer was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

    }
}
