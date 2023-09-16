/* final */

public final class Student2 extends Person2{
    private int stuNo;

    // 
    public Student2(String name, int stuNo){
        super(name);
        this.stuNo = stuNo;
    }

    public void display(){
        super.display();
        System.out.println("学籍番号：" + stuNo);
    }
}