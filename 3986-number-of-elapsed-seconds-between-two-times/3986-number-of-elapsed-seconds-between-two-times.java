class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int hr1=Integer.parseInt(startTime.substring(0,2));
        int min1=Integer.parseInt(startTime.substring(3,5));
        int sec1=Integer.parseInt(startTime.substring(6,8));
        int first = hr1*3600 +min1*60+sec1;
        int hr2=Integer.parseInt(endTime.substring(0,2));
        int min2=Integer.parseInt(endTime.substring(3,5));
        int sec2=Integer.parseInt(endTime.substring(6,8));
        int second = hr2*3600 +min2*60+sec2;
        return second-first;
    }
}