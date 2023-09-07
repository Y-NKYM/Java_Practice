/* コメントの残し方
   命名規則
   変数記述方法　*/

class Variable{  //classの一文字目は大文字
    public static void main(String[] args){  //メインメソッド
        int day = 7;  //宣言方法１
        int month;  //宣言方法２
        month = 9;
        System.out.println("Today is");
        System.out.println(month + "/" + day);
        System.out.println("Today is" + month + "/" + day);
        System.out.println("今日の日付は、");
        System.out.println(month + "月" + day + "日です");
        System.out.println("今日の日付は、" + month + "月" + day + "日です");
    }
}
// 日本語表示はコンパイル時に「javac -encoding UTF-8 filename.java」と記述すること。