import java.util.Arrays;

public class Passenger {
    String passengerList[];
    int capacity;




           void transportCapacity (){
               passengerList = new String[capacity];
           }
            void addPassenger(int id, String passengerName){

                passengerList[id] = passengerName;
                System.out.println("Student added successfully");
            }

            void viewTotalPassengers(){

                System.out.println("Passenger list " +  Arrays.toString(passengerList));
            }

            void removePassenger (int id){

                passengerList [id] = null;
                System.out.println("Student removed successfully");
            }
            void updatePassenger (int id, String passengerName) {
                passengerList[id] = passengerName;
                System.out.println("Student updated successfully");
            }
            int totalStudent (){
                return passengerList.length;
            }
}
