package Practice_Questions;

public class Time {
    int hr,min;
    Time(int h, int m){
        hr = h;
        min = m;
    }
    static void addition(Time t1, Time t2){
        int hr = t1.hr + t2.hr;
        int min = t1.min + t2.min;
        if(min >= 60){
            hr += min/60;
            min %= 60;
        }
        System.out.println(hr+" : "+min);
    }

    public static void main(String[] args) {
        Time t1 = new Time(2,40);
        Time t2 = new Time(3,60);

        Time.addition(t1,t2);
    }
}
