public class SuperClass {
    private int superClassVariable;

    SuperClass() {
        superClassVariable = -10;
    }
    SuperClass(int a) {
        superClassVariable = a;
    }

    public void showValue() {
        System.out.println("SuperClass: " + superClassVariable);
    }
}

