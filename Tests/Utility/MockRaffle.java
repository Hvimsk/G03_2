package Tests.Utility;
import src.interfaces.IRaffle;

import java.util.ArrayList;

public class MockRaffle implements IRaffle{
    int currentIndOfListArray = 0;
    private final ArrayList<int[]> ListOfInputs;
    public MockRaffle(ArrayList<int[]> inputs){
        ListOfInputs = inputs;
    }

    @Override
    public int[] RaffleDices() {
        if (currentIndOfListArray >= ListOfInputs.size()) {
            throw new IllegalStateException("No more mock inputs available.");
        }
        int[] returnResults = ListOfInputs.get(currentIndOfListArray);
        currentIndOfListArray++;
        return returnResults;
    }
}
