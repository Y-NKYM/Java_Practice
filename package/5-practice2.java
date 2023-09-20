abstract class Vehicle{
    protected int crewNum;
    public abstract void showCrewNum();
}

class Taxi extends Vehicle{
    // private int crewNum;
    public Taxi(int crewNum){
        this.crewNum = crewNum;
    }
    public void showCrewNum(){
        System.out.println("タクシー乗車人数：" + crewNum + "名");
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

class Bus extends Vehicle{
    public Bus(int crewNum){
        this.crewNum = crewNum;
    }
    public void showCrewNum(){
        System.out.println("バス乗車人数：" + crewNum + "名");
    }
}