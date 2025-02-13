class Solution {
    public int getKth(int lo, int hi, int k) {
        List<int[]> list=new ArrayList<>();
        for(int i=lo;i<=hi;i++){
            int x=i;
            int count=0;
            while(x!=1){
                if(x%2==0){
                    x=x/2;
                    count++;
                }
                else{
                    x=3*x+1;
                    count++;
                }
            }
            list.add(new int[] {i,count});
        }
        Collections.sort(list,(a,b)->{
            if(a[1]==b[1]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        return list.get(k-1)[0];
    }
}