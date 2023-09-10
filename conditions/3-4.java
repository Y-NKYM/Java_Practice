/* for文 */

class For{
    public static void main(String[] args){
        for(int i = 0; i < 3; i++){
            System.out.println("i = " + i);
        }
    }
}

class ForExample{
    public static void main(String[] args){
        int[] score = new int[3];  //配列生成方法
        score[0] = 5;
        score[1] = 10;
        score[2] = 12;
        String[] name = {"A", "B", "C"};  //初期化記述方法
        for (int i = 0; i < 3; i++){
            System.out.println(name[i] + "さん：" + score[i] + "点");
        }
    }
}