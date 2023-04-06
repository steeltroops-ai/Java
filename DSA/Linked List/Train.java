
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TrainBooking {

    private Map<String, Integer> stateToCompartmentTrainE = new HashMap<>();
    private Map<String, Integer> stateToCompartmentTrainF = new HashMap<>();
    private Stack<String> states = new Stack<>();
    private int[] compartmentsTrainE = new int[5];
    private int[] compartmentsTrainF = new int[5];

    public void book(String train, String state, int compartment) {
        if (train.equals("TrainE")) {
            stateToCompartmentTrainE.put(state, compartment);
            compartmentsTrainE[compartment - 1]++;
        } else if (train.equals("TrainF")) {
            stateToCompartmentTrainF.put(state, compartment);
            compartmentsTrainF[compartment - 1]++;
        }
        states.push(state);
    }

    public void showPassengerStateWiseCount() {
        Map<String, Integer> stateWiseCountTrainE = new HashMap<>();
        Map<String, Integer> stateWiseCountTrainF = new HashMap<>();
        for (String state : states) {
            if (stateToCompartmentTrainE.containsKey(state)) {
                stateWiseCountTrainE.put(state, compartmentsTrainE[stateToCompartmentTrainE.get(state) - 1]);
            }
            if (stateToCompartmentTrainF.containsKey(state)) {
                stateWiseCountTrainF.put(state, compartmentsTrainF[stateToCompartmentTrainF.get(state) - 1]);
            }
        }
        System.out.println("TrainE state-wise passenger count: " + stateWiseCountTrainE);
        System.out.println("TrainF state-wise passenger count: " + stateWiseCountTrainF);
    }
}
