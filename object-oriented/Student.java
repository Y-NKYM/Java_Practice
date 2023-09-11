/* 4-1.java (実行用から設計用を自動でコンパイルさせるため名を変更)
   オブジェクト指向について */

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
}