import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayFactory {
    int x;


    public ArrayFactory(int x){
        this.x=x;


        }

     public void Instancja(){
        int[]tablica = new int [x];
        for(int i=0;i<tablica.length;i++){

            System.out.println(i);
        }
    }

    public ListIterator<Integer> Back(int x){
        List<Integer>mLista= new LinkedList<>();
        for(int i=x;i<=x;i--){

            System.out.println(i);
        }
   //     Iterator i = mLista.listIterator();
   //     while(((ListIterator)i).hasPrevious()){
   //         System.out.println(((ListIterator)i).previousIndex()+ " : "+((ListIterator) i).previous());

    //    }
        return mLista.listIterator();
    }
    public static void MacierzJednostkowa(){

    }










}
