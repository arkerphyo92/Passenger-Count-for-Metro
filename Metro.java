import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
  
    int onCount = 0;
    int offCount =0;
    int result = 0;
    stops.get(0)[1] = 0; // replace [0][1] = 0;
    // Iterate 2 D arrays 
    for (int i=0; i<stops.size(); i++){
      //inside array first value is for on the bus
      for (int j=0; j<stops.get(i).length; j++){
        if (j == 0){
          onCount += Math.abs(stops.get(i)[j]); // add Maths abs
        }else{
            // second value is for off the bus
          offCount += Math.abs(stops.get(i)[j]); // add Maths abs
        }
      }
    }
    return onCount - offCount;
  }
}
