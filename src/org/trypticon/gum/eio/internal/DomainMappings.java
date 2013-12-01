package org.trypticon.gum.eio.internal;

import org.trypticon.gum.eio.Domain;

import java.util.EnumMap;
import java.util.Map;

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
