import java.util.*;

class MyCalendar {
    private List<int[]> bookings;

    public MyCalendar() {
        bookings = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for (int[] b : bookings) {
            if (start < b[1] && b[0] < end) {
                return false; // overlap
            }
        }
        
        bookings.add(new int[]{start, end});
        return true;
    }
}