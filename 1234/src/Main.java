

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main extends Rectangle {


    Main(int lenght, int width) {
        super(lenght, width);
    }

    public static void main(String[] args) throws FileNotFoundException {
  /*     Rectangle rectangle = new Rectangle(2,2);
       Scanner odczyt = new Scanner(System.in);
       System.out.println("Podaj pierwszą liczbę");
         int  dane = odczyt.nextInt();
        System.out.println("Podaj drugą liczbę");
        int dane2 = odczyt.nextInt();
       System.out.println("Obwód prostokąta to : "+rectangle.Circuit(dane, dane2));

      System.out.println("Pole prostokąta to : "+rectangle.Field(dane,dane2));
      System.out.println("Długość przekątnej to : "+rectangle.Diagonal(dane,dane2));

     System.out.println(rectangle.lenght);
        System.out.println(rectangle.width);
        System.out.println("Podaj następną liczbę : ");
       MyNumber number = new MyNumber();
        int i1 =odczyt.nextInt();
       System.out.println("Czy liczba jest nieparzysta?");
       System.out.println(number.isOdd(i1));
       System.out.println(number.oblicz(i1));
        System.out.println("Potęga:");
       System.out.println(number.doPotegi(i1));

       Tablica tablica = new Tablica();
       for (String letter : tablica.getLetters()) {
           System.out.println(letter);
        }
      for (int i : tablica.getNumber(new int[]{1, 2, 3, 4, 5})) {
           System.out.println(i);
        }

        Iterator iterator = new Iterator();
        System.out.println("Wpisz trzy dowolne liczby : ");
        Scanner scanner = new Scanner(System.in);

        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int liczba3 = scanner.nextInt();


        System.out.println("Wpisane liczby w odwrotnej kolejności to : ");
        Iteraotr(liczba1,liczba2,liczba3);
        System.out.println("Podaj dowolną liczbę a ja policzę do niej : ");
        Instructions instructions = new Instructions();
        Scanner scanner2 = new Scanner(System.in);
        int x = scanner2.nextInt();
        instructions.OneDemention(x);
        System.out.println("_____-----_____");
        instructions.OneDmention2(x);

*/
      //  Scanner ArayFactoryInt = new Scanner(System.in);
      //  int instancja = ArayFactoryInt.nextInt();

     //   ArrayFactory arrayFactory = new ArrayFactory(instancja);
    //    arrayFactory.Instancja();
    //    arrayFactory.Back(instancja);
   //     Reversed reversed = new Reversed();
     //  Scanner scannerInt = new Scanner(System.in);
   //     System.out.println("Podaj wyraz a ja wyświetle go od tyłu ! ");
   //   String odczyt = scannerInt.nextLine();
  //      System.out.println(reversed.Reversed(odczyt));
  //      System.out.println("Podaj liczbę a wyświetle ją od tyłu !");
   //     int odczyt2 = scannerInt.nextInt();
   //    reversed.Reversed2(odczyt2);



   //     int numbers = scannerInt.nextInt();
     //  binary.ZapisBinarny(numbers);
    //Palindrom palindrom = new Palindrom();
   // palindrom.Palindromy(odczyt);

  //      try{
        //DataOutputStream strumień = new DataOutputStream(new FileOutputStream("zapis.txt"));
//
   //         strumień.close();
  //      }catch (FileNotFoundException e){
  //          System.out.println("Nie znaleziono pliku");
  //      }catch (IOException e ){
 //           System.out.println("Błąd wyjścia");
 //       }




/*   ZapisBinarny zapisBinarny = new ZapisBinarny();
        System.out.println("Podaj liczbę !");
    zapisBinarny.ZapisDanych();
      Scanner BinaryScanner = new Scanner(new File("zapis.txt"));

      int liczby = BinaryScanner.nextInt();
     zapisBinarny.ZamianaNaBinarne2(liczby);
*/

//Tablica2 tablica2= new Tablica2();
 //       System.out.println("Dane wyświetlane są w formie tablicy !");
//
 //           tablica2.ShowTab2(new int[]{10,9,8,7,6,5})
  //      int[] inputArray = new int[]{4, 5, 1, 3, 2};
     //   tablica2.Sortowanie(inputArray);
    //    tablica2.bubbleSort(inputArray);

    Temperatura temperatura = new Temperatura();
  //  temperatura.PoliczTemperature();   //7 dni
        temperatura.PoliczTemp();      //z dowolnej liczby dni



    }
}
