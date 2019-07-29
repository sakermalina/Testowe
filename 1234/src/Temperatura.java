import java.util.Scanner;

public class Temperatura {
    public static void PoliczTemperature(){

        try{

            System.out.println("Policzę temperature z ostatnich 7 dni !");
            Thread.sleep(1000);
            Scanner scanner = new Scanner(System.in);
            double[]tab=new double[8];
            for(int i =1;i<tab.length;i++){
                System.out.println("Podaj "+i+" liczbę ");
                tab[i]=scanner.nextInt();


            }
            double starter = 0;
            for (double temperature : tab) {
               starter+=temperature;
            }
            System.out.println("Srednia temperarura z ostatnich 7 dni wynosi "+(starter/tab.length));
            
        }catch (InterruptedException e) {
            {
                //
            }

        }
    }
    public static void PoliczTemp(){
        System.out.println("Z ilu ostatnich dni chcesz policzyć temperature ?");
        Scanner iledni = new Scanner(System.in);
        int zIluDni = iledni.nextInt();
        Scanner dane = new Scanner(System.in);

        double[]tablica = new double[zIluDni+1];
        for(int i=1;i<tablica.length;i++){
            System.out.println("Podaj "+i+" temperature");
            tablica[i]=dane.nextInt();
        }
        double starter =0;
        for (double temperatura : tablica) {
            starter+=temperatura;
        }
        System.out.println("Srednia temperatura z "+zIluDni+" dni wynosi "+(starter/zIluDni));


    }





}
