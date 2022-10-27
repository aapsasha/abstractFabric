import Platform.*;

import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter platform%n");
        String platform = scanner.next();
        System.out.printf("enter version%n");
        int version = scanner.nextInt();
        platformType Type;
        if(platform.equals("Android")){
            Type = platformType.Android;
        }
        else if(platform.equals("IOS")){
            Type = platformType.IOS;
        }
        else{
            System.out.print("wrong platform");
            return;
        }
        Platformfactory mainfactory = new Platformfactory(Type,version);
        IPlatform current = mainfactory.createPlatform();
        IA currentAction;
        IO currentOption;
        ISA currentSuperAction;
        try{
            currentAction = current.createA();
            currentOption = current.createO();
            currentSuperAction = current.createSA();
        }catch(Exception e){
            System.out.print("incorrect version");
            return;
        }

        System.out.print("current action: ");
        currentAction.printversion();
        System.out.printf("%ncurrent option: ");
        currentOption.printversion();
        System.out.printf("%ncurrent Super Action: ");
        currentSuperAction.printversion();
    }
//    public interface Ireader{
//        Stream read();
//    }
//    public class txtReader implements Ireader{
//        Ireader reader;
//        Stream read(){
//            sstream = reader.read();
//            ///read txt
//            return sstream;
//        }
//
//    }
//    Ireader readnow = new txtreader(new zipreader(...));
}

