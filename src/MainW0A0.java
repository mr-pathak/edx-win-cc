import java.io.File;
import java.io.*;
import java.util.*;

public class MainW0A0 {
	    // TODO file names
	    static Scanner newInput() throws IOException {
	        if (System.getProperty("JUDGE") != null) {
	            return new Scanner(new File(".in"));
	        } else {
	            return new Scanner(System.in);
	        }
	    }
	    static PrintWriter newOutput() throws IOException {
	        if (System.getProperty("JUDGE") != null) {
	            return new PrintWriter(".out");
	        } else {
	            return new PrintWriter(System.out);
	        }
	    }

	    public static void main(String[] args) throws IOException {
	        try (Scanner in = newInput(); PrintWriter out = newOutput()) {
	        }
	    }
}
