/*
 * This file is part of core.
 *
 * Copyright (C) 2023 BoboLabs.net
 * Copyright (C) 2023 Fabio Nebbia (https://glowy.bobolabs.net)
 * Copyright (C) 2023 Mattia Mignogna (https://stami.bobolabs.net)
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

/**
 * Specifies that the implementing class has some functionality
 * than can be enabled, disabled or reloaded.
 */
public interface Reloadable {

    /**
     * Enable implementing class' functionality.
     */
    default void onEnable() {

    }

    /**
     * Disable implementing class' functionality.
     */
    default void onDisable() {

    }

    /**
     * Reloads implementing class' functionality.
     */
    default void reload() {
        onDisable();
        onEnable();
    }

}
