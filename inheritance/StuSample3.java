/* 型変換 */

public class StuSample3{
    public static void main(String[] args){
        Student2 stu1 = new Student2("山田", 2525);
        Person2 psn = stu1;
        psn.display();
        stu1.display();
        //psn.changeStuNo(4649); //コンパイルエラー
        stu1.changeStuNo(4649); //問題なく実行される。
        psn.display();
        stu1.display();
    
    if(psn instanceof Student2){
        Student2 stu2 = (Student2)psn;
        stu2.changeStuNo(1000);
        stu2.display();
        stu1.display();
        psn.display();
        }
    }
}