/*
== vs .equals()

Strings are immutable (they don't change)
*/

String word = "hello";
String other = "hello";
String thing = new String("hello");
String dude = other;  //shallow copy

boolean one = word == other;
//one -> true
//due to the compiler
//a compiler turns written code into machine code
//compiler is very efficient
	//I'll save space!
boolean two = dude == other;
//two -> true
boolean three = word == thing;
//three -> false
//== compares addresses

boolean four = word.equals(thing);
//four -> true
//.equals compares the text


if (word.isEmpty()){

}

if (word.equals("")){

}

if (word.length() == 0){

}



