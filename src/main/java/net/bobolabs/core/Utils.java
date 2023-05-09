package net.bobolabs.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Utils {

    private Utils() {}

    public static <T> T coalesce(@Nullable T provided, @NotNull Provider<T> provider) {
        return provided != null ? provided : provider.provide();
    }

}
