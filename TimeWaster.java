public class TimeWaster {
    public static void main() {
        for(long i=0;i<Long.MAX_VALUE/100000000;i+=50)
        {
            if(i%1000000000==0)//Just to engage the program control ... to waste some time . INEFFICIENT
            System.out.print("*");
        }System.out.println("");
    }
}
