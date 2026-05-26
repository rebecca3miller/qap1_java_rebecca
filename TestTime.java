public class TestTime {

    public static void main(String[] args) 
    {
        // create two time objects.
        Time t1 = new Time(0, 0, 0);

        Time t2 = new Time(0, 0, 0);

        // set times.
        t1.setTime(21, 10, 15);

        t2.setTime(10, 20, 25);

        // displaying original times.
        System.out.println("Before Changes:");
        System.out.println("Time 1: " + t1);
        System.out.println("Time 2: " + t2);

        // change times.
        t1.nextSecond();
        t2.previousSecond();

        // displaying updated times.
        System.out.println();

        System.out.println("After Changes:");
        System.out.println("Time 1: " + t1);
        System.out.println("Time 2: " + t2);
    }
}