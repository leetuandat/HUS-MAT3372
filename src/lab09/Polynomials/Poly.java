package lab09.Polynomials;

public interface Poly {
    public double[] coefficients();

    public double coefficient(int degree);

    public int degree();

    public Poly derivative();
}
