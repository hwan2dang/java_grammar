public class loop {
    public static void main(String[] args) {
        // write your code here
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for(String day: days) {
            System.out.println(day);
        }

        int i = 0;
        int sum = 0;
        int j = 0;
        int sum1 = 0;

        while(i <= 10) {
            if(i == 5) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println(sum);

        do {
            sum1 += j;
            j++;
        } while (j < 10);
        System.out.println(sum);

    }
}

