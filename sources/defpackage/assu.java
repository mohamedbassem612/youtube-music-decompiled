package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class assu extends aihn implements aiis {
    public static final assu a;
    public static final aihl b;
    public int c = 0;
    public Object d;

    static {
        assu assuVar = new assu();
        a = assuVar;
        aihn.registerDefaultInstance(assu.class, assuVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), assuVar, assuVar, null, 272531091, aika.MESSAGE, assu.class);
    }

    private assu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00017\u0000\u00024\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new assu();
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
        return aihn.getParserForClass(assu.class);
    }
}
