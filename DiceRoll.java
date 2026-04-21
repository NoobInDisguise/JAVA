import java.util.*;

class DiceRoll{
//method  for rolling dice, which containe=s all the  functionalities
	int roll(){
		double random = Math.random() * 6;//for generating random no. through Math.random() and muktiplying it w 6 to get values just under 6
		return (int) Math.ceil(random);// cinvert the floor value to ceiling value
	}

	public static void main(String[] args){
		 DiceRoll  dice = new DiceRoll(); // object creation
		for(int i = 0; i < 20; i++){// loop for rolling dice 20 times
			System.out.println(dice.roll());
		}
	}
}
