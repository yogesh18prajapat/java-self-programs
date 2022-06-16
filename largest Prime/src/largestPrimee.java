public class largestPrimee {

    public static void main(String[] args) {
        prime(21);
    }


        public static int prime ( int number){
            if (number < 0) {
                return -1;
            }
            int count = 0;
            for (int i = number - 1; i > 0; i--) {
                if (number % i == 0){
                    System.out.println(number);
                }

            }


            return number;
        }

}
