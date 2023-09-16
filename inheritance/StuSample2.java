public class StuSample2{
    public static void main(String[] args){
        final int BASE_NO = 1000;
        Student2 student = new Student2("山田", BASE_NO+1);
        student.display();
        Student2 student2 = new Student2("山田", BASE_NO+2);
        student2.display();

        //BASE_NO = 2000;  //代入できないのでエラーになる。
    }
}