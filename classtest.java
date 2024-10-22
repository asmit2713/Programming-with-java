package Asmit;

public class ClassTest {
    static class Test {
        int a;
        int b;

        Test(int x, int y) {
            a = x;
            b = y;
        }

        void display() {
            System.out.println("a: " + a + ", b: " + b);
        }

        void modifyValues(Test obj) {
            obj.a *= 10;
            obj.b /= 20;
        }
    }

    public static void main(String[] args) {
        Test testObj = new Test(15, 10);
        
        System.out.println("Before modification:");
        testObj.display();
        
        testObj.modifyValues(testObj);
        
        System.out.println("After modification:");
        testObj.display();
    }
}
