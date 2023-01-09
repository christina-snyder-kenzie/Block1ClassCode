/*
Can we make a new array where all even 
elements have been moved to the front,
otherwise preserving the order of the elements?
*/

//array[position] = newValue;

int[] nums = {7, 5, 8, 3, 2, 1, 6};
//		  -> {8, 2, 6, 7, 5, 3, 1}

//even -> something % 2 == 0

//a bunch of stuff (more specifically, counting)...

//new array
int[] updated = new int[nums.length];
//make my goto index 
int gotoPos = 0;
//loop
for (int i = 0; i < nums.length; i++){
	//make stuff here -> it re-initializes
	int currValue = nums[i];
	//if even
	if (currValue % 2 == 0){
		//put it in the new array at the right spot
		updated[gotoPos] = currValue;
		gotoPos++;
	}
}

for (int i = 0; i < nums.length; i++){
	if (nums[i] % 2 == 1){
		updated[gotoPos] = nums[i];
		gotoPos++;
	}
}

/////////////////////////////////////////////////////////////

/*
	Count Lucky Number
	Given an array, and a lucky number, can you COUNT
	how many times that number appears in the array?
*/

int[] numbers = {7, 5, 3, 1, 7, 2, 7};
int luckyNumber = 7;


//init counter
int counter = 0;
//loop
for (int i = 0; i < numbers.length; i++){
	int currValue = numbers[i];
	//if statement
	if (currValue == luckyNumber){
		//update counter
		counter++;
	}
}
//present results
System.out.println(luckNumber + " appears " + counter + " times");


















