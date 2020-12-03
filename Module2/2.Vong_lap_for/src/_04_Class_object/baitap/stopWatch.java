package _04_Class_object.baitap;

public class stopWatch {
    long startTime;
    long stopTime;

    public long Start(){
        this.startTime = System.currentTimeMillis();
        return this.startTime;

    }
     public long Stop(){
        this.stopTime = System.currentTimeMillis();
        return this.stopTime;
     }

    public long getStartTime() {
        return this.stopTime - this.startTime;
    }

    public static void main(String[] args) {
        stopWatch stopWatch =new stopWatch();
        stopWatch.Start();
        int a = 0 ;
        for ( int x = 0 ; x < 100000000; x++){
            for (int y = 0; y < 100000000 ; y++){
                a +=-1;
            }
        }
        System.out.println("aaaaaaa");
        stopWatch.Stop();
        System.out.println(stopWatch.getStartTime());
    }
}
