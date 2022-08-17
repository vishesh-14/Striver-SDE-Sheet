double multiply(double val,int n);
double findNthRootOfM(int n, int m) {
    // Time Complexity : o(nlogm)
    // Space Complexity : o(1)
    double low = 1;
        double high = m;
        double eps = 1e-9; 
        
        while((high - low) > eps) {
            double mid = low+( high-low) / 2.0; 
            if(multiply(mid, n) <=m) {
                low = mid; 
            }
            else {
                high = mid; 
            }
        }
        return low;
 
 }
double multiply(double number,int n)
{
     double ans = 1.0;
        for(int i = 1;i<=n;i++) {
            ans = ans * number;
        }
    return ans;
}
