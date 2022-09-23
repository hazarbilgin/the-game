import java.util.Scanner;
public class Location {
    int zdamage = 5;
    private int zHealth = 15;

    SafeHouse safeHouse = new SafeHouse();
    Inventory inventory = new Inventory();
    private Player player;
    protected String name;
    private  int ahealth=21;
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
        System.out.println("1. güvenli ev 3 altın karşılı canınız fullenir");
        System.out.println("2. Mağara belki karşınıza zombi(hasar: 5 para: +6 can: 15) çıkabilir ");
        System.out.println("3. orman belki karşınıza vampir(hasar: 7 para: +8 can: 17) çıkabilir");
        System.out.println("4. nehir belki karşınıza ayı   (hasar: 9 para: +10 can: 21) çıkabilir");
        System.out.println("5. mağazaya gidip zırh/silah geliştirmesi alabilirsiniz...");
        while (_selloc < 0 || _selloc > 5) {
            System.out.println("yanlis sayi girdiniz gecerli bir lokasyon seciniz");
            _selloc = scan.nextInt();
        }
    }
    public void zombie() {

        if (player.healty > zdamage) {
            while (player.healty > zdamage) {
                if(zHealth>-3){
                    player.setHealty(player.healty - zdamage);
                    setzHealth(zHealth-player.getDamage());
                    System.out.println("zombinin cani:"+zHealth);
                    System.out.println("karakterin kalan cani: " + player.healty);

                }
            }
            System.out.println("tebrikler kazandiniz...");
            player.setMoney(player.getMoney()+6);
            System.out.println("yeni paraniz: "+player.getMoney());
        } else {
            System.out.println("öldünüz ...");
            System.exit(0);
        }
        System.out.println("gitmek istediginiz yeni yeri seçiniz ...");
        getMenu();
    }
    public void vampir() {
        int vdamage = 7;
        int vHealth = 17;
        if (player.healty > vdamage) {
            while (player.healty > vdamage) {
                if(zHealth>-3){
                    player.setHealty(player.healty - vdamage);
                    setzHealth(zHealth-player.getDamage());
                    System.out.println("vampirin kalan cani:"+zHealth);
                    System.out.println("karakterin kalan cani: " + player.healty);

                }
            }
            System.out.println("tebrikler kazandiniz...");
            player.setMoney(player.getMoney()+8);
            System.out.println("yeni paraniz: "+player.getMoney());
        } else {
            System.out.println("öldünüz ...");
            System.exit(0);
        }
        System.out.println("gitmek istediginiz yeni yeri seçiniz ...");
        getMenu();
    }
    public void ayı() {
        int adamage = 9;

        if (player.healty > adamage) {
            while (player.healty > adamage) {
                if(getAhealth()>-5){
                    player.setHealty(player.healty - adamage);
                   setAhealth(getAhealth()-player.getDamage());
                    System.out.println("ayının kalan cani: "+getAhealth());
                    System.out.println("karakterin kalan  cani: " + player.healty);

                }
            }
            System.out.println("tebrikler kazandiniz...");
            player.setMoney(player.getMoney()+10);
            System.out.println("yeni paraniz: "+player.getMoney());
        } else {
                System.out.println("öldünüz ...");
                System.exit(0);
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
               while (_selloc<0 || _selloc>5){
                   System.out.println("yanlis değer girdiniz");
                   Location location=new Location(player);
                   location.getMenu();
               }

    break;
      }
        return _selloc;
    }
    private String bost;
    private String cave;
    private  String bear;
    private String monster;
    private String zombie;


    public int getSelloc() {
        return _selloc;
    }

    public void setSelloc(int selloc) {
        this._selloc = selloc;
    }

    public int getzHealth() {
        return zHealth;
    }

    public void setzHealth(int zHealth) {
        this.zHealth = zHealth;
    }

    public int getAhealth() {
        return ahealth;
    }

    public void setAhealth(int ahealth) {
        this.ahealth = ahealth;
    }
}
