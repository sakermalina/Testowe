
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {


    public static void Iteraotr(int liczba1, int liczba2, int liczba3) {
        List<Integer> array = new ArrayList<>();
        array.add(liczba1);
        array.add(liczba2);
        array.add(liczba3);

        ListIterator i = array.listIterator();
        while (((ListIterator) i).hasPrevious()) {
            System.out.println(((ListIterator) i).previousIndex() + " : " + ((ListIterator) i).previous());
        }


        for (Integer integer : array) {
            System.out.println(integer);
        }


    }

}












