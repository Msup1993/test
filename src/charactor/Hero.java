package src.charactor;
import java.io.Serializable;
import src.property.Item;

public class Hero  implements Serializable {
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;


    float armor; //护甲

    int moveSpeed; //移动速度

    public String testname = "some hero";

    public Hero() {
    }

    public Hero(String name) {
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }

    public void useItem(Item i) {
        System.out.println("ad 使用了什么东西");
    }

    public static void battleWin() {
        System.out.println("hero battle win");
    }


    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }
    //敌方的水晶
    static class EnemyCrystal{
        int hp=0;

        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory(){
            if(hp==0){
                Hero.battleWin();

                //静态内部类不能直接访问外部类的对象属性
                System.out.println( " win this game");
                System.out.println( " win this game");
                System.out.println( " win this game");
                System.out.println( " win this game");
                System.out.println( " win this game");
                System.out.println( " win this game");
                System.out.println( " win this game");
                System.out.println( " win this game");
                System.out.println( " win this game");
                System.out.println( " win this game");
                System.out.println( " win this game");
                System.out.println( " win this game");
            }
        }
    }

    public static void main(String[] args) {
        //实例化静态内部类
        Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
        crystal.checkIfVictory();
    }



}
