public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void approve(Book book,Student student){
       if (student.getStudentId() == 2420 && book.getBookName().equals("RDPD")){
           System.out.println("The book has been given by :" +
                   this.getName() + " to:" + student.getStudentName() +
                   " on :" +book.getBookDate());
       }
    }
}
