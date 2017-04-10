package com.sdajava.observator_SZ;

public class Main {

    public static void main(String[] args) {

        TotoLotek lotek = new TotoLotek();

        new Internet(lotek);
        Telewizja telewizja = new Telewizja(lotek);

        lotek.kolejneLosowanie();
        lotek.kolejneLosowanie();
        lotek.removeObserwator(telewizja);
        lotek.kolejneLosowanie();





    }
}
