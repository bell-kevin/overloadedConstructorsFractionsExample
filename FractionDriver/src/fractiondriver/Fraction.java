package fractiondriver;

public class Fraction {

    private int numerator, denominator;
    private double quotient;

    public Fraction(int n) {
        this(n, 1);
    }

    public Fraction(int n, int d) {
        this.numerator = n;
        this.denominator = d;
        this.quotient = (double) this.numerator / this.denominator;
    }

    public void printIt() {
        System.out.println(this.numerator + " / " + this.denominator + " = " + this.quotient);
    }
}
