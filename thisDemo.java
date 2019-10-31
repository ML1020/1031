class Person{
    private String name;
    private int age;
    private String sex;

    public Person(){
        this("bit",12,"man");
        //this必须放在无参构造方法的第一行
    }

//    public Person(){
//        this("bit",12);
//    }

    public Person(String name,int age,String sex){
        this.name = name;  //该变量是类的成员变量
        this.age = age;
        this.sex = sex;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }
}

public class thisDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
    }
}

