class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                int last=stack.pop();
                int second=stack.peek();
                stack.push(last);
                stack.push(last+second);
            }
            else if(s.equals("D")){
                int top=stack.peek();
                stack.push(top*2);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(s));
            }

        }
        int sum=0;
        for(int num:stack){
            sum+=num;
        }
        return sum;
        
    }
}