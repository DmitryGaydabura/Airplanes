public class Airplane {

    public static void printAirplaneInfo(String airplaneName, String modelOfAirplane) {
        System.out.println("Type of Airplane : \nName: " + airplaneName + " ,\nModel: " + modelOfAirplane + ".");
    }

    public static void printAirplaneInfo(String airplaneName, String modelOfAirplane, int numberOfStandardPassengers) {
        System.out.println("Type of Airplane : \nName: " + airplaneName + " ,\nModel: " + modelOfAirplane + " ,\nStandart Seats: " + numberOfStandardPassengers + ".");
    }

    public static void printAirplaneInfo(String airplaneName, String modelOfAirplane, int numberOfStandardPassengers, int numberOfBusinessClassPassengers) {
        System.out.println("Type of Airplane : \nName: " + airplaneName + " ,\nModel: " + modelOfAirplane + " ,\nStandart Seats: " + numberOfStandardPassengers + " ,\nNumber of Business-Class Seats: " + numberOfBusinessClassPassengers + ".");
    }


}
