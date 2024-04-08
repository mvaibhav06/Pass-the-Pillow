public class PassPillow {
    public static int passThePillow(int n, int time) {
        if(time >= n){
            int factor = time%(n-1);
            if((time/(n-1))%2 == 0){
                return 1+factor;
            }else{
                return n-factor;
            }
        }else{
            return 1+time;
        }
    }

    public static void main(String[] args) {
        System.out.println(passThePillow(1000,1000));
    }
}
