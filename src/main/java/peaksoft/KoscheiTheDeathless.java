package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import peaksoft.model.Ocean1;

@Component
public class KoscheiTheDeathless {

    @Autowired
    private Ocean1 ocean;


    public String getRulesByDeth() {
        return "There is an ocean in the world , " + ocean.toString();
    }

//    @Autowired
//    public void setOcean(Ocean1 ocean) {
//        this.ocean = ocean;
//    }
}
