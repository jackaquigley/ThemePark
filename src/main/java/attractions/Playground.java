package attractions;

import people.Visitor;
import behaviours.ISecurity;

public class Playground extends Attraction implements ISecurity {

    Visitor visitor;

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() < 16) return true;
                    return false; }
    }

