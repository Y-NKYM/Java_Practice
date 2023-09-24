public class Wrapper2{
    public static void main(String[] args){
        try{
            int i = Integer.parseInt(args[0]);
            String s = Integer.toBinaryString(i);
            System.out.println("二進数に変換：" + s);
        } catch(NumberFormatException e){
            System.out.print(Integer.MIN_VALUE);
            System.out.print("から");
            System.out.print(Integer.MAX_VALUE);
            System.out.print("までの数値を入力してください");
        }
    }
}