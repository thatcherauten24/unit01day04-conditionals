// good
public class RollLoadedDie {
    public static void main(String[] args) {
        double rn = Math.random();
        if(rn<=0.125){
            System.out.println(1);
            
        } else if(rn > 0.125 && rn <= .250){
            System.out.println(2);

        } else if(rn > 0.250 && rn <= .375){
            System.out.println(3);

        } else if(rn > 0.375 && rn <= .500){
            System.out.println(4);

        } else if(rn > 0.500 && rn <= 0.625){
            System.out.println(5);

        } else {
            System.out.println(6);
        }
        
    }
}
