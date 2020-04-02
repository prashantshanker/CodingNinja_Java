
public class Polynomial {
	private int coff;
	private int degree[];
	private int nextIndex;

	public Polynomial() {
		degree = new int[5];
		nextIndex = 0;
	}

	public void print() {
		for (int i = 0; i < degree.length; i++) {
			if (degree[i] != 0)
				System.out.println(degree[i] + "x" + (i + 1));

		}
	}

	public void setCoefficient(int x, int coeff) {

		for (int i = 0; i < x; i++) {

			if (degree.length == nextIndex) {

				doubleCapacity(x);
			}
			if ((x - 1) == i) {
				degree[nextIndex] = coeff;
				nextIndex++;
				return;
			}

			degree[nextIndex] = 0;
			nextIndex++;

		}

	}

	private void doubleCapacity(int x) {
		int temp[] = degree;
		degree = new int[2*x];
		for (int i = 0; i < temp.length; i++) {
			degree[i] = temp[i];
		}
	}

}
