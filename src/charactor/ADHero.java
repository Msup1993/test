package src.charactor;
import src.property.Item;
import src.property.LifePotion;

public class ADHero extends Hero implements AD {
    int moveSpeed;

    {
        moveSpeed = 400;
    }

    @Override
    public void physicAttack() {

        System.out.println("进行了物理攻击");

    }
    //隐藏父类的battleWin方法
    public int getMoveSpeed(){
        return this.moveSpeed;
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    // 重写userItem，并在其中调用父类的userItem方法
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }

    public static void main(String[] args) {
        ADHero h = new ADHero();


        LifePotion lp = new LifePotion();
        h.useItem(lp);

    }


}
