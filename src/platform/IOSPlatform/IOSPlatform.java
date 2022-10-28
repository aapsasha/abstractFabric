package platform.IOSPlatform;

import platform.IAction;
import platform.IOption;
import platform.IOSPlatform.Actions.*;
import platform.IOSPlatform.Options.*;
import platform.IOSPlatform.SuperActions.*;
import platform.IPlatform;
import platform.ISuperAction;

public class IOSPlatform implements IPlatform {
    private int version;

    public IOSPlatform(int v) {
        version = v;
    }

    @Override
    public IOption createOption() throws Exception {
        switch (version) {
            case 10: {
                return new IOSO10();
            }
            case 20: {
                return new IOSO20();
            }
            case 30: {
                return new IOSO30();
            }
            case 40: {
                return new IOSO40();
            }
            case 50: {
                return new IOSO50();
            }
            default:
                throw new Exception("incorrect version");
        }
    }

    @Override
    public IAction createAction() throws Exception {
        switch (version) {
            case 10: {
                return new IOSA10();
            }
            case 20: {
                return new IOSA20();
            }
            case 30: {
                return new IOSA30();
            }
            case 40: {
                return new IOSA40();
            }
            case 50: {
                return new IOSA50();
            }
            default:
                throw new Exception("incorrect version");
        }
    }

    @Override
    public ISuperAction SuperAction() throws Exception {
        switch (version) {
            case 10: {
                return new IOSSA10();
            }
            case 20: {
                return new IOSSA20();
            }
            case 30: {
                return new IOSSA30();
            }
            case 40: {
                return new IOSSA40();
            }
            case 50: {
                return new IOSSA50();
            }
            default:
                throw new Exception("incorrect version");
        }
    }
}
