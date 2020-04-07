import java.util.Stack;

public class Warmup {
    public static int backtrackingSearch(int[] arr, int x, int fd, int bk, Stack myStack) {
    	int f = 1;// for fd 
    	for (int i = 0; i < arr.length; i=i+1) {
    		if(x == arr[i]) {
    			return i;
    		}
    		myStack.push(arr[i]);
			f=f+1;
			if(f==fd) {
				for (int b = 0; b != bk ; b=b+1) {
					arr[i] = (int) myStack.pop();
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
    public static void main (String[] args) {
    	int[] a = {1,2,3,4,5};
    	Stack stack = new Stack();
    	int b = backtrackingSearch(a, 4, 3, 2, stack);
    	System.out.println(b);
    	
    }
}
