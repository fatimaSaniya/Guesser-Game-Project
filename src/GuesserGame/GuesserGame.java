package GuesserGame;
import java.util.Scanner;
class Guesser {
    int guesserNum;
    public int GuesserNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser, choose a number between 1 and 100: ");
        guesserNum = sc.nextInt();
        return guesserNum;
    }
}
class Player {
    int playerNum;
    public int PlayerNumber(String playerName) {
        Scanner sc = new Scanner(System.in);
        System.out.print(playerName + ", guess a number between 1 and 100: ");
        playerNum = sc.nextInt();
        return playerNum;
    }
}
class Umpire {
    int guesserNum;
    int playerNum1;
    int playerNum2;
    int playerNum3;
    public void CollectNumFromGuesser() {
        System.out.println("🔮 Guesser, close your eyes and pick a secret number!");
        Guesser g = new Guesser();
        guesserNum = g.GuesserNumber();
    }

    public void CollectNumFromPlayers() {
        Player p1 = new Player();
        playerNum1 = p1.PlayerNumber("👤 Player 1");
        playerNum2 = p1.PlayerNumber("👤 Player 2");
        playerNum3 = p1.PlayerNumber("👤 Player 3");
    }

    public void Compare() {
        if (guesserNum == playerNum1) {
            if (guesserNum == playerNum2 && guesserNum == playerNum3)
                System.out.println("🎉 All players won the game! The guesser's number was " + guesserNum + "!");
            else if (guesserNum == playerNum2)
                System.out.println("🎉 Player 1 and Player 2 won the game! The guesser's number was " + guesserNum + "!");
            else if (guesserNum == playerNum3)
                System.out.println("🎉 Player 1 and Player 3 won the game! The guesser's number was " + guesserNum + "!");
            else
                System.out.println("🎉 Player 1 won the game! The guesser's number was " + guesserNum + "!");
        } else if (guesserNum == playerNum2) {
            if (guesserNum == playerNum3)
                System.out.println("🎉 Player 2 and Player 3 won the game! The guesser's number was " + guesserNum + "!");
            else
                System.out.println("🎉 Player 2 won the game! The guesser's number was " + guesserNum + "!");
        } else if (guesserNum == playerNum3)
            System.out.println("🎉 Player 3 won the game! The guesser's number was " + guesserNum + "!");
        else
            System.out.println("🙁 No one won this round. The guesser's number was " + guesserNum + ".");
    }
}
public class GuesserGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎲 Welcome to the Guesser Game! 🎲");
        do {
            Umpire u = new Umpire();
            u.CollectNumFromGuesser();
            u.CollectNumFromPlayers();
            u.Compare();
            System.out.print("Enter Y to continue or N to end: ");
            String c = sc.next();
            if (c.equalsIgnoreCase("N")) break;
        } while (true);
        System.out.println("🏁 Thanks for playing! 🏁");
    }
}
