
public class Complex 
{
	private int real;
	private int imag;
	
	public Complex(int real,int imag) 
	{
		this.real=real;
		this.imag=imag;
	}

	public void print() 
	{
		System.out.println(real+" + "+"i"+imag);
	}
	
	public void add(Complex c2) 
	{
		this.real=this.real+c2.real;
		this.imag=this.imag+c2.imag;
	}
	
	public void multiply(Complex c2) 
	{
		Complex a = new Complex(real, imag);
		a.real=this.real*c2.real+((-1)*this.imag*c2.imag);
		a.imag=(this.real*c2.imag)+(this.imag*c2.real);
		this.real=a.real;
		this.imag=a.imag;
	}
}
