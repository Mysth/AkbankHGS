package HGSAutomation;

import Transition.Transition;
import VehicleManagement.VehicleType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HGS {
    private int HGSNumber;
    private String ownerName;
    private String ownerSurname;
    private float balance;
    private VehicleType vehicleType;
    private ArrayList<Transition> transitionHistory;

    public HGS(String newOwnerName, String newOwnerSurname, float newBalance, VehicleType vehicleType){
        this.SetHGSNumber();
        this.SetOwnerName(newOwnerName);
        this.SetOwnerSurname(newOwnerSurname);
        this.SetBalance(newBalance);
        this.SetVehicleType(vehicleType);
        transitionHistory = new ArrayList<Transition>();
    }

    public void SetHGSNumber(){
        this.HGSNumber = (int) ((Math.random())*(25000-10000)+10000);
    }
    public int GetHGSNumber(){
        return this.HGSNumber;
    }
    public void SetOwnerName(String name){
        this.ownerName = name;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public void SetOwnerSurname(String surname){
        this.ownerSurname = surname;
    }
    public String GetOwnerSurname(){
        return this.ownerSurname;
    }
    public void SetBalance(float newBalance){
        this.balance = newBalance;
    }
    public float GetBalance(){
        return this.balance;
    }
    public void SetVehicleType(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }
    public Transition.PriceListIdentifier GetVehicleType(){
        return this.vehicleType.GetVehicleEnumType();
    }
    public Transition.PriceListIdentifier GetVehicleEnumType(){
        return this.vehicleType.GetVehicleEnumType();
    }
    public void AddTransitionToList(Transition newTransition){
        this.transitionHistory.add(newTransition);
    }
    public ArrayList<Transition> GetTransitionHistory(){
        return transitionHistory;
    }
    public void PrintAllInformation(){
        System.out.println(this.GetHGSNumber()+" "+this.getOwnerName() + " "+ this.GetOwnerSurname() + " " + this.GetBalance()+ " " + this.GetVehicleType());
    }
}
