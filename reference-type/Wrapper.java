public class Wrapper{
    public static void main(String[] args){
        int i = 10;
        Integer j = 10;  //not recommended
        System.out.println(i);
        System.out.println(j);
        String s = j.toString();
        String t = Integer.toString(i);
        System.out.println(s);
        System.out.println(t);
    }
}