/* 継承
   オーバーライド */

public class StuSample{
    public static void main(String[] args){
        Student student = new Student();
        student.setName("山田");
        student.setStuNo(2525);
        student.display();
        System.out.println(student.className);
    }
}