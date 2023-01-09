public class SwitchItUp {
    public static void main(String[] args) {
        String mood = "joyful";

        if (mood.equals("happy") || mood.equals("joyful")){
            System.out.println("Happy happy joy joy");
        } else if (mood.equals("sad")){
            System.out.println("Woe is us. So sad :(");
        } else {
            System.out.println("Mood not recognized...");
        }

        switch (mood) {
            case "happy", "joyful":
                System.out.println("Happy happy joy joy");
                break;
            case "sad":
                System.out.println("Woe is us. So sad :(");
                break;
            default:
                System.out.println("Mood not recognized...");
                break;
        }

        //30 days hath november, april, june, and september
        //28 days in February
        //all the rest have 31
        String month = "March";
        switch (month) {
            case "February":
                System.out.println("February has 28 days!");
                break;
            case "November", "April", "June", "September":
                System.out.println(month + " has 30 days");
                break;
            default:
                System.out.println(month + " has 31 days");
                break;
        }

    }
}
