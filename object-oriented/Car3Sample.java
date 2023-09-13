class Car3Sample{
    public static void main(String[] args){
        Car3 c1 = new Car3();
        c1.run(30);
        c1.display();

        Car3 c2 = new Car3(2525);
        // c2.speed = 30;
        c2.run(30);
        c2.brake(10);
        c2.display();
    }
}