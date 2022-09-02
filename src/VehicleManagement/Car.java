package VehicleManagement;

import Transition.Transition;
public class Car implements Vehicle{
    Transition.PriceListIdentifier vehicleType = Transition.PriceListIdentifier.CAR;
    public Transition.PriceListIdentifier GetVehicleTypeEnum(){
        return vehicleType;
    }
}
