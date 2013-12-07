/*
 * Gum - a thin shim around the com.apple extension classes
 * Copyright (C) 2013  Trejkaz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.trypticon.gum.eio.internal;

import org.trypticon.gum.eio.Domain;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author trejkaz
 */
class DomainMappings {
    private static final Map<Domain, Short> map = new EnumMap<>(Domain.class);
    static {
        map.put(Domain.ON_APPROPRIATE_DISK, (short) -32767);
        map.put(Domain.SYSTEM, (short) -32766);
        map.put(Domain.LOCAL, (short) -32765);
        map.put(Domain.NETWORK, (short) -32764);
        map.put(Domain.USER, (short) -32763);
    }

    static short convert(Domain domain) {
        Short result = map.get(domain);
        if (result == null) {
            throw new IllegalArgumentException("Unknown domain: " + domain);
        }
        return result;
    }
}
