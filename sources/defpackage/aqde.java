package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqde extends aihn implements aiis {
    public static final aqde a;
    public static final aihl b;

    static {
        aqde aqdeVar = new aqde();
        a = aqdeVar;
        aihn.registerDefaultInstance(aqde.class, aqdeVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), aqdeVar, aqdeVar, null, 388804096, aika.MESSAGE, aqde.class);
    }

    private aqde() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new aqde();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aqde.class);
        }
        return null;
    }
}
