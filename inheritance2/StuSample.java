public class StuSample{
    public static void main(String[] args){
        TandF taf = new TandF("陸上競技部");
        Football fb = new Football("サッカー部");
        Student stu1 = new Student("山田", taf);
        stu1.display();
        stu1.practice();  //抽象メソッドが必要
        taf.practice();  //抽象メソッドが必要ない
        Student stu2 = new Student("田中", fb);
        stu2.display();
        stu2.practice();
    }
}