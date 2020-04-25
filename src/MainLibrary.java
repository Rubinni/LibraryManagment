public class MainLibrary {
    public static void main(String [] args){

        Student stud1 = new Student("Nitsuh",2420);

        Book b1 = new Book("RDPD","Robert",2020
                ,"Productivity");

        Employee emp1 = new Employee("PIPI",5444);

        emp1.approve(b1,stud1);

    }
}
