package Encapsulation;

public class GirlFriend {
    // private: 只能在本类中使用
    private String name;
    private int age;
    private String gender;

    // 构造方法
    // 方法重载
    public GirlFriend(){};
    public GirlFriend(String name,int age){
        this.name = name;
        this.age = age;
    }
    // 赋值
    public void setAge(int age){
        if(age>=18 && age <= 30){
            this.age = age;
        }
        else{
            System.out.println("年龄不符合要求.");
        }
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


}
