// http://www.runoob.com/java/java-object-classes.html
public class Puppy{

    int p_age;

    public Puppy(String name){
        System.out.println("小狗的名字是:"+name);
    }

    public void setAge(int age){
        p_age = age;
    }

    public int getAge(){
        System.out.println("小狗的年龄是:" + p_age);
        return p_age;
    }

    public static void main(String args[]){

        Puppy apuppy = new Puppy("dog");
        apuppy.setAge(10);
        apuppy.getAge();
        System.out.println("变量值:" + apuppy.p_age);
    }
}
