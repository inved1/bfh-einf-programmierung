public class DataSet {
	private Measurable maximum;
	private int count;

	public DataSet() {
		count = 0;
		maximum = null;
	}

	public void add(Measurable x) {
		if (count == 0 || maximum.getMeasure() < x.getMeasure())
			maximum = x;
		count++;
	}

	public Measurable getMaximum() {
		return maximum;
	}
}