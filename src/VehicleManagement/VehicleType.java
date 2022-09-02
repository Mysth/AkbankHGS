package VehicleManagement;

import Transition.Transition;

public class VehicleType {

    private Vehicle vehicleType;

    public VehicleType(Vehicle newType){
        this.vehicleType = newType;
    }
    public Transition.PriceListIdentifier GetVehicleEnumType(){
        return this.vehicleType.GetVehicleTypeEnum();
    }

}
