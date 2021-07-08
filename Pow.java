//TC: O(log n)
//SC: O(1) 
class Solution {

    
    public double myPow(double x, int n) {
        //base 
        if(n == 0)
            return 1.00;
        
        //logic        
        double result = myPow(x, n/2);        
        //if n is even then res * res
        if(n %2 == 0){
            return result * result;
        }
        else {
            //if n is -ve
            if(n < 0){
                return result * result * (1/x);
            }
            else
                return result * result * x;
        }
    }
    
}