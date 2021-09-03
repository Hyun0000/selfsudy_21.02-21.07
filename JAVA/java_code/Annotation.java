package Annotation;
//---------------------------------------------------------------------------
//@Override
class Parent {
    void parentMethod() { }
}

class Child extends Parent {
    @Override
    @Deprecated
    void parentMethod() { }
}
//---------------------------------------------------------------------------
//@Deprecated
class Ex12_7 {
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod(); // Deprecated된 method 사용
    }
}
//---------------------------------------------------------------------------
//@FunctionalInterface
@FunctionalInterface
interface Testable {
    void test(); // 추상메소드
    void check(); // 추상메소드
}