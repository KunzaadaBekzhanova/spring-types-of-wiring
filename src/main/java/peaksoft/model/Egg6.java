package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    @Autowired
    private Needle7 needle;

//    public Egg6 egg6(Needle7 needle){
//        return new Egg6();
//    }

    @Override
    public String toString() {
        return ", needle in the egg " + ""+needle.toString();
    }
}
