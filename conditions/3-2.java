/* switch文 */

class SwitchBranch{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        switch(num){
            case 1:
                System.out.println("入場料：8000円");
                break;
            case 2:
                System.out.println("入場料：5000円");
                break;
            case 3:
                System.out.println("入場料：3000円");
                break;
            default:
                System.out.println("入場料：");
                System.out.println("１：一般、２：中・高校生、３：小学生");
        }
    }
}