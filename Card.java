public class Card {

	private String owner;
	private int numbers[][];
	private boolean selected[][];

	public Card(String owner) { //create 2 2d array//
		this.owner = owner;
		this.numbers = new int[5][5]; //2d array of random numbers//
		this.selected = new boolean[5][5]; //2d array of the player selected//

		int arr[] = new int[25]; 									//the array that check are the numbers of the randomnumbers array repeated or not//
		for(int i = 0; i<25; i++){
			boolean repeatednum = false;
			do{
				repeatednum = false;
				int x =(int)(Math.random()*99)+1;
				for(int j = 0; j<i; j++){
					if(x==arr[j]){
						repeatednum = true;
						break;
					}
				}
				if(!repeatednum)
					arr[i] = x;	
			} while(repeatednum);
		}

		for(int i = 0; i<5; i++ ){
			for(int j=0; j<5; j++){
				numbers[i][j] = arr[i*5+j];
			}
		}
		for(int i=0; i<5; i++){
			for(int j = 0; j<5; j++){
				selected[i][j] = false;
			}
		}
	}

	public String getOwner() {    //get the player's name//
		return owner;
	}

	public boolean select(int num) { //check the player's selected numbers//
		for(int i = 0; i<5; i++){
			for(int j=0; j<5; j++){
				if(numbers[i][j] == num){
					if(!selected[i][j]){
						selected[i][j] = true;
						return true;
					}
					else
						return false;
				}
			}
		}
			return false;
	}

	public boolean bingo() { 					//check is the player bingo by horizontal , vertical, diagonal 1 and diagonal 2//
		// check horizontal
		for(int i=0; i<5; i++){
			boolean y = true;
			for(int j=0; j<5; j++){
				if(!selected[i][j]){
					y = false;
					break;
				}
			}
			if(y)
				return true;
		}
		// check vertical
		for(int j=0; j<5; j++){
			boolean y = true;
			for(int i=0; i<5; i++){
				if(!selected[i][j]){
					y = false;
					break;
				}
			}
			if(y)
				return true;
		}
		// check diagonal 1
		boolean y = true;
		for(int i=0; i<5; i++){
			if(!selected[i][i]){
				y = false;
				break;
			}
		}
		if(y)
			return true;
		// check diagonal 2
		y =true;
		for(int i=0; i<5; i++){
			if(!selected[5-1-i][i]){
				y = false;
				break;
			}
		}
		if(y)
			return true;
		return false;
	}

 
	public String toString() {                               //the String method to show the player's Card//
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(numbers[i][j]<10)
					sb.append("0"); //numbers < 10 like 1-9 than add 0in the front eg.01,02,03....//
				sb.append(numbers[i][j]);
				sb.append(" "); //add space between number and number//
			}
			sb.append("    ");
			for(int j=0; j<5; j++){
				if(selected[i][j])
					sb.append("X  "); //if the numbers are selected then show X//
				else
					sb.append("_  "); // if the numbers are not selected then show _//
			}
			sb.append("\n"); 				//null//
		}
		return sb.toString();				//return the toString//
	}
}