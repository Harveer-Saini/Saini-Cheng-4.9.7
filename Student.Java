public class Student
{
    private String name;
    private int id;
    private String yearInSchool;

    // Constructor that takes all three attributes
    public Student(String name, int id, String yearInSchool)
    {
        this.name = name;
        this.id = id;
        this.yearInSchool = yearInSchool;
    }

    // toString method to return a string representation of the student
    @Override
    public String toString()
    {
        return "Name: " + name + ", ID: " + id + ", Year in School: " + yearInSchool;
    }

    // equals method to compare students based on ID
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return this.id == other.id;
    }
}
