import java.util.Scanner;

public class Factory {

    public static void main(String[] args) {
        Factory factory = new Factory();
        System.out.println("Podaj markę : ");
        Scanner odczyt = new Scanner(System.in);
        String string = odczyt.nextLine();
        String marka = factory.dajSamochod(string).getMarka();
        String klasa = factory.dajSamochod(string).getClass().getName();
        System.out.println(marka);
        System.out.println(klasa);


    }
    public Samochody dajSamochod(String marka){
        Samochody samochod;

        if(marka.equals("Fiat")){
            samochod = new Fiat();

        }else if(marka.equals("Ford")) {
            samochod = new Ford();
        }else if(marka.equals("Mercedes")){
            samochod = new Mercedes();

        }else {
            samochod = new Samochody();
        }
        return samochod;
    }

}

