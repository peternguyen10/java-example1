public class Fibonacci {

    public static void main(String[] args) {

        int n = 10, t1 = 0, t2 = 1;
        System.out.println("running Fibonacci number demo in container running on remote host");
       
        System.out.print("First " + n + " terms:.");

        for (int i = 1; i <= n; ++i)
        {
            System.out.println(t1 + " + ");
                    
                                            
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
