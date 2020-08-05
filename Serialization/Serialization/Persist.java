import java.util.*;
import java.io.*;
/**
 * This class describes a student.
 */
class Student implements Serializable
{
    int id;
    String name;
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class Persist
{
    public static void main(String args[])
    {
        try
        {
            //Creating the object
            Student s1 = new Student(211, "ravi");
            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}