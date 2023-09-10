/* if文 */

class Branch{
    public static void main(String[] args){
        int price = Integer.parseInt(args[0]);
        double rate = 0.10;
        int discount, amount;
        
        if (price >= 3000){  //3000以上の場合
            discount = 300;
        } else {
            discount = 0;
        }

        amount = (int)((price-discount) * (1 + rate));
        System.out.println("値引価格：" + discount + "円");
        System.out.println("税込価格：" + amount + "円");
    }
}