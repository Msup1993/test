package src.property;

public class Item {
    String name;//名字
    int price;//价格
    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }

    public static void main(String[] args) {
        Item blod = new Item();

        blod.name = "血瓶";
        blod.price = 50;
        Item shoe = new Item();

        shoe.name = "草鞋";
        shoe.price = 300;
        Item longArrow = new Item();

        longArrow.name = "长剑";
        longArrow.price = 350;
        Item i = new Item();
        i.effect();

        LifePotion lp =new LifePotion();
        lp.effect();


    }
}
