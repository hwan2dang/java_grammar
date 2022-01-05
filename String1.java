import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        short s = 1;
        System.out.println(s);

        int a = 3;
        System.out.println(a);

        long b = 4;
        System.out.println(b);

        float f = 5.5F;
        System.out.println(f);

        double d = 5.5;
        System.out.println(d);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        char c = 'A';

        boolean fact = true;
        fact = false;
        System.out.println(fact);

        byte data = 'd';
        System.out.println(data);


        String z = "hello world";
        System.out.println(z);

        int[] intArray = new int[] {1, 2, 3, 4};
        System.out.println(Arrays.toString(intArray));

        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] season = {"spring", "summer", "fall", "winter"};
        System.out.println(Arrays.toString(season));

        System.out.println(season[season.length - 1]);
    }
}
