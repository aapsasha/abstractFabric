package Platform;

public interface IPlatform {
    IO createO() throws Exception;

    IA createA() throws Exception;

    ISA createSA() throws Exception;
}
