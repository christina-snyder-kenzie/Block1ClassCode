int[] nums = {7, 13, 8, 5, 1, 4};

int bucket = 0;

for (int x : nums){
	if (x % 3 == 1){
		bucket += x;
	}
}

System.out.println(bucket);




Object variable = new Object(stuff);



primitive vs reference types


variable = null;
variable.method();
NullPointerException

absence of address -> null


variable.equals(null); //DOESN"T MAKE SENSE

variable == null
or
variable != null



String x = new String("hello");
String y = new String("hello");
String z = y;

x == y // false
y == z // true
x == z // false

y = "hello";
z = y;
y = y + "goodbye";

what is z?





Book b = new Book("The Lorax");
Book x = b;

b.setTitle("The cat in the hat");

What is x's title?

x = new Book("Green eggs and ham");

What is b's title?


HashMap<Key, ArrayList<Values>>

Recipes?
HashMap<Titles, ArrayList<Ingredients>, a third?>





















