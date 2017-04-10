package com.sdajava.observator_SZ;

import java.util.List;

/**
 * Created by RENT on 2017-04-10.
 */
public class Telewizja implements Obserwator, Media {


    private List<Integer> wyniki;
    private TotoLotek lotek;

    public Telewizja(TotoLotek lotek){
        this.lotek = lotek;
        this.lotek.addObserwator(this);
    }
    @Override
    public void update(){
        System.out.println("Telewizja wyniki: " + lotek.getResults());
    }
    public void informuj(){
        System.out.println("Wyniki w Telewizji: " + wyniki);
    }

    public void spadam(){}

}
