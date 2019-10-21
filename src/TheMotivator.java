public class TheMotivator {
    public void feedback(int score) {
        if (score == 100)
            System.out.println("You're awesome");
        else if (score > 90)
            System.out.println("That's great");
        else if (score > 60)
            System.out.println("That's good ");
        else if (score > 50)
            System.out.println("EHHH");
        else if (score < 0)
            System.out.println("Impossible!");
        else
            System.out.println("Well, what can I say?");

    }
    public static void main(String[] args) {
        TheMotivator tm = new TheMotivator();
        tm.feedback(60);
        tm.feedback(100);
    }
}

