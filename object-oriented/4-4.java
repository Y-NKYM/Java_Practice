/* コンストラクタ */

class Student3{
    String name;
    int engScore;
    int mathScore;

    Student3(){}
    
    Student3(String n){
        name = n;
    }
    Student3(String n, int e, int m){
        name = n;
        engScore = e;
        mathScore = m;
    }
    void setScore(int e, int m){
        engScore = e;
        mathScore = m;
    }
    void display(){
        System.out.println(name+"さん");
        System.out.println("英語：" + engScore + "点");
        System.out.println("数学：" + mathScore + "点");
    }

    public static void main(String[] args){
        Student3 stu1 = new Student3("山田");
        Student3 stu2 = new Student3("田中", 90, 80);
        stu1.display();
        stu2.display();

        stu1.setScore(50, 20);
        stu1.display();
        stu2.display();
    }
}