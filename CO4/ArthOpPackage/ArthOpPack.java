package CO4.ArthOpPackage;

interface ArthOp {
    public int add(int a, int b);
    public int sub(int a, int b);
    public int mul(int a, int b);
    public int div(int a, int b);
}

public class ArthOpPack implements ArthOp {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
}