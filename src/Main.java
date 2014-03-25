public class Main {
    public static void main(String... str){
        BitSetWrapper bsw= new BitSetWrapper();
        bsw.set(4);
        bsw.set(23);
        bsw.set(44,54);
        bsw.set(101);
        bsw.set(102);

        System.out.println(bsw);
    }
}
