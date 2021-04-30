public class PraticeBaisc {

    public int a =5;

    PraticeBaisc()
    {

        System.out.println("Construtor without arguments");
    }

    PraticeBaisc(String Subject, int marks)
    {
        System.out.println("construtor with arguments"+Subject+marks);
    }

    public void test()
    {
        System.out.println("Test Parent Method");
    }
}
