import java.util.Scanner;

public class Game {
        Player player;
        public  Player getPlayer(){
        return  player;
    }
        Scanner scan = new Scanner(System.in);
        public void login() {
        System.out.println("Welcome to area of war");
        System.out.println("please enter your nickname");
        String Name = scan.nextLine();
    }
        public String getName(String Name) {
                System.out.println(Name);
                return Name;
        }
}
