class StockSpanner {
     Stack<int[]>s;
    public StockSpanner() {
        s=new Stack<>();
    }
    
    public int next(int price) {
        int sp=1;
        while(!s.isEmpty() && s.peek()[0]<=price)
        {
            sp+=s.pop()[1];
        }
        s.push(new int[]{price,sp});
        return sp;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */