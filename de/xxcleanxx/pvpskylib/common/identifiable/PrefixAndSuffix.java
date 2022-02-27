package de.xxcleanxx.pvpskylib.common.identifiable;

import de.xxcleanxx.pvpskylib.common.identifiable.abstractions.PrefixAndSuffixBase;
import org.jetbrains.annotations.Nullable;

public class PrefixAndSuffix extends PrefixAndSuffixBase {
    public PrefixAndSuffix(@Nullable String prefix, @Nullable String suffix) {
        super(prefix, suffix);
    }

    public PrefixAndSuffix(@Nullable String prefix) {
        super(prefix);
    }

    public PrefixAndSuffix() {
        super();
    }
}