public class SubClass extends SuperClass {

    private int subClassVariable;
    SubClass() {
        subClassVariable = -20;
    }
    SubClass(int a) {
        subClassVariable = a;
    }

    public void showValue() {
        System.out.println("SubClass: " + subClassVariable);
    }
}
