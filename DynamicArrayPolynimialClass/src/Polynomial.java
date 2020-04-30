
public class Polynomial {

	int arr[] = new int[100];

	public void setCoefficient(int degree, int coeff) {

		arr[degree] = coeff;

	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[i] + "x" + i);
			}
		}
	}

	public Polynomial add(Polynomial p) {
		for (int i = 0; i < this.arr.length; i++) {
			for (int j = 0; j < p.arr.length; j++) {
				if (i == j && (this.arr[i] != 0 || p.arr[j] != 0)) {
					this.arr[i] += p.arr[j];
				}
			}

		}

		return this;
	}

	public Polynomial subtract(Polynomial p) {

		for (int i = 0; i < this.arr.length; i++) {
			for (int j = 0; j < p.arr.length; j++) {
				if (i == j && (this.arr[i] != 0 || p.arr[j] != 0)) {
					this.arr[i] -= p.arr[j];
				}
			}

		}

		return this;
	}

	public Polynomial multiply(Polynomial p) {

		Polynomial poly = new Polynomial();

		for (int i = 0; i < this.arr.length / 2; i++) {
			for (int j = 0; j < p.arr.length / 2; j++) {

				poly.arr[i + j] += this.arr[i] * p.arr[j];

			}

		}

		return poly;

	}
}
