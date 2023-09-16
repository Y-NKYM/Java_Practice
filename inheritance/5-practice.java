class Car{
    private int no;
    public void setNo(int no){
        this.no = no;
    }
    public void display(){
        System.out.println("ナンバーは" + no + "です");
    }
}
class Taxi extends Car{
    private int price;
    public void start(){
        this.price = 420;
    }
    public void run(){
        this.price += 80;
    }
    public void display(){
        System.out.println("タクシーの料金：" + price);
    }
}
class Taxi2 extends Car{
    private int price;
    public void start(){
        this.price = 420;
    }
    public void run(){
        this.price += 80;
    }
    public void display(){
        super.display();
        System.out.println("タクシーの料金：" + price);
    }
}

//実行用
class DriveTaxi{
    public static void main(String[] args){
        Taxi t1 = new Taxi();
        t1.setNo(2525);
        t1.start();
        t1.run();
        t1.display();
    }
}
class DriveTaxi2{
    public static void main(String[] args){
        Taxi2 t2 = new Taxi2();
        t2.setNo(4649);
        t2.start();
        t2.run();
        t2.display();
    }
}