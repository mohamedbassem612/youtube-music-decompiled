package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asls extends aihn implements aiis {
    public static final asls a;
    public static final aihl b;
    public int c;
    public float d;

    static {
        asls aslsVar = new asls();
        a = aslsVar;
        aihn.registerDefaultInstance(asls.class, aslsVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), aslsVar, aslsVar, null, 472454357, aika.MESSAGE, asls.class);
    }

    private asls() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new asls();
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
        return aihn.getParserForClass(asls.class);
    }
}
