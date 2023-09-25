import java.util.ArrayList;

public class NameArrayList{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("桜井");
        names.add("田原");
        names.add("中川");
        names.add("鈴木");
        String search = args[0];
        boolean result = false;
        int i;
        for(i = 0; i < names.size(); i++){
            String name = names.get(i);
            // System.out.println(name);
            if(name.equals(search)){
                break;
            }
        }
        if(i < names.size()){
            System.out.println(search + "さんは含まれています");
        } else {
            System.out.println(search + "さんは含まれていません");
        }
    }
}