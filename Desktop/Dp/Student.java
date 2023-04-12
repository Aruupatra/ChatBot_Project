/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

abstract class Teacher
{
    private void show()
    {
        System.out.println("Teacher");
    }
}

public class Student extends Teacher
{
    protected void show()
    {
        System.out.print(" Student");
    }
    
    public static void main(String[] args)
    {
        Teacher teacher=new Student();
        teacher.show();
    }
}
