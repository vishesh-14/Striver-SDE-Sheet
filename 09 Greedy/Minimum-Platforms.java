static int findPlatform(int arr[], int dep[], int n)
    {
        
        // Time Complexity : o(nlogn)
        // Space Complexity : o(1)
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform=1,minPlat=1;
        int p1=1,p2=0;
        while(p1<n)
        {
             if(arr[p1]<=dep[p2])
             {
                 platform++;
                 p1++;
             }
             else
             {
                 platform--;
                  p2++;
             }
             minPlat=Math.max(minPlat,platform);
        }
        return minPlat;
        
    }
