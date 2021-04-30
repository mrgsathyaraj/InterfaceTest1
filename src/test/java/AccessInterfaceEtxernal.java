public class AccessInterfaceEtxernal {

    public static void main(String[] args) {
        
        BirdSoundsInterface sound = new BirdSoundClass();

        sound.catSound();

        sound.honda();
    }

}


/*
interface -it requires all methods to implement wherever we use the class to connect it
inheritance -it used to access the parent and sub parent or nested parent class objects
method call
private encapsulation -just the data to be private
polymorphism-overload and override
super, this keyword - super is used to access the super class data and this for refer the local variable
constructor -it will be run when the object is created for the class
junit  except parameter

To be

final
static
collections
*/
