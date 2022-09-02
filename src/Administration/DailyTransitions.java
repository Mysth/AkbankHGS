package Administration;

import Transition.Transition;

import java.util.ArrayList;

public class DailyTransitions {
    private float dailyRevenue;
    private ArrayList<ArrayList<Transition>> transitions;

    public DailyTransitions(){
        transitions = new ArrayList<ArrayList<Transition>>();
    }

    public void AddTransitionToCalculate(ArrayList<Transition> newTransition){
        this.transitions.add(newTransition);
    }
    public void GetDailyTransitionBalance(){
        for(int i=0; i<transitions.size(); i++){
            for(int j=0; j<transitions.get(i).size(); j++){
                dailyRevenue += transitions.get(i).get(j).GetTransitionCost();
            }

        }
        System.out.println("Daily revenue is: "+dailyRevenue);
    }
}
