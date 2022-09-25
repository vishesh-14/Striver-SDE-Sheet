 public int romanToInt(String s) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int total=0,n=s.length();
        for(int i=0;i<n;i++)
        {
            int val=hm.get(s.charAt(i));
            total+=val;
        }
        return total;
    }
