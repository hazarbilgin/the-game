import java.util.Scanner;
public class Inventory extends Player
{
    int select;
    private int tdamage;
    private int kmoney;
    private int kdamage;
    private int pdamage;
    private int pmoney;
    Player player=new Player();
    Scanner scan = new Scanner(System.in);
    public  void silahlar(){
        System.out.println("tool store'a hoşgeldiniz...");
        System.out.println("hangi silahı almak istersiniz");
        System.out.println("1.  tabanca damage: 7,  money: 12");
        System.out.println("2.  kılıç damage: 9,  money: 15");
        System.out.println("3.  pompalı damage: 11,  money: 17");
        select=scan.nextInt();
        switch (select)
        {
            case 1:
                int tmoney=12;
                System.out.println(player.money);
                //BAŞKA BİR CLASSTAN VERİ ALMAK İÇİN STATİC YAZ HAFIZADA TUTUYOR
                if(money >= tmoney)
                {
                    setMoney( money-tmoney);
                    setDamage(7);
                    System.out.println("yeni hasarınız: "+player.getDamage());
                    System.out.println("kalan paraniz: "+money);
                }
                else {
                    System.out.println("yetersiz bakiye");
                }
                break;
            case 2:
                kmoney=15;
                if(money>= getKmoney())
                {
                    setMoney( money-kmoney);
                    setDamage(9);
                    System.out.println("yeni hasarınız: "+player.getDamage());
                    System.out.println("kalan paraniz: "+money);
                }
                else {
                    System.out.println("yetersiz bakiye");
                }
                break;
            case 3:
                pmoney=17;
                if(money>= getPmoney())
                {
                    setMoney( money-pmoney);
                    setDamage(11);
                    System.out.println("yeni hasarınız: "+player.getDamage());
                    System.out.println("kalanparaniz: "+money);
                }
                else {
                    System.out.println("yetersiz bakiye");
                }
                break;
            default:
                System.out.println("lütfen geçerli bi silah seçiniz");
                    //buraya while döngüsü girilcek
                break;
        }
    }
    public int getKmoney() {
        return kmoney;
    }

    public void setKmoney(int kmoney) {
        this.kmoney = kmoney;
    }

    public int getKdamage() {
        return kdamage;
    }

    public void setKdamage(int kdamage) {
        this.kdamage = kdamage;
    }

    public int getPdamage() {
        return pdamage;
    }

    public void setPdamage(int pdamage) {
        this.pdamage = pdamage;
    }

    public int getPmoney() {
        return pmoney;
    }

    public void setPmoney(int pmoney) {
        this.pmoney = pmoney;
    }
}
