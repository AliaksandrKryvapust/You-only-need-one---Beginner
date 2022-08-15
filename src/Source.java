public class Source {
    public static void main(String[] args) {
        int x =45;
        int [] arr = new int[]  {80, 117, 115, 104, 45, 85, 112, 115};
        System.out.println(check(new int[][]{arr},x));
    }
    public static boolean check(Object[] a, Object x) {
        for (Object o : a) {
            if (o == x) {
                return true;
            }
        }
        return false; //return Arrays.asList(a).contains(x);
    }
}
