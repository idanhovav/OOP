public class Xifyer {
	public int[] xify(int[] x) {
		int total = 0;
		int index = 0;
		for(int a : x) {
			total += a;
		}
		int[] result = new int[total];
		for(int a : x) {
			for(int b = 0; b < a; b++) {
				result[index++] = a;
			}
		}
		return result;
	}
}