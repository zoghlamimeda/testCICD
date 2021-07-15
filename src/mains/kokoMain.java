package mains;

class A {
    int x;
    int y;

    public A(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equals(A a){
        if (a.x == this.x && a.y == this.y)
            return true;
        return false;
    }
}

public class kokoMain {

    public static void main(String[] args){
        A a1 = new A(1,2);
        A a2 ;
        a2 = a1;

        A a3 = new A(1,2);

        System.out.println(a1.equals(a2));
    }
}
