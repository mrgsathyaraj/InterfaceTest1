public class BirdSoundClass implements BirdSoundsInterface {

    public void catSound()
    {
        System.out.println("meow");
    }

    public String dogSound()
    {
        System.out.println("wowwww");

        return "woww return";
    }

    @Override
    public void honda() {

        System.out.println("honda rii");
    }




}
