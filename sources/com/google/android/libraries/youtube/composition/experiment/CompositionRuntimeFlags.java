package com.google.android.libraries.youtube.composition.experiment;

import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class CompositionRuntimeFlags extends aihn implements aiis {
    public static final CompositionRuntimeFlags a;

    static {
        CompositionRuntimeFlags compositionRuntimeFlags = new CompositionRuntimeFlags();
        a = compositionRuntimeFlags;
        aihn.registerDefaultInstance(CompositionRuntimeFlags.class, compositionRuntimeFlags);
    }

    private CompositionRuntimeFlags() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new CompositionRuntimeFlags();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(CompositionRuntimeFlags.class);
        }
        return null;
    }
}
