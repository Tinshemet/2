public class Warmup {
    public static int backtrackingSearch(int[] arr, int x, int fd, int bk, Stack myStack) {
        boolean found=false;
        while(!found) {
        	int index=0;
        	int steps=0;
        	if(steps==bk) {
        		while(steps!=0) {
        			arr[index-1]=myStack.pull;
        			steps--;
        			index--;
        			}
        	}
        	if(arr[index]==x) {
        		return index;
        	}
        	else {
        		myStack.push(arr[index]);
        		index++
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
