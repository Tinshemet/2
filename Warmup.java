import java.util.Stack;

public class Warmup {
    public static int backtrackingSearch(int[] arr, int x, int fd, int bk, Stack myStack) {
    	Stack<E> st = new Stack;
    	int f = 0;
    	int d = 0;
    	for (int i = 0; i < arr.length; i++) {
    		if(x == arr[i]) {
    			return i;
    		}
			st.push(arr[i]);
			f=f+1;
			if(f==fd) {
				for (int b = 0; b != bk ; b++) {
					arr[i] = st.pop();
				}
				f=0;
			}
		}
    	return -1;
    }

    public static int consistentBinSearch(int[] arr, int x, Stack myStack) {
        // TODO: implement your code here
    }

    private static int isConsistent(int[] arr) {
        double res = Math.random() * 100 - 75;

        if (res > 0) {
            return (int)Math.round(res / 10);
        } else {
            return 0;
        }
    }
}
