package Inheritance;

public class Shape {
    public double CalculateAria() {
        return 0.0;
    }
}

    class Circle extends Shape{
        double raza;

        public Circle(double raza){
            this.raza = raza;
        }

        @Override
        public double CalculateAria(){
            return Math.PI * raza * raza;
        }

        public static void main(String[] args){
            Circle dp = new Circle(2.3);
            System.out.println(dp.CalculateAria());
        }

    }

    class Rectangle extends Shape{
        int latime, lungime;

        public  Rectangle(int latime, int lungime){
            this.latime = latime;
            this.lungime = lungime;
        }

        @Override
        public double CalculateAria(){
            return latime * lungime;
        }

        public static void main(String[] args){
            Rectangle da = new Rectangle(3,5);
            System.out.println((da.CalculateAria()));
        }
    }

