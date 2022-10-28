package platform;

import platform.AndroidPlatform.AndroidPlatform;
import platform.IOSPlatform.IOSPlatform;

public class PlatformFactory {
    static public IPlatform createPlatform(PlatformType platformType,int version) {
        switch (platformType) {
            case IOS: {
                return new IOSPlatform(version);
            }
            case ANDROID: {
                return new AndroidPlatform(version);
            }
            default:
                return null;
        }
    }
}
