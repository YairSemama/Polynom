import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;


/**
 * This class represents a Polynom with add, multiply functionality, it also should support the following:
 * 1. Riemann's Integral: https://en.wikipedia.org/wiki/Riemann_integral
 * 2. Finding a numerical value between two values (currently support root only f(x)=0).
 * 3. Derivative
 * @author Boaz
 *
 */
public class Polynom implements Polynom_able{

	/**
	 * Zero (empty polynom)
	 */
	public Polynom() {

	}
	/**
	 * init a Polynom from a String such as:
	 *  {"x", "3+1.4X^3-34x", "(2x^2-4)*(-1.2x-7.1)", "(3-3.4x+1)*((3.1x-1.2)-(3X^2-3.1))"};
	 * @param s: is a string represents a Polynom
	 */

	public Polynom(String s) {
		String t = "";
		Monom[] arr = new Monom[s.length()];
		int Startindex  = 0 ;
		int EndIndex = 0 ;
		int arrIndex = 0;
		int JustCheck = 0  ;
		for (int i = 0 ; i < s.length() ; i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == ')') {
			EndIndex = s.length()+1	;
			}
		}
			while (EndIndex < s.length()) {
				if (EndIndex != 0) {
					if (EndIndex == '+' || EndIndex == '-') {
						arr[arrIndex] = new Monom(s.substring(Startindex, EndIndex));
						arrIndex++;
						Startindex = EndIndex;
					}
				}
				EndIndex++;
			}

	}
	@Override
	public double f(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(Polynom_able p1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Monom m1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void substract(Polynom_able p1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiply(Polynom_able p1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean equals(Polynom_able p1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isZero() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double root(double x0, double x1, double eps) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Polynom_able copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Polynom_able derivative() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double area(double x0, double x1, double eps) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<Monom> iteretor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void multiply(Monom m1) {
		// TODO Auto-generated method stub
		
	}
	
}
