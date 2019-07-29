public class Rectangle extends Iterator{
    int lenght;
    int width;
    Rectangle(int lenght, int width){
        this.lenght=lenght;
        this.width=width;
    }

    static int Circuit(int lenght,int width){
        return 2*(lenght+width);
    }

    static int Field(int lenght, int width){
        return lenght*width;
    }

    static double Diagonal(int lenght, int width){
        return (double) Math.sqrt(Math.pow(lenght,2.0)+Math.pow(width,2));
    }


}

