import java.util.Scanner;

public class Tablica2 {

    public static  void ShowTab(){

        Scanner tab = new Scanner(System.in);
        int tabSiz = tab.nextInt();
        int[]tablica = new int[tabSiz];
       for (int i=0;i<tablica.length;i++){
           System.out.println(i);
       }
    }
    public  static  void ShowTab2(int[]tablica){
        System.out.print("[");
        for (int i=0;i<tablica.length;i++){
            boolean isLastOne = i ==tablica.length - 1;
            if(isLastOne){
                System.out.print(tablica[i]);
            }else {
                System.out.print(tablica[i]);
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
    public static void Sortowanie(int[] tablica){
        for(int i =0;i<tablica.length;i++){
            for (int current =0;current<tablica.length-1-i;current++){
                int next= current+1;
                if(tablica[current]>tablica[next]){
                    int tmp = tablica[next];
                    tablica[current]=tablica[next];
                    tablica[current]=tmp;
                }

            }

        }





    }
    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int current = 0; current < array.length - 1 - i; current++) {
                int next = current + 1;
                if (array[current] > array[next]) {
                    int tmp = array[next];
                    array[next] = array[current];
                    array[current] = tmp;
                }
            }
        }
    return array;

    }
}
