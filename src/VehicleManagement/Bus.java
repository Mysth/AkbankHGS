package VehicleManagement;

import Transition.Transition;

public class Bus implements Vehicle{
    Transition.PriceListIdentifier vehicleType = Transition.PriceListIdentifier.BUS;

    public Transition.PriceListIdentifier GetVehicleTypeEnum(){
        return vehicleType;
    }
}
