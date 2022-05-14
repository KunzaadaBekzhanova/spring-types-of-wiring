package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    @Autowired
    private Duck5 duck;

    @Override
    public String toString() {
        return ", duck in a hare " + ""+duck.toString();
    }
}
