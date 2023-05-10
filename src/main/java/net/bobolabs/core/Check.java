/*
 * This file is part of core.
 *
 * Copyright (C) 2023 BoboLabs.net
 * Copyright (C) 2023 Mattia Mignogna (https://stami.bobolabs.net)
 * Copyright (C) 2023 Fabio Nebbia (https://glowy.bobolabs.net)
 * Copyright (C) 2023 Third party contributors
 *
 * core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with core.  If not, see <http://www.gnu.org/licenses/>.
 */

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
