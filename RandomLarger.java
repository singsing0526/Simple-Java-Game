public class RandomLarger extends NumberGenerator {

	private String str;

	public RandomLarger() {
		super("RandomLarger");	// call super class constructor
		this.str = "RandomLarger: [not execute yet]";
	}

	public int generate(int a, int b) {
		int result = (int)(Math.random() * (99 - a + 1) + a); 	//if a>b pick a random number between a to 99 //
		int result2 = (int)(Math.random() * (99 - b + 1) + b); 	//if a<b pick a random number between b to 99 //
		this.str = "RandomLarger : " + "Random[";	//edit the String in str //
		if(a>b){
			str += a + " to " + 99 +"]" + " = " + result;	//edit the String in str //
			return result; //return result 1//
		}
		else{
			str += b + " to " + 99 +"]" + " = " + result;	//edit the String in str //
			return result2; //return result 2//
		}
	}

	public String toString() { //mehtod used to show the String str//
		return str;
	}
}