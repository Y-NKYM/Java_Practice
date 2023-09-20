package mypack;

public class Train extends Vehicle{
    // private int crewNum;
    public Train(int crewNum){
        this.crewNum = crewNum;
    }
    public void showCrewNum(){
        System.out.println("電車乗車人数：" + crewNum + "名");
    }
}