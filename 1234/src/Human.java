public class Human {
    int age;
    int weight;
    int hight;
    String name;
    Boolean isMale;

    public Human(int age, int weight, int hight, String name, Boolean isMale) {
        this.age=age;
        this.hight=hight;
        this.weight=weight;
        this.name=name;
        this.isMale=isMale;
    }

    public Boolean getMale() {
        return isMale;
    }

    public int getHight() {
        return hight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}
