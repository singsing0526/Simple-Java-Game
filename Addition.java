public class Addition extends NumberGenerator {

	private String str;

	public Addition() {
		super("Addition");	// call super class constructor
		this.str = "Addition: [not execute yet]";
	}

	public int generate(int a, int b) {
		int result = a + b; //result 1//
		int afterresult = a + b -99; //result2//
		this.str = "Addition : " + a + "+" + b +" = " + result;	//edit the String in str //
		if(result<100)
			return result; //return result//
		else{
			str += "->" + result + " - " + 99 + " = " + afterresult; //edit the String in str //
			return afterresult; //return result 2//
		}
	}

	public String toString() { //mehtod used to show the String str//
		return str;
	}
}