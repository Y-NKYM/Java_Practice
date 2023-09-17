public class Student{
    private String name;
    private Club club;

    public Student(String name, Club club){
        this.name = name;
        this.club = club;  //ClubにTandFクラスを代入
    }
    public void display(){
        System.out.println("名前：" + name);
        club.display();  //Clubクラスに存在するdisplay()メソッドを実行
    }
    public void practice(){
        club.practice();
    }
}