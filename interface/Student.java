public class Student extends Person implements English{
    public Student(String name){
        super(name);
    }
    public void display(){
        System.out.println("名前：" + getName());
    }
    public void displayEnglish(){
        System.out.println(English.LANGUAGE);
        this.display();
    }
}