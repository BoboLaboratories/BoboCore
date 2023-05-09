package net.bobolabs.core;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Supplier;

public final class Check {

    private Check() {}

    public static void argument(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    public static void argument(boolean expression, @NotNull String error) {
        if (!expression) {
            throw new IllegalArgumentException(error);
        }
    }

    public static void argument(boolean expression, @NotNull Supplier<String> errorSupplier) {
        if (!expression) {
            throw new IllegalArgumentException(errorSupplier.get());
        }
    }

    public static void state(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static void state(boolean expression, @NotNull String error) {
        if (!expression) {
            throw new IllegalStateException(error);
        }
    }

    public static void state(boolean expression, @NotNull Supplier<String> errorSupplier) {
        if (!expression) {
            throw new IllegalStateException(errorSupplier.get());
        }
    }

    public static <T> void notNull(T reference) {
        Objects.requireNonNull(reference);
    }

    public static <T> void notNull(T reference, @NotNull String error) {
        Objects.requireNonNull(reference, error);
    }

    public static <T> void notNull(T reference, @NotNull Supplier<String> errorSupplier) {
        Objects.requireNonNull(reference, errorSupplier);
    }

}
