package OopsProg;
public class InheritPerson {
    //This is parent Class
       //declaring parent variables
        String name;
        int age;

        // no constructor

        //declaring parent method
        public void print(){
            System.out.println("------------------------");
            System.out.println("Data from parent class");
            System.out.println("------------------------");
            System.out.println("default value from parent class for name: " + name);
            System.out.println("default value from parent class for age: " + age);
            System.out.println("");
        }
    }