class stu{
    int rollno;
    int arr[];

    public stu(int rollno, int[] arr) {
        this.rollno = rollno;
        this.arr = arr;
    }
    public void display()
    {
        System.out.println(rollno);
        for (int res:arr)
        {
            System.out.println(res);
        }


    }
}

public class demo1 {
    public static void main(String[] args) {
        stu obj1=new stu(23,new int[]{23_000,56,34,89});
        obj1.display();

    }
}
