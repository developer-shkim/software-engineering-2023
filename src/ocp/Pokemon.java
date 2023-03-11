package ocp;

public class Pokemon {  // 추상 클래스가 되는 게 맞음, 피카츄는 그릴 수 있지만 포켓몬은 못 그림
    private String name;
    private int level;
    private int hp;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
        this.hp = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // SRP 위배
    public void attack(String opponent) {
        System.out.println(opponent + "를(을) 기본 공격합니다!");
    }

    public void evolve() {
        level++;
        hp = hp + 10;
        System.out.println(name + "이(가) " + level + "로 UP!");
    }

    // 또 다른 방식의 공격, 진화가 추가된다면 pokemon 클래스를 수정해야 함
}
