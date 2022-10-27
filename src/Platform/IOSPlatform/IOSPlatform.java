package Platform.IOSPlatform;

import Platform.IA;
import Platform.IO;
import Platform.IOSPlatform.Actions.*;
import Platform.IOSPlatform.Options.*;
import Platform.IOSPlatform.SuperActions.*;
import Platform.IPlatform;
import Platform.ISA;

public class IOSPlatform implements IPlatform {
    private int version;

    public IOSPlatform(int v) {
        version = v;
    }

    @Override
    public IO createO() throws Exception {
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
    public IA createA() throws Exception {
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
    public ISA createSA() throws Exception {
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
