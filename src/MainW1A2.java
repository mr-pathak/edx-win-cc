import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class MainW1A2 {
	    static Scanner newInput() throws IOException {
	        if (System.getProperty("JUDGE") != null) {
	            return new Scanner(new File("aplusbb.in"));
	        } else {
	            return new Scanner(System.in);
	        }
	    }
	    static PrintWriter newOutput() throws IOException {
	        if (System.getProperty("JUDGE") != null) {
	            return new PrintWriter("aplusbb.out");
	        } else {
	            return new PrintWriter(System.out);
	        }
	    }

	    public static void main(String[] args) throws IOException {
	        try (Scanner in = newInput(); PrintWriter out = newOutput()) {
	        	BigInteger a = BigInteger.valueOf(in.nextLong());
	        	BigInteger b = BigInteger.valueOf(in.nextLong());
	        	BigInteger c = b.multiply(b);
	        	c = a.add(c);
	            out.println(c);
	        }
	    }
}
