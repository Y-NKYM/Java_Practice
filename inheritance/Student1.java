/* this・super */

public class Student1 extends Person1{
    private int stuNo;

    // 
    public Student1(String name){
        this(name, 999);
    }
    public Student1(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }

    public void display(){
        super.display();
        System.out.println("学籍番号：" + stuNo);
    }
}