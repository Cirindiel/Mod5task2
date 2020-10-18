public class AirConditioningTest {
    public static void main(String[] args) {

        Room room = new Room(24.5, 20, true);

        room.loweringTemperature();
        System.out.println(room.getTemperature());
    }
}
