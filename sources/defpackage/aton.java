package defpackage;

import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aton extends aihn implements aiis {
    public static final aton a;
    public static final aihl b;
    public int c;
    public boolean d;

    static {
        aton atonVar = new aton();
        a = atonVar;
        aihn.registerDefaultInstance(aton.class, atonVar);
        b = aihn.newSingularGeneratedExtension(TransactionContextOuterClass$TransactionContext.getDefaultInstance(), atonVar, atonVar, null, 1000, aika.MESSAGE, aton.class);
    }

    private aton() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aton();
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
        return aihn.getParserForClass(aton.class);
    }
}
