import java.util.Scanner;
public class Player {
    Game game=new Game();
    Scanner scan = new Scanner(System.in);
    private String Name;
    private String cName;
    private int chaid;
    protected static int damage;

    protected int _selloc;
    protected static int healty;
    protected static int money;
    public static int rhealty;



    public Player getPlayer(Player player) {
    return  player;
    }

    public int chaMenu() {
        System.out.println("please select character");
        System.out.println("1-karakter ismi: samuray,     hasar:5,    sağlık: 21,     para:15");
        System.out.println("2-karakter ismi: okçu,        hasar:7,    sağlık: 18,     para:20");
        System.out.println("3-karakter ismi: şovalye,     hasar:8,    sağlık: 24,     para:5");
        chaid = scan.nextInt();
        return chaid;
    }
    public void selectCha() {
        do{
            switch (chaid) {
                case 1:
                    character("samuray",5,21,15, 21 );
                    System.out.println("damage: "+getDamage());
                    System.out.println("health: "+getHealty());
                    System.out.println("money: "+getMoney());

                    break;
                case 2:
                    character("okcu", 7, 18, 20, 18);
                    System.out.println("damage: "+getDamage());
                    System.out.println("health: "+getHealty());
                    System.out.println("money: "+getMoney());
                    break;
                case 3:
                    character("sovalye", 8, 24, 5, 24);
                    System.out.println("damage: "+getDamage());
                    System.out.println("health: "+getHealty());
                    System.out.println("money: "+getMoney());
                    break;
            }
        } while (chaid < 0 || chaid > 4);
    }
    public void character(String name,int damage, int healty, int money, int rhealty) {
        setName(name);
        setHealty(healty);
        setDamage(damage);
        setMoney(money);
        setRhealty(rhealty);
    }

    public static void setRhealty(int TakenRhealty) {
        Player.rhealty = TakenRhealty;
    }
    public void rHealth(){
        setHealty(getRhealty());

    }
    public Player() {
        this.Name = Name;
    }
    public String getName() {

        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {

        this.damage = damage;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney()
    {
        return money;
    }
    public int setHealty(int healty) {
        this.healty = healty;
        return healty;
    }
    public int getHealty() {
        System.out.println("character health: "+healty);
        return healty;
    }
    public static int getRhealty() {
        return rhealty;
    }



}
