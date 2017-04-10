package com.sdajava.observator_SZ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;




/**
 * Created by RENT on 2017-04-10.
 */
public class TotoLotek implements Obserwowany {



    private List<Obserwator> obserwators = new ArrayList<>();
    private List<Integer> wyniki = new ArrayList<>();

    public TotoLotek totoLotek;

    public List<Integer> getResults() {
        return wyniki;
    }

    @Override
    public void addObserwator(Obserwator obserwator){
        obserwators.add(obserwator);
    }

    @Override
    public void removeObserwator(Obserwator obserwator) {

            obserwators.remove(obserwator);
        }

    public void kolejneLosowanie(){
        wyniki.clear();
        Random r = new Random();
        wyniki.add(r.nextInt(10));
        powiadamiajObserwatorow(obserwators);


    }


    @Override
    public void powiadamiajObserwatorow(List<Obserwator> obserwators) {
        obserwators.forEach(o -> o.update());
    }
}
