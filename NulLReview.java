String[] names = new String[5];
names[0] = "Christina";
names[1] = "Michael";
names[4] = "";

//partially populated array
//spots 2, 3, 4 are null

System.out.println(names[2]); //prints null
String str = names[2];
System.out.println(str); //prints null


//this code will compile
//this code will work, in a fully populated array
//NPE: happens when I call method upon an object which is null
int bucket = 0;
for (int i = 0; i < names.length; i++){
	if (names[i] != null){ //or == definitely not .equals
		bucket += names[i].length();
	}
	
}