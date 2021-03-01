package abc;

public class StartAlphabet {
    public static void main(String[] args) {
        A[] alphabet = new A[20];
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        int count = 0;
        alphabet[count] = a;
        count++;
        alphabet[count] = b;
        count++;
        alphabet[2] = c;
        alphabet[3] = d;
        alphabet[2] = null;
    }

    // полиморфизм java
    // инкапсуляция java
    // наследование java
}
