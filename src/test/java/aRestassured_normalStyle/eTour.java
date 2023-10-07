package aRestassured_normalStyle;

import org.testng.annotations.Test;

public class eTour {
    /*
    Tour:{
        "place": setplace();
        "modeoftravel":setmodeoftravel();
    }

     */

    String place;
    String modeoftravel;

    public String getPlace() {
        return place;
    }

    //now set the return type as Tour
    //and return this (because it refers to current object)
      /*
    this:{
    "place":setplace();
    }
     */
    public eTour setPlace(String place) {
        this.place = place;
        return this;
    }

    public String getModeoftravel() {
        return modeoftravel;
    }

    //if u notice here, setmodewill add along to the this
    //because it refers to the current object

    /*
this:{
"place":setplace();
"modeoftravel":setmodeoftravel();
}
*/
    public eTour setModeoftravel(String modeoftravel) {
        this.modeoftravel = modeoftravel;
        return this;
    }

    @Test
    public void testthemethodchaining(){
        eTour newTour = new eTour();
        newTour.setPlace("samayapuram").setModeoftravel("car");
        System.out.println("Am going to "+newTour.getPlace()+" by "+ newTour.getModeoftravel());
    }

}
