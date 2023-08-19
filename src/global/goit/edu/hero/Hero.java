package global.goit.edu.hero;

public class Hero {

    private String name;
    private int hp;

    public Hero() {
        this ("Paratrooper",100);

    }

    public Hero (String heroName, int heroHp) {
        if (heroHp > 200) {
            heroHp = 200;
        }

        if (heroHp < 0) {
            heroHp = 0;
        }

        this.name = heroName;
        this.hp = heroHp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public static void main(String[] args) {
        System.out.println(new Hero().getName());
    }
}