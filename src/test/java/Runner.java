public class Runner {

    public static void main(String[] args) {
        PraticeMedium obj = new PraticeMedium();
        obj.test();
        obj.OverloadWithNoarg();
        obj.OverloadWithoutArguments("firstname","lastname");
        PraticeBaisc object = new PraticeBaisc();
        PraticeBaisc constructorwitharg = new PraticeBaisc("Maths",100);
    }
}
