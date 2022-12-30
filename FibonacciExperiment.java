

public class FibonacciExperiment {

    private int limit;

    public FibonacciExperiment() {
        this.limit = 100;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void run() {
        int n = 0;
        int result;
        int StartingTime;
        int FinishingTime;
        int resultTİme;

        while(true){
                StartingTime = (int) System.currentTimeMillis();
                result = fibonacci(n);
                FinishingTime = (int) System.currentTimeMillis();
                resultTİme = FinishingTime - StartingTime;

                if (resultTİme >= limit){
                    System.out.printf("Time limit has been reached at fibonacci(%d) ",n);
                    break;
                }
                System.out.printf("fibonacci(%d) = %d is computed at %d milliseconds \n",n ,result, resultTİme);
                    n++;
        }



    }

     private static int fibonacci(int number) {
        if (number == 0 || number == 1){
            return  number;
        }

        return fibonacci(number-1) + fibonacci(number - 2);
    }
}
