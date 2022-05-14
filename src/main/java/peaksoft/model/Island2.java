package peaksoft.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Island2 {

    @Autowired
    private Wood3 wood;

    @Override
    public String toString() {
        return ", tree on the island " + wood.toString();
    }
}
