public class Casting {
    public static void main(String[] args) {
        /*
         * there are 2 types of casting
         * widening casting: smaller type to larger size (i.e. char to int)
         * narrowing casting: other way around (i.e. double to int)
         * widening can be done auto but narrowing is manual
         */
        int nine = 9;
        double dooble = nine;
        System.out.println(nine);
        System.out.println(dooble);
        short smallNine = (short) nine; // reverse function wat???
        System.out.println(smallNine);
    }
}
