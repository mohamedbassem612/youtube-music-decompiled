package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asoi extends aihn implements aiis {
    public static final asoi a;
    public static final aihl b;
    public int c;
    public asob d;
    public ason e;
    public float f;

    static {
        asoi asoiVar = new asoi();
        a = asoiVar;
        aihn.registerDefaultInstance(asoi.class, asoiVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), asoiVar, asoiVar, null, 193804845, aika.MESSAGE, asoi.class);
    }

    private asoi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new asoi();
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
        return aihn.getParserForClass(asoi.class);
    }
}
