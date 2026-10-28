package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asqt extends aihn implements aiis {
    public static final asqt a;
    public static final aihl b;
    public int c;
    public int d;

    static {
        asqt asqtVar = new asqt();
        a = asqtVar;
        aihn.registerDefaultInstance(asqt.class, asqtVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asqtVar, asqtVar, null, 329240327, aika.MESSAGE, asqt.class);
    }

    private asqt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "d", asmm.q});
        }
        if (iOrdinal == 3) {
            return new asqt();
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
        return aihn.getParserForClass(asqt.class);
    }
}
