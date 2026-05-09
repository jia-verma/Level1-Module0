package _01_methods._1_houses;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
//1. Have a robot start on the left side of the window near the bottom.
Rob = new Robot();
rob.penDown();
rob.setSpeed(100);
for (i=0;i<5;i++){
	Random rand = new Random();
	int theHeightOfAHouseThatIsFlatOnTheTopKnownWithoutMuchGrammaricalCorrectness = rand.nextInt(676) + 14;
	flatHouseRoof(theHeightOfAHouseThatIsFlatOnTheTopKnownWithoutMuchGrammaricalCorrectness);
	int theHeightOfAHouseThatIsPointyOnTheTopWhyAreHousesPointyInPlacesThatDoNotSnow = rand.nextInt(416)+67;
	pointyHouseRoof(theHeightOfAHouseThatIsPointyOnTheTopWhyAreHousesPointyInPlacesThatDoNotSnow);
}
//2. Draw a flat-topped house of height 100 with grass after it (see picture).
static void flatHouseRoof(int TheHeightOfAHouseThatIsFlatOnTheTopKnownWithoutMuchGrammaricalCorrectness){
Rob.setRandomPenColor();
Rob.turn(270);
Rob.move(theHeightOfAHouseThatIsFlatOnTheTopKnownWithoutMuchGrammaricalCorrectness);
Rob.turn(270);
Rob.move(25);
Rob.turn(270);
Rob.move(theHeightOfAHouseThatIsFlatOnTheTopKnownWithoutMuchGrammaricalCorrectness);
Rob.turn(270);
Rob.setPenColor(45,112,49);
Rob.move(26);
}

static void pointyHouseRoof(int theHeightOfAHouseThatIsPointyOnTheTopWhyAreHousesPointyInPlacesThatDoNotSnow){
Rob.setRandomPenColor();
Rob.turn(270);
Rob.move(theHeightOfAHouseThatIsPointyOnTheTopWhyAreHousesPointyInPlacesThatDoNotSnow);
Rob.turn(300);
Rob.move(25);
Rob.turn(300);
Rob.move(25)
Rob.turn(210);
Rob.move(theHeightOfAHouseThatIsPointyOnTheTopWhyAreHousesPointyInPlacesThatDoNotSnow);
Rob.turn(270);
Rob.setPenColor(45,112,49);
Rob.move(26);
}
//3. Extract the piece of code that draws the house into a method. Draw 10 houses.

//4. Change the method to take (int height) as a parameter. Draw 9 houses of different heights

//5. Make the method take a String instead of an int.

//6. Make the method take a color as well as a height. The houses are drawn in that color.

//[optional] Set the scene to night by setting the background to black

//7. Give the houses peaked roofs

//8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”.

//9. Make large houses have flat roofs
	}
}
