import Administration.DailyTransitions;
import HGSAutomation.HGS;
import Transition.Transition;
import VehicleManagement.Bus;
import VehicleManagement.Car;
import VehicleManagement.VehicleType;

public class Main {
    public static void main(String[] args){
        VehicleType vehicleType = new VehicleType(new Car());
        HGS car1 = new HGS("Emre","Erdin",150,vehicleType);
        vehicleType = new VehicleType(new Bus());
        HGS bus1 = new HGS("Ali","Mehmet",200,vehicleType);

        //Prints out the all information about the HGS of the car.
        car1.PrintAllInformation();
        bus1.PrintAllInformation();
        //Adds transition for each vehicle to related HGS number and car.
        car1.AddTransitionToList(new Transition(car1));
        bus1.AddTransitionToList(new Transition(bus1));
        //Adds all daily transitions to the administration daily transition list.
        DailyTransitions dailyTransitions = new DailyTransitions();
        //We send transition history of each HGS as an ArrayList into another ArrayList
        dailyTransitions.AddTransitionToCalculate(car1.GetTransitionHistory());
        dailyTransitions.AddTransitionToCalculate(bus1.GetTransitionHistory());
        //We get the elements of an ArrayList of ArrayList and calculate all the transitions of a spesific vehicle and get total.
        dailyTransitions.GetDailyTransitionBalance();

    }
}
