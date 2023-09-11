class StudentSample{
    public static void main(String[] args){
        Student student1 = new Student();

        student1.name = "山田太郎";
        student1.setScore(90, 80);
        student1.display();
        System.out.println("平均：" + student1.getAvg() + "点");
    }
}