/*
goal: remove any non-letter character from the beginning and end of my string

1,2.3hello1,2.3 -> hello

how do I remove a character? (THINK: KEEPING what I want)

	from the beginning
		str = str.substring(1);
	from the end
		str = str.substring(0, str.length() - 1);
	from the middle? (maybe the ith letter)
		str = str.substring(0, i) + str.substring(i + 1);

How do I know if something is a letter or not?
	
	ascii table -> the capital alphabet and the lowercase alphabet 
			are together

	char tester = str.charAt(index);
	boolean isLowerCaseLetter = tester >= 'a' && tester <= 'z';
	boolean isUpperCaseLEtter = tester >= 'A' && tester <= 'Z';

the TRUE condition for continuation of the loop is when I am NOT a letter

*/

public static String removePunc(String str){
	//remove punc from the beginning
	while (isNOTaLetter(str.charAt(0))){
		str = str.substring(1);
	}

	//hello1,2.3
	//remove punc from the end
	while (isNOTaLetter(str.charAt(str.length() - 1))){
		str = str.substring(0, str.length() - 1);
	}

	return str;
}


public static boolean isNOTaLetter(char c){
	//this method returns TRUE if c is NOT a letter
	//if c IS a letter, this method should return false
	if (c >= 'a' && c <= 'z'){
		return false;
	} else if (c >= 'A' && c <= 'Z'){
		return false;
	} else {
		return true;
	}
}




