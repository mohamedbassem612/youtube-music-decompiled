package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asln extends aihn implements aiis {
    public static final asln a;
    public static final aihl b;
    public int c;
    public int d;

    static {
        asln aslnVar = new asln();
        a = aslnVar;
        aihn.registerDefaultInstance(asln.class, aslnVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), aslnVar, aslnVar, null, 525000058, aika.MESSAGE, asln.class);
    }

    private asln() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new asln();
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
        return aihn.getParserForClass(asln.class);
    }
}
