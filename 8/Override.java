/* Write a Java program to implement method overriding? */

package shubham;

class MODemo {
    int i, j;

    MODemo(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends MODemo {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show();
    }
}
