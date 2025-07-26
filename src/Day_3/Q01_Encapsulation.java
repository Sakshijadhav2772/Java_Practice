//Define a Student class with attributes name, age, roll number. Create objects and display their data.
package Day_3;

class Student{
   String name;
   int age;
   int rollNo;
        public Student(String name, int age, int rollNo){
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
        }

        public void displayDetails(){
            System.out.println("Name : " +name);
            System.out.println("Age : "+ age);
            System.out.println("Roll no : "+rollNo);
        }
}
public class Q01_Encapsulation {

    public static void main(String[] args) {
        Student s1 = new Student("Sakshi", 22, 1);
        s1.displayDetails();

    }
}
