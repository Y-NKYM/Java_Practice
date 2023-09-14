/* 継承：サブクラス */

public class Student extends Person{
    private int stuNo;
    public String className = "Student";

    public void setStuNo(int s){
        stuNo = s;
    }

    public void display(){  //オーバーライド
        System.out.println("名前：" + getName());
        System.out.println("学籍番号：" + stuNo);
    }
}