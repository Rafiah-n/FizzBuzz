public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int multiplesOf3 = 0;
        int multiplesOf5 = 0;

        while (i < 1000){
            if (i % 3 == 0){
                multiplesOf3 += 1;
            }
            if (i % 5 == 0){
                multiplesOf5 += 1;
            }
        }

        System.out.println(multiplesOf3);
        System.out.println(multiplesOf5);
    }
}
