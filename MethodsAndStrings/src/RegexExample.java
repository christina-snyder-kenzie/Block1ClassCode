import java.util.Arrays;

public class RegexExample {
    public static void main(String[] args) {
        String test = "hello-world goodbye mooo-oooo-ooo-on";
        String[] splitBySpaces = test.split(" ");
        String[] splitByDashes = test.split("-");
        String[] weird = test.split(" -"); //literally looks for space dash
        String[] both = test.split("[ -]");
        String[] jerrod = test.split("[\\s+]");

        System.out.println("Spaces: " + Arrays.toString(splitBySpaces));
        System.out.println("Dashes: " + Arrays.toString(splitByDashes));
        System.out.println("Weird: " + Arrays.toString(weird));
        System.out.println("Both: " + Arrays.toString(both));
        System.out.println("Jerrod: " + Arrays.toString(jerrod));
    }
}
