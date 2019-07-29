public class Palindrom {
    public  static void  Palindromy(String text){
        StringBuilder builder = new StringBuilder("kotek");
        builder.reverse().toString();
        System.out.println(builder);

        if(text.equals(builder.toString())){
            System.out.println("Jest to palindrom !");
        }else {
            System.out.println("To nie jest palindrom!");
        }


    }
}
