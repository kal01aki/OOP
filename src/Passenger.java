import java.util.Arrays;

public class Passenger {
    String passengerList[];






           void transportCapacity (int capacity){

               passengerList = new String[capacity];
           }

            void addPassenger(int id, String passengerName){

                passengerList[id] = passengerName;

                System.out.println("Passenger " + passengerName + " added successfully");
            }



            void removePassenger (int id){


               passengerList [id] = null;
                System.out.println("Passenger " + passengerList[id] + "removed successfully");
            }
            void updatePassenger (int id, String passengerName) {
                passengerList[id] = passengerName;
                System.out.println("Passenger " + passengerName + " updated successfully");
            }
            void viewTotalPassengers(){

               System.out.println("Total Passenger list " +  Arrays.toString(passengerList));
              }
            int totalPassenger (){

               return passengerList.length;
            }
}
