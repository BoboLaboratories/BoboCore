package net.bobolabs.core;

import org.jetbrains.annotations.NotNull;

public interface Provider<T> {

    @NotNull T provide();

}
