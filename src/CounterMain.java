public class CounterMain {
    public static void main (String[] args) {

        Counter redCounter = new Counter(5);
        Counter blueCounter = new Counter(10);

        //System.out.println(firstCounter);

        System.out.println ("The blueCounter begins at " + blueCounter.value());
        System.out.println ("The redCounter begins at " + redCounter.value());
        redCounter.increase(3);
        blueCounter.decrease(10);



        System.out.println("redCounter increased to " + redCounter.getNumber());
        System.out.println("blueCounter decreased to " + blueCounter.value());
    }
}
