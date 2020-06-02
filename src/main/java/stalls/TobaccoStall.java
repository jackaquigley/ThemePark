package stalls;

import people.Visitor;
import behaviours.ISecurity;

public class TobaccoStall extends Stall implements ISecurity{

    Visitor visitor;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() < 19) return false;
        return true; }
}


