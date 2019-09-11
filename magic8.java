import java.util.Random;

public class Magic8 {

    // generate a random int between the range provided.
    private static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

    }

    public static void main(String[] args) {
        int roll = getRandomNumberInRange(1, 20);
        String result;
        switch (roll) {
        case 1:
            result = "It is certain.";
            break;
        case 2:
            result = "It is decidedly so.";
            break;
        case 3:
            result = "Without a doubt.";
            break;
        case 4:
            result = "Yes - definitely.";
            break;
        case 5:
            result = "You may rely on it.";
            break;
        case 6:
            result = "As I see it, yes.";
            break;
        case 7:
            result = "Most likely.";
            break;
        case 8:
            result = "Outlook good.";
            break;
        case 9:
            result = "Yes.";
            break;
        case 10:
            result = "Signs point to yes.";
            break;
        case 11:
            result = "Reply hazy, try again.";
            break;
        case 12:
            result = "Ask again later.";
            break;
        case 13:
            result = "Better not tell you now.";
            break;
        case 14:
            result = "Cannot predict now.";
            break;
        case 15:
            result = "Don't count on it.";
            break;
        case 16:
            result = "My reply is no.";
            break;
        case 17:
            result = "My sources say no.";
            break;
        case 18:
            result = "Outlook not so good.";
            break;
        case 19:
            result = "Very doubtful.";
            break;
        case 20:
            result = "Concentrate and ask again.";
            break;
        default:
            result = "This should not have happened";
        }

        // Shake the magic 8 ball and print the results to the terminal
        System.out.println("You shake the Magic 8 Ball.");
        System.out.println("The Results appear in the window:");
        for (int i = 0; i < result.length() + 4; i++) {
            System.out.print("-");
        }
        System.out.println("\n| " + result + " |");
        // Print to console if result of roll was positive, nuetral or negative.
        for (int i = 0; i < result.length() + 4; i++) {
            System.out.print("-");
        }
        if (roll < 11) {
            System.out.println("\nThe result was positive! Hooray!");
        } else if (roll < 16) {
            System.out.println("\nThe result was neutral.");
        } else {
            System.out.println("\nThe result was negative. Sorry!");
        }

    }

}