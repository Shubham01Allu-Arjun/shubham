
public class Exception {

		public static int sum(int[] values, int start, int end) {
		    if (values.length == 0) {
		        throw new IllegalArgumentException("Array length is 0");
		    }
		    if (values == null) {
		        throw new NullPointerException("Array is null");
		    }
		    if (start < 0 || end >= values.length) {
		        throw new ArrayIndexOutOfBoundsException("Start and end must be within the range of the array");
		    }
		    int sum = 0;
		    for (int i = start; i <= end; i++) {
		        sum += values[i];
		    }
		    if (sum == 0) {
		        throw new Exception();
		    }
		    return sum;
		
	}

}
