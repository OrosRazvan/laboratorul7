package Polymorphism;

public class Drawable {
    public void draw(){
        System.out.println("Aici se vor afisa desenele: ");
    }
}

class Circle extends Drawable{
    public void draw(){
        System.out.println("Aici se va desena cercul");
    }
}

class Square extends Drawable{
    public void draw(){
        System.out.println("Aici se va desena patratului");
    }
}
class Triangle extends Drawable{
    public void draw(){
        System.out.println("Aici se va desena tringhiului");
    }
}

class Main {
    public static void main(String[] args) {
        Drawable desen = new Drawable();
        Drawable cerc = new Circle();
        Drawable patrat = new Square();
        Drawable triunghi = new Triangle();

        desen.draw();
        cerc.draw();
        patrat.draw();
        triunghi.draw();
    }
}


