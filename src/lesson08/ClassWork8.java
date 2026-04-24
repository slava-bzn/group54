package lesson08;

public class ClassWork8 {
    public static void main(String[] args) {
        int x = 16;
        int y = 3;
        int z = x / y;
        System.out.println(z);

        boolean i = true;
        boolean j = !i;
        i = !j;
        boolean k = !i || !j;
        boolean o = i && k;
        if(o) {
            i=!j;
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
