package com.sdajava.observator_SZ;

import java.util.List;

/**
 * Created by RENT on 2017-04-10.
 */
public interface Obserwowany{



     void addObserwator(Obserwator obserwator);

     void removeObserwator(Obserwator obserwator);

    void powiadamiajObserwatorow(List<Obserwator> obserwators);
}
