package week04.sample01;

import java.sql.SQLOutput;

public class StudyException {
    public static void main(String[] args) {
        OurClass outClass = new OurClass();

        try{
            outClass.thisMethodIsDangerous();
        } catch(OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("우리는 방금 예외를 handling 했습니다.");
        }

    }
}
