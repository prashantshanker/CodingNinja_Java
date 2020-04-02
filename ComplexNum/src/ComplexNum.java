
public class ComplexNum 
{
	private int real;
	private int imag;
	public ComplexNum(int real,int imag) 
	{
		this.real=real;
		this.imag=imag;
	}
	
	public void print() 
	{
		System.out.println(real+" + "+imag+"i");
	}
	
	public void setreal(int num) 
	{
		this.real=num;
	}
	
	public void setimag(int num)
	{
		this.imag=num;
	}
	
	public void add(ComplexNum c2) 
	{
		this.real=this.real+c2.real;
		this.imag=this.imag+c2.imag;
	}
	
	public void multiply(ComplexNum c2) 
	{
		this.real=this.real*c2.real+((-1)*this.imag*c2.imag);
		this.imag=this.real*c2.imag+this.imag*c2.real;
	}
	
	public static ComplexNum add(ComplexNum c1,ComplexNum c2) 
	{
		int newReal=c1.real+ c2.real;
		int newImag=c1.imag+c2.imag;
		ComplexNum c4 = new ComplexNum(newReal,newImag);
		return c4;
	}

}
