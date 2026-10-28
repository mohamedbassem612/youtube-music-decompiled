package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aslu extends aihn implements aiis {
    public static final aslu a;
    public static final aihl b;
    public int c;
    public aslo d;

    static {
        aslu asluVar = new aslu();
        a = asluVar;
        aihn.registerDefaultInstance(aslu.class, asluVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), asluVar, asluVar, null, 525000057, aika.MESSAGE, aslu.class);
    }

    private aslu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aslu();
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
        return aihn.getParserForClass(aslu.class);
    }
}
