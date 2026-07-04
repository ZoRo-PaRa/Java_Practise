class Student {

    private long id;
    private String name, email;
    private double marks;

    public void setData(long id, String name, String email, double marks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public void getData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Marks: " + marks);
    }
}

class J1 {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setData(1, "Arun", "arun@gmail.com", 65);
        s1.getData();

    }
}