public class Football extends Club{
    public Football(String clubName){
        super(clubName);  
        /* 
        super();というのはスーパークラスの実行という意味なので、
        Club();となる。ClubのコンストラクタはStringを必要としているため、
        new Football("サッカー部");と記述した文字をClubへ送る。
        */
    }
    public void practice(){
        System.out.println("練習内容：腹筋");
    }
}