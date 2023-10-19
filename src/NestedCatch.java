public class NestedCatch {
    public static void main(String[] args) {
        int A[] = {30, 0, 10, 40, 0};

        try
        {
            int c = A[0]/A[2];
            System.out.println("Division is: " + c);

            try
            {
                System.out.println(A[30]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                e.printStackTrace();
                System.out.println("Index is invalid.");
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Dominator should not be 0.");
        }
        System.out.println("Bye!");
    }

}
