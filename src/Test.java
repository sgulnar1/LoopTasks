public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a += b += c; // a = a+b+=3
        a+=b=b+c;
        a=a+b;
        System.out.println("a: " + a + ", b: " + b);
    }
}
