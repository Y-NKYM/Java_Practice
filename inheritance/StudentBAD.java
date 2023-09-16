/* final
   エラー：final Student2からは継承できません */

public class StudentBAD extends Student2{
    StudentBAD(String name, int stuNo){
        super(name, stuNo);
    }
}