import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binary {
    public static void ZapisBinarny(int numbers) {

        String binaryReserved ="";

        while (numbers>0){
            binaryReserved+=numbers%2;
            numbers /= 2;
        }

        System.out.println(new StringBuilder(binaryReserved));


    }




}
