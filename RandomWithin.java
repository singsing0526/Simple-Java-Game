import java.util.Random;
public class RandomWithin extends NumberGenerator {

	private String str;

	public RandomWithin() {
		super("RandomWithin");// call super class constructor
		this.str = "RandomWithin: [not execute yet]";
	}

	public int generate(int a, int b) {
		int result = (int)(Math.random() * (b - a + 1) + a); //result 1//
		int result2 = (int)(Math.random() * (a - b + 1) + b);//result 2//
		this.str = "RandomWithin : " + "Random["; //edit the String in str //
		if(a<b){
			str += a + " to " + b +"]" + " = " + result; //edit the String in str //
			return result; //return result//
		}
		else{
			str += b + " to " + a +"]" + " = " + result2; //edit the String in str //
			return result2; //return result 2//
		}
	}

	public String toString() { //mehtod used to show the String str//
		return str;
	}
}