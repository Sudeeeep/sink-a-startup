import java.util.ArrayList;

/**
 * Startup
 */
public class Startup {
    private ArrayList<String> locationCells;
    String name;
    // private int numOfHits;

    public void setLocationCells(ArrayList<String> location) {
        this.locationCells = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {

        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        // System.out.println(result);
        return result;
    }

}