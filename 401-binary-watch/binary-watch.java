class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> list=new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(Integer.bitCount(h)+Integer.bitCount(m)==turnedOn){
                    list.add(h+":"+String.format("%02d", m));

                }
            }
        }
        return list;
        
    }
}