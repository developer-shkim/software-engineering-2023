package ocp;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int level, int hp) {
        super(name, level, hp);
        System.out.println("삐카삐카");
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 100만 볼트 공격을 합니다.");
    }

    @Override
    public void evolve() {
        level++;
        hp = hp + 30;
        System.out.println(getName() + "이(가) 레벨 " + level + " 으로 Up, 체력은 " + hp + "로 증가");
    }
}

// 새로운 포켓몬을 만들어도 Pikachu 는 건들지 않음