package ocp;

public class Charizard extends Pokemon {
    public Charizard(String name, int level, int hp) {
        super(name, level, hp);
        System.out.println("파읠파읠");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 화염 공격을 합니다.");
    }

    @Override
    public void evolve() {
        level++;
        hp = hp + 60;
        System.out.println(getName() + "이(가) 레벨 " + level + " 으로 Up, 체력은 " + hp + "로 증가");
    }
}
