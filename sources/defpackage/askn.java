package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class askn extends aihn implements aiis {
    public static final askn a;
    public static final aihl b;
    public int c;
    public boolean d;
    public float e;

    static {
        askn asknVar = new askn();
        a = asknVar;
        aihn.registerDefaultInstance(askn.class, asknVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), asknVar, asknVar, null, 196573526, aika.MESSAGE, askn.class);
    }

    private askn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new askn();
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
        return aihn.getParserForClass(askn.class);
    }
}
