package it.polito.mad17.viral.sliceapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Kalos on 25/03/2017.
 */

public class SharingPolicy {


    private HashMap<String, Float> percentuali_persona = new HashMap<String, Float>();
    //private boolean isPercentage; //nel caso sia falso segnamo che è valore assoluto -> utile ?



    public SharingPolicy(Collection<Float> percentages, Collection<String> usernames) {

        if (percentages.size() == usernames.size()){

            Iterator<Float> it = percentages.iterator();
            Iterator<String> it2 = usernames.iterator();

            while (it.hasNext() && it2.hasNext()){
                percentuali_persona.put(it2.next(),it.next());
            }

    }

    }


    public void AllTheSame(){

        Float percentage= 100/(float)percentuali_persona.size();

        for(String key : percentuali_persona.keySet()){
            percentuali_persona.put(key,percentage);
        }


    }







}
