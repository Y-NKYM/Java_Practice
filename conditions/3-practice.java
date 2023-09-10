//三角形の面積
class Triangle{
    public static void main(String[] args){
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int area;
        //面積の計算
        area = (width * height) / 2;
        //高さ・幅・面積の表示文
        System.out.println("高さ：" + height);
        System.out.println("幅：" + width);
        System.out.println("面積：" + area);
    }
}

//少数の任意の位以下の切り捨て
class Decimal{
    public static void main(String[] args){
        int radius = Integer.parseInt(args[0]);
        double pi = 3.141592;
        double area;
        area = radius * radius * pi;
        //少数第３以降切り捨て(0.00まで)
        area = (Math.floor(area * 100))/100;

        System.out.println("半径：" + radius);
        System.out.println("面積：" + area);
    }
}

//比較
class Comparison{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a > b){
            System.out.println("大きいのは" + a + "です");
        } else if (a < b){
            System.out.println("大きいのは" + b + "です");
        } else {
            System.out.println("同じです");
        }
    }
}

//ループ
class LoopMessage{
    public static void main(String[] args){
        int i = 0;
        while (i < 10){
            System.out.println((i+1)+"回目の実行が行われました");
            i++;
        }
    }
}

//エコー
class Echo{
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}