package br.com.hygor.fundamentos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Hygor Dias
 * email : hygor_christian@hotmail.com
 * github: github.com/zygor06
 */

public class Zodiac {

    private static void printMessage(int x){
        switch (x){
            case 0:   print("hou(monkey)", "witty,intelligent,ambitious and adventurous"); break;
            case 1:   print("ji(rooster)", "observant,hardworking,resourceful,courageous and talented"); break;
            case 2:   print("gou(dog)", "loyal,honest,amiable,kind,cautious and prudent"); break;
            case 3:   print("zhu(pig)", "diligen,compassionate,generous,easy-going and gentle"); break;
            case 4:   print("shu(rat)", "quick-witted,resourceful and versatile"); break;
            case 5:   print("niu(ox)", "decisive,honest,dependable and hardworking"); break;
            case 6:   print("hu(tiger)", "brave,competitive,unpredictable and self-confident"); break;
            case 7:   print("tu(rabbit)", "gentle,quiet,elegant,alert,quick,skillful,kind and patient"); break;
            case 8:   print("long(dragon)", "confident,intelligent,ambitious,presevering and hardworking"); break;
            case 9:   print("she(snake)", "intelligent,courageous,confident,insightful and communicative"); break;
            case 10:  print("ma(horse)", "animated,kind,straightforward,active and energetic"); break;
            case 11:  print("yang(goat)", "gentle,shy,stable,sympathetic and adventurous"); break;
        }
    }

    private static void print(String s1, String s2){
        System.out.printf("You are born in the year of %s in Chinese year and you are %s\n", s1, s2);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int birth_date = 0;
        try{
            birth_date = input.nextInt(); //Get the input from user
        }catch(InputMismatchException e){
            e.printStackTrace();
            System.exit(0); //Exit the program if the input value is incorrect
        } finally {
            input.close();
        }
        printMessage(birth_date % 12);
    }
}
