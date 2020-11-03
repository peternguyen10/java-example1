public class Fibonacci {

    public static void main(String[] args) {

        int n = 10, t1 = 0, t2 = 1;
        System.out.println("running Fibonacci number demo in the remote host container thru SSH connection");
       // System.out.println("Running a demo setting up remote server connecting thru ssh and spin up a container dev en.");
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.println(t1 + " + ");
                                          

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}