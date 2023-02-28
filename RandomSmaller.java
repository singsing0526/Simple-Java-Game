public class RandomSmaller extends NumberGenerator {

	private String str;

	public RandomSmaller() {
		super("RandomSmaller");// call super class constructor
		this.str = "RandomSmaller: [not execute yet]";
	}

	public int generate(int a, int b) {
		int result = (int)(Math.random() * (a - 1 + 1) + 1); 	//if a<b pick a random number between 1 to a //
		int result2 = (int)(Math.random() * (b - 1 + 1) + 1);	//if a>b pick a random number between 1 to b //
		this.str = "RandomSmaller : " + "Random[";	//edit the String in str //
		if(a<b){
			str += 1 + " to " + a +"]" + " = " + result;	//edit the String in str //
			return result; //return result 1//
		}
		else{
			str += 1 + " to " + b +"]" + " = " + result2;	//edit the String in str //
			return result2; //return result 2//
		}
	}

	public String toString() { //mehtod used to show the String str//
		return str;
	}
}