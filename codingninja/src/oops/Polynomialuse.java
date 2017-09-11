package oops;

public class Polynomialuse {
	public static void main(String[] args) {
		
		Polynomial p1;
		p1=new Polynomial();
		p1.setcoff(0,2);
		p1.setcoff(1,2);
		p1.setcoff(3,2);
		p1.setcoff(2,2);
		p1.showpolynomial();
		System.out.println(p1.degree());
		Polynomial p2;
		p2=new Polynomial();
		p2.setcoff(0,2);
		p2.setcoff(1,2);
		p2.showpolynomial();
		System.out.println(p2.degree());
		Polynomial p3;
		p3=new Polynomial();
		p3.add(p1, p2);;
		p3.showpolynomial();
		System.out.println(p3.degree());
		p3.multiply(p1, p2);
		p3.showpolynomial();
		System.out.println(p3.degree());
	}

}
