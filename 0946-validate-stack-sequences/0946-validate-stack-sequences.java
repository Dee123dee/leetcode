class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>s = new Stack<>();
        int k=0;
        for(int i : pushed)
        {
            s.push(i);
            while(!s.isEmpty() && popped[k]==s.peek())
            {
                s.pop();
                k++;
            }
        }
        return s.isEmpty();
    }
}