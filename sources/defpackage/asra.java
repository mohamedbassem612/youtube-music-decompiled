package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asra extends aihn implements aiis {
    public static final asra a;
    public static final aihl b;
    public int c;
    public String d = "";

    static {
        asra asraVar = new asra();
        a = asraVar;
        aihn.registerDefaultInstance(asra.class, asraVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asraVar, asraVar, null, 197074932, aika.MESSAGE, asra.class);
    }

    private asra() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new asra();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(asra.class);
    }
}
