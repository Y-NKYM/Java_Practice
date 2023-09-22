/* IOExceptionクラスというのはjava.io内にあるため、importが必要 */
import java.io.*;

public class ThrowsMethod{
    public static void main(String[] args){
        //ファイルに書き込みを行うためのクラス
        WriteFile wf = new WriteFile();
        try{
            wf.open();
            wf.write();
        } catch(IOException e){
            System.out.println("IOEceptionが発生");
            e.printStackTrace();
        //念のため記述。今回は実行されない。
        } catch(Exception e){
            System.out.println("Eceptionが発生");
            e.printStackTrace();
        } finally {
            wf.close();
        }
    }
}