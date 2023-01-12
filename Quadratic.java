public class Quadratic {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if(args.length != 3){
            System.out.println("Not enough arguments were provided");
            
        } else if(b == 0 && c > 0){
            System.out.println("No solutions");

        } else if(a == 0){
            System.out.println("x = " + (c * -1)/b);

        } else {
            int negb = (b*-1);  
            int bsq = (b*b); 
            int  fourac = (4*a*c);
            int twoa = (2*a);
            double sqrt = Math.sqrt(bsq-fourac);
            
            double solution1 = ((negb + sqrt) / twoa);
            double solution2 = ((negb - sqrt) / twoa);
          
            System.out.println("x = " + solution1);
            System.out.println("OR");
            System.out.println("x = " + solution2);
        }
    }
}
