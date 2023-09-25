public class NameArray{
    public static void main(String[] args){
        String[] names = {"桜井","田原","中川","鈴木"};
        String search = args[0];
        int i;
        for(i = 0; i < names.length; i++){
            if(names[i].equals(search)){
                break;
            }
        }
        /* まだiがfor loop範囲内の場合breakが実行されたという
           意味になるため、含まれているということがわかる。*/
        if(i < names.length){  
            System.out.println(search + "さんは含まれています");
        } else {
            System.out.println(search + "さんは含まれていません");
        }
    }
}