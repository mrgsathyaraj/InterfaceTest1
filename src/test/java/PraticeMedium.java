public class PraticeMedium extends PraticeBaisc{

    int s = super.a;

    PraticeMedium()
    {

        System.out.println("Sub class constructor test" +s);

    }
    public void test()
    {

        System.out.println("Test Override Class");
        super.test();
    }

    public void OverloadWithNoarg()
    {
        System.out.println("Overloading with No Arguments");
    }

    public void OverloadWithoutArguments(String fname,String lanme)
    {
        System.out.println("Overloading without Arguments"+fname+lanme);
    }


}
