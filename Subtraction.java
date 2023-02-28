public class Subtraction extends NumberGenerator {

	private String str;

	public Subtraction() {
		super("Subtraction");// call super class constructor
		this.str = "Subtraction: [not execute yet]";
	}

	public int generate(int a, int b) {
		int result = a - b; //result 1//
		int result2 = -(a-b);//result 2//
		this.str = "Subtraction : " + a + " - " + b +" = " + result; //edit the String in str //
		if(result>0){
			return result; //return result//
		}
		else if(result == 0){
			str += "-> " + a; //edit the String in str //
			return a; //return 2//
		}
		else{
			str += "-> " + "-" + "(" + result + ")" + "=" + result2; //edit the String in str //
			return result2; //return result 2//
		}
	}

	public String toString() { //mehtod used to show the String str//
		return str;
	}
}