package platform;

public interface IPlatform {
    IOption createOption() throws Exception;

    IAction createAction() throws Exception;

    ISuperAction SuperAction() throws Exception;
}
