import java.io.File;
import java.io.*;
import java.util.*;

public class MainW1A3 {
	    static Scanner newInput() throws IOException {
	        if (System.getProperty("JUDGE") != null) {
	            return new Scanner(new File("prepare.in"));
	        } else {
	            return new Scanner(System.in);
	        }
	    }
	    static PrintWriter newOutput() throws IOException {
	        if (System.getProperty("JUDGE") != null) {
	            return new PrintWriter("prepare.out");
	        } else {
	            return new PrintWriter(System.out);
	        }
	    }

	    public static void main(String[] args) throws IOException {
	        try (Scanner in = newInput(); PrintWriter out = newOutput()) {
	        	int n = in.nextInt();
	        	int t[] = new int [n];
	        	int pI;
	        	
	        	int minDiff = Integer.MAX_VALUE;
	        	int sum = 0;
	        	int tM = 0, pM = 0;
	        	
	        	for (int i = 0; i < n; i++) {
	        		t[i] = in.nextInt();
	        	}
	        	for (int i = 0; i < n; i++) {
	        		pI = in.nextInt();
	        		sum += Math.max(pI, t[i]);
	        		if (pI > t[i]) {
	        			pM++;
	        		} else if (pI < t[i]) {
	        			tM++;
	        		}
	        		minDiff = Math.min(minDiff, Math.abs(t[i]-pI));
	        	}
	        	
	        	if (tM == 0 || pM == 0) {
	        		sum -= minDiff;
	        	}
	        	
	        	out.println(sum);
	        }
	    }
}
