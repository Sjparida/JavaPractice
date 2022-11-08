package OopsProg;

class InheritEmployee extends InheritPerson {
        //This is Child Class
        //declaring child data members
        int empid;
        double salary;

        //declaring child method display
        public void display(){
            System.out.println("---------------------------");
            System.out.println("Employee Details");
            System.out.println("---------------------------");
            System.out.println("Name of the Employee is: "+ name);
            System.out.println("Age of the Employee is: "+ age);
            System.out.println("Employee ID is: "+ empid);
            System.out.println("Salary of the Employee is: "+ salary);

        }

        //creating child class constructor
        public InheritEmployee(String name, int age, int empid, double salary){
            this.name=name;
            this.age=age;
            this.empid=empid;
            this.salary=salary;
        }

        //declaring main method
        public static void main(String[] args) {
            //employee object call
            InheritEmployee emp = new InheritEmployee("Satyajeet",20,101,35000d);
            emp.display(); // display the passed values in child class

            //person object call
            InheritPerson per = new InheritPerson();
            per.print(); // print the default value of name and age from parent class

        }

    }
