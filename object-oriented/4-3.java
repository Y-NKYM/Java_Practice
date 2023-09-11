/* オーバーロード */

class Student2{
    String name;
    int engScore;
    int mathScore;

    void setData(String n){
        name = n;
    }
    void setData(String n, int e, int m){
        name = n;
        engScore = e;
        mathScore = m;
    }
    void setData(int e, int m){
        engScore = e;
        mathScore = m;
    }
    void display(){
        System.out.println(name+"さん");
        System.out.println("英語：" + engScore + "点");
        System.out.println("数学：" + mathScore + "点");
    }

    public static void main(String[] args){
        Student2 stu1 = new Student2();
        stu1.setData("山田");
        stu1.display();

        stu1.setData(90, 80);
        stu1.display();

        stu1.setData("田中", 50, 20);
        stu1.display();
    }
}