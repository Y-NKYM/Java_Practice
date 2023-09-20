package mypack;

public class Bus extends Vehicle implements Stopable{
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