package oops;

public class Complex {
	private int realnum;
	private int compnum;

	Complex(int realnum, int compnum) {
		this.realnum = realnum;
		this.compnum = compnum;
	}

	public void print() {
		System.out.println(this.realnum + " i" + this.compnum);
	}

	public static Complex add(Complex C1, Complex C2) {
		int realnum = C1.realnum + C2.realnum;
		int compnum = C1.compnum + C2.compnum;
		Complex c3 = new Complex(realnum, compnum);
		return c3;
	}

	public void add(Complex C2) {
		this.realnum = this.realnum + C2.realnum;
		this.compnum = this.compnum + C2.compnum;
	}

	public static Complex multiply(Complex C1, Complex C2) {
		int realnum = C1.realnum * C2.realnum - C1.compnum * C2.compnum;
		int compnum = C1.realnum * C2.compnum + C1.compnum * C2.realnum;
		Complex c3 = new Complex(realnum, compnum);
		return c3;
	}

	public static Complex substact(Complex C1, Complex C2) {
		int realnum = C1.realnum - C2.realnum;
		int compnum = C1.compnum - C2.compnum;
		Complex c3 = new Complex(realnum, compnum);
		return c3;
	}
}
