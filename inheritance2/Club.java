public abstract class Club{
    private String clubName;

    public Club(String clubName){
        this.clubName = clubName;
    }
    public void display(){
        System.out.println("部活：" + clubName);
    }
    public abstract void practice();
}