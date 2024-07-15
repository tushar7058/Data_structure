
class Student{

    String name ;
    int age ;

    Student(){ // non parameterized constructor
        
        // constructor does not return any returntype
        // constructor always call once time we make class instance in main()
        System.out.println("it is constructor");
    }

    Student(int age ,String name){  // it is parameterized constructor
        this.age = age;
        this.name = name;
    }

    Student(Student s2){   // copy constructor always defined by user
        this.name = s2.name;
        this.age = s2.age;
    } 

    void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class cons {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 12;
        s.name = "tushar";

        // another object
        Student s2 = new Student(s);
        s.info();

        
    }
}
