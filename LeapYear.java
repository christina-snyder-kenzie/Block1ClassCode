/*
To be a leap year, 
	the year number must be divisible by four – 
		except for end-of-century years, 
			1600, 1700, 1800, 1900, 2000 (are divisible by 100)
			which must be divisible by 400.

*/


int year = 1700;
if (year % 100 == 0){
	//I am an end of century year
	if (year % 400 == 0){
		System.out.println("I am a leap year!");
	} else {
		System.out.println("I am not special...");
	} //little else
} else if (year % 4 == 0){
	System.out.println("I am a leap year!");
} else {
	System.out.println("I am not special....");
}

//1845 % 10 -> 5
//1847 % 10 -> 7
//1849 % 10 -> 9
//ANYTHING % 10 -> the rightmost digit

//1845 % 100 -> 45
//1847 % 100 -> 47
//ANYTHING % 100 -> the two rightmost digits

//1845 % 1000 -> 845

//RULE: with % (power of 10)
// % by a power of 10, I get that many digits from the right
