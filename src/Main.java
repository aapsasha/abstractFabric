import platform.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter platform");
        String platform = scanner.next();
        System.out.println("enter version");
        int version = scanner.nextInt();
        PlatformType type;
        if("Android".equals(platform)){

            type = PlatformType.ANDROID;

        } else if("IOS".equals(platform)){

            type = PlatformType.IOS;

        } else{
            System.out.print("wrong platform");
            return;

        }
        IPlatform current = PlatformFactory.createPlatform(type,version);
        IAction currentAction;
        IOption currentOption;
        ISuperAction currentSuperAction;
        try{
            currentAction = current.createAction();
            currentOption = current.createOption();
            currentSuperAction = current.SuperAction();

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

