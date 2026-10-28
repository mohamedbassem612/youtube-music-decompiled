package defpackage;

import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asta extends aihn implements aiis {
    public static final asta a;
    public static final aihl b;
    public int c;
    public boolean d;
    public asob e;
    public ason f;

    static {
        asta astaVar = new asta();
        a = astaVar;
        aihn.registerDefaultInstance(asta.class, astaVar);
        b = aihn.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.getDefaultInstance(), astaVar, astaVar, null, 525000056, aika.MESSAGE, asta.class);
    }

    private asta() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဇ\u0000", new Object[]{"c", "e", "f", "d"});
        }
        if (iOrdinal == 3) {
            return new asta();
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
        return aihn.getParserForClass(asta.class);
    }
}
