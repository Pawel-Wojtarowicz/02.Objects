
public class MyNumber {

    private double number;

    public MyNumber(double number) {
        this.number = number;
    }
    public boolean isOdd(){
        return ! isEven();
    }
    public boolean isEven(){
        return (number % 2) == 0;
    }
    public double sqrt() {
        return Math.sqrt(number);
    }
    public MyNumber pow(MyNumber pow) {
        return new MyNumber(Math.pow(number, pow.number));
    }
    public MyNumber add(MyNumber otherNumber) {
        return new MyNumber(number + otherNumber.number);
    }
    public MyNumber subtract(MyNumber otherNumber) {
        return new MyNumber(number - otherNumber.number);
    }


    @Override
    public String toString() {
        return "MyNumber{" +
                "number=" + number +
                '}';
    }

    public static void main(String[] args) {
        //https://www.samouczekprogramisty.pl/zestaw-cwiczen-dla-poczatkujacych-programistow/
        //Exercise 3

        MyNumber myNumber = new MyNumber(4);
        System.out.println("Czy jest parzysta: " + myNumber.isEven());
        System.out.println("Czy jest nieparzysta: " + myNumber.isOdd());
        System.out.println("Pierwiatek kwadratowy to: " + myNumber.sqrt());
        System.out.println("[Opakowany] Atrybut podniesiony do potęgi x opakowana w klase MyNumber: " + myNumber.pow(myNumber).toString());
        System.out.println("[Opakowany] Zwraca sumę atrybutu i x opakowaną w klasę MyNumber: " + myNumber.add(myNumber).toString());
        System.out.println("[Opakowany] Zwraca różnicę atrybutu i x opakowaną w klasę MyNumber: " + myNumber.subtract(myNumber).toString());


    }
}
