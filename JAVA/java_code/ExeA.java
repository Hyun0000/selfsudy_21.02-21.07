package Generics실습.ex01;

public class ExeA<T> {

    private T t;

    public ExeA(T t){
        this.t = t;
        // Generic을 이용한 생성자 함수 정의
        // [ this.t = t; ]에서
        // this.t --> private T t; 를 가리킨다.
        // t --> ExeA(T t)에서 parameter 't'를 의미한다.
    }

    public T getT() {
        return t;
    }
}
