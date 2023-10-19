package week04.sample01;

public class OurClass {
    private final boolean just = true;

    public void thisMethodIsDangerous() throws OurBadException{
        if(just) {
            throw new OurBadException();
        }
    }
}
