import java.util.Arrays;

public class PointDemo {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point.Print(p1);

        Point[] arr = new Point[5];

        for (Point p : arr)
            System.out.println(p);

        for (int i = 0; i < arr.length ; i++)
            arr[i] = new Point();


          // for (Point p : arr)
               // System.out.println(p);
                System.out.println(Arrays.toString(arr));

        for(Point p : arr)
            Point.Print(p);

        arr[0].x = 1;
        arr[1].x = 2;
        arr[2].x = 3;
        arr[3].x = 4;
        arr[4].x = 5;


        arr[0].y = 5;
        arr[1].y = 5;
        arr[2].y = 5;
        arr[3].y = 5;
        arr[4].y = 5;

       Point.Print(arr[3]);


    }


}
