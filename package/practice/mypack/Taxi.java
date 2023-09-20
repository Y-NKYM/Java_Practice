package mypack;

public class Taxi extends Vehicle implements Stopable{
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