import java.util.Random;
import java.util.function.Supplier;

class Exercise_2_OTP_generator{
    public static void main(String[] args) {

        //supplier take nothing return value
        Supplier<String> generateOtp = () -> {
            char[] vowels = {'A', 'E', 'I', 'O', 'U'};
            Random random = new Random();
            
            // Generate 1st char (random vowel)
            char firstChar = vowels[random.nextInt(vowels.length)];
            
            // Generate remaining 4 random digits (0-9)
            StringBuilder otp = new StringBuilder().append(firstChar);
            for (int i = 0; i < 4; i++) {
                otp.append(random.nextInt(10));
            }
            
            return otp.toString();
        };

        System.out.println("Generated OTP: " + generateOtp.get());
        System.out.println("Generated OTP: " + generateOtp.get());
    }
}