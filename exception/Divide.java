/* try-catch
   exception error */

public class Divide{
    public static void main(String[] args){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("計算開始");
            System.out.println(a + " / " + b + " = " + (a / b) + " 余り " + (a % b));
            System.out.println("計算終了");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("二つの数値を入力してください。");
            // 具体的なエラー文
            System.out.println("詳細：" + e.getMessage());
            // Exception種類、エラー文、エラー発生行等
            e.printStackTrace();
        } catch(Exception e){
            System.out.println("例外が発生しました。");
            System.out.println("詳細：" + e.getMessage());
            e.printStackTrace();
        } finally{
            System.out.println("プログラムを終了します。");
        }
    }
}