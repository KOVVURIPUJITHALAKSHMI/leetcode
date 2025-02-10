class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int n=mountain.length;
        int index=0;
        ArrayList<Integer> List=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i==0){
                continue;
            }
            else if(i==n-1){
                continue;
            }
            else{
                if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                    List.add(i);
                }
            }

        }
        return List;
        
    }
}