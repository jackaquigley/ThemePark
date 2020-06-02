package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    Visitor visitor;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 145 && visitor.getAge() > 12) {
            return true;
        }
        return false;
    }

    ;
}

