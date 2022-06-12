package Fan;

public class TestFan {
    public static void main(String[] args) {
        Fan[] fans = new Fan[3];
        fans[0] = new Fan(3, true, 3.5, "red");
        fans[1] = new Fan(2, false, 3.5, "yellow");
        fans[2] = new Fan(1, true, 3.5, "black");

        System.out.println("Fans: " );
        for (Fan fan: fans){
            System.out.println(fan);
        }
    }
}
