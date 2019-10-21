public class AntiMotivator {
    public void feedback(int score) {
        if (score == 100)
            System.out.println("Good enough");
        else if (score > 90)
            System.out.println("almost enough");
        else if (score > 60)
            System.out.println("barely a start ");
        else
            System.out.println("disappointment");
    }
}
