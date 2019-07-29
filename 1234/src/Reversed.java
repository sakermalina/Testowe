import java.nio.IntBuffer;

public class Reversed {
    public  String Reversed(String word){
        return new StringBuilder(word).reverse().toString();
    }
    public void Reversed2(int number){
        while (number>0){
            int reminder = number%10;
            number/=10;
            System.out.println(reminder);
        }
    }

}
