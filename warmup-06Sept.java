int[] nums = {8, 7, 4, 5, 1, 3};

//warmup #1
int i = 0;
while (i < nums.length){
	if (nums[i] % 2 == 0){
		System.out.println(i + ": " + nums[i] + " is even");
	} else {
		System.out.println(i + ": " + nums[i] + " is odd");
	}
	i++;
}

//warmup #2
int i2 = 0;
int count = 0;
while (i2 < nums.length){
	if (nums[i2] < 5){
		count++;
	}
	i2++;
}
System.out.println("i2: " + i2 + ", count: " + count);


/*
	basic accessing loop: (touching every element)
	index intitialization
	while (index < arr.length){
		do something with arr[index]
		index++;
	}

	

	index initialization
	counter initialization
	while (index < arr.length){
		if statement based on problem, typically we'll say arr[index]
			increment counter
		increment index	(index++)
	}
	present results (print out or return counter)
*/

int[] things = {2, -1, 4, 5, -2};
int index = 0;
int counter = 0;
while (index < things.length){
	int currValue = things[index];
	if (currValue < 0){
		counter++;
	}
	index++;
}
System.out.println(index + ", " + counter);






int[] arr = {7, 5, 3, 1};

int index = 0;
while (index < arr.length){
	System.out.println(index);
	index++;
}





























