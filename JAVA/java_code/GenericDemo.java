package Generics;
//
//class StudentInfo{
//    public int grade;
//    StudentInfo(int grade){ this.grade = grade; }
//}
//class EmployeeInfo{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//}
//class Person{
//    public Object info;
//    Person (Object info){ this.info = info; }
//}
//public class GenericDemo {
//    public static void main(String[] args) {
//        Person p1 = new Person("부장");
//        EmployeeInfo ei = (EmployeeInfo)p1.info;
//        System.out.println(ei.rank);
//    }
//}

//class EmployeeInfo{
//    public int rank;
//    EmployeeInfo(int rank){ this.rank = rank; }
//}
//class Person<T, S>{
//    public T info;
//    public S id;
//    Person(T info, S id){
//        this.info = info;
//        this.id = id;
//    }
//}
//public class GenericDemo {
//    public static void main(String[] args) {
//        Integer id = new Integer(1);
//        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), id);
//        System.out.println(p1.id.intValue());
//    }
//}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = 10;
        Person p1 = new Person(e, i);
    }
}