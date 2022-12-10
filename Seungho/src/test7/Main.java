package test7;

public class Main {

    public static void main(String[] args) {


        Player p1 = new Player();
        p1.jumpEx(1);

        System.out.println("===============");

        Silver s = new Silver("이민수");
        p1.upgradeLevel(s);
        p1.jumpEx(2);

        System.out.println("===============");

        Gold g = new Gold("김용현");
        p1.upgradeLevel(g);
        p1.jumpEx(3);


    }

}
