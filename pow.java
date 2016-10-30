    public static double pow(double x, int n){
        if(n==0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        double result = pow(x, n/2);
        if(n%2 == 0){
            return result * result;
        }
        else {
            return result * result * x;   
        }
    }
