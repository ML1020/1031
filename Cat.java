class Animal0{
    protected String name;

    public Animal0(String name){
        this.name = name;
    }

    public void eat(String food){
        System.out.println("小动物");
        System.out.println(this.name + "正在吃" + food);
    }

    public  void eatingFish(){
        System.out.println(this.name + "爱吃鱼");
    }
}

public class Cat extends Animal0{

    public Cat(String name) {
        super(name);
    }

    public void eat(String food){
        System.out.println("我是猫");
        System.out.println(this.name + "正在吃" + food);
        super.eatingFish();
    }

    public static void main(String[] args) {
        Animal0 animal0 = new Cat("喵");
        animal0.eat("大肥鱼");
    }
}
