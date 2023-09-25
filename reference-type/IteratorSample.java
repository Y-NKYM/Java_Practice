import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4); 
        list.add(5); 
        list.add(6); 
        Iterator<Integer> it = list.iterator();
        System.out.println("リストサイズ："+list.size());
        System.out.println(it);
        System.out.println(it.next());
        while(it.hasNext()){
            int i = it.next();
            if(i == 2 || i == 4){
                System.out.println("削除します");
                it.remove();
            } else {
                System.out.println(i);
            }
        }
        System.out.println("リストサイズ："+list.size());
    }
}