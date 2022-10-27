package Platform.AndroidPlatform;

import Platform.AndroidPlatform.Actions.AA10;
import Platform.AndroidPlatform.Actions.AA20;
import Platform.AndroidPlatform.Actions.AA30;
import Platform.AndroidPlatform.Actions.AA40;
import Platform.AndroidPlatform.Options.AO10;
import Platform.AndroidPlatform.Options.AO20;
import Platform.AndroidPlatform.Options.AO30;
import Platform.AndroidPlatform.Options.AO40;
import Platform.AndroidPlatform.SuperActions.ASA10;
import Platform.AndroidPlatform.SuperActions.ASA20;
import Platform.AndroidPlatform.SuperActions.ASA30;
import Platform.AndroidPlatform.SuperActions.ASA40;
import Platform.IA;
import Platform.IO;
import Platform.IPlatform;
import Platform.ISA;

public class APlatform implements IPlatform {
    private int version;

    public APlatform(int v) {
        version = v;
    }

    @Override
    public IO createO() throws Exception {
        switch (version) {
            case 10: {
                return new AO10();
            }
            case 20: {
                return new AO20();
            }
            case 30: {
                return new AO30();
            }
            case 40: {
                return new AO40();
            }
            default:
                throw new Exception("incorrect version");
        }
    }

    @Override
    public IA createA() throws Exception {
        switch (version) {
            case 10: {
                return new AA10();
            }
            case 20: {
                return new AA20();
            }
            case 30: {
                return new AA30();
            }
            case 40: {
                return new AA40();
            }
            default:
                throw new Exception("incorrect version");
        }
    }

    @Override
    public ISA createSA() throws Exception {
        switch (version) {
            case 10: {
                return new ASA10();
            }
            case 20: {
                return new ASA20();
            }
            case 30: {
                return new ASA30();
            }
            case 40: {
                return new ASA40();
            }
            default:
                throw new Exception("incorrect version");
        }
    }
}
