package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asqs extends aihn implements aiis {
    public static final asqs a;
    public static final aihl b;
    public int c;
    public String d = "";
    public float e;
    public float f;

    static {
        asqs asqsVar = new asqs();
        a = asqsVar;
        aihn.registerDefaultInstance(asqs.class, asqsVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), asqsVar, asqsVar, null, 455760611, aika.MESSAGE, asqs.class);
    }

    private asqs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new asqs();
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
        return aihn.getParserForClass(asqs.class);
    }
}
