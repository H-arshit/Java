package oops;

public class Polynomial {
	private DynamicArray mypolinomial;

	public Polynomial() {
		mypolinomial = new DynamicArray();

	}

	public void setcoff(int deg, int coff) {

		while (mypolinomial.size() <= deg) {
			mypolinomial.add(0);
		}

		mypolinomial.set(deg, coff);

	}

	public int degree() {
		for (int i = this.mypolinomial.size() - 1; i >= 0; i--) {
			if (this.mypolinomial.get(i) != 0) {
				return i;
			}
		}
		return -1;
	}

	public void add(Polynomial a, Polynomial b) {
		if (a.degree() > b.degree()) {
			for (int i = 0; i <= b.degree(); i++) {
				this.setcoff(i, a.mypolinomial.get(i) + b.mypolinomial.get(i));
			}
			for (int i = b.degree() + 1; i <= a.degree(); i++) {
				this.setcoff(i, a.mypolinomial.get(i));
			}

		} else {
			for (int i = 0; i <= a.degree(); i++) {
				this.setcoff(i, a.mypolinomial.get(i) + b.mypolinomial.get(i));
			}
			for (int i = a.degree() + 1; i <= b.degree(); i++) {
				this.setcoff(i, b.mypolinomial.get(i));
			}
		}
	}

	public void addintome(Polynomial a) {
		if (a.degree() > this.degree()) {
			for (int i = 0; i <= this.degree(); i++) {
				this.setcoff(i,
						a.mypolinomial.get(i) + this.mypolinomial.get(i));
			}
			for (int i = this.degree() + 1; i <= a.degree(); i++) {
				this.setcoff(i, a.mypolinomial.get(i));
			}

		} else {
			for (int i = 0; i <= a.degree(); i++) {
				this.setcoff(i,
						a.mypolinomial.get(i) + this.mypolinomial.get(i));
			}
			for (int i = a.degree() + 1; i <= this.degree(); i++) {
				this.setcoff(i, this.mypolinomial.get(i));
			}
		}
	}

	public void showpolynomial() {
		for (int i = 0; i <= this.degree(); i++) {
			if (mypolinomial.get(i) != 0) {
				System.out.print(mypolinomial.get(i) + " X^" + i);
				if (i != this.degree()) {
					System.out.print(" + ");
				}
			}

		}
		System.out.println();
	}

	public void subtractfromme(Polynomial a) {
		if (a.degree() > this.degree()) {
			for (int i = 0; i <= this.degree(); i++) {
				this.setcoff(i,
						-a.mypolinomial.get(i) + this.mypolinomial.get(i));
			}
			for (int i = this.degree() + 1; i <= a.degree(); i++) {
				this.setcoff(i, -a.mypolinomial.get(i));
			}

		} else {
			for (int i = 0; i <= a.degree(); i++) {
				this.setcoff(i,
						-a.mypolinomial.get(i) + this.mypolinomial.get(i));
			}
			for (int i = a.degree() + 1; i <= this.degree(); i++) {
				this.setcoff(i, this.mypolinomial.get(i));
			}
		}
	}
	
	public void multiply(Polynomial a,Polynomial b)
	{
		for(int i=0;i<=a.degree();i++)
		{
			for(int j=0;j<=b.degree();j++)
			{
				if(a.mypolinomial.get(i)*b.mypolinomial.get(j)!=0)
				{	
				if(i+j<=this.degree())
				this.setcoff(i+j,this.mypolinomial.get(i+j)+(a.mypolinomial.get(i)*b.mypolinomial.get(j)));
				
				else
					this.setcoff(i+j,a.mypolinomial.get(i)*b.mypolinomial.get(j));
					
				}
			}
		}
	}

}
