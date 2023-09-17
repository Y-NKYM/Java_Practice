public class TandF extends Club{
    public TandF(String clubName){
        super(clubName);  
        /* 
        super();というのはスーパークラスの実行という意味なので、
        Club();となる。ClubのコンストラクタはStringを必要としているため、
        new TandF("陸上競技部");と記述した文字をClubへ送る。
        */
    }
    public void practice(){
        System.out.println("練習内容：腕立て伏せ");
    }
}