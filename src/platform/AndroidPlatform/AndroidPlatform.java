package platform.AndroidPlatform;

import platform.AndroidPlatform.Actions.AA10;
import platform.AndroidPlatform.Actions.AA20;
import platform.AndroidPlatform.Actions.AA30;
import platform.AndroidPlatform.Actions.AA40;
import platform.AndroidPlatform.Options.AO10;
import platform.AndroidPlatform.Options.AO20;
import platform.AndroidPlatform.Options.AO30;
import platform.AndroidPlatform.Options.AO40;
import platform.AndroidPlatform.SuperActions.ASA10;
import platform.AndroidPlatform.SuperActions.ASA20;
import platform.AndroidPlatform.SuperActions.ASA30;
import platform.AndroidPlatform.SuperActions.ASA40;
import platform.IAction;
import platform.IOption;
import platform.IPlatform;
import platform.ISuperAction;

public class AndroidPlatform implements IPlatform {
    private int version;

    public AndroidPlatform(int version) {
        this.version = version;
    }

    @Override
    public IOption createOption() throws Exception {
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
    public IAction createAction() throws Exception {
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
    public ISuperAction SuperAction() throws Exception {
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
