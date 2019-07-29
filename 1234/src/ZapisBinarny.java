import java.io.*;
import java.util.Scanner;

public class ZapisBinarny {
    public void ZapisDanych() {
        File file = new File("zapis.txt");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        try {

            PrintWriter zapis = new PrintWriter("zapis.txt");
            zapis.print(i);
            zapis.close();
            Scanner odczyt = new Scanner(new File("zapis.txt"));

        } catch (FileNotFoundException e) {
            //
        }

        


    }

    public static void ZamianaNaBinarne2(int liczba){
        String s = " ";
        while (liczba>0){
            s+=liczba%2;
            liczba/=2;
        }
        System.out.println("Liczba w postaci binarnej to : "+s);
    }



}
