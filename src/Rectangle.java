public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double calculateField() {
        return sideA * sideB;
    }
    public double calculateCircumference() {
        double l;
        l = (2*(sideA+sideB));
        return l;
    }
    public double calculateDiagonalLenght() {
        double d;
        d = Math.sqrt((sideA*sideA)+(sideB*sideB));
        return d;
    }

    public static void main(String[] args) {

        //https://www.samouczekprogramisty.pl/zestaw-cwiczen-dla-poczatkujacych-programistow/
        //Exercise 2
        Rectangle rectangle1 = new Rectangle(55,12.5);
        System.out.println("Pole wynosi: " + rectangle1.calculateField());
        System.out.println("Obwód wynosi: " + rectangle1.calculateCircumference());
        System.out.println("Przekątna ma długość :" + rectangle1.calculateDiagonalLenght());
    }
}
