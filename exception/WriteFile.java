/* IOExceptionクラスというのはjava.io内にあるため、importが必要 */
import java.io.*;

public class WriteFile{
    public void open(){
        System.out.println("ファイルを開きます");
    }
    public void write() throws IOException{
        throw new IOException();
    }
    public void close(){
        System.out.println("ファイルを保存して閉じます");
    }
}