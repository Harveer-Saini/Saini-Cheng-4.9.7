public class StudentRunner
{
    public static void main(String args[])
    {
        // Creating Student objects with all three attributes
        Student s = new Student("AlexCheng", 101, "Junior");
        Student t = new Student("HarveerSaini", 101, "Junior");
        Student r = new Student("JoshuaWu", 102, "Sophomore");

        // Testing toString method by printing each student's details
        System.out.println(s.toString());
        System.out.println(t.toString());
        System.out.println(r.toString());

        // Testing equals method by comparing students based on ID
        System.out.println(s.equals(t));  // Should print true (same ID)
        System.out.println(s.equals(r));  // Should print false (different ID)
    }
}
