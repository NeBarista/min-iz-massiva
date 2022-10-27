public class a {

        public static void main (String [] args) {
            b(new int [] {2, -1, 3, 1, 32, 21, -5});
        }
        public static void b (int [] numbers) {
            int min = numbers[0];
            for(int i : numbers) {
                if(i < min) {
                        min = i;
            }
            
            System.out.println (min);
             }
        }
    }
