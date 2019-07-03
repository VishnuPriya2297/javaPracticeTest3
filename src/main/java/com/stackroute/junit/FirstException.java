package main.java.com.stackroute.junit;
/*
program to generate an exception and use finally
 */
public class FirstException {
    FirstException(String message) {
        message = "this is bound to execute";
        System.out.println(message);
}
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("i will get printed");
        }

    }
}
