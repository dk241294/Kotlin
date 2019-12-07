public class Second {
    public static void main(String[] args) {
        //  in java it ask for two parameter so just write @jvmoverloads then kotlin code create two method of it
        System.out.println(FirstKt.cal(30, 0.04));
        System.out.println(FirstKt.cal(70));
        System.out.println(FirstKt.cal(70,0.8));
    }
}
