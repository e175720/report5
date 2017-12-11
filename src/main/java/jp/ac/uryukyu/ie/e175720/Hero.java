package jp.ac.uryukyu.ie.e175720;

public class Hero extends LivingThing {

    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void attack(LivingThing opponent){
        if(getDead()==true){
        }else{
            int damage = (int) (Math.random() * getAttack());
            int fatal = (int) (Math.random() * 100);
            if(damage == 0){
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName());
            }else{
                if (fatal <= 40){
                    damage = damage * 2;
                    System.out.printf("%sの攻撃！会心の一撃！%sに%dのダメージを与えた！\n", getName(), opponent.getName(), damage);
                    opponent.wounded(damage);
                }else{
                    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", getName(), opponent.getName(), damage);
                    opponent.wounded(damage);
                }
            }
        }
    }

    @Override
    public void wounded(int damage){
        int HP  = getHitPoint();
        HP -= damage;
        setHitPoint(HP);
        if( HP < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}