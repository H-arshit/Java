package oops;

public class ComplexUse {
	public static void main(String[] args) {

		Complex C1 = new Complex(3, 4);
		Complex C2 = new Complex(1, 2);

		C1.print();

		C2.print();
		C1.add(C2);
		C1.print();
		Complex C3 = Complex.add(C1, C2);
		C3.print();
		C3 = Complex.multiply(C1, C2);
		C3.print();
		C3 = Complex.substact(C1, C2);
		C3.print();
		C2 = C1;
		C2.print();

	}
}
