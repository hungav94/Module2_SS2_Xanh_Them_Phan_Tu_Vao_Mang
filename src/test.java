public class test {
    public int[] reSize(int[] a, int size){
        int[] temp = new int [size];
        System.arraycopy(a, 0, temp, 0, (a.length < size) ? a.length : size);
        return temp;
    }
    public void outPut(int[] a){
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+"  ");
    }
    public static void main(String [] agrs){
        test ns = new test();
        int[] a = new int[5];
        for (int i=0; i<a.length; i++)
            a[i] = i;
        System.out.println("\nBefor change length of a = " + a.length);
        ns.outPut(a);
        a = ns.reSize(a, 20);
        for (int i=5; i<a.length; i++)
            a[i] = i;
        System.out.println("\nAfter change length of a = " + a.length);
        ns.outPut(a);
    }
}
