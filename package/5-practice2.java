abstract class Vehicle{
    protected int crewNum;
    public abstract void showCrewNum();
}

interface Stopable{
    public abstract void stop();
}

class Taxi extends Vehicle implements Stopable{
    // private int crewNum;
    public Taxi(int crewNum){
        this.crewNum = crewNum;
    }
    public void showCrewNum(){
        System.out.println("タクシー乗車人数：" + crewNum + "名");
    }
    public void stop(){
        System.out.println("ここで降ります");
    }
}

class Train extends Vehicle{
    // private int crewNum;
    public Train(int crewNum){
        this.crewNum = crewNum;
    }
    public void showCrewNum(){
        System.out.println("電車乗車人数：" + crewNum + "名");
    }
}

class Bus extends Vehicle implements Stopable{
    public Bus(int crewNum){
        this.crewNum = crewNum;
    }
    public void showCrewNum(){
        System.out.println("バス乗車人数：" + crewNum + "名");
    }
    public void stop(){
        System.out.println("ここで降ります");
    }
}

