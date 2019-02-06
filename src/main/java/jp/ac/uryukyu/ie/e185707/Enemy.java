package jp.ac.uryukyu.ie.e185707;

public class Enemy extends LivingThing{
    public Enemy(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    @Override
    public void wounded(int damage){
        setHitPoint(damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
