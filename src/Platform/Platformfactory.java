package Platform;

import Platform.AndroidPlatform.APlatform;
import Platform.IOSPlatform.IOSPlatform;

public class Platformfactory {
    platformType ptype;
    int version;

    public Platformfactory(platformType t, int v) {
        ptype = t;
        version = v;
    }

    public IPlatform createPlatform() {
        switch (ptype) {
            case IOS: {
                return new IOSPlatform(version);
            }
            case Android: {
                return new APlatform(version);
            }
            default:
                return null;
        }
    }
}
