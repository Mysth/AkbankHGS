package Transition;


import HGSAutomation.HGS;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Transition {

    public enum PriceListIdentifier{
        CAR,
        MINIBUS,
        BUS
    }
    private HGS HGSInformation;
    private float transitionCost;
    public Transition(HGS newHGSInformation){
        this.HGSInformation = newHGSInformation;
        DecreaseBalance(this.HGSInformation);

    }
    public float GetTransitionCost(){
        return this.transitionCost;
    }
    public void DecreaseBalance(HGS HGSInformation){
        switch (HGSInformation.GetVehicleEnumType()){
            case CAR:
                HGSInformation.SetBalance(HGSInformation.GetBalance()-5);
                this.transitionCost+=5;
                break;
            case MINIBUS:
                HGSInformation.SetBalance(HGSInformation.GetBalance()-10);
                this.transitionCost+=10;
                break;
            case BUS:
                HGSInformation.SetBalance(HGSInformation.GetBalance()-15);
                this.transitionCost+=15;
                break;
        }
    }

}
