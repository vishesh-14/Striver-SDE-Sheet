class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Time Complexity : o(nlong+n)
         // Space Complexity : o(1)
        Arrays.sort(arr,new mycomp());
         double maxAmount=0;
         for(int i=0;i<n;i++)
         {
              if(W>=arr[i].weight)
              {
                  maxAmount+=arr[i].value;
                  W-=arr[i].weight;
              }
              else 
              {
                   double ratio=((double)arr[i].value / (double)arr[i].weight);
                   maxAmount+=ratio*W;
                   break;
              }
         }
         return maxAmount;
    }
}
class mycomp implements Comparator<Item>
{
     public int compare(Item i1, Item i2)
     {
         double ratio1=(double)(i1.value)/(double)i1.weight;
         double ratio2=(double)(i2.value)/(double)i2.weight;
          if(ratio1>ratio2)
          return -1;
          return 1;
     }
}
