/* 4-6.java (クラスpublic記述によりファイル名変更)
   カプセル化 */

public class Capsule{
    private String name;
    private int score;

    public Capsule(String n){
        name = n;
    }

    public void setScore(int s){
        if (0 <= s && s <= 100){
            score = s;
        } else {
            System.out.println(name + "さんの点数が範囲外です。");
            //score = 0;
        }
    }

    void display(){
        System.out.println(name + "さん：" + score + "点");
    }

    public static void main(String[] args){
        Capsule student = new Capsule("山田");
        student.setScore(80);
        student.display();

        Capsule student2 = new Capsule("田中");
        student2.setScore(-50);
        student2.display();
    }
}