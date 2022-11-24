public class Main {
    public static void main(String[] args) {
        Passenger ship = new Passenger();

        ship.transportCapacity(9);

        ship.addPassenger(0, "Samuel");
        ship.addPassenger(1, "Nahom");
        ship.addPassenger(2, "Eden");
        ship.addPassenger(3, "Kalkidan");
        ship.addPassenger(4, "Selam");
        ship.addPassenger(5, "Biniam");
        ship.addPassenger(6, "Yabets");
        ship.addPassenger(7, "Mark");
        ship.addPassenger(8, "Paul");

        ship.updatePassenger(3, "Hermon");

        ship.removePassenger(5);
        ship.removePassenger(6);

        ship.addPassenger(5, "Kaleb");

        ship.viewTotalPassengers();


        Passenger plane = new Passenger();
        
        Passenger Bus = new Passenger();


    }
}