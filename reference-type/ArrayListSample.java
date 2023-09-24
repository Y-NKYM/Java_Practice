import java.util.ArrayList;

public class ArrayListSample{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list.size());
        list.add("私は");
        list.add("山田");
        list.add("です");
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.remove(0);
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}