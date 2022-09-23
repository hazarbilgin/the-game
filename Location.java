import java.util.Scanner;
public class Location {
    NormalLoc normalLoc;
    SafeHouse safeHouse = new SafeHouse();
    Inventory inventory = new Inventory();
    private Player player;
    protected String name;
    protected int _selloc;

    Location(Player player) {
        this.setPlayer(player);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.println("select where you want to go");
        System.out.println("1. güvenli ev");
        System.out.println("2. Mağara belki karşınıza zombi çıkabilir ");
        System.out.println("3. orman belki karşınıza vampir çıkabilir");
        System.out.println("4. nehir belki karşınıza ayı çıkabilir");
        System.out.println("5. mağazaya gidip zırh/silah geliştirmesi alabilirsiniz...");
        while (_selloc < 0 || _selloc > 5) {
            System.out.println("yanlis sayi girdiniz gecerli bir lokasyon seciniz");
            _selloc = scan.nextInt();
        }
    }
    public void zombie() {
        int zdamage = 5;
        int zHealth = 15;

        if (player.healty > zdamage) {
            while (player.healty > zdamage) {
                player.setHealty(player.healty - zdamage);
                System.out.println("karakterin yeni cani: " + player.healty);

            }
            System.out.println("tebrikler kazandiniz...");
        } else {
            System.out.println("öldünüz ...");

        }
        System.out.println("gitmek istediginiz yeni yeri seçiniz ...");
        getMenu();
    }

    public void vampir() {
        int vdamage = 7;
        int vHealth = 17;
        if (player.healty > vdamage) {
            while (player.healty > vdamage) {
                player.setHealty(player.healty - vdamage);
                System.out.println("karakterin yeni cani: " + player.healty);
            }
        } else {
            System.out.println("öldünüz ...");
        }
        System.out.println("gitmek istediginiz yeni yeri seçiniz ...");
        getMenu();
    }

    public void ayı() {
        int adamage = 9;
        int aHealth = 21;
        if (player.healty > adamage) {
            while (player.healty > adamage) {
                player.setHealty(player.healty - adamage);
                System.out.println("karakterin yeni cani: " + player.healty);
            }
        }
        else
            {
                System.out.println("öldünüz ...");
            }
            System.out.println("gitmek istediginiz yeni yeri seçiniz ...");
            getMenu();
        }
    public int getMenu(){
        _selloc = scan.nextInt();
        switch (_selloc){
           case 1:
               System.out.println("suan güvenli evdesiniz");
               safeHouse.Healths();
               System.out.println("gitmek istediginiz yeni yeri seçiniz ...");
               getMenu();
               break;
            case 2:
               System.out.println("suan Magaradasınız... ");
                zombie();
               break;
            case 3:
                System.out.println("şuan ormandasınız...");
                vampir();
                break;
            case 4:
                System.out.println("şuan nehirdesiniz...");
                ayı();
                break;
            case 5:
                inventory.silahlar();
                break;
           default:
               System.out.println("yanlis değer girdiniz");
    break;
      }
        return _selloc;
    }
    private String bost;
    private String cave;
    private  String bear;
    private String monster;
    private String zombie;
    public String getCave() {
        return cave;
    }

    public void setCave(String cave) {
        this.cave = cave;
    }

    public String getBost() {
        return bost;
    }

    public void setBost(String bost) {
        this.bost = bost;
    }

    public String getBear() {
        return bear;
    }

    public void setBear(String bear) {
        this.bear = bear;
    }

    public String getMonster() {
        return monster;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }

    public String getZombie() {
        return zombie;
    }

    public void setZombie(String zombie) {

        this.zombie = zombie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSelloc() {
        return _selloc;
    }

    public void setSelloc(int selloc) {
        this._selloc = selloc;
    }
}
