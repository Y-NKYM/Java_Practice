/* Staticキーワードについて */

class Static{
    String name;
    static int counter;

    Static(String n){
        name = n;
        counter++;
        System.out.println(name + "さんをインスタンス化しました。");
    }

    static void display(){
        System.out.println(counter + "人インスタンス化しました。");
    }
    
    public static void main(String[] args){
        Static.display();
        Static s1 = new Static("山田");
        Static.display();
        Static s2 = new Static("田中");
        Static.display();
    }
}