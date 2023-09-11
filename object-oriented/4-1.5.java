class Student{
    //変数（属性）の定義
    String name;
    int engScore;
    int mathScore;

    //
    void display(){
        System.out.println(name + "さん");
        System.out.println("英語：" + engScore + "点");
        System.out.println("数学：" + mathScore + "点");
    }

    void setScore(int eng, int math){
        engScore = eng;
        mathScore = math;
    }

    double getAvg(){
        double avg = (engScore + mathScore) / 2.0;
        return avg;
    }

    public static void main(String[] args){
        Student student1 = new Student();

        student1.name = "山田太郎";
        student1.setScore(90, 80);
        student1.display();
        System.out.println("平均：" + student1.getAvg() + "点");
    }
}