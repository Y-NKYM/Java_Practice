import java.util.Arrays;  
public class StuSample{
    public static void main(String[] args){
        Student stu1 = new Student("山田");
        Student stu2 = new Student("山田");

        boolean result = stu1.equals(stu2);
        System.out.println(result);
        System.out.println(stu1 == stu2);
        System.out.println(stu1);  //System.out.println(stu1.toString());と一緒
    }
}