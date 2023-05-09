package net.bobolabs.core;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public final class Utils {

    private Utils() {}

    // A Stami piace :D
    @Contract("!null, _ -> param1")
    public static <T> T coalesce(@Nullable T supplied, @NotNull Supplier<T> supplier) {
        return supplied != null ? supplied : supplier.get();
    }

}
