package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auhr extends aihn implements aiis {
    public static final auhr a;
    public int b;
    public float c;
    private int d;

    static {
        auhr auhrVar = new auhr();
        a = auhrVar;
        aihn.registerDefaultInstance(auhr.class, auhrVar);
    }

    private auhr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001", new Object[]{"d", "b", arfr.i, "c"});
        }
        if (iOrdinal == 3) {
            return new auhr();
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
        return aihn.getParserForClass(auhr.class);
    }
}
