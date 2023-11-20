package ClassAndObject;

public class Person {
    String name, address;
    int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;

    }

    public static void main(String[] args){
        Person persoana = new Person("Razvan", "Bihor", 20);
        System.out.println("Numele: " + persoana.name + " ,Adresa: " + persoana.address + " ,Varsta: " + persoana.age);
    }
}

