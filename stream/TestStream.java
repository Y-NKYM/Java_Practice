import java.util.stream.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class TestStream{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "avocado");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> streamInt = intList.stream();
        System.out.println(streamInt);
        intList.stream().forEach(num -> System.out.println(num.toString()));
        List<Integer> newlist = new ArrayList<Integer>();
        intList.stream().forEach(num -> newlist.add(num+1));
        System.out.println(newlist.toString());
    }
}