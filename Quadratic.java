// good
public class Quadratic {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if(args.length != 3){
            System.out.println("Not enough arguments were provided");
            
        } else if(a == 0){
            System.out.println("x = " + (c * -1)/b);

        } else {
            // I'd probably just have one variable here, for the discriminant:
            // int disc = b*b - 4*a*c
            int negb = (b*-1);  
            int bsq = (b*b); 
            int  fourac = (4*a*c);
            int twoa = (2*a);
            if (bsq - fourac < 0){
                System.out.println("No solutions");
            }
            double sqrt = Math.sqrt(bsq-fourac);
            
            double solution1 = ((negb + sqrt) / twoa);
            double solution2 = ((negb - sqrt) / twoa);
          
            System.out.println("x = " + solution1);
            System.out.println("OR");
            System.out.println("x = " + solution2);
        }
    }
}
