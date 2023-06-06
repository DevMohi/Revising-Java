// class Student{
//     String name;
//     int age;

//     public void printName(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//     //copy contructors
// }

// public class oop {
//     public static void main(String[] args) {
//         Student s1 = new Student("aman",24);
//         s1.printName();
//     }
// }

//Polymorphism 
// class Student{
//     String name;
//     int age;

//    public void printName(String name){
//     System.out.println(name);
//    }
//    public void printName(int age){
//     System.out.println(age);
//    }
//    public void printName(String name, int age){
//     System.out.println(name +  " "  + age);
//    }

//     //copy contructors
// }

// public class oop {
//     public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.name = "aman";
//        s1.age = 7;

//        s1.printName(s1.age);
        
//     }
// }

//Inheritance
//base class

class Shape{
    public void area(){
        System.out.println("display area");
    }
}

//child class/derived class
//inherits shapes class
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}



public class oop {
    public static void main(String[] args) {
      
    }
}
