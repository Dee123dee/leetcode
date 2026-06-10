class ListNode {
    public String url;
    public ListNode prev, next;

    public ListNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}

class BrowserHistory {
    ListNode home;
    ListNode curr;

    public BrowserHistory(String homepage) {
        home = new ListNode(homepage);
        curr = home;
    }

    public void visit(String url) {
        ListNode temp = new ListNode(url);
        curr.next = temp;
        temp.prev = curr;
        curr = curr.next;
    }

    public String back(int steps) {
        for (int i = 0; i < steps; i++) {
            if (curr.prev == null)
                break;
            else
                curr = curr.prev;
        }
        return curr.url;
    }

    public String forward(int steps) {
        for (int i = 0; i < steps; i++) {
            if (curr.next == null)
                break;
            else
                curr = curr.next;
        }
        return curr.url;
    }
}



/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */