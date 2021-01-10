public class Palindromic{

    public static void main(String[] args) {

        int value = 0; // Palindromic number

        for(int i = 100; i <= 999; i++) // first number

        {
            for(int j = i; j <=999; j++) // second number
            
            {
                int value1 = i * j; // product of the 3 digit number

                StringBuilder sb1 = new StringBuilder("" + value1); // convert it to a string value

                String sb2 = "" + value1; // equal that sb1 to sb2 (3663)

                sb1.reverse(); // revers the sb1 value (EX: 3663 -- > 3663)

                if(sb2.equals(sb1.toString()) && value<value1) { // we need to check the largest Palindromic number (value < value1)
                    
                    value = value1;

                }

            }
        }

        System.out.println(" largest palindromic number " + value);
    }

}