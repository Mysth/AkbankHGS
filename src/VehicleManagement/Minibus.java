package VehicleManagement;

import Transition.Transition;

public class Minibus implements Vehicle{
    Transition.PriceListIdentifier vehicleType = Transition.PriceListIdentifier.MINIBUS;
    public String VehicleType(){
        return "Minibus";
    }

    public Transition.PriceListIdentifier GetVehicleTypeEnum(){
        return vehicleType;
    }
}
